package com.step_it.pages;

import com.step_it.utils.LoadWebDriver;
import com.step_it.utils.PageLoad;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    @Getter
    private final WebDriver driver;

    @Getter
    private final PageLoad pageLoad;

    public BasePage() {
        driver = LoadWebDriver.getDriver();
        pageLoad = new PageLoad(driver);
        PageFactory.initElements(driver, this);
    }

}

package com.step_it.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(className = "logo-link")
    private static WebElement main;
    private final MainPage logoMain;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        logoMain = new MainPage(driver);
    }

    public static boolean isLogoDisplayed() {
        return main.isDisplayed();
    }


}

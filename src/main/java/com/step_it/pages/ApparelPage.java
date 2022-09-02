package com.step_it.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ApparelPage {

    @FindBy(className = "col-lg-3 category-title")
    private static WebElement pageApparel;

    public ApparelPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public static boolean theListOfApparelProductsIsDisplayed() {
        return pageApparel.isDisplayed();
    }

    public static WebElement getPageApparel() {
        return pageApparel;
    }
}

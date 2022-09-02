package com.step_it.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NextPage {

    @FindBy(className = "js-search-link")
    private static WebElement nextMain;



    public static boolean theListOfNextProducts() {
        return nextMain.isDisplayed();
    }
}

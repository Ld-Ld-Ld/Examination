package com.step_it.steps;

import com.step_it.pages.ApparelPage;
import com.step_it.pages.MainPage;
import com.step_it.pages.NextPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CommonSteps {
    public static void checkMainPageIsOpen() {
              assertThat(MainPage.isLogoDisplayed()).as("The main page is not displayed");
    }


    public static void checkApparelPageIsOpened() {
              assertThat(ApparelPage.theListOfApparelProductsIsDisplayed()).as("The Apparel page is not displayed").isTrue();
    }

    public  static void nextApparelPageIsOpened(){
        assertThat(NextPage.theListOfNextProducts()).as("The next page is not displayed");
    }
}

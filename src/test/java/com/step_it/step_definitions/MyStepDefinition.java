package com.step_it.step_definitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.chrome.ChromeDriver;
import static java.util.concurrent.TimeUnit.SECONDS;

public class MyStepDefinition {

    @Given("a main page is displayed")
    public void aMainPageIsDisplayed() {
//        CommonSteps.checkMainPageIsOpen(){
            System.out.println("main page is displayed");
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, SECONDS);
            driver.get("https://shop.md/en/");
        }
    }


package com.step_it.hooks;

import com.step_it.utils.PropertyReader;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.step_it.utils.LoadWebDriver.getDriver;
import static com.step_it.utils.LoadWebDriver.quitDriver;

public class TestHook {

    @Before
    public void startBrowser() {
        getDriver().get(PropertyReader.getConfigProperty("url"));
    }

    @After
    public void driverTearDown(Scenario scenario) {
       quitDriver();
    }
}

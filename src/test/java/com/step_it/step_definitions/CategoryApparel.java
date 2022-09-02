package com.step_it.step_definitions;

import com.step_it.steps.CommonSteps;
import io.cucumber.java.en.When;

public class CategoryApparel {

    @When("the user choose the category apparel")
    public  void theUserChooseTheCategoryApparel() {
        CommonSteps.checkApparelPageIsOpened();
    }
}

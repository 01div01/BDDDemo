package stepSefinitions;

import base.BaseClasss;
import io.cucumber.java.en.Given;

public class CommonSteps {
    @Given("Launch Browser")
    public void launchBrowser(){
        BaseClasss.initDriver();
    }
}

package stepSefinitions;

import base.BaseClasss;
import com.beust.ah.A;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import io.cucumber.java.en.When;
import pageObject.ArcFacilityLogin;

public class LoginSteps extends BaseClasss {
    @When("I login to account")
    public void login(){
        ArcFacilityLogin arcFacilityLogin = new ArcFacilityLogin(driver);
        arcFacilityLogin.performLogin();
    }
}

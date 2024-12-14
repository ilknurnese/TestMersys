package StepDefinitions;

import Utilities.GWD;
import org.testng.annotations.AfterClass;

public class Hooks {
    @AfterClass
    public void after(){
        GWD.quitDriver();
    }
}

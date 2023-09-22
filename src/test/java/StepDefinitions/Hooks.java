package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.CommonMethods;

public class Hooks extends CommonMethods {
    @Before
    public void launchBrowserAndStartApplication(){
        CommonMethods.initiateBrowser();

    }
    @After
    public void terminateBrowser(){
       CommonMethods.closeBrowser();
    }
}

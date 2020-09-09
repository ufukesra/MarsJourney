package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook {

    @Before
    public void setup(Scenario scenario){

        System.out.println(scenario.getName());
        System.out.println("BEFORE");
    }

    @After
    public void teardown(){
        System.out.println("AFTER");

    }
}

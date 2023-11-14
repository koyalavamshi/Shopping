package Runner;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lombok.extern.slf4j.Slf4j;
import org.example.Main;
@Slf4j
public class Hooks {

Main main;

public  Hooks(Main main) {
    this.main = main;
}
    @Before(order = 0)
    public void beforeScenario(Scenario scenario){
        TestBase.scenario = scenario;
        log.info("------ Scenario: START ------");
        log.info("Scenario Name: " + scenario.getName());
    }

    @After(order = 0)
    public void afterScenario(Scenario scenario){
        log.info("Scenarios Result: " + scenario.getStatus());
        log.info("------ Scenario: END ------");
    }

}


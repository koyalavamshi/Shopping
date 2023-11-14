package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import reports.Intialize;
import reports.Processor;
import reports.Teardown;
@Slf4j
@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/feature/ShoppingDesktop.feature"},
        glue = {"Runner","StepDefination"},
        plugin = {"json:target/jsonReports/cucumber-reports.json"}





)

        public class TestRunner {
        private static String executionDateTime;
        private static final String DATEFORMAT = "dd-MM-yyyy_hh-mm-ss";

        @Intialize
        public static void initialize(){
                log.info("------ Initialize: START ------");
                executionDateTime = Processor.getDateAsString(DATEFORMAT);
                log.info("------ Intialize: END ------");
        }

        @Teardown
        public static void teardown(){
                log.warn("------ Teardown: START ------");
                Processor.initializeTeardown(executionDateTime);
                log.info("Teardown: END ------");
        }
}




package ui.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// UI RUNNERS CLASS

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports.html.",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/uiFeature",
        glue = "ui/stepDefinitions",
        tags = "@smoke2"
)

public class Ui_Runner {
}

package proj.cucRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/scenaries"},
        glue = {"/proj/stepsCuc"},
        tags = "@trip",
        plugin = {"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"})

        public class CucumberRunner{
}

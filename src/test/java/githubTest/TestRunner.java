package githubTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= { "src/main/resources"
        } ,
        plugin = {
                "pretty",
                "html:results/html/cucumber.html"
        },
        glue = {"githubTest"}
       // monochrome = true
)
public class TestRunner {

}

package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"}    //json: JSON formatında rapor oluşturur. API entegrasyonları için kullanılabilir.
)


public class TestRunnerAll extends AbstractTestNGCucumberTests {
//    Eğer senaryoları paralel olarak çalıştırmak istiyorsanız,
//    TestNG ile entegre edilen paralel çalışma özelliğini etkinleştirebilirsiniz:

//    @Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }

}

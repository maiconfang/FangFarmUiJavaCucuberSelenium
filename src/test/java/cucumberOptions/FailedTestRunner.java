package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
/**
 * @author Maicon Fang
 * @version 1.0
 * 
 */

//@CucumberOptions(features="@target/failed_scenarios.txt",glue ="stepDefinitions"
//,monochrome=true,
//plugin= {"html:target/cucumber.html", "json:target/cucumber.json"
////,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//})
//public class FailedTestRunner extends AbstractTestNGCucumberTests{
//
//	@Override
//	@DataProvider(parallel=true)
//	public Object[][] scenarios()
//	{
//		return super.scenarios();
//	}
//	
//}


/* this was commented because the fails tests was executing together the normal test "TestNGTestRunner.java" 2023-09-05
 
  @CucumberOptions(features="@target/failed_scenarios.txt",glue ="stepDefinitions"
,monochrome=true,
plugin= {"html:target/cucumber.html", "json:target/cucumber.json"
//,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
})
public class FailedTestRunner extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
}
  
 * */
 
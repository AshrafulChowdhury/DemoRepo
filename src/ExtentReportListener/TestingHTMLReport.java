package ExtentReportListener;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class TestingHTMLReport {
ExtentReports extent;

@BeforeTest
public void CreateReport(){
ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("/HTML_Report/TestResult");
extent = new ExtentReports();
extent.attachReporter(htmlReporter);
}


@Test(priority = 1)
public void LoginValidation(){
ExtentTest test = extent.createTest("Login Validation");
int a = 2;
if(a == 3){
test.pass("Test Case Passed");
}else{
test.fail("Test Case Failed");
}
extent.flush();


}


@Test(priority = 2)
public void SearchValidtion(){
ExtentTest test = extent.createTest("Search Validation");
double b = 4.5;
if(b == 4.5){
test.pass("Test Case Passed");
}else{
test.fail("Test Case Failed");
}
extent.flush();

}


}
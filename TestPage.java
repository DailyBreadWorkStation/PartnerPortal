package TestPage;

import org.openqa.selenium.chrome.ChromeDriver;
import Init.LoginPage;
import Init.PageFactory;
public class TestPage{
	
	public static String handle = "";
public static void main(String[] args) throws Exception{
	
	      // This code sets the system property for the Chrome WebDriver to the location of the chromedriver.exe file
	     // on the local machine. It then initializes a new instance of the ChromeDriver and navigates to the demoqa.com/books
	     // page. 
	
	System.setProperty("webdriver.chrome.driver", "/home/aberhe/Downloads/chromedriver_linux64/chromedriver\"");
	ChromeDriver driver = new ChromeDriver();
	 driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		
	    //Creating object of Login page
	LoginPage login = new LoginPage(driver);
		
		// This code enters the user's email and password into the login form, and then clicks the "Next" and "Verify"
		// buttons to submit the form and complete the login process. It's important to ensure that the email and password
		// values being entered are valid and correctly formatted, and that the login form is accessible and functioning
		// properly.
	login.getEmailInput().sendKeys("email");
	login.getNextButton().click();
	login.getPasswordInput().sendKeys("password");
	login.getVerifyButton().click();
	
	
	    //Creating object of pagefactory
	PageFactory page = new PageFactory();
	    // This code executes a series of test cases on the 'page' object. It's important to note that the test cases
	    // are being executed in a specific order, so it's possible that the results of one test case may impact the
	    // results of another.
	page.testCase1();
	page.testCase2();
	page.testCase3();
	page.testCase4();
	page.testCase5();
	page.testCase6();
	page.testcase7();
	page.testCase8();
	page.testCase9();
	page.testCase10();
	page.testCase11();
	page.testCase12();
	page.testcase13();
	
	

}
}

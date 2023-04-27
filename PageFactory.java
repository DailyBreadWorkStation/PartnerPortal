package Init;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageFactory {
    
	public static String handle = "";
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static JavascriptExecutor jse;
    
    
     // This code defines a method named testCase1 that performs a series of actions related to verifying device
     // certification for a YouTube application. The method first sets an expected title for the page and retrieves
     // the actual title using the WebDriver's getTitle() method. It then uses the JavaScriptExecutor to find a
     // specific element on the page and stores it in a WebElement object. The method then checks that the expected
     // title matches the actual title and that the element is enabled. If both of these conditions are true, the
     // method switches to a new window and clicks on an element in the page to initiate a search. It then uses
     // the WebDriver to find an input element and clicks on it, and waits for a popup to become visible. Finally,
     // the method clicks on a button within the popup, using an XPath expression to locate the button.


    public void testCase1() throws InterruptedException, Exception{
    	
		driver.get("https://devicecertification.youtube/?nonprodApi=true#/devices/series/saltmine_users-2023-sm0510/details");
		handle = driver.getWindowHandle();
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement signin = (WebElement)jse.executeScript("return document.querySelector('saltmine-app').shadowRoot.querySelector('login-page').shadowRoot.querySelector('paper-button')");		
		signin.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("saltmine.tester.1@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[2]/div[1]/div/div[1]/div/div[1]/input")).sendKeys("aberhe@google.com");
		driver.findElement(By.xpath("//*[@id=\"verifycontactNext\"]/div/button/span")).click();
		Thread.sleep(7000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().window(handle);
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://testtracker.googleplex.com/efforts/testplans/details/1123402/44847");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("username");	
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"signInButton\"]")).click();
		Thread.sleep(7000);
	 	driver.switchTo().window(handle);
		Thread.sleep(3000);
	String expectedTitle = "YouTube Device Certification";
	String actual = driver.getTitle();	
	WebElement verifyElements = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#list-items\")");
	Thread.sleep(5000);
	
	if(expectedTitle.equalsIgnoreCase(actual)==true && verifyElements.isEnabled()==true) {
		Thread.sleep(3000);
				Set<String> handles = driver.getWindowHandles();
		for(String i : handles) {
			driver.switchTo().window(i);
			
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"4484285\"]/td[2]/a")).click();
		Thread.sleep(5000);
		WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));
		  filterElement.click();
//		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//span[contains(text(),'Passed')]")).click();
		  Thread.sleep(3000);
//		  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//		  Thread.sleep(3000);
//		  driver.findElement(By.xpath("//button[contains(text(),'Update and Go Next')]")).click();
//		  Thread.sleep(3000);
	}
	else {
		Thread.sleep(3000);
		Set<String> handles = driver.getWindowHandles();
for(String i : handles) {
	driver.switchTo().window(i);
	
}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"4484285\"]/td[2]/a")).click();
		Thread.sleep(5000);
		WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));		
		  filterElement.click();
//		  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//span[contains(text(),'Failed')]")).click();
		  Thread.sleep(3000);
//		  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//		  Thread.sleep(3000);
//		  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//		  Thread.sleep(3000);
	}
	
	jse.executeScript("window.scrollBy(0,-5000)");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'Testcases')]")).click();
	Thread.sleep(3000);
	try {
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	}
	catch(Exception e) {
		    System.out.println("no alert");
	
	}
    }
	
        // The code switches to a new window, initializes a JavascriptExecutor and Actions object, and then performs
        // a series of interactions with various web elements on the page, such as clicking a button, entering text 
        // into input fields, and selecting an option from a dropdown menu.
	
	public void testCase2() throws InterruptedException {
		try {
		driver.switchTo().window(handle);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	Actions action = new Actions(driver);
	Thread.sleep(2000);
	WebElement plusButton= (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#add-series-fab\").shadowRoot.querySelector(\"#icon\")");
	plusButton.click();
	Thread.sleep(2000);
	//wait.until(ExpectedConditions.jsReturnsValue((String) jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#add-series-fab\").shadowRoot.querySelector(\"#icon\")")));
	WebElement seriesName = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#series-list-page > base-form > series-form\").shadowRoot.querySelector(\"#seriesform > form > div:nth-child(4) > paper-input:nth-child(2)\").shadowRoot.querySelector(\"#input-1 > input\")");
	seriesName.sendKeys("SM0516");
	Thread.sleep(2000);
	WebElement descripionOfseries = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#series-list-page > base-form > series-form\").shadowRoot.querySelector(\"#seriesform > form > div:nth-child(4) > paper-input:nth-child(3)\").shadowRoot.querySelector(\"#input-2 > input\")");
	descripionOfseries.sendKeys("All LR device Board");
	Thread.sleep(2000);
	WebElement requirementsYear = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#series-list-page > base-form > series-form\").shadowRoot.querySelector(\"#seriesform > form > div:nth-child(5) > paper-dropdown-menu\").shadowRoot.querySelector(\"#input\").shadowRoot.querySelector(\"#input-3 > input[type=text]\")");
	requirementsYear.click();
	Thread.sleep(2000);
	action.sendKeys(Keys.DOWN).build().perform();
	action.sendKeys(Keys.DOWN).build().perform();
	Thread.sleep(1000);
	action.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(2000);
	WebElement launchDate = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#series-list-page > base-form > series-form\").shadowRoot.querySelector(\"#seriesform > form > div:nth-child(6) > paper-input\").shadowRoot.querySelector(\"#input-4 > input[type=date]\")");
	launchDate.sendKeys("11/12/2022");
	WebElement marketVolume = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#series-list-page > base-form > series-form\").shadowRoot.querySelector(\"#seriesform > form > div:nth-child(7) > paper-input\").shadowRoot.querySelector(\"#input-5 > input[type=number]\")");
	marketVolume.sendKeys("100000");
	Thread.sleep(2000);
	WebElement nextButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#series-list-page > base-form > series-form\").shadowRoot.querySelector(\"#right-btn\")");
	nextButton.click();
	Thread.sleep(2000);
	WebElement socVendor = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#series-list-page > base-form > series-form\").shadowRoot.querySelector(\"#seriesform > form > div:nth-child(10) > paper-dropdown-menu:nth-child(2)\").shadowRoot.querySelector(\"#input\").shadowRoot.querySelector(\"#input-28 > input[type=text]\")");
	socVendor.click();
	Thread.sleep(1000);
	action.sendKeys(Keys.DOWN).build().perform();
	action.sendKeys(Keys.DOWN).build().perform();
	Thread.sleep(1000);
	action.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(2000);
	WebElement socChipset = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#series-list-page > base-form > series-form\").shadowRoot.querySelector(\"#seriesform > form > div:nth-child(10) > paper-dropdown-menu:nth-child(3)\").shadowRoot.querySelector(\"#input\").shadowRoot.querySelector(\"#input-29 > input[type=text]\")");
	socChipset.click();
	Thread.sleep(1000);
	action.sendKeys(Keys.DOWN).build().perform();
	action.sendKeys(Keys.DOWN).build().perform();
	Thread.sleep(1000);
	action.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(2000);                                          
	WebElement youTubeTV = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#series-list-page > base-form > series-form\").shadowRoot.querySelector(\"#seriesform > form > div:nth-child(11) > paper-toggle-button:nth-child(2)\")");
	youTubeTV.click();
	WebElement youTubeKids = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#series-list-page > base-form > series-form\").shadowRoot.querySelector(\"#seriesform > form > div:nth-child(11) > paper-toggle-button:nth-child(3)\")");
	youTubeKids.click();
	WebElement evergreenLevel = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#series-list-page > base-form > series-form\").shadowRoot.querySelector(\"#seriesform > form > div:nth-child(13) > paper-dropdown-menu\").shadowRoot.querySelector(\"#input\").shadowRoot.querySelector(\"#input-30 > input[type=text]\")");
	evergreenLevel.click();
	Thread.sleep(1000);
	action.sendKeys(Keys.DOWN).build().perform();
	action.sendKeys(Keys.DOWN).build().perform();
	Thread.sleep(1000);
	action.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(2000);
	WebElement nextButton1 = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#series-list-page > base-form > series-form\").shadowRoot.querySelector(\"#right-btn\")");
	nextButton1.click();
	Thread.sleep(1000);
	WebElement closeButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#series-list-page > base-form\").shadowRoot.querySelector(\"#close-form-btn > iron-icon\")");
	closeButton.click();
	Thread.sleep(2000);
//	WebElement submitButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#series-form > series-form\").shadowRoot.querySelector(\"#form-drawer-buttons\")");
//	submitButton.click(); 
	if(closeButton.isEnabled() == true) {
		Thread.sleep(3000);
		Set<String> handles = driver.getWindowHandles();
for(String i : handles) {
	driver.switchTo().window(i);
	 
}
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"4424800\"]/td[2]/a")).click();
Thread.sleep(5000);
WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));
  filterElement.click();
//  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
  Thread.sleep(3000);
  driver.findElement(By.xpath("//span[contains(text(),'Passed')]")).click();
  Thread.sleep(3000);
//  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//  Thread.sleep(3000);
//  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//  Thread.sleep(3000);
	}
	
	     
		else if (closeButton.isEnabled() == false)
	{ 
		Thread.sleep(3000);
		Set<String> handles = driver.getWindowHandles();
for(String i : handles) {
	driver.switchTo().window(i);
	
}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"4424800\"]/td[2]/a")).click();
		Thread.sleep(5000);
		WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));		
		  filterElement.click();
//		  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//span[contains(text(),'Failed')]")).click();
		  Thread.sleep(3000);
//		  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//		  Thread.sleep(3000);
//		  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//		  Thread.sleep(3000);
	}
//	WebElement testCaseButton = driver.findElement(By.xpath("//a[contains(text(),'Testcases')]"));
//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", testCaseButton);
	jse.executeScript("window.scrollBy(0,-5000)");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(text(),'Testcases')]")).click();
	Thread.sleep(5000);
	try {
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		}
		catch(Exception e) {
			System.out.println("no alert");
		}
		}
		catch(Exception e) {				try {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			WebElement closeButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > base-form\").shadowRoot.querySelector(\"#close-form-btn > iron-icon\")");
			closeButton.click();
			Thread.sleep(2000);
			WebElement backButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-breadcrumb > a > iron-icon\")");
			backButton.click();
			System.out.println("case number two is failed due to program error");}
			catch(Exception e1) {
				System.out.println("case number two is failed due to program error");
			}
		}
	}
	
	
	//The purpose of this particular test case is to navigate to the Models page of a particular MC Series 
	//and click on the Add button to add a new device.
	
	public void testCase3() throws InterruptedException {
		try {
		driver.switchTo().window(handle);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Actions action = new Actions(driver);
		WebElement MCseries = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#list-items > div:nth-child(1)\")");
		MCseries.click();
		Thread.sleep(2000);
		WebElement Models = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-tabs > a:nth-child(2)\")");
		Models.click();
		Thread.sleep(2000);
		WebElement addButton1 = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#add-device-fab\").shadowRoot.querySelector(\"#icon\")");
		addButton1.click();
		Thread.sleep(2000);
		WebElement newModel = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#add-model-fab\").shadowRoot.querySelector(\"#icon\")");
		newModel.click();
		Thread.sleep(2000);
		WebElement deviceType = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(2) > paper-dropdown-menu\").shadowRoot.querySelector(\"#input\").shadowRoot.querySelector(\"#input-10 > input[type=text]\")");
		deviceType.click();
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.ENTER).build().perform();
		WebElement deviceBrandName = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(3) > paper-input:nth-child(2)\").shadowRoot.querySelector(\"#input-11 > input\")");
		Thread.sleep(2000);
		deviceBrandName.sendKeys("LG");
		WebElement deviceModelName = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(3) > paper-input:nth-child(3)\").shadowRoot.querySelector(\"#input-12 > input\")");
		Thread.sleep(1000);
		deviceModelName.sendKeys("Rokulg2023");
		WebElement launchYear = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(3) > paper-input:nth-child(4)\").shadowRoot.querySelector(\"#input-13 > input\")");
		launchYear.sendKeys("2023");
		Thread.sleep(1000);
		WebElement northAmerica = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(4) > paper-checkbox:nth-child(2)\").shadowRoot.querySelector(\"#checkboxContainer\")");
		northAmerica.click();
		Thread.sleep(1000);
		WebElement latinAmerica = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(4) > paper-checkbox:nth-child(3)\")");
		latinAmerica.click();
		Thread.sleep(1000);
		WebElement europeMiddleEastandAfrica = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(4) > paper-checkbox:nth-child(4)\")");
		europeMiddleEastandAfrica.click();
		Thread.sleep(1000);
		WebElement asiaPacific = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(4) > paper-checkbox:nth-child(5)\")");
		asiaPacific.click();
		Thread.sleep(1000);
		WebElement HDR = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(5) > paper-toggle-button:nth-child(2)\").shadowRoot.querySelector(\"div.toggle-container\")");
		HDR.click();
		Thread.sleep(1000);
		WebElement microphone = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(5) > paper-toggle-button:nth-child(3)\")");
		microphone.click();
		Thread.sleep(1000);
		WebElement voiceAssistant = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(5) > paper-toggle-button.model-page-0\")");
		voiceAssistant.click();
		Thread.sleep(1000);
		WebElement amazonAlexa1 = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(6) > paper-checkbox:nth-child(3)\")");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", amazonAlexa1);
		Thread.sleep(2000);
		WebElement backgroundMode = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(5) > paper-toggle-button:nth-child(5)\")");
		backgroundMode.click();
		Thread.sleep(1000);
		WebElement wakeOnLan = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(5) > paper-toggle-button:nth-child(6)\")");
		wakeOnLan.click();
		Thread.sleep(1000);
		WebElement HDMIonlyoutput = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(5) > paper-toggle-button:nth-child(7)\")");
		HDMIonlyoutput.click();
		Thread.sleep(1000);
		WebElement textToSpeech = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(5) > paper-toggle-button:nth-child(8)\")");
		textToSpeech.click();
		Thread.sleep(1000);
		WebElement googleAssistant = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(6) > paper-checkbox:nth-child(2)\")");
		googleAssistant.click();
		Thread.sleep(1000);
		WebElement amazonAlexa = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(6) > paper-checkbox:nth-child(3)\")");
		amazonAlexa.click();
		Thread.sleep(1000);
		WebElement nextButton2 = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#right-btn\")");
		nextButton2.click();
		Thread.sleep(3000);                                               
		WebElement systemIntegrator = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(10) > paper-input\").shadowRoot.querySelector(\"#input-31 > input\")");
		systemIntegrator.sendKeys("What");
		Thread.sleep(1000);	                                         
		WebElement deviceRam = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(10) > paper-dropdown-menu:nth-child(3)\").shadowRoot.querySelector(\"#input\").shadowRoot.querySelector(\"#input-32 > input[type=text]\")");
		deviceRam.click();
		Thread.sleep(1000);
		action.sendKeys(Keys.DOWN).build().perform();
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.ENTER).build().perform();							
		WebElement maximumResolution = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(10) > paper-dropdown-menu:nth-child(5)\").shadowRoot.querySelector(\"#input\").shadowRoot.querySelector(\"#container\")");
		maximumResolution.click();
		Thread.sleep(1000);
		action.sendKeys(Keys.DOWN).build().perform();
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.ENTER).build().perform();
		WebElement VP9Profile0 = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(12) > span > paper-toggle-button:nth-child(1)\")");
		VP9Profile0.click();
		Thread.sleep(2000);
		WebElement AV1Codeclevel = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(12) > paper-dropdown-menu\").shadowRoot.querySelector(\"#input\").shadowRoot.querySelector(\"#input-35 > input[type=text]\")");
		AV1Codeclevel.click();
		Thread.sleep(1000);
		action.sendKeys(Keys.DOWN).build().perform();
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.ENTER).build().perform();
		WebElement playReadySecurityLevel = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(13) > paper-dropdown-menu:nth-child(2)\").shadowRoot.querySelector(\"#input\").shadowRoot.querySelector(\"#input-36 > input[type=text]\")");
		playReadySecurityLevel.click();
		Thread.sleep(1000);
		action.sendKeys(Keys.DOWN).build().perform();
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.ENTER).build().perform();
		WebElement widevineSecurityLevel = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(13) > paper-dropdown-menu:nth-child(4)\").shadowRoot.querySelector(\"#input\").shadowRoot.querySelector(\"#input-37 > input[type=text]\")");
		widevineSecurityLevel.click();
		Thread.sleep(1000);
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		WebElement submit = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#right-btn\")");
//		submit.click();
//		Thread.sleep(3000);												
		WebElement closeButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form\").shadowRoot.querySelector(\"#close-form-btn > iron-icon\")");
		closeButton.click();
		Thread.sleep(2000);
		WebElement backButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-breadcrumb > a > iron-icon\")");
		backButton.click();
		
		
		if(submit.isEnabled() == true && addButton1.isEnabled()==true) {
			Thread.sleep(3000);
			Set<String> handles = driver.getWindowHandles();
	for(String i : handles) {
		driver.switchTo().window(i);
		
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"4424801\"]/td[2]/a")).click();
	Thread.sleep(5000);
	WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));
	  filterElement.click();
	 // wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[contains(text(),'Passed')]")).click();
	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//	  Thread.sleep(3000);
		}
		else if (submit.isEnabled() == false || addButton1.isEnabled()==false) {
			Thread.sleep(3000);
			Set<String> handles = driver.getWindowHandles();
	for(String i : handles) {
		driver.switchTo().window(i);
		
	}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"4424801\"]/td[2]/a")).click();
			Thread.sleep(5000);
			WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));		
			  filterElement.click();
		//	  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//span[contains(text(),'Failed')]")).click();
			  Thread.sleep(3000);
//			  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//			  Thread.sleep(3000);
//			  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//			  Thread.sleep(3000);
		}
		jse.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Testcases')]")).click();
		Thread.sleep(5000);
		try {
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			}
			catch(Exception e) {
				System.out.println("no alert");
			}
		}
		catch(Exception e) {
			try {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			WebElement closeButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > base-form\").shadowRoot.querySelector(\"#close-form-btn > iron-icon\")");
			closeButton.click();
			Thread.sleep(2000);
			WebElement backButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-breadcrumb > a > iron-icon\")");
			backButton.click();
			System.out.println("case number three is failed due to program error");}
			catch(Exception e1) {
				System.out.println("case number three is failed due to program error");
			}
		}
	}
	
	public void testCase4() throws InterruptedException {
		try {
		driver.switchTo().window(handle);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Actions action = new Actions(driver);
		WebElement MCseries = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#list-items > div:nth-child(1) > div > h3\")");
		MCseries.click();
		Thread.sleep(2000);
		WebElement Models = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-tabs > a:nth-child(2)\")");
		Models.click();
		Thread.sleep(2000);
		WebElement deleteButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.series-tab-page.iron-selected > device-models\").shadowRoot.querySelector(\"vaadin-grid > vaadin-grid-cell-content:nth-child(102) > iron-icon\")");
		deleteButton.click();
		Thread.sleep(2000);
		WebElement cancel = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.series-tab-page.iron-selected > device-models\").shadowRoot.querySelector(\"#confirmation-modal > div > paper-button:nth-child(1)\")");
		cancel.click();
		WebElement backButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-breadcrumb > a > iron-icon\")");
		backButton.click();
		Thread.sleep(1000);
		if(cancel.isEnabled()==true) {
			Thread.sleep(3000);
			Set<String> handles = driver.getWindowHandles();
	for(String i : handles) {
		driver.switchTo().window(i);
		
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"4484280\"]/td[2]/a")).click();
	Thread.sleep(5000);
	WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));
	  filterElement.click();
	 // wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[contains(text(),'Passed')]")).click();
	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//	  Thread.sleep(3000);
		}
		else if(cancel.isEnabled()==false){
			Thread.sleep(3000);
			Set<String> handles = driver.getWindowHandles();
	for(String i : handles) {
		driver.switchTo().window(i);
		
	}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"4484280\"]/td[2]/a")).click();
			Thread.sleep(5000);
			WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));		
			  filterElement.click();
			//  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//span[contains(text(),'Failed')]")).click();
			  Thread.sleep(3000);
//			  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//			  Thread.sleep(3000);
//			  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//			  Thread.sleep(3000);
		
		}
		jse.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Testcases')]")).click();
		Thread.sleep(5000);
		try {
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			}
			catch(Exception e) {
				System.out.println("no alert");
			}
		}
		catch(Exception e) {
			try {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			WebElement closeButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > base-form\").shadowRoot.querySelector(\"#close-form-btn > iron-icon\")");
			closeButton.click();
			Thread.sleep(2000);
			WebElement backButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-breadcrumb > a > iron-icon\")");
			backButton.click();
			System.out.println("case number four is failed due to program error");}
			catch(Exception e1) {
				System.out.println("case number four is failed due to program error");
			}
		}
		
	}
	
	public void testCase5() throws InterruptedException {
		try {
		driver.switchTo().window(handle);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		WebElement MCseries = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#list-items > div:nth-child(1) > div\")");
		MCseries.click();
		Thread.sleep(3000);
		WebElement Models = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-tabs > a:nth-child(2)\")");
		Models.click();
		Thread.sleep(3000);
		WebElement updateElements = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.series-tab-page.iron-selected > device-models\").shadowRoot.querySelector(\"vaadin-grid > vaadin-grid-cell-content:nth-child(100) > iron-icon\")");
		updateElements.click();
		Thread.sleep(3000);
		WebElement deviceBrandName = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(3) > paper-input:nth-child(2)\").shadowRoot.querySelector(\"#input-11 > input\")");
		Thread.sleep(3000);
		deviceBrandName.sendKeys("LG");
		WebElement deviceModelName = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(3) > paper-input:nth-child(3)\").shadowRoot.querySelector(\"#input-12 > input\")");
		Thread.sleep(3000);
		deviceModelName.sendKeys("Rokulg2023");
		WebElement launchYear = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#model-form > form > div:nth-child(3) > paper-input:nth-child(4)\").shadowRoot.querySelector(\"#input-13 > input\")");
		launchYear.sendKeys("2023");
		Thread.sleep(3000);
		WebElement nextButtonUpdate = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#right-btn\")");
		nextButtonUpdate.click();
		Thread.sleep(3000);
		WebElement newIframe = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#model-form > model-form\").shadowRoot.querySelector(\"#form-drawer-buttons\")");
		newIframe.click();
		Thread.sleep(3000);
//		WebElement closeButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#series-list-page > base-form\").shadowRoot.querySelector(\"#close-form-btn > iron-icon\")");
//		closeButton.click();
//		Thread.sleep(2000);
		WebElement backButton1 = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-breadcrumb > a > iron-icon\")");
		backButton1.click();
		Thread.sleep(2000);
		if(newIframe.isEnabled()==true) {
			Thread.sleep(3000);
			Set<String> handles = driver.getWindowHandles();
	for(String i : handles) {
		driver.switchTo().window(i);
		
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"4484280\"]/td[2]/a")).click();
	Thread.sleep(5000);
	WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));
	  filterElement.click();
	//  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[contains(text(),'Passed')]")).click();
	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//	  Thread.sleep(3000);
		}
		else if(newIframe.isEnabled()==false){
			Thread.sleep(3000);
			Set<String> handles = driver.getWindowHandles();
	for(String i : handles) {
		driver.switchTo().window(i);
		
	}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"4484280\"]/td[2]/a")).click();
			Thread.sleep(5000);
			WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));		
			  filterElement.click();
			//  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//span[contains(text(),'Failed')]")).click();
			  Thread.sleep(3000);
//			  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//			  Thread.sleep(3000);
//			  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//			  Thread.sleep(3000);
//		
		}
		jse.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Testcases')]")).click();
		Thread.sleep(5000);
		try {
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			}
			catch(Exception e) {
				System.out.println("no alert");
			}
		}
		catch(Exception e) {
			try {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			WebElement closeButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > base-form\").shadowRoot.querySelector(\"#close-form-btn > iron-icon\")");
			closeButton.click();
			Thread.sleep(2000);
			WebElement backButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-breadcrumb > a > iron-icon\")");
			backButton.click();
			System.out.println("case number five is failed due to program error");}
			catch(Exception e1) {
				System.out.println("case number five is failed due to program error");
			}
		}
	}
	
	public void testCase6() throws InterruptedException {
		try {
		driver.switchTo().window(handle);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		WebElement MCseries = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#list-items > div:nth-child(1) > div\")");
		MCseries.click();
		Thread.sleep(3000);
		WebElement Models = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-tabs > a:nth-child(2)\")");
		Models.click();
		Thread.sleep(3000);
		WebElement verifyModelSection = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.series-tab-page.iron-selected > device-models\").shadowRoot.querySelector(\"vaadin-grid\").shadowRoot.querySelector(\"#table\")");
		if(verifyModelSection.isEnabled()==true) {
			Thread.sleep(5000);
			WebElement testing = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-tabs > a:nth-child(3)\")");
			testing.click();
			Thread.sleep(3000);}
		else {System.out.println("Model section has not been created!!!");}
		WebElement verifyTestingSection = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#test-container\")");		
		if(verifyTestingSection.isEnabled()==true) {
			WebElement sharing = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-tabs > a:nth-child(4)\")");
			sharing.click();
			Thread.sleep(3000);
		}
		else {System.out.println("Testing section has not been created!!!");}
		WebElement verifySharingSection =(WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected\")");
			if(verifySharingSection.isEnabled()==true) {
				WebElement complieance = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-tabs > a:nth-child(5)\")");
				complieance.click();
				Thread.sleep(3000);
		}
		else {System.out.println("Sharing section has not been created!!!");}
			WebElement complieance = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-tabs > a:nth-child(5)\")");
					if(complieance.isEnabled()==true) {
			Thread.sleep(2000);
			Set<String> handles = driver.getWindowHandles();
	for(String i : handles) {
		driver.switchTo().window(i);
		
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"4484284\"]/td[2]/a")).click();
	Thread.sleep(5000);
	WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));
	  filterElement.click();
	//  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[contains(text(),'Passed')]")).click();
	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//	  Thread.sleep(3000);

			
		}
		else if(complieance.isEnabled()==false){
			Thread.sleep(2000);
			WebElement backButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-breadcrumb > a > iron-icon\")");
			backButton.click();
			Thread.sleep(3000);
			Set<String> handles = driver.getWindowHandles();
	for(String i : handles) {
		driver.switchTo().window(i);
		
	}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\\\"4484284\\\"]/td[2]/a")).click();
			Thread.sleep(5000);
			WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));		
			  filterElement.click();
			//  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//span[contains(text(),'Failed')]")).click();
			  Thread.sleep(3000);
//			  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//			  Thread.sleep(3000);
//			  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//			  Thread.sleep(3000);
		}
		jse.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Testcases')]")).click();
		Thread.sleep(5000);
		try {
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			}
			catch(Exception e) {
				System.out.println("no alert");
			}
		}
		catch(Exception e) {
			try {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			WebElement backButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-breadcrumb > a > iron-icon\")");
			backButton.click();
			System.out.println("case number six is failed due to program error");}
			catch(Exception e1) {
				System.out.println("case number six is failed due to program error");
			}
		}
	}
	
	public void testcase7() throws InterruptedException {
		try {
		Thread.sleep(2000);
		driver.switchTo().window(handle);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement backButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-breadcrumb > a > iron-icon\")");
		backButton.click();
		Thread.sleep(3000);
		WebElement testSeriesRoopaAmazon = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#list-items > div:nth-child(4) > div > h3\")");
		testSeriesRoopaAmazon.click();
		Thread.sleep(2000);
		WebElement testing = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-tabs > a:nth-child(3)\")");
		testing.click();
		Thread.sleep(5000);
		WebElement cookie = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#test-container > test-suite:nth-child(5)\").shadowRoot.querySelector(\"#suite\")");
		cookie.click();
		Thread.sleep(5000);
//		WebElement HFRTest = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#test-container > test-suite:nth-child(9)\").shadowRoot.querySelector(\"#suite\")");
//		HFRTest.click();
//		Thread.sleep(5000);
		WebElement cookiesNotCompleted = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#test-container > test-suite:nth-child(5)\").shadowRoot.querySelector(\"#results-testing > automatic-test-result:nth-child(1)\").shadowRoot.querySelector(\"#test-result-icon\")");
//		WebElement passedIcon = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#test-container > test-suite:nth-child(9)\").shadowRoot.querySelector(\"#test-result-icon\")");
		if(cookiesNotCompleted.isEnabled()==true) {
			Thread.sleep(4000);
			Set<String> handles = driver.getWindowHandles();
			for(String i : handles) {
				driver.switchTo().window(i);
				
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"4369217\"]/td[2]/a")).click();
			Thread.sleep(5000);
			WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));		
			  filterElement.click();
			//  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//span[contains(text(),'Failed')]")).click();
			  Thread.sleep(3000);
//			  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//			  Thread.sleep(3000);
//			  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//			  Thread.sleep(3000);
		}
		else if(cookiesNotCompleted.isEnabled()==false){
			Set<String> handles = driver.getWindowHandles();
			for(String i : handles) {
				driver.switchTo().window(i);
				
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"4369217\"]/td[2]/a")).click();
			Thread.sleep(5000);
			WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));
			  filterElement.click();
			//  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//span[contains(text(),'Passed')]")).click();
			  Thread.sleep(3000);
//			  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//			  Thread.sleep(3000);
//			  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//			  Thread.sleep(3000);

		}
		
		jse.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Testcases')]")).click();
		Thread.sleep(3000);
		try {
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			}
			catch(Exception e) {
				System.out.println("no alert");
			}
		}
		catch(Exception e) {
			try {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			Thread.sleep(2000);
			WebElement backButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-breadcrumb > a > iron-icon\")");
			backButton.click();
			System.out.println("case number seven is failed due to program error");}
			catch(Exception e1) {
				System.out.println("case number seven is failed due to program error");
			}
		}
	
	}
	
	public void testCase8() throws InterruptedException {
		try {
		Thread.sleep(2000);
		driver.switchTo().window(handle);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement backButton1 = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-breadcrumb > a > iron-icon\")");
		backButton1.click();
		Thread.sleep(3000);
		WebElement testSeriesRoopaAmazon = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#list-items > div:nth-child(4) > div > h3\")");
		testSeriesRoopaAmazon.click();
		Thread.sleep(3000);
		WebElement testing = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-tabs > a:nth-child(3)\")");
		testing.click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(3000);
		WebElement collapseAll = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#test-container > paper-button\")");
		collapseAll.click();
		Thread.sleep(3000);
		WebElement voiceSearchQueries = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#test-container > manual-test-result:nth-child(40)\").shadowRoot.querySelector(\"#icon-title\")");
		voiceSearchQueries.click();
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(4000);
		WebElement passedRadioButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#test-container > manual-test-result:nth-child(40)\").shadowRoot.querySelector(\"#description-container > div.description-column > div:nth-child(5) > paper-radio-group > paper-radio-button:nth-child(1)\")");
		passedRadioButton.click();
		Thread.sleep(5000);
		WebElement failedRadioButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#test-container > manual-test-result:nth-child(40)\").shadowRoot.querySelector(\"#description-container > div.description-column > div:nth-child(5) > paper-radio-group > paper-radio-button:nth-child(2)\")");
		failedRadioButton.click();
		Thread.sleep(3000);
		if(passedRadioButton.isEnabled()==true || failedRadioButton.isEnabled()==true) {
			Thread.sleep(3000);
			Set<String> handles = driver.getWindowHandles();
	for(String i : handles) {
		driver.switchTo().window(i);
		
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"4369218\"]/td[2]/a")).click();
	Thread.sleep(5000);
	WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));
	  filterElement.click();
	//  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[contains(text(),'Passed')]")).click();
	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//	  Thread.sleep(3000);

			
		}
		else if(passedRadioButton.isEnabled()==false || failedRadioButton.isEnabled()==false){
			Thread.sleep(3000);
			Set<String> handles = driver.getWindowHandles();
	for(String i : handles) {
		driver.switchTo().window(i);
		
	}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"4369218\"]/td[2]/a")).click();
			Thread.sleep(5000);
			WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));		
			  filterElement.click();
		//	  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//span[contains(text(),'Failed')]")).click();
			  Thread.sleep(3000);
//			  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//			  Thread.sleep(3000);
//			  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//			  Thread.sleep(3000);
		}
		jse.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Testcases')]")).click();
		Thread.sleep(5000);
		try {
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			}
			catch(Exception e) {
				System.out.println("no alert");
			}
		}
		catch(Exception e) {
			try {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			Thread.sleep(2000);
			WebElement backButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-breadcrumb > a > iron-icon\")");
			backButton.click();
			System.out.println("case number eight is failed due to program error");}
			catch(Exception e1) {
				System.out.println("case number eight is failed due to program error");
			}
		}
		}
	
	public void testCase9() throws InterruptedException {
		try {
		
		Thread.sleep(2000);
		driver.switchTo().window(handle);
		Actions action = new Actions(driver); 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement backButton1 = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-breadcrumb > a > iron-icon\")");
		backButton1.click();
		Thread.sleep(3000);
		WebElement testSeriesRoopaAmazon = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#list-items > div:nth-child(4) > div > h3\")");
		testSeriesRoopaAmazon.click();
		Thread.sleep(3000);
		WebElement testing = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-tabs > a:nth-child(3)\")");
		testing.click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,1600)");
		Thread.sleep(3000);
//		WebElement collapseAll = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#test-container > paper-button\")");
//		collapseAll.click();
//		Thread.sleep(3000);
//		WebElement voiceSearchQueries = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#test-container > manual-test-result:nth-child(40)\").shadowRoot.querySelector(\"#icon-title\")");
//		voiceSearchQueries.click();
//		Thread.sleep(4000);
		WebElement deleteButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#test-container > manual-test-result:nth-child(40)\").shadowRoot.querySelector(\"#description-container > div.file-preview-column > file-upload\").shadowRoot.querySelector(\"form > div > paper-button > iron-icon\")");
		deleteButton.click();
		Thread.sleep(2000);
		WebElement ChooseFilesToUpload = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#test-container > manual-test-result:nth-child(40)\").shadowRoot.querySelector(\"#description-container > div.file-preview-column > file-upload\").shadowRoot.querySelector(\"#file-upload-input\")");
		ChooseFilesToUpload.sendKeys("/home/aberhe/Pictures/Screenshot from 2022-05-16 12-57-36.png");
		Thread.sleep(4000);
		if(ChooseFilesToUpload.isEnabled() ==true ||  deleteButton.isEnabled()== true) {
			Thread.sleep(3000);
			Set<String> handles = driver.getWindowHandles();
	for(String i : handles) {
		driver.switchTo().window(i);
		
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"4461722\"]/td[2]/a")).click();
	Thread.sleep(5000);
	WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));
	  filterElement.click();
	//  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[contains(text(),'Passed')]")).click();
	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//	  Thread.sleep(3000);
		}
		else if(testSeriesRoopaAmazon.isEnabled()==false || deleteButton.isEnabled()==false || ChooseFilesToUpload.isEnabled() == false) {
			Thread.sleep(3000);
			Set<String> handles = driver.getWindowHandles();
	for(String i : handles) {
		driver.switchTo().window(i);
		
	}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"4461722\"]/td[2]/a")).click();
			Thread.sleep(5000);
			WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));		
			  filterElement.click();
			//  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//span[contains(text(),'Failed')]")).click();
			  Thread.sleep(3000);

		}
		jse.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Testcases')]")).click();
		Thread.sleep(5000);
		try {
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			}
			catch(Exception e) {
				System.out.println("no alert");
			}
		}
		catch(Exception e) {
			try {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			Thread.sleep(2000);
			WebElement backButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-breadcrumb > a > iron-icon\")");
			backButton.click();
			System.out.println("case number nine is failed due to program error");}
			catch(Exception e1) {
				System.out.println("case number nine is failed due to program error");
			}
		}
	}
	
	public void testCase10() throws InterruptedException {
		try {
		Thread.sleep(3000);
		driver.switchTo().window(handle);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement backButton1 = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-breadcrumb > a > iron-icon\")");
		backButton1.click();
		Actions action = new Actions(driver); 
		Thread.sleep(3000);
		WebElement SM0510 = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#list-items > div:nth-child(12)\")");
		SM0510.click();
		Thread.sleep(2000);
		WebElement editDetail = (WebElement) jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > series-details\").shadowRoot.querySelector(\"#edit-series-fab\").shadowRoot.querySelector(\"#icon\")");
		editDetail.click();
		Thread.sleep(3000);                                                   
		WebElement descripionOfseries = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > base-form > series-form\").shadowRoot.querySelector(\"#seriesform > form > div:nth-child(5) > paper-input:nth-child(3)\").shadowRoot.querySelector(\"#input-15 > input\")");
		descripionOfseries.sendKeys("1");
		Thread.sleep(2000);
		WebElement date = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > base-form > series-form\").shadowRoot.querySelector(\"#seriesform > form > div:nth-child(7) > paper-input\").shadowRoot.querySelector(\"#input-17 > input[type=date]\")");
		date.sendKeys("12/12/2023");
		Thread.sleep(2000);
		WebElement marketVolume = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > base-form > series-form\").shadowRoot.querySelector(\"#seriesform > form > div:nth-child(8) > paper-input\").shadowRoot.querySelector(\"#input-18 > input[type=number]\")");
		marketVolume.sendKeys("0");
		Thread.sleep(2000);
		WebElement nextButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > base-form > series-form\").shadowRoot.querySelector(\"#right-btn\")");
		nextButton.click();
		Thread.sleep(2000);                                           
		WebElement socVendor = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > base-form > series-form\").shadowRoot.querySelector(\"#seriesform > form > div:nth-child(11) > paper-dropdown-menu:nth-child(2)\").shadowRoot.querySelector(\"#input\").shadowRoot.querySelector(\"#input-38 > input[type=text]\")");
		socVendor.click();
		Thread.sleep(2000);
		action.sendKeys(Keys.DOWN).build().perform();
		action.sendKeys(Keys.DOWN).build().perform();
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
//		WebElement socChipset = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > base-form > series-form\").shadowRoot.querySelector(\"#seriesform > form > div:nth-child(11) > paper-dropdown-menu:nth-child(3)\").shadowRoot.querySelector(\"#input\").shadowRoot.querySelector(\"#input-29 > input[type=text]\")");
//		socChipset.click();
//		Thread.sleep(2000);
//		action.sendKeys(Keys.DOWN).build().perform();
//		action.sendKeys(Keys.DOWN).build().perform();
//		action.sendKeys(Keys.DOWN).build().perform();
//		Thread.sleep(2000);
//		action.sendKeys(Keys.ENTER).build().perform();
//		Thread.sleep(2000);                                              
		WebElement evergreenLevel = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > base-form > series-form\").shadowRoot.querySelector(\"#seriesform > form > div:nth-child(14) > paper-dropdown-menu\").shadowRoot.querySelector(\"#input\").shadowRoot.querySelector(\"#input-40 > input[type=text]\")");
		evergreenLevel.click();
		Thread.sleep(2000);                                            
		WebElement nextButton1 = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > base-form > series-form\").shadowRoot.querySelector(\"#right-btn\")");
		nextButton1.click();
		Thread.sleep(3000);
		WebElement closeButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > base-form\").shadowRoot.querySelector(\"#close-form-btn > iron-icon\")");
		closeButton.click();
	//	WebElement updateButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-form > series-form\").shadowRoot.querySelector(\"#form-drawer-buttons\")");
	//	updateButton.click(); 
		Thread.sleep(2000);						
		if(editDetail.isEnabled()==true) {
			Thread.sleep(3000);
			Set<String> handles = driver.getWindowHandles();
	for(String i : handles) {
		driver.switchTo().window(i);
		
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"4427494\"]/td[2]/a")).click();
	Thread.sleep(5000);
	WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));
	  filterElement.click();
	//  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[contains(text(),'Passed')]")).click();
	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//	  Thread.sleep(3000);
		}
		else if(editDetail.isEnabled() == false) {
			Thread.sleep(3000);
			Set<String> handles = driver.getWindowHandles();
	for(String i : handles) {
		driver.switchTo().window(i);
		
	}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"4427494\"]/td[2]/a")).click();
			Thread.sleep(5000);
			WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));		
			  filterElement.click();
			//  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//span[contains(text(),'Failed')]")).click();
			  Thread.sleep(3000);
//			  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//			  Thread.sleep(3000);
//			  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//			  Thread.sleep(3000);
		}
		jse.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Testcases')]")).click();
		Thread.sleep(5000);
		try {
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			}
			catch(Exception e) {
				System.out.println("no alert");
			}
		}
		catch(Exception e) {
			try {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			WebElement closeButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > base-form\").shadowRoot.querySelector(\"#close-form-btn > iron-icon\")");
			closeButton.click();
			Thread.sleep(2000);
			WebElement backButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-breadcrumb > a > iron-icon\")");
			backButton.click();
			System.out.println("case number ten is failed due to program error");}
			catch(Exception e1) {
				System.out.println("case number ten is failed due to program error");
			}
		}
	}
	
	public void testCase11() throws InterruptedException {
		try {
		Thread.sleep(3000);
		driver.switchTo().window(handle);
		Actions action = new Actions(driver); 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement backButton1 = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-breadcrumb > a > iron-icon\")");
		backButton1.click();
		Thread.sleep(3000);
		WebElement testSeriesRoopaAmazon = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#list-items > div:nth-child(4) > div > h3\")");
		testSeriesRoopaAmazon.click();
		Thread.sleep(3000);
		WebElement testing = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-tabs > a:nth-child(3)\")");
		testing.click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,1600)");
		Thread.sleep(3000);
		WebElement voiceSearchQueries = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#test-container > manual-test-result:nth-child(40)\").shadowRoot.querySelector(\"#icon-title\")");
		voiceSearchQueries.click();
		Thread.sleep(4000);
		WebElement reportIssueButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#test-container > manual-test-result:nth-child(40)\").shadowRoot.querySelector(\"#action-div > partner-issue\").shadowRoot.querySelector(\"#report-button\")");
		reportIssueButton.click();
		Thread.sleep(2000);
		WebElement fileNewIssue = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#partner-bug-form > partner-bug-form\").shadowRoot.querySelector(\"#file-new\")");
		fileNewIssue.click();
		Thread.sleep(2000);
		WebElement backButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#partner-bug-form > partner-bug-form\").shadowRoot.querySelector(\"#left-btn\")");
		backButton.click();
		Thread.sleep(2000);
		WebElement closeButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#partner-bug-form\").shadowRoot.querySelector(\"#close-form-btn > iron-icon\")");
		closeButton.click();
		Thread.sleep(2000);
		if(reportIssueButton.isEnabled()==true && fileNewIssue.isEnabled()==true) {
			Thread.sleep(3000);
			Set<String> handles = driver.getWindowHandles();
	for(String i : handles) {
		driver.switchTo().window(i);
		
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"4484287\"]/td[2]/a")).click();
	Thread.sleep(5000);
	WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));
	  filterElement.click();
	//  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[contains(text(),'Passed')]")).click();
	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//	  Thread.sleep(3000);
		}
		else if(reportIssueButton.isEnabled()==false && fileNewIssue.isEnabled()==false) {
			Thread.sleep(3000);
			Set<String> handles = driver.getWindowHandles();
	for(String i : handles) {
		driver.switchTo().window(i);
		
	}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"4484287\"]/td[2]/a")).click();
			Thread.sleep(5000);
			WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));		
			  filterElement.click();
			//  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//span[contains(text(),'Failed')]")).click();
			  Thread.sleep(3000);
//			  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//			  Thread.sleep(3000);
//			  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//			  Thread.sleep(3000);
		}
		jse.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Testcases')]")).click();
		Thread.sleep(5000);
		try {
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			}
			catch(Exception e) {
				System.out.println("no alert");
			}
		}
		catch(Exception e) {
			try {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			WebElement closeButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > base-form\").shadowRoot.querySelector(\"#close-form-btn > iron-icon\")");
			closeButton.click();
			Thread.sleep(2000);
			WebElement backButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-breadcrumb > a > iron-icon\")");
			backButton.click();
			System.out.println("case number eleven is failed due to program error");}
			catch(Exception e1) {
				System.out.println("case number eleven is failed due to program error");
			}
		}
	} 

	public void testCase12() throws InterruptedException {
		try {
		Thread.sleep(3000);
		driver.switchTo().window(handle);
		Actions action = new Actions(driver); 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement backButton1 = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-breadcrumb > a > iron-icon\")");
		backButton1.click();
		Thread.sleep(5000);
		WebElement testSeriesRoopaAmazon = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"#list-items > div:nth-child(4) > div > h3\")");
		testSeriesRoopaAmazon.click();
		Thread.sleep(3000);
		WebElement testing = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-tabs > a:nth-child(3)\")");
		testing.click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,1600)");
		Thread.sleep(3000);
		WebElement voiceSearchQueries = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#test-container > manual-test-result:nth-child(40)\").shadowRoot.querySelector(\"#icon-title\")");
		voiceSearchQueries.click();
		Thread.sleep(4000);
		WebElement reportIssueButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#test-container > manual-test-result:nth-child(40)\").shadowRoot.querySelector(\"#action-div > partner-issue\").shadowRoot.querySelector(\"#report-button\")");
		reportIssueButton.click();
		Thread.sleep(2000);
		WebElement linkExistedIssue = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#partner-bug-form > partner-bug-form\").shadowRoot.querySelector(\"#link-existing\")");
		linkExistedIssue.click();
		Thread.sleep(2000);                                                    
		WebElement sendingExistingIssue = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#partner-bug-form > partner-bug-form\").shadowRoot.querySelector(\"#issue-id-input\").shadowRoot.querySelector(\"#input-42 > input\")");
		sendingExistingIssue.sendKeys("7655884");
		Thread.sleep(2000);
		WebElement closeButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#partner-bug-form\").shadowRoot.querySelector(\"#close-form-btn > iron-icon\")");
		closeButton.click();
		if(reportIssueButton.isEnabled()==true && linkExistedIssue.isEnabled()==true && sendingExistingIssue.isEnabled()==true) {
			Thread.sleep(3000);
			Set<String> handles = driver.getWindowHandles();
	for(String i : handles) {
		driver.switchTo().window(i);
		
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"4484288\"]/td[2]/a")).click();
	Thread.sleep(5000);
	WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));
	  filterElement.click();
	//  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[contains(text(),'Passed')]")).click();
	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//	  Thread.sleep(3000);
		}
		else if(reportIssueButton.isEnabled()==false || linkExistedIssue.isEnabled()==false || sendingExistingIssue.isEnabled()==false) {
			Thread.sleep(3000);
			Set<String> handles = driver.getWindowHandles();
	for(String i : handles) {
		driver.switchTo().window(i);
		
	}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"4484288\"]/td[2]/a")).click();
			Thread.sleep(5000);
			WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));		
			  filterElement.click();
			//  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//span[contains(text(),'Failed')]")).click();
			  Thread.sleep(3000);
//			  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//			  Thread.sleep(3000);
//			  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//			  Thread.sleep(3000);
		}
		jse.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Testcases')]")).click();
		Thread.sleep(5000);
		try {
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			}
			catch(Exception e) {
				System.out.println("no alert");
			}
		}
		catch(Exception e) {
			try {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			WebElement closeButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > base-form\").shadowRoot.querySelector(\"#close-form-btn > iron-icon\")");
			closeButton.click();
			Thread.sleep(2000);
			WebElement backButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-breadcrumb > a > iron-icon\")");
			backButton.click();
			System.out.println("case number tweleve is failed due to program error");}
			catch(Exception e1) {
				System.out.println("case number tweleve is failed due to program error");
			}
		}
	}
		
	public void testcase13() throws InterruptedException {
		try {
		Thread.sleep(3000);
		driver.switchTo().window(handle);
		Actions action = new Actions(driver); 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement copyTestInfo = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > certification-view\").shadowRoot.querySelector(\"#copy-results-btn\").shadowRoot.querySelector(\"paper-button\")");
		copyTestInfo.click();
		if(copyTestInfo.isEnabled()==true) {
			Thread.sleep(3000);
			Set<String> handles = driver.getWindowHandles();
	for(String i : handles) {
		driver.switchTo().window(i);
		
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"4703913\"]/td[2]/a")).click();
	Thread.sleep(5000);
	WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));
	  filterElement.click();
	//  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[contains(text(),'Passed')]")).click();
	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//	  Thread.sleep(3000);
		}
		else if(copyTestInfo.isEnabled()==false) {
			Thread.sleep(3000);
			Set<String> handles = driver.getWindowHandles();
	for(String i : handles) {
		driver.switchTo().window(i);
		
	}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"4703913\"]/td[2]/a")).click();
			Thread.sleep(5000);
			WebElement filterElement = driver.findElement(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input"));		
			  filterElement.click();
			//  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultform\"]/table/tbody/tr[2]/td/div/input")));
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//span[contains(text(),'Failed')]")).click();
			  Thread.sleep(3000);
//			  driver.findElement(By.xpath("//*[@id=\"updbtn\"]")).sendKeys(Keys.DOWN);
//			  Thread.sleep(3000);
//			  driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
//			  Thread.sleep(3000);
		}
		jse.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Testcases')]")).click();
		Thread.sleep(5000);
		try {
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			}
			catch(Exception e) {
				System.out.println("no alert");
			}
		}
		catch(Exception e) {
			try {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			WebElement closeButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"iron-pages > div.iron-selected > base-form\").shadowRoot.querySelector(\"#close-form-btn > iron-icon\")");
			closeButton.click();
			Thread.sleep(2000);
			WebElement backButton = (WebElement)jse.executeScript("return document.querySelector(\"body > saltmine-app\").shadowRoot.querySelector(\"#content > iron-pages > device-list\").shadowRoot.querySelector(\"iron-pages > series-page\").shadowRoot.querySelector(\"#series-breadcrumb > a > iron-icon\")");
			backButton.click();
			System.out.println("case number thirteen is failed due to program error");}
			catch(Exception e1) {
				System.out.println("case number thirteen is failed due to program error");
			}
		}
	}

}

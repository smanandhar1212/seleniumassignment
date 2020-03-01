package LinerAutomationExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CerotidWebsiteLinerExample {

	static WebDriver driver;

	public static void main(String[] args) {
		// Step 1: invoke Browser go to cerotid page
		invokeBrowser();

		// Step 2: Fill form
		fillForm();

		// Step 3: Validate Success Message

	}

	private static void fillForm() {
		// Select Course
		// Creating Webelement Obj finding the location of the element
		WebElement course = driver.findElement(By.xpath("//select[@id='classType' ]"));
		// creating select obj and passing the element
		Select chooseCourse = new Select(course);
		// creating a string variable with course name
		String courseQaAutomation = "QA Automation";
		// selecting the course by visible text
		chooseCourse.selectByVisibleText(courseQaAutomation);

		// Selecting session
		WebElement session = driver.findElement(By.xpath("//select[@id='sessionType']"));
		Select chooseSession = new Select(session);

		// selecting the session by visible text
		String sessionType = "Upcoming Session";
		chooseSession.selectByVisibleText(sessionType);

		WebElement fullName = driver.findElement(By.xpath("//input[@id='name']"));
		fullName.sendKeys("Celina Manandhar");

		WebElement address = driver.findElement(By.xpath("//input[@id='address']"));
		address.sendKeys("5694 Bois D Arc Lane");

		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("Grand Prairie");

		// selecting State
		WebElement stateType = driver.findElement(By.xpath("//select[@id='state']"));
		Select chooseState = new Select(stateType);
		String state = "TX";
		// selecting the state by visible text
		chooseState.selectByVisibleText(state);

		WebElement zip = driver.findElement(By.xpath("//input[@id='zip']"));
		zip.sendKeys("75057");

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("celina.manandhar@gmail.com");

		WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='phone']"));
		phoneNumber.sendKeys("786-359-5988");

		// selecting Visa Status
		WebElement visaStatus = driver.findElement(By.xpath("//select[@id='visaStatus']"));
		Select chooseVisa = new Select(visaStatus);
		String status = "OPT";
		// selecting the state by visible text
		chooseVisa.selectByVisibleText(status);

		// selecting source
		WebElement source = driver.findElement(By.xpath("//select[@id='mediaSource']"));
		Select chooseSource = new Select(source);
		String referal = "Other";
		// selecting the source by visible text
		chooseSource.selectByVisibleText(referal);
		
		WebElement relocate = driver.findElement(By.xpath("//input[@type='radio']"));
		relocate.sendKeys("No");
		
		WebElement eduBackground = driver.findElement(By.xpath("//textarea[@id='eduDetails']"));
		eduBackground.sendKeys("Masters in Information Technology");
		

	}

	private static void invokeBrowser() {
		// Set the system path

		System.setProperty("webdriver.chrome.driver",
				"/Users/celina/Desktop/MyGitCode 2/learningselenium/libs/chromedriver");

		// Chromedriver obj
		driver = new ChromeDriver();

		// Navigates to Cerotid Websites
		driver.navigate().to("http://www.cerotid.com");

		System.out.println(driver.getTitle() + "-----------> Was lauched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}

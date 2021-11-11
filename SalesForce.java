package assignments.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("UserFirstName")).sendKeys("Tharani");
		driver.findElement(By.name("UserLastName")).sendKeys("M");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("tharanibe31@gmail.com");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("12345678");
		WebElement jobtitle = driver.findElement(By.name("UserTitle"));
		Select a = new Select(jobtitle);
		a.selectByVisibleText("Customer Service Manager");
		WebElement employees = driver.findElement(By.name("CompanyEmployees"));
		Select b = new Select(employees);
		b.selectByVisibleText("101 - 500 employees");
		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select c = new Select(country);
		c.selectByVisibleText("United States");
		WebElement state = driver.findElement(By.name("CompanyState"));
		Select d = new Select(state);
		d.selectByVisibleText("New York");
		driver.findElement(By.className("checkbox-ui")).click();
		driver.close();

	}

}

package assignments.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("Harry");
		driver.findElement(By.name("lastname")).sendKeys("Potter");
		driver.findElement(By.name("reg_email__")).sendKeys("5555");
		driver.findElement(By.name("reg_passwd__")).sendKeys("xxxx");
		WebElement d = driver.findElement(By.id("day"));
		Select select = new Select(d);
		select.selectByValue("12");
		WebElement m = driver.findElement(By.id("month"));
		Select a = new Select(m);
		a.selectByValue("8");
		WebElement y = driver.findElement(By.id("year"));
		Select b = new Select(y);
		b.selectByValue("1995");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		

	}

}

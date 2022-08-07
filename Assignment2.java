package Test;

import javax.crypto.BadPaddingException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws Exception 
	{
		//update students data
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		
		wd.manage().window().maximize();
		wd.get("https://student-app-frontend.herokuapp.com/view-all");
		wd.findElement(By.linkText("View All Students")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[2]/td[5]/button[1]")).click();
		Thread.sleep(3000);
		wd.findElement(By.id("lastName")).clear();//clearing last name data
		Thread.sleep(3000);
		wd.findElement(By.id("lastName")).sendKeys("Vishe");//updating last name data
		Thread.sleep(3000);
		Select s = new Select(wd.findElement(By.name("department")));
		s.selectByVisibleText("CS");//updating department
		Thread.sleep(3000);
		wd.findElement(By.id("percentage")).clear();//clearing percentage
		Thread.sleep(3000);
		wd.findElement(By.id("percentage")).sendKeys("90");//updating percentage
		Thread.sleep(2000);
		wd.findElement(By.cssSelector("button[type=submit]")).click();
		
		wd.close();

	}

}

package Test;

import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws Exception 
	{
		//add student data
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();//calling chromedriver
		
		wd.manage().window().maximize();//maximize the chrome window
		wd.get("https://student-app-frontend.herokuapp.com/view-all");//pass url
		wd.findElement(By.partialLinkText("Add Student")).click();
		wd.findElement(By.id("firstName")).sendKeys("Asmita");//adding first name
		wd.findElement(By.id("lastName")).sendKeys("Vishe");//adding last name
		Select s = new Select(wd.findElement(By.name("department")));
		s.selectByVisibleText("IT");//selecting department
		wd.findElement(By.id("percentage")).sendKeys("60");//adding percentage
		Thread.sleep(2000);
		wd.findElement(By.cssSelector("button[type=submit]")).click();
		
		wd.close();

	}

}

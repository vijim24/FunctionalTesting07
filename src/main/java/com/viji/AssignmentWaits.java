package com.viji;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentWaits {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.manage().window().maximize();
//		Getting the UserName and the Pwd
		String text = driver.findElement(By.cssSelector("p[class='text-center text-white']")).getText();
		System.out.println(text);
		String[] splittedText = text.split("is");
		System.out.println(splittedText[1]);

		System.out.println(splittedText[2]);
		String[] splittedUserName = splittedText[1].split(" ");
		String username = splittedUserName[1];
		String trimmedPwd = splittedText[2].trim();
		String password = trimmedPwd.substring(0, trimmedPwd.length() - 1);
		System.out.println(password);

		// entering username
		driver.findElement(By.cssSelector("#username")).sendKeys(username);
		// entering pwd
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		// clicking user radio button
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
//		Thread.sleep(2000);
//		Alert a = driver.switchTo().alert();
//		Thread.sleep(4000);
//		a.accept();
		w.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement staticDropDown = driver.findElement(By.cssSelector("select[class='form-control']"));
		staticDropDown.click();
		Select s = new Select(staticDropDown);
		s.selectByIndex(2);
//		Terms
		driver.findElement(By.cssSelector("#terms")).click();
//		SignIn Button
		driver.findElement(By.cssSelector("#signInBtn")).click();
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-info']")));

		List<WebElement> mobileItems = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for (WebElement a : mobileItems) {
			a.click();
		}
		driver.findElement(By.className("btn-primary")).click();

	}

}

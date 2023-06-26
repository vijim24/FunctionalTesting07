package com.viji;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcommerceUtil {
	public static void vegetableHandler(WebDriver driver) {
		List<WebElement> productNames = driver.findElements(By.cssSelector("h4.product-name"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
		List<String> myVegetableBasket = new ArrayList<>();
		myVegetableBasket.add("Brocolli");
		myVegetableBasket.add("Cucumber");
		myVegetableBasket.add("Cauliflower");
		myVegetableBasket.add("Potato");
		myVegetableBasket.add("Onion");
		System.out.println(myVegetableBasket);
		int j = myVegetableBasket.size();
		for (int i = 0; i < productNames.size(); i++) {
			String name = productNames.get(i).getText();
			String[] splittedVegetableName = name.split(" ");
			if (myVegetableBasket.contains(splittedVegetableName[0])) {
				j--;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == 0) // If J reaches the max size
					break;
			}
		}
		driver.findElement(By.cssSelector(".cart-icon")).click();
		driver.findElement(By.xpath("(//div[@class='action-block'] //button)[1]")).click();
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));
		System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo'])")).getText());

		
	}

}

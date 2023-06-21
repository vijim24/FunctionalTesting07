package com.viji;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EcommerceUtil {
	public static void vegetableHandler(WebDriver driver) {
		List<WebElement> productNames = driver.findElements(By.cssSelector("h4.product-name"));
		List<String> myVegetableBasket = new ArrayList<>();
		myVegetableBasket.add("Brocolli");
		myVegetableBasket.add("Cucumber");
		myVegetableBasket.add("Cauliflower");
		myVegetableBasket.add("Potato");
		myVegetableBasket.add("Onion");
		System.out.println(myVegetableBasket);
		int j=myVegetableBasket.size();
		for (int i = 0; i < productNames.size(); i++) {
			String name = productNames.get(i).getText();
			String[] splittedVegetableName = name.split(" ");
			if (myVegetableBasket.contains(splittedVegetableName[0])) {
				j--;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==0)  // If J reaches the max size
					break;
			}
		}
	}

}

package com.viji;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceApp01 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
//		Getting all the elements through array
		
//		 Here index position is needed so, For each cannot be used
//		for (WebElement myVeggieList : productName) {
//			if(myVeggieList.getText().contains("Cucumber"))
//			{
//				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
//				break;
//			}
//			else
//			{
//				continue;
//			}
//			
//		}
//		Creating Arrays for the vegetables
//		String[] myVegetableBaskets ={"Brocolli","Cucumber"};
//		List<String> vegetables =Arrays.asList(myVegetableBaskets);
//		for (int i = 0; i < productNames.size(); i++) {
//			String name = productNames.get(i).getText();
//			String[] splittedVegetableName = name.split(" ");
//			if (vegetables.contains(splittedVegetableName[0])) {
//				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//				
//			}
//		}

		
		

//		Adding the vegetables needed in the basket in the form of Array List
		EcommerceUtil util = new EcommerceUtil();
		EcommerceUtil.vegetableHandler(driver);
		
//		EcommerceUtil.vegetableHandler(driver);
		

	}



}

package com.sampleclass;



import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;



public class Auto {
	

		public static WebDriver driver;

		public static boolean isElementPresent(WebDriver driver ,String locator) {

			try {

				WebElement element = driver.findElement(By.xpath(locator));
				
				return true;

			} catch (NoSuchElementException e) {

			}

			return false;

		}

		public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\BIS\\eclipse-workspace\\interview\\Validation\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");

			String pageUrl = driver.getCurrentUrl();
			System.out.println(pageUrl);
			/*
			 * WebElement electronic =
			 * driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[4]"));
			 * electronic.click();
			 */
			String tab = "Top Offer" ;
			try {
				
			List<WebElement> tabs = driver.findElements(By.xpath("//span[@class='_1XjE3T']"));

			System.out.println("Number of Elements founds:"+ tabs.size());
			
			for (int i = 0; i < tabs.size(); i++) {

				System.out.println("Element   " +(i+1) + " is :" + tabs.get(i).getText());
			}
			
			
			/*
			for (WebElement x : tabs) {
				
			
				if(x.getText().equals(tab)) {
					x.click();
					break;
				}
				} */
				
			/*
			int index = 9;
			WebElement selectedOne = tabs.get(index);
			selectedOne.click(); */
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
			
	}




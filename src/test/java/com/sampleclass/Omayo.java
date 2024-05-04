package com.sampleclass;


	
	

	import java.util.Iterator;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Omayo {
		public static WebDriver driver;

		public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\BIS\\eclipse-workspace\\interview\\Validation\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://omayo.blogspot.com/");
			/*
			driver.findElement(By.linkText("Open a popup window")).click();

			Set<String> windowIds = driver.getWindowHandles();

			Iterator<String> itr = windowIds.iterator();

			String window = itr.next();
			System.out.println(window);
			
			String childwindow = itr.next();
			System.out.println(childwindow);
			
			driver.switchTo().window(childwindow);
			String newWindowText = driver.findElement(By.className("example")).getText();

			System.out.println(newWindowText);
			
			driver.close();
			
			driver.switchTo().window(window);
			
			driver.close(); */
			
			//driver.findElement(By.linkText("Open a popup window")).click();
			
			driver.findElement(By.linkText("Blogger")).click();
			
			Set<String> windowIds = driver.getWindowHandles();
			
			Iterator<String> itr = windowIds.iterator();
			/*
			String textInPage = null;
			
			while(itr.hasNext()) {
				
				String windowid = itr.next();
				
				driver.switchTo().window(windowid);
				
				
				
				if (driver.getTitle().equals("New Window")) {
					
					textInPage = driver.findElement(By.className("example")).getText();
					
				}
			}
			System.out.println(textInPage);  */
			
			String mainWindow = itr.next();
			System.out.println(mainWindow);
			
			String childWindow = itr.next();
			System.out.println(childWindow);
			
			driver.switchTo().window(childWindow);
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			driver.close();
			
			driver.switchTo().window(mainWindow);
			
			String secUrl = driver.getCurrentUrl();
			System.out.println(secUrl);
			
			driver.close();
		}

	}


}

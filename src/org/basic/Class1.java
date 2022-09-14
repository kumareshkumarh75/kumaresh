package org.basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pown Kumar\\eclipse-workspace\\java\\Jva\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/s?k=samsung+m13&sprefix=sam%2Caps%2C513&ref=nb_sb_ss_pltr-ranker-retrain-acsession-opsacceptance_4_3");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(2000);
		WebElement mob = driver.findElement(By.xpath("(//span[contains(text(),'Samsung Galaxy M13 ')])[1]"));
		mob.click();
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		for (String string : allwindows) {
			if (!string.equals(parent)) {
				driver.switchTo().window(string);
				WebElement text = driver.findElement(By.xpath("//span[@id='productTitle']"));
				String text2 = text.getText();
				System.out.println(text2);
				
				
				
			}
			
		}
			
			
			
		}
		
		
		
	}



package popUpHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PoPupHandling {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\S_DATA\\Selenium_Data\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.mycbseguide.com/");
		d.manage().window().maximize();
		if(d.findElement(By.xpath("//div[@class='modal-dialog']")).isDisplayed()){
			System.out.println("pop up appeared");
			d.findElement(By.xpath("//button[@class='close']")).click();
		}
	}

}

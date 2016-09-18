package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGJenkins {
	
	@Test
	public void method1(){
		System.out.println("Welcome to jenkins");
		
System.setProperty("webdriver.chrome.driver", "E:\\Kirti\\ChromeDriver\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.irctc.co.in");
		d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		d.manage().window().maximize();
		
		d.findElement(By.id("loginbutton")).click();
		Alert alert=d.switchTo().alert();
		System.out.println(alert.getText());
		Assert.assertEquals(alert.getText().equals("Enter User ID"), true);
		//alert.accept();//clicks on ok
		alert.dismiss();
		d.close();

	} 
}

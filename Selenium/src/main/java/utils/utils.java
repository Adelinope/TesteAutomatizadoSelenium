package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class utils {

	public WebDriver driver;

	public utils() {
	}

	public void inicia(String url) {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public void ScrollPage(By value){
		WebElement element = driver.findElement(value);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
	}
	public void MethodBy(By value){
		WebElement frame = driver.findElement(value);
		driver.switchTo().frame(frame);
	}
	public void fechaNavegador(WebDriver driver) { driver.quit(); }
}

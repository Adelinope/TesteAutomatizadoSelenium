package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class utils {

	WebDriver driver;

	public utils(WebDriver driver) {
		this.driver = driver;
	}

	public void scrollToElement(By value) {
		WebElement element = driver.findElement(value);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
	}

	public void findFrameElement(By value) {
		WebElement frame = driver.findElement(value);
		driver.switchTo().frame(frame);
	}

}

package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MapsMenu {
	WebDriver driver;

	public MapsMenu(WebDriver driver) {
		this.driver = driver;
	}

	public By elemendoPropagandaDinamico(String elemento) {
		return By.xpath("//div[contains(text(),'" + elemento + "')]");
	}
}
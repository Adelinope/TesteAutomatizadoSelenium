package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.utils;

import java.awt.image.ImageProducer;
import java.util.concurrent.TimeUnit;

public class BasePage {
	WebDriver driver;
	WebDriverWait wait;
	utils utils;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
	}

	public void clickGenerico(WebElement elemento, String nomeElemento) throws Exception {
		if (wait.until(ExpectedConditions.elementToBeClickable(elemento)) != null) {
			elemento.click();
			System.out.println("Clicou no elemento: " + nomeElemento);
		} else {
			throw new Exception("Erro ao clicar em: " + nomeElemento);
		}
	}

	public void sendKeysGenerico(WebElement elemento, String valor, String nomeElemento) throws Exception {
		if (wait.until(ExpectedConditions.visibilityOf(elemento)) != null) {
			elemento.clear();
			elemento.sendKeys(valor);
			System.out.println("Clicou no elemento: " + nomeElemento);
		} else {
			throw new Exception("Erro ao clicar em: " + nomeElemento);
		}
	}
	/**
	 * Metodo para mover para qualquer elemento
	 * 
	 * @param elemento
	 */
	public void moveToElement(WebElement elemento) {
		Actions actions = new Actions(driver);
		actions.moveToElement(elemento).build();
		actions.perform();
        System.out.println("moveu");
	}

	public void jsClick(WebElement element, String nameElement){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
		System.out.println("Clicou no elemento: " + nameElement);
	}

	public void waitElementToClick(WebElement element1, WebElement element2){
		while (wait.until(ExpectedConditions.invisibilityOf(element1))){
			if (driver.findElement(By.xpath("(//a[@title='Placa de Vídeo Gigabyte GeForce GTX 1050 Ti D5, 4GB GDDR5, 128Bit, GV-N105TD5-4GD'])[2]")).isDisplayed()){
				jsClick(element1,"Clicou em produto");
			}else {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", element2);
				js.executeScript("arguments[0].click();",element2);
			}
		}
	}

	public void imprimeValor(WebElement elemento) {
		System.out.println(elemento.getText().toString());
	}
}

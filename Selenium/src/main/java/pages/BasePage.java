package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	WebDriverWait wait;

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
}

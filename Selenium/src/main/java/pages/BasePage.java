package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
	WebDriver driver;
	WebDriverWait wait;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
	}

	//Metodo de click generico
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

	//Metodo que ira mover para o elemento
	public void moveToElement(WebElement elemento) {
		Actions actions = new Actions(driver);
		actions.moveToElement(elemento).build();
		actions.perform();
        System.out.println("moveu");
	}

	//Metodo de click com javascript
	public void jsClick(WebElement element, String nameElement){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
		System.out.println("Clicou no elemento: " + nameElement);
	}

	//Metodo ira verificar se o elemento esta presente
	public boolean isPresent(WebElement elemento, String nome) {
		try {
			if ( elemento.isDisplayed()) {
				System.out.println("Elemento: " + nome + " encontrado");
				return true;
			}
		}catch(Exception e) {
			System.out.println("Elemento: " + nome + " nao encontrado");
		}
		return false;
	}

	public void scrollElement(WebElement elemento) throws InterruptedException {
		JavascriptExecutor je = ((JavascriptExecutor)driver);
		je.executeScript("arguments[0].scrollIntoViewIfNeeded(true);", elemento);
		Thread.sleep(3000);
	}
}

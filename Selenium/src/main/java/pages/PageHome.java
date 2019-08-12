package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import maps.MapsMenu;
import utils.utils;

public class PageHome {
	MapsMenu mapsMenu = new MapsMenu();

	/**
	 * pesquisa no campo na barra superior
	 * 
	 * @param valor
	 * @throws InterruptedException
	 */
	public void pesquisaAlgo(String valor, WebDriver driver) throws InterruptedException {
		driver.findElement(mapsMenu.inputPesquisa).click();
		driver.findElement(mapsMenu.inputPesquisa).sendKeys(valor);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mapsMenu.btnPesquisa));
		driver.findElement(mapsMenu.btnPesquisa).click();
	}
	public void clicaBotaoRpg(WebDriver driver) throws InterruptedException{
		driver.findElement(mapsMenu.btnRpg).click();
		driver.findElement(mapsMenu.btnEscutar).click();
	}
	public void clicaBotaoNerdBunker(String valor, WebDriver driver) throws InterruptedException{
		driver.findElement(mapsMenu.btnNerdBunker).click();
		driver.findElement(mapsMenu.inputPesquisaNerd).sendKeys(valor);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mapsMenu.inputPesquisaNerd));
		driver.findElement(mapsMenu.getBtnPesquisaNerd).click();
	}
}
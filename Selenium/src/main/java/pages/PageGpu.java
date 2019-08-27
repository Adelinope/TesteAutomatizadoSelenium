package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import maps.MapsMenu;

public class PageGpu extends BasePage {
	WebDriverWait wait;

	public PageGpu(WebDriver driver) {
		super(driver);
		mapsMenu = new MapsMenu(driver);
		PageFactory.initElements(driver, mapsMenu);
		wait = new WebDriverWait(driver, 10);
	}

	MapsMenu mapsMenu;

	public void findProdutos(String produto) throws InterruptedException {
		while (!isPresent(mapsMenu.carregarProdutos)|| isPresent(driver.findElement(mapsMenu.elemendoPropagandaDinamico(produto)))) {
			if (isPresent(driver.findElement(mapsMenu.elemendoPropagandaDinamico(produto)))) {	
				scrollElement(driver.findElement(mapsMenu.elemendoPropagandaDinamico(produto)));
				jsClick(driver.findElement(mapsMenu.elemendoPropagandaDinamico(produto)), produto);
				break;
			} else {
				scrollElement(mapsMenu.carregarProdutos);
				mapsMenu.carregarProdutos.click();
			}
			Thread.sleep(3000);
		}
	}
}

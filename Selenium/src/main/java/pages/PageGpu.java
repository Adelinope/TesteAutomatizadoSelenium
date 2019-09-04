package pages;

import maps.MapsGpuPage;
import maps.MapsHome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import maps.MapsMenu;

public class PageGpu extends BasePage {
	WebDriverWait wait;
	MapsGpuPage mapsGpuPage;

	public PageGpu(WebDriver driver) {
		super(driver);
		mapsGpuPage = new MapsGpuPage(driver);
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, mapsGpuPage);
	}

	public void findProdutos(String produto) throws InterruptedException {
		while (isPresent(mapsGpuPage.carregarProdutos, "Botao carrega produtos")|| !isPresent(mapsGpuPage.btnCompra1, "Botao compra")) {
			if (isPresent(mapsGpuPage.btnCompra1, "Botao compra")) {
				scrollElement(mapsGpuPage.btnCompra1);
				jsClick(mapsGpuPage.btnCompra1, produto);
				break;
			} else {
				scrollElement(mapsGpuPage.carregarProdutos);
				mapsGpuPage.carregarProdutos.click();
			}
			Thread.sleep(2000);
		}
	}
}

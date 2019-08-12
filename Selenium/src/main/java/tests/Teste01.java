package tests;

import maps.MapsMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PageHome;
import utils.utils;

public class Teste01 {

	public static void main(String[] args) throws InterruptedException {
		MapsMenu mapsMenu = new MapsMenu();
		PageHome pageHome = new PageHome();
		utils utils = new utils();
		// TODO Auto-generated method stub
		utils.inicia("https://jovemnerd.com.br");
		pageHome.pesquisaAlgo("Cthulhu", utils.driver);
		pageHome.clicaBotaoRpg(utils.driver);
		utils.ScrollPage(new By.ByXPath("//div[@class='entry-header-actions__play']/a[@href='/rpg/cthulhu']"));
		utils.MethodBy(new By.ByXPath("//div[@class='entry-header-actions__play']/a[@href='/rpg/cthulhu']"));

		pageHome.clicaBotaoNerdBunker("Star War",utils.driver);


	}
}

		/*WebDriverWait wait = new WebDriverWait(utils.driver, 10);
		wait.until(ExpectedConditions.textToBe(new By.ByXPath("//span[@class='brand-color']"),"Cthulhu"));
		 */

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import maps.MapsMenu;

public class PageHome extends BasePage {

	public PageHome(WebDriver driver) {
		super(driver);
		mapsMenu = new MapsMenu();
		PageFactory.initElements(driver, mapsMenu);
	}

	MapsMenu mapsMenu;

	/**
	 * pesquisa no campo na barra superior
	 * 
	 * @param valor
	 * @throws Exception
	 */
	public void pesquisaAlgo(String valor) throws Exception {
		clickGenerico(mapsMenu.inputPesquisa2, "Campo de Pesquisar");
		sendKeysGenerico(mapsMenu.inputPesquisa2, valor, "Campo pesquisar");
		clickGenerico(mapsMenu.btnPesquisa2, "Botão pesquisar");
	}

	/**
	 * 
	 * @param valor
	 * @throws Exception
	 */
	public void acessNerdBunker(String valor) throws Exception {
		clickGenerico(mapsMenu.btnNerdBunker2, "Botão NerdBunker");
		sendKeysGenerico(mapsMenu.inputPesquisaNerd, valor, "Escreve campo pesquisa Nerd");
		clickGenerico(mapsMenu.getBtnPesquisaNerd2, "Clica em Pesquisa");
	}
}
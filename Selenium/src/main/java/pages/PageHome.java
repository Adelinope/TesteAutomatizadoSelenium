package pages;

import org.openqa.selenium.WebDriver;

import maps.MapsMenu;

public class PageHome extends BasePage {

	public PageHome(WebDriver driver) {
		super(driver);
		mapsMenu = new MapsMenu();
	}

	MapsMenu mapsMenu;

	/**
	 * pesquisa no campo na barra superior
	 * 
	 * @param valor
	 * @throws Exception
	 */
	public void pesquisaAlgo(String valor) throws Exception {
		clickGenerico(mapsMenu.inputPesquisa, "Campo de Pesquisar");
		sendKeysGenerico(mapsMenu.inputPesquisa, valor, "Campo pesquisar");
		clickGenerico(mapsMenu.inputPesquisa, "Bot�o pesquisar");
	}

	/**
	 * 
	 * @param valor
	 * @throws Exception
	 */
	public void acessNerdBunker(String valor) throws Exception {
		clickGenerico(mapsMenu.btnNerdBunker, "Bot�o NerdBunker");
		sendKeysGenerico(mapsMenu.inputPesquisaNerd, valor, "Escreve campo pesquisa Nerd");
		clickGenerico(mapsMenu.getBtnPesquisaNerd, "Clica em Pesquisa");
	}
}
package maps;

import org.openqa.selenium.By;

public class MapsMenu {
	public MapsMenu() {
		// TODO Auto-generated constructor stub
	}

	public By inputPesquisa = new By.ById("main-navigation-search-input");
	public By btnPesquisa = new By.ByXPath("//button[@class='main-navigation-search-form__submit-button']");
}
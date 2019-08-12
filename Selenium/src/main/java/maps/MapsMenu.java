package maps;

import org.openqa.selenium.By;

public class MapsMenu {
	public MapsMenu() {
		// TODO Auto-generated constructor stub
	}

	public By inputPesquisa = new By.ById("main-navigation-search-input");
	public By btnPesquisa = new By.ByXPath("//button[@class='main-navigation-search-form__submit-button']");
	public By btnRpg = new By.ByXPath("//a[@class='special-title special-title-rpg']");
	public By btnEscutar = new By.ByXPath("//div[@class='entry-header-actions__play']/a[@href='/rpg/cthulhu']']");
	public By btnNerdBunker = new By.ByXPath("//li[@class='main-navigation__item main-navigation__item__nerdnews']/a");
	public By inputPesquisaNerd = new By.ByXPath("//label[@class='filter-search__input']/input");
	public By getBtnPesquisaNerd = new By.ByXPath("//label[@class='filter-search__input']/button");

}
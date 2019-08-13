package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MapsMenu {
	public MapsMenu() {
		// TODO Auto-generated constructor stub
	}

	@FindBy(how = How.ID, using = "main-navigation-search-input")
	public WebElement inputPesquisa2;

	@FindBy(how = How.XPATH, using = "//button[@class='main-navigation-search-form__submit-button']")
	public WebElement btnPesquisa2;

	@FindBy(how = How.XPATH, using = "//li[@class='main-navigation__item main-navigation__item__nerdnews']/a")
	public WebElement btnNerdBunker2;
	@FindBy(how = How.XPATH, using = "//label[@class='filter-search__input']/button")
	public WebElement getBtnPesquisaNerd2;

	@FindBy(how = How.XPATH, using = "//label[@class='filter-search__input']/input")
	public WebElement inputPesquisaNerd;

}
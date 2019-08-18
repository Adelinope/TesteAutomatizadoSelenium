package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MapsMenu {
	WebDriver driver;

	public MapsMenu(WebDriver driver) {
		this.driver = driver;
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

	// Terabyte Maps
	@FindBy(how = How.XPATH, using = "//input[@id='isearch']")
	public WebElement inputPesquisaMain;

	@FindBy(how = How.XPATH, using = "//button[@class='btnstyle _bt_busca_M']")
	public WebElement btnPesquisaMain;

	@FindBy(how = How.XPATH, using = "//button[@id='onesignal-popover-cancel-button']")
	public WebElement btnNotificacao1;

	@FindBy(how = How.XPATH, using = "(//ul[@class='wsmenu-submenu']/li/a)[1]")
	public WebElement btnMinhaConta;

	@FindBy(how = How.XPATH, using = "//input[@id='f_email']")
	public WebElement inputLoginEmail;

	@FindBy(how = How.XPATH, using = "//input[@id='f_senha']")
	public WebElement inputLoginSenha;

	@FindBy(how = How.XPATH, using = "//div[@class='col-xs-12 col-md-12 nopadding']/button")
	public WebElement btnLogin;

	@FindBy(how = How.XPATH, using = "//a[@class='wtxaccountlink']")
	public WebElement campoGideone;

	public By elemendoPropagandaDinamico(String elemento) {
		return By.xpath("//strong[contains(text(),'" + elemento + "')]");
	}
}
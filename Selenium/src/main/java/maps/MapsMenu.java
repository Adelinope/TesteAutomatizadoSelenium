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
		return By.xpath("//strong[contains(text(),'" + elemento + "')]/../..");
	}

	@FindBy(how = How.XPATH, using = "//div[@class='col-xs-12 col-sm-3 col-md-3 col-lg-3']")
	public WebElement dbDepartamentos;

	@FindBy(how = How.XPATH, using = "(//a[@title='Hardware'])[1]")
	public WebElement btnHardware;

	@FindBy(how = How.XPATH, using = "//a[@title='Placa de Vídeo']")
	public WebElement btnPlacaDeVideo;

	@FindBy(how = How.XPATH, using = "(//a[contains(text(), \"Ver Todos\")])[2]")
	public WebElement btnVerTodosGpu;

	@FindBy(how = How.ID, using = "pdmore")
	public WebElement btnVerMaisProdutos;

	@FindBy(how = How.XPATH, using = "(//a[@title='Placa de Vídeo Gigabyte GeForce GTX 1050 Ti D5, 4GB GDDR5, 128Bit, GV-N105TD5-4GD'])[2]")
	public WebElement btnCompra1;
	
	@FindBy(how = How.XPATH, using = "//a[@id='pdmore']")
	public WebElement carregarProdutos;
	
}
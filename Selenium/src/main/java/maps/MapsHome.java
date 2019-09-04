package maps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MapsHome {
    WebDriver driver;

    public MapsHome(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//input[@id='isearch']")
    public WebElement inputPesquisaMain;

    @FindBy(how = How.XPATH, using = "//button[@class='btnstyle _bt_busca_M']")
    public WebElement btnPesquisaMain;

    @FindBy(how = How.XPATH, using = "//button[@id='onesignal-popover-cancel-button']")
    public WebElement btnNotificacao1;

    @FindBy(how = How.XPATH, using = "(//ul[@class='wsmenu-submenu']/li/a)[1]")
    public WebElement btnMinhaConta;

    @FindBy(how = How.XPATH, using = "//a[@class='wtxaccountlink']")
    public WebElement campoOlaGamer;

    @FindBy(how = How.XPATH, using = "//div[@class='col-xs-12 col-sm-3 col-md-3 col-lg-3']")
    public WebElement dbDepartamentos;

    @FindBy(how = How.XPATH, using = "(//a[@title='Hardware'])[1]")
    public WebElement btnHardware;

    @FindBy(how = How.XPATH, using = "//a[@title='Placa de Vídeo']")
    public WebElement btnPlacaDeVideo;

    @FindBy(how = How.XPATH, using = "(//a[contains(text(), \"Ver Todos\")])[2]")
    public WebElement btnVerTodosGpu;

    @FindBy(how = How.XPATH, using = "//div[@class='smllogo']/a")
    public WebElement btnHome;
}

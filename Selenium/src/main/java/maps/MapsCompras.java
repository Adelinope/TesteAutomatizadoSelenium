package maps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MapsCompras {
    WebDriver driver;

    public MapsCompras(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "(//button[@class='btn tbt_comprar'])[1]")
    public WebElement btnComprar;

    @FindBy(how = How.XPATH, using = "//input[@class='cepInput shopp-cep']")
    public WebElement inputFrete;

    @FindBy(how = How.XPATH, using = "//button[@class='calcFrete btcalcular visible']")
    public WebElement btnCalculaFrete;

    @FindBy(how = How.XPATH, using = "(//div[@class='col-md-2 entregaFreteVlr'])[4]")
    public WebElement precoPac;
}

package maps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MapsGpuPage {
    WebDriver driver;

    public MapsGpuPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'Placa de Vídeo Gigabyte GeForce GTX 1050 Ti D5, 4GB GDDR5, 128Bit, GV-N105TD5-4GD')]/../..")
    public WebElement btnCompra1;

    @FindBy(how = How.XPATH, using = "//a[@id='pdmore']")
    public WebElement carregarProdutos;
}

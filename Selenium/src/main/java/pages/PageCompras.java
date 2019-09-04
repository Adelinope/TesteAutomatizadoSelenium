package pages;

import maps.MapsCompras;
import maps.MapsMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageCompras extends BasePage{
    public PageCompras(WebDriver driver){
        super(driver);
        mapsCompras = new MapsCompras(driver);
        mapsMenu = new MapsMenu(driver);
        PageFactory.initElements(driver, mapsCompras);
    }

    MapsCompras mapsCompras;
    MapsMenu mapsMenu;

    public void calculaFrete(String frete) throws Exception {
        jsClick(mapsCompras.btnComprar, "Botao comprar");
        clickGenerico(mapsCompras.inputFrete, "Input frete");
        sendKeysGenerico(mapsCompras.inputFrete, frete, "Campo frete");
        jsClick(mapsCompras.btnCalculaFrete, "Botao calcula frete");
        Thread.sleep(10000);
        WebElement text = driver.findElement(new By.ByXPath("(//div[@class='col-md-2 entregaFreteVlr'])[4]"));
        System.out.println(text.getText());
    }
}

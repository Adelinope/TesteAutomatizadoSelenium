package pages;

import maps.MapsMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageGpu extends BasePage {
    public PageGpu(WebDriver driver) {
        super(driver);
        mapsMenu = new MapsMenu(driver);
        PageFactory.initElements(driver, mapsMenu);
    }
    MapsMenu mapsMenu;

    public void findProdutos(){
        waitElementToClick(mapsMenu.btnCompra1, mapsMenu.btnVerMaisProdutos);
    }

}

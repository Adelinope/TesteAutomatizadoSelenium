package maps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MapsLogin {
    WebDriver driver;

    public MapsLogin(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//input[@id='f_email']")
    public WebElement inputLoginEmail;

    @FindBy(how = How.XPATH, using = "//input[@id='f_senha']")
    public WebElement inputLoginSenha;

    @FindBy(how = How.XPATH, using = "//div[@class='col-xs-12 col-md-12 nopadding']/button")
    public WebElement btnLogin;
}

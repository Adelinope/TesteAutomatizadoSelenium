package pages;

import maps.MapsLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageLogin extends BasePage {
    public MapsLogin mapsLogin;

    public PageLogin(WebDriver driver) {
        super(driver);
        mapsLogin = new MapsLogin(driver);
        PageFactory.initElements(driver, mapsLogin);
    }

    public void signIn(String email, String senha) throws Exception {
        Thread.sleep(5000);
        jsClick(mapsLogin.inputLoginEmail, "Campo login");
        sendKeysGenerico(mapsLogin.inputLoginEmail, email, "Escreve campo email");
        jsClick(mapsLogin.inputLoginSenha, "Campo senha");
        sendKeysGenerico(mapsLogin.inputLoginSenha, senha, "Escreve campo senha");
        jsClick(mapsLogin.btnLogin, "Botao login");
    }
}

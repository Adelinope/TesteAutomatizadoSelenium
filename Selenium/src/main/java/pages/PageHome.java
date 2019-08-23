package pages;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import maps.MapsMenu;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageHome extends BasePage {

	public PageHome(WebDriver driver) {
		super(driver);
		mapsMenu = new MapsMenu(driver);
		PageFactory.initElements(driver, mapsMenu);
	}

	MapsMenu mapsMenu;

	// Metodo para imprimir o nome da variavel
	private void AccessFieldsUsingReflection(Object obj) {
		Field[] fields = obj.getClass().getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			String fieldName = fields[i].getName();
			Object fieldType = fields[i].getGenericType();

			System.out.println("Field(variable) name: " + fieldName);
			System.out.println("Generic Type: " + fieldType);

			/* Set<E>, List<E> and Map<K,V> are ParameterizedType */
			if (fieldType instanceof ParameterizedType) {
				/**
				 * This will give you Actual Type of Set<E>, List<E> and Map<K,V>. Example:
				 * List<String> -> String is ActualType Set<Integer> -> Integer is ActualType
				 * Map<String, Long> -> String, Long is ActualType
				 */
				System.out.println("Actual Type:");
				for (Object objActualType : ((ParameterizedType) fieldType).getActualTypeArguments()) {
					System.out.println("-- " + objActualType);
				}
			}
			System.out.println("+++++++++++++++++++++++++++++++");
		}
	}

	/**
	 * pesquisa no campo na barra superior
	 * 
	 * @param valor
	 * @throws Exception
	 */
	public void pesquisaAlgo(String valor) throws Exception {
		clickGenerico(mapsMenu.inputPesquisa2, "Campo de Pesquisar");
		AccessFieldsUsingReflection(mapsMenu.inputPesquisa2);
		sendKeysGenerico(mapsMenu.inputPesquisa2, valor, "Campo pesquisar");
		clickGenerico(mapsMenu.btnPesquisa2, "Botão pesquisar");
	}
	/**
	 * 
	 * @param valor
	 * @throws Exception
	 */
	public void acessNerdBunker(String valor) throws Exception {
		clickGenerico(mapsMenu.btnNerdBunker2, "Botão NerdBunker");
		sendKeysGenerico(mapsMenu.inputPesquisaNerd, valor, "Escreve campo pesquisa Nerd");
		clickGenerico(mapsMenu.getBtnPesquisaNerd2, "Clica em Pesquisa");
	}

	public void clickNotification() throws Exception {
		clickGenerico(mapsMenu.btnNotificacao1, "Botão notificação 1");
	}

	public void clickMyAccount() throws Exception {
		moveToElement(mapsMenu.campoGideone);
		clickGenerico(mapsMenu.btnMinhaConta, "Botão minha conta");
	}

	public void signIn(String email, String senha) throws Exception {
		clickGenerico(mapsMenu.inputLoginEmail, "Campo de email");
		sendKeysGenerico(mapsMenu.inputLoginEmail, email, "Escreve campo email");
		clickGenerico(mapsMenu.inputLoginSenha, "Campo de senha");
		sendKeysGenerico(mapsMenu.inputLoginSenha, senha, "Escreve campo senha");
		clickGenerico(mapsMenu.btnLogin, "Clica em login");
	}

	public void moveToElementOlaGamer() {
		moveToElement(mapsMenu.campoGideone);
	}

	public void accessPropaganda(String nomeProduto) {
		moveToElement(driver.findElement(mapsMenu.elemendoPropagandaDinamico(nomeProduto)));
		System.out.println(driver.findElement(mapsMenu.elemendoPropagandaDinamico(nomeProduto)).getText().toString());
		driver.findElement(mapsMenu.elemendoPropagandaDinamico(nomeProduto)).click();
		System.out.println();
	}

	public void imprimeValor() {
		String valor = driver.findElement(By.xpath("//h1")).getText().toString();
		System.out.println(valor);
		assertEquals("ESCOLHA SEU PC batata", valor);
		System.out.println();
	}

	public void moveToGpuPage() throws Exception {
		jsClick(mapsMenu.dbDepartamentos,"Departamentos");
		moveToElement(mapsMenu.btnHardware);
		moveToElement(mapsMenu.btnPlacaDeVideo);
		jsClick(mapsMenu.btnVerTodosGpu,"Botao ver todos");
	}
}
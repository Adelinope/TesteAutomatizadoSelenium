package pages;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.concurrent.TimeUnit;

import maps.MapsGpuPage;
import maps.MapsHome;
import maps.MapsLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import maps.MapsMenu;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageHome extends BasePage {
	MapsLogin mapsLogin;
	MapsHome mapsHome;
	MapsMenu mapsMenu;

	public PageHome(WebDriver driver) {
		super(driver);
		mapsLogin = new MapsLogin(driver);
		mapsHome = new MapsHome(driver);
		mapsMenu = new MapsMenu(driver);
		PageFactory.initElements(driver, mapsHome);
	}

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

	//Ira clicar na notificacao inicial
	public void clickNotification() throws Exception {
		clickGenerico(mapsHome.btnNotificacao1, "Botão notificação 1");
	}

	public void accessPropaganda(String nomeProduto) throws InterruptedException {
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

	//Metodo ira mover para a pagina de login
	public void moveToLoginPage(){
		jsClick(mapsHome.btnHome, "Botão Home");
		moveToElement(mapsHome.campoOlaGamer);
		jsClick(mapsHome.btnMinhaConta, "Botao minha conta");
	}

	//Metodo ira mover para a pagina de gpus
	public void moveToGpuPage() throws Exception {
		jsClick(mapsHome.dbDepartamentos,"Departamentos");
		moveToElement(mapsHome.btnHardware);
		moveToElement(mapsHome.btnPlacaDeVideo);
		jsClick(mapsHome.btnVerTodosGpu,"Botao ver todos");
		Thread.sleep(5000);
	}
}
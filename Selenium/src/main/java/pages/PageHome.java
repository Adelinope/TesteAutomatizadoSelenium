package pages;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import maps.MapsMenu;

public class PageHome extends BasePage {

	public PageHome(WebDriver driver) {
		super(driver);
		mapsMenu = new MapsMenu();
		PageFactory.initElements(driver, mapsMenu);
	}

	MapsMenu mapsMenu;
	
	//Metodo para imprimir o nome da váriavel
	  private void AccessFieldsUsingReflection(Object obj){
	      Field[] fields = obj.getClass().getDeclaredFields();
	      for(int i = 0; i < fields.length ; i++){
	         String fieldName = fields[i].getName();
	         Object fieldType = fields[i].getGenericType();
	  
	         System.out.println("Field(variable) name: " + fieldName);
	         System.out.println("Generic Type: " + fieldType);
	   
	         /* Set<E>, List<E> and Map<K,V> are ParameterizedType */
	         if(fieldType instanceof ParameterizedType){
	           /**
	            * This will give you Actual Type of Set<E>, List<E> and Map<K,V>.
	            * Example:
	            * List<String> -> String is ActualType
	            * Set<Integer> -> Integer is ActualType
	            * Map<String, Long> -> String, Long is ActualType
	            */
	            System.out.println("Actual Type:");
	            for(Object objActualType : ((ParameterizedType) fieldType).getActualTypeArguments()){
	                 System.out.println("-- "+objActualType);
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
}
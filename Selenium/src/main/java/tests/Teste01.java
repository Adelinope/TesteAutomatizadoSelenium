/**
 * Classe de teste 01
 * 
 */
package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.PageHome;
import utils.utils;

public class Teste01 {
	PageHome pageHome;
	utils utils;
	WebDriver driver;

	/*
	 * Roda antes do teste
	 */
	@Before
	public void antes() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		utils = new utils(driver);
		pageHome = new PageHome(driver);
		driver.get("https://jovemnerd.com.br");
		driver.manage().window().maximize();
		
	}

	/*
	 * Teste
	 */
	@Test
	public void script() throws Exception {

		pageHome.pesquisaAlgo("Cthulhu");
		pageHome.acessNerdBunker("Cthulhu");
	}

	/*
	 * Roda após o teste
	 */
	@After
	public void apos() {
		driver.close();
		driver.quit();
	}
}

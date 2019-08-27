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

import pages.PageGpu;
import pages.PageHome;
import utils.utils;

public class Teste01 {
	PageHome pageHome;
	utils utils;
	WebDriver driver;
	PageGpu pageGpu;

	/*
	 * Roda antes do teste
	 */
	@Before
	public void antes() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		utils = new utils(driver);
		pageHome = new PageHome(driver);
		pageGpu = new PageGpu(driver);
		driver.manage().window().maximize();
		driver.get("https://www.terabyteshop.com.br");
	}

	/*
	 * Teste
	 */
	@Test
	public void script() throws Exception {
		pageHome.clickNotification();
		pageHome.moveToGpuPage();
		pageGpu.findProdutos("Placa de Vídeo Asus GeForce GTX 1650 Rog Strix Gaming, 4GB GDDR5");
	}

	/*
	 * Roda apos o teste
	 */
	@After
	public void apos() {
		driver.close();
		driver.quit();
	}
}
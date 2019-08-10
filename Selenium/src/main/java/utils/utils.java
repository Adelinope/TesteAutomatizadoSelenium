package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class utils {

	public WebDriver driver;

	public utils() {
	}

	public void inicia(String url) {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void fechaNavegador() {
		driver.quit();
	}

}

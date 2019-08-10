package tests;

import pages.PageHome;
import utils.utils;

public class Teste01 {

	public static void main(String[] args) throws InterruptedException {
		PageHome pageHome = new PageHome();
		utils utils = new utils();
		// TODO Auto-generated method stub
		utils.inicia("https://jovemnerd.com.br");
		pageHome.pesquisaAlgo("Cthulhu", utils.driver);
	}

}

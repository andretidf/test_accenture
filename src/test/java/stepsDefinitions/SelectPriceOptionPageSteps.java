package stepsDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import pageObjects.SelectPriceOptionPage;

public class SelectPriceOptionPageSteps {
	
	SelectPriceOptionPage page = new SelectPriceOptionPage(driver);
	
	@Dado("que eu seleciono a opcao silver")
	public void que_eu_seleciono_a_opcao_silver() {
	    page.selecionarOpcaoSilver();
	}



	@Dado("clico em Next")
	public void clico_em_Next() {
	    page.clicarProximo();
	}

	@Quando("o sistema deve abrir a aba Send Quote")
	public void o_sistema_deve_abrir_a_aba_Send_Quote() {
	   
	}

}

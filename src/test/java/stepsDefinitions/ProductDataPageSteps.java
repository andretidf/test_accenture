package stepsDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Dado;
import pageObjects.ProductDataPage;

public class ProductDataPageSteps {
	
	ProductDataPage page = new ProductDataPage(driver);
	
	@Dado("que eu preencha todos os dados do formulario {string} {string} {string} {string} {string}")
	public void que_eu_preencha_todos_os_dados_do_formulario(String data, String sum, String rating, String damage, String car) {
	    page.preencherFormulario(data, sum, rating, damage, car);
	}

	
	@Dado("selecionar em Optional Products Euro Protection")
	public void selecionar_em_Optional_Products_Euro_Protection() {
		page.selecionarOptionEuroProtection();
	}

	@Quando("clicar em Next deve ir para a aba Select Price Option")
	public void clicar_em_Next_deve_ir_para_a_aba_Select_Price_Option() {
	    page.clicarNext();
	}
	


}

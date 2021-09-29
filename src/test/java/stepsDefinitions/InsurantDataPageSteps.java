package stepsDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Dado;
import pageObjects.InsurantDataPage;

public class InsurantDataPageSteps {

	InsurantDataPage page = new InsurantDataPage(driver);;

	@Dado("que eu preencha todos os dados do formulario  {string} {string} {string} {string} {string} {string}")
	public void que_eu_preencha_todos_os_dados_do_formulario(String name, String last, String date, String country,
			String zip, String occupation) {
		page.preencherFormulario(name, last, date, country, zip, occupation);
	}

	@Dado("escolher o Hobbie BungeeJumping")
	public void escolher_o_Hobbie_BungeeJumping() {
		page.selecionarHobbieBungeeJumping();
	}

	@Quando("clicar em Next deve ir para a aba Product Data")
	public void clicar_em_Next_deve_ir_para_a_aba_Product_Data() {
		page.clicarBotaoNext();
	}
}

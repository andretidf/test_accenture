package stepsDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.SendQuotePage;

public class SendQuotePageSteps {

	SendQuotePage page = new SendQuotePage(driver);
	
	@Dado("que eu preencha todos os dados do formulario {string} {string} {string} {string}")
	public void que_eu_preencha_todos_os_dados_do_formulario(String email, String user, String password, String confirmPassword) {
	    page.preencherFormulario(email, user, password, confirmPassword);
	}

	@Quando("clicar em Send")
	public void clicar_em_Send() {
	    page.clicarSend();
	}

	@Entao("o sistema deve abrir um modal informando o sucesso do envio do email")
	public void o_sistema_deve_abrir_um_modal_informando_o_sucesso_do_envio_do_email() {
	    
	}
}

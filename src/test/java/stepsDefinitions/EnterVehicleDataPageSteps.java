package stepsDefinitions;

import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Dado;
import pageObjects.EnterVehicleDataPage;

import static utils.Utils.*;

public class EnterVehicleDataPageSteps {
	
	EnterVehicleDataPage page = new EnterVehicleDataPage(driver);;
	
	@Dado("que estou acessando o sistema")
	public void que_estou_acessando_o_sistema() {
	    acessarSistema();
	     
	}
	
	@Dado("que eu preenchi make com {string}")
	public void que_eu_preenchi_make_com(String string) {
		page.preencherMake(string);
	   
	}

	@Dado("com Model {string}")
	public void com_Model(String string) {
		page.preencherModel(string);
	}
	
	@Dado("com Cylinder entre{string}")
	public void com_Cylinder_entre(String string) {
		page.preencherCylinder(string);
	}

	@Dado("com Engine com {string}")
	public void com_Engine_com(String string) {
		page.preencherEngine(string);
	}

	@Dado("data com {string}")
	public void data_com(String string) {
		page.preencherData(string);
	}

	@Dado("number com {string}")
	public void number_com(String string) {
		page.preencherNumber(string);
	}

	@Dado("marcar RightHand com yes")
	public void marcar_RightHand_com_yes() {
		page.RihtHandYes();
	}

	@Dado("NumberOfSeats com {string}")
	public void numberofseats_com(String string) {
		page.preencherNumberOfSeats(string);
	}

	@Dado("Fuel Type com {string}")
	public void fuel_Type_com(String string) {
		page.preencherFuel(string);
	}

	@Dado("Payload com {string}")
	public void payload_com(String string) {
		page.preencherPayload(string);
	}

	@Dado("Total Weiht com {string}")
	public void total_Weiht_com(String string) {
		page.preencherTotalWeiht(string);
	}

	@Dado("List Price com {string}")
	public void list_Price_com(String string) {
		page.preencherListPrice(string);
	}

	@Dado("Annual Mileage com {string}")
	public void annual_Mileage_com(String string) {
		page.preencherAnnualMileage(string);
	}

	
	@Quando("clicar em Next deve ir para a aba Insurant Data")
	public void clicar_em_Next_deve_ir_para_a_aba_Insurant_Data() {
		 page.clickNext();
	}

}

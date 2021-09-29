package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsurantDataPage {

	@FindBy(id = "firstname")
	public WebElement firstName;

	@FindBy(id = "lastname")
	public WebElement lastName;

	@FindBy(id = "birthdate")
	public WebElement birthDate;

	@FindBy(id = "country")
	public WebElement country;

	@FindBy(id = "zipcode")
	public WebElement zipCode;

	@FindBy(id = "occupation")
	public WebElement occupation;

	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]//label[2]")
	public WebElement checkHobbies;

	@FindBy(id = "nextenterproductdata")
	public WebElement buttonNext;

	public InsurantDataPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void preencherFormulario(String name, String last, String date, String txtCountry, String zip,
			String txtOccupation) {
		firstName.sendKeys(name);
		lastName.sendKeys(last);
		birthDate.sendKeys(date);
		country.sendKeys(txtCountry);
		zipCode.sendKeys(zip);
		occupation.sendKeys(txtOccupation);

	}

	public void selecionarHobbieBungeeJumping() {
		checkHobbies.click();
		
	}

	public void clicarBotaoNext() {
		buttonNext.click();
		
	}

}

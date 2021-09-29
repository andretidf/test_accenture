package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendQuotePage {
	
	@FindBy(id ="email")
	public WebElement campoEmail;
	
	@FindBy(id ="username")
	public WebElement campoUserName;
	
	@FindBy(id ="password")
	public WebElement campoPassword;
	
	@FindBy(id ="confirmpassword")
	public WebElement campoConfirmPassword;
	
	@FindBy(id ="sendemail")
	public WebElement buttonSend;
	
	
	
	public SendQuotePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	public void preencherFormulario(String email, String user, String password, String confirmPassword) {
		campoEmail.sendKeys(email);
		campoUserName.sendKeys(user);
		campoPassword.sendKeys(password);
		campoConfirmPassword.sendKeys(confirmPassword);
		
	}



	public void clicarSend() {
		buttonSend.click();
		
	}

}

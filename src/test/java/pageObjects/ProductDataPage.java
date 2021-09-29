package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDataPage {
	
	
	@FindBy(id = "startdate")
	public WebElement startDate;
	
	@FindBy(id = "insurancesum")
	public WebElement insuranceSum;
	
	
	@FindBy(id = "meritrating")
	public WebElement meritrating;
	
	@FindBy(id = "damageinsurance")
	public WebElement damageInsurance;
	
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]")
	public WebElement OptionEuroProtection;
	
	@FindBy(id = "courtesycar")
	public WebElement courtesyCar;
	
	@FindBy(id = "nextselectpriceoption")
	public WebElement buttonNext;
	
	

	public ProductDataPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	public void preencherFormulario(String data, String sum, String rating, String damage, String car) {
		startDate.sendKeys(data);
		insuranceSum.sendKeys(sum);
		meritrating.sendKeys(rating);
		damageInsurance.sendKeys(damage);
		courtesyCar.sendKeys(car);
		
	}



	public void selecionarOptionEuroProtection() {
		OptionEuroProtection.click();
		
	}



	public void clicarNext() {
		buttonNext.click();
		
	}
	


}

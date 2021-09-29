package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPriceOptionPage {
	
	@FindBy(xpath = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]")
	public WebElement checkSilver;
	
	@FindBy(id = "nextsendquote")
	public WebElement buttonNext;

	public SelectPriceOptionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void selecionarOpcaoSilver() {
		checkSilver.click();
		
	}

	public void clicarProximo() {
		buttonNext.click();
		
	}

}

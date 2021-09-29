package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class EnterVehicleDataPage {
	
	private static final CharSequence txtPayload = null;

	@FindBy(id = "make")
	public WebElement make;
	
	@FindBy(id = "model")
	public WebElement model;
	
	@FindBy(id = "cylindercapacity")
	public WebElement cylinderCapacity;
	
	@FindBy(id = "engineperformance")
	public WebElement enginePerformance;
	
	@FindBy(id = "dateofmanufacture")
	public WebElement dateofManufacture;
	
	@FindBy(id = "numberofseats")
	public WebElement numberofSeats;
	
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p//label[1]")
	public WebElement righthandDriveyes;
	
	@FindBy(id = "numberofseatsmotorcycle")
	public WebElement numberofSeatsMotorcycle;
	
	@FindBy(id = "fuel")
	public WebElement fuel;
	
	@FindBy(id = "payload")
	public WebElement payload;
	
	@FindBy(id = "totalweight")
	public WebElement totalWeight;
	
	@FindBy(id = "listprice")
	public WebElement listPrice;
	

	
	@FindBy(id = "annualmileage")
	public WebElement annualMileage;
	
	@FindBy(id = "nextenterinsurantdata")
	public WebElement buttonNext;
	

	public EnterVehicleDataPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void preencherFormularioCompleto(String txtMake, String txtModel, String txtCylinderCapacity, String txtEnginePerformance, String txtDate, String txtNumberSeats, String txtSeats2, String txtFuel, String txtTotalWeight, String txtListPrice, String txtAnnualMileage) {
		make.sendKeys(txtMake);
		model.sendKeys(txtModel);
		cylinderCapacity.sendKeys(txtCylinderCapacity);
		enginePerformance.sendKeys(txtEnginePerformance);
		dateofManufacture.sendKeys(txtDate);
		numberofSeats.sendKeys(txtNumberSeats);
		righthandDriveyes.click();
		numberofSeatsMotorcycle.sendKeys(txtSeats2);
		fuel.sendKeys(txtFuel);
		payload.sendKeys(txtPayload);
		totalWeight.sendKeys(txtTotalWeight);
		listPrice.sendKeys(txtListPrice);
		annualMileage.sendKeys(txtAnnualMileage);
		
		buttonNext.click();
		
	}

	public void preencherMake(String string) {
		final Select selectBox = new Select(make);
	    selectBox.selectByValue(string);
		
	}

	public void preencherModel(String string) {
		model.sendKeys(string);
		
	}

	public void preencherCylinder(String string) {
		cylinderCapacity.sendKeys(string);
		
	}

	public void preencherEngine(String string) {
		enginePerformance.sendKeys(string);
		
	}

	public void preencherData(String string) {
		dateofManufacture.sendKeys(string);
		
	}

	public void preencherNumber(String string) {
		numberofSeats.sendKeys(string);
		
	}

	public void RihtHandYes() {
		righthandDriveyes.click();
		
	}

	public void preencherNumberOfSeats(String string) {
		numberofSeatsMotorcycle.sendKeys(string);
		
	}

	public void preencherFuel(String string) {
		fuel.sendKeys(string);
		
	}

	public void preencherPayload(String string) {
		payload.sendKeys(string);
		
	}

	public void preencherTotalWeiht(String string) {
		totalWeight.sendKeys(string);
		
	}

	public void preencherListPrice(String string) {
		listPrice.sendKeys(string);
		
	}

	public void preencherAnnualMileage(String string) {
		annualMileage.sendKeys(string);
		
	}

	public void clickNext() {
		buttonNext.click();
		
	}
}

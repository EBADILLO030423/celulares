package excerciseMap;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ExcerciseMap {
	WebDriver driver;

	public ExcerciseMap(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Phones')]")
	public WebElement celulares;
	@FindBy(xpath = "//a[contains(text(),'Laptops')]")
	public WebElement laptops;
	@FindBy(xpath = "//a[contains(text(),'Monitors')]")
	public WebElement monitores;

}

package pageObjects;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import managers.FileReaderManager;

public class HomePage {
	WebDriver driver;
 
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 
	public void perform_Search(String search) {
		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getApplicationUrl() + "/?s=" + search + "&post_type=product");
	}
 
	public void navigateTo_HomePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl()); // use file reader manager > config reader to get url
		//driver.get(configFileReader.getApplicationUrl()); // use configfilereader to get to url
		//driver.get("http://www.shop.demoqa.com"); //go direct to url
	}
 
}
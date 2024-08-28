import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RahuShetty {
	WebDriver driver;
	
	public RahuShetty(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css = "#username")
	WebElement usernameField;
	
	@FindBy(css = "#password")
	WebElement PasswordField;
	
	@FindBy(css = "#signInBtn")
	WebElement signInButton;
	
	public void login(String userName,String password ) {
		usernameField.sendKeys(userName);
		PasswordField.sendKeys(password);
		signInButton.click();
		
	}

}

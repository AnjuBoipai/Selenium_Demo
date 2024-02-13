package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	//constructor
	public Login(WebDriver driver){
		PageFactory.initElements(driver,this);
			
		}

	@FindBy(id="Email")
	private WebElement emailTextfield;

	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	@FindBy(id="//input[@value='Log in']")
	private WebElement loginbutton;

	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	


}

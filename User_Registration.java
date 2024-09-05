package storytech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class User_Registration {
	WebDriver driver;
	String applicationURL = "https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn ";
	public void Launch_Application()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\pushpa\\Desktop\\java folder\\JavaNewProgramms\\browser files\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(applicationURL);
		driver.manage().window().maximize();
	}
	public void HellosigninLocator()
	{
        /*
		 *Relative x-path = //*[@id="nav-link-accountList"]
		 *  
		 */ 
		By HellosigninLocatorProperty=By.xpath("//*[@id=\"nav-link-accountList\"] ");
		WebElement HellosignIn=driver.findElement(HellosigninLocatorProperty);
		HellosignIn.click();
		
	}
	public void CreateYour_Account()
	{
		/*
		 * Relative x-path=//*[@id="createAccountSubmit"]
		 * 
		 */
		By CreateYourAccountProperty=By.xpath("//*[@id=\"createAccountSubmit\"]");
		WebElement CreateYourAccount=driver.findElement(CreateYourAccountProperty);
		CreateYourAccount.click();
	}
	public void create_Account()
	{
		/* Relative x-path for Your name text box field = //*[@id="ap_customer_name"]
		 */
		By YourNameProperty=By.xpath("//*[@id=\"ap_customer_name\"]");
		WebElement YourName=driver.findElement(YourNameProperty);
		YourName.sendKeys("Pushpa");
		
		// Relative x-path for Contact text box field =//*[@id="ap_phone_number"]
		By ContactProperty=By.xpath("//*[@id=\"ap_phone_number\"]");
		WebElement Contact=driver.findElement(ContactProperty);
		Contact.sendKeys("6305534352");
		
		//Relative x-path for password text box field=//*[@id="ap_password"]
		By PasswordProperty=By.xpath("//*[@id=\"ap_password\"]");
		WebElement Password=driver.findElement(PasswordProperty);
		Password.sendKeys("Pushpa@123");
		
		//Relative x-path for Verify mobile number text box field=//*[@id="continue"]
		By VerifyMobilenumberProperty=By.xpath("//*[@id=\"continue\"]");
		WebElement VerifyMobilenumber=driver.findElement(VerifyMobilenumberProperty);
		VerifyMobilenumber.click();
	}
	//if the customer have already an account with same mobile number then the customer have to signin into his account
	public void Existing_Customer_Signin()
	{
		// Absolute xpath for signin = /html/body/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/a
		By SignInProperty=By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/a");
		WebElement Signin=driver.findElement(SignInProperty);
		Signin.click();
		
		//Eneter mobile number in to text box for signin so the Relative xpath is = //*[@id="ap_email"]
		By mobilenumberProperty=By.xpath("//*[@id=\"ap_email\"]");
		WebElement mobilenumber=driver.findElement(mobilenumberProperty);
		mobilenumber.sendKeys("6305534352");
		//Relative xpath for contiue button = //*[@id="continue"]
		By ContinueProperty=By.xpath("//*[@id=\"continue\"]");
		WebElement Continue=driver.findElement(ContinueProperty);
		Continue.click();
		
		//Relative xpath for password text box = //*[@id="ap_password"]
		By PasswordProperty=By.xpath("//*[@id=\"ap_password\"]");
		WebElement Password=driver.findElement(PasswordProperty);
		Password.sendKeys("Pushpa@123");
		
		//Relative xpath for Signin =//*[@id="signInSubmit"]
		By SignInProperty1=By.xpath("//*[@id=\"signInSubmit\"]");
		WebElement Signin1=driver.findElement(SignInProperty);
		Signin.click();
		
		
	}
	

	public static void main(String[] args) {
		User_Registration reg = new User_Registration();
		reg.Launch_Application();
		reg.HellosigninLocator();
		reg.CreateYour_Account();
		reg.create_Account();
		reg.Existing_Customer_Signin();

	}

}

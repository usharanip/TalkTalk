package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	 WebDriver driver;

	    By userName = By.id("user-name");

	    By password =By.id("password");

	    By login =By.id("login-button");
	    
	    
	    public void launchUrl(String url) {
			driver.get(url);
		}
	    public void setUserName(String strUserName){
	        driver.findElement(userName).sendKeys(strUserName);
	    }
	    //Set password in password textbox
	    public void setPassword(String strPassword){
	         driver.findElement(password).sendKeys(strPassword);
	    }
	    //Click on login button
	    public void clickLogin(){
	            driver.findElement(login).click();
	    }
	    


}

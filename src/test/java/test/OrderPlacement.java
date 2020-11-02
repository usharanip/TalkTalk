package test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import these and created objects and use those methods with the relevant page objects.
import pages.HomePage;
import pages.LoginPage;
import pages.CartPage;
import pages.CheckOut;
public class OrderPlacement{
	
	WebDriver driver;
	LoginPage LoginObj=new LoginPage();
	HomePage hpObj= new HomePage();
	CartPage CartObj= new CartPage();
	CheckOut checkoutObj=new CheckOut();
	
	@BeforeTest
	public void launchUrl() {
		driver.get("https://www.saucedemo.com");
		}
	@Test
	public void loginToSwagLabs(String strUserName,String strPasword){
        //Enter user name
		LoginObj.setUserName("standard_user");
        //Enter password
		LoginObj.setPassword("secret_sauce");
        //Click Login 
		LoginObj.clickLogin();        
    }
	@Test
	public void AddProducttoCart() {
		hpObj.selectBikeLight();
		hpObj.AddItemtoCart();
	}
	@Test
	public void OpenCartandCheckOut() {
		CartObj.OpenCart();
		CartObj.CheckOut();
	}
	public void Checkout() {
		checkoutObj.enterFirstName("usha");
		checkoutObj.enterLastName("Tagi");
		checkoutObj.enterZipCode("Ab23sd");
	}
	
	
	
	
	
	
	
	

}

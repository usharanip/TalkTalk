package pages;

import org.openqa.selenium.By;

public class CheckOut extends LoginPage {
	By FirstName = By.xpath("//input[@id='first-name']");

    By LastName =By.xpath("//input[@id='last-name']");

    By ZipCode =By.xpath("//input[@id='postal-code']");
    
    //using driver from login page

    public void enterFirstName(String firstName){
        driver.findElement(FirstName).sendKeys(firstName);
    }
    public void enterLastName(String lastname){
        driver.findElement(LastName).sendKeys(lastname);
    }
    public void enterZipCode(String zipcode){
        driver.findElement(ZipCode).sendKeys(zipcode);
    }
    
	

}

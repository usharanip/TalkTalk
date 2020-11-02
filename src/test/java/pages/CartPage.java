package pages;

import org.openqa.selenium.By;

public class CartPage  extends LoginPage{
	By OpenCart=By.tagName("a");
	By CheckOut=By.linkText("CHECKOUT");
		
	//using driver from login page

	public void OpenCart() {
		driver.findElement(OpenCart).click();
	}
	public void CheckOut() {
		driver.findElement(CheckOut).click();
	}

}

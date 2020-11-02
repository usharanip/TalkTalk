package pages;


import org.openqa.selenium.By;

public class HomePage extends LoginPage{
	
	String title=driver.getTitle();
	
	By BikeLight=By.id("item_0_title_link");
	By AddtoCart=By.xpath("//button[contains(text(),'ADD TO CART')]");

	//using driver from login page
	public void selectBikeLight()
	{
		driver.findElement(BikeLight).click();
	}
	public void AddItemtoCart() {
		driver.findElement(AddtoCart).click();
	}
	
	
}

package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		System.out.println(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[1]/h1")).getText());
		driver.findElement(By.id("Email")).sendKeys("atest@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		System.out.println(driver.findElement(By.className("account")).getText());
		driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[1]/a/img")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[6]/div[2]/span")).getText());
        driver.findElement(By.name("addtocart_13.EnteredQuantity")).clear();
        driver.findElement(By.name("addtocart_13.EnteredQuantity")).sendKeys("3");
        driver.findElement(By.id("add-to-cart-button-13")).click();
        //System.out.println(driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/p")).getText());
        driver.findElement(By.linkText("Shopping cart")).click();
        System.out.println(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[6]/span[2]")).getText());
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();
        WebElement statiDropdown=driver.findElement(By.name("billing_address_id"));
		Select dropdown=new Select(statiDropdown);
		dropdown.selectByVisibleText("New Address");
		driver.findElement(By.id("BillingNewAddress_FirstName")).clear();
		driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("venkat");
		driver.findElement(By.id("BillingNewAddress_LastName")).clear();
		driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Rao");
		driver.findElement(By.id("BillingNewAddress_Email")).clear();
		driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]")).sendKeys("india");
		driver.findElement(By.name("BillingNewAddress.City")).sendKeys("Hyd");
		driver.findElement(By.name("BillingNewAddress.Address1")).sendKeys("Amp");
		driver.findElement(By.name("BillingNewAddress.ZipPostalCode")).sendKeys("500016");
		driver.findElement(By.name("BillingNewAddress.PhoneNumber")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 WebElement statiDropdown1=driver.findElement(By.xpath("//*[@id=\"shipping-address-select\"]"));
			Select dropdown1=new Select(statiDropdown1);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			dropdown1.selectByVisibleText("New Address");
			driver.findElement(By.id("ShippingNewAddress_FirstName")).clear();
			driver.findElement(By.id("ShippingNewAddress_FirstName")).sendKeys("venkat");
			driver.findElement(By.id("ShippingNewAddress_LastName")).clear();
			driver.findElement(By.id("ShippingNewAddress_LastName")).sendKeys("Rao");
			driver.findElement(By.id("ShippingNewAddress_Email")).clear();
			driver.findElement(By.id("ShippingNewAddress_Email")).sendKeys("abc@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"ShippingNewAddress_CountryId\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"ShippingNewAddress_CountryId\"]")).sendKeys("india");
			driver.findElement(By.xpath("//*[@id=\"ShippingNewAddress_City\"]")).sendKeys("Hyd");
			driver.findElement(By.xpath("//*[@id=\"ShippingNewAddress_Address1\"]")).sendKeys("Amp");
			driver.findElement(By.xpath("//*[@id=\"ShippingNewAddress_ZipPostalCode\"]")).sendKeys("500016");
			driver.findElement(By.xpath("//*[@id=\"ShippingNewAddress_PhoneNumber\"]")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/div/div/ul/li[2]/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/ul/li[1]/div/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"checkout-payment-info-load\"]/div/div/div[1]/table/tbody/tr/td/p")).getText());
		driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input")).click();
		System.out.println(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[1]/strong")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[1]")).getText());
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.close();
		

	}

}

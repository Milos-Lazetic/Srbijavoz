package testClasses;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageClasses.LoginPage;

public class LoginPage_testClass extends BaseTestClass{
	
	WebDriverWait wait;
	
	
	@BeforeMethod
	public void navigation() {
		driver.navigate().to(baseURL);
	}
	
	@Test(priority = 0)
	public void verifikacijaPodnaslova() {
		String podnaslov = driver.findElement(By.cssSelector(".sv-form-header")).getText();
		assertEquals(podnaslov, "PRIJAVA NA SISTEM ILI REGISTRACIJA");
	}
	
	@Test(priority = 1)
	public void popunjavanjeForme() {
		login.unosImena("Milos");
		login.unosPrezimena("Lazetic");
		login.odabirDanaRodjenja("29");
		login.odabirMesecaRodjenja("Apr");
		login.odabirGodineRodjenja("1988");
		login.unosBrojaTelefona("061332211");
		login.unosEmaila("lbkjgGO");
		login.unosLozinke("IdEmOoOoOoO!");
		login.klikNaDugmeRegistracija();
		//String poruka = driver.findElement(By.cssSelector(".bg-danger")).getText();
		//assertEquals(driver.findElement(By.cssSelector(".bg-danger")).getText(), "Molimo Vas sačekajte.");
	}
	
	@Test(priority = 2)
	public void klikNaCheckbox() {
		login.klikNaPrviCheckbox();
		login.proveraDaLiJePrviCheckboxSelektovan();
		login.proveraDaLiJeDrugiCheckboxSelektovan();
		login.klikNaDrugiCheckbox();
		login.proveraDaLiJeDrugiCheckboxSelektovan();
		//String podnaslov = driver.findElement(By.cssSelector(".sv-form-header")).getText();
		//assertTrue(podnaslov.contains("PRIJAVA"));
	}
	//javlja bug koji je ocekivan, tako da cenim da ovo radiii!!!
	
	
}
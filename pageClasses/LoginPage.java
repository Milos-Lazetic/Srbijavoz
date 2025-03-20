package pageClasses;

import java.time.Duration;
import java.util.List;import javax.swing.text.html.CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	WebDriverWait wait;
	
	//pravim listu dugmica (cela 2: Prijava i Registracija, s obzirom da nijedan nema unikatan selektor)

	@FindBy(css = ".btn.btn-sv")
	List<WebElement> buttons;
	
	//elementi
	@FindBy(css = "#firstName")
	WebElement inputField_ime;
	
	@FindBy(css = "#lastName")
	WebElement inputField_prezime;
	
	@FindBy(css = "#telefon")
	WebElement inputField_brojTelefona;
	
	@FindBy(css = "#email")
	WebElement inputField_email;
	
	@FindBy(id = "passwordr")
	WebElement inputField_lozinka;
	
	
	@FindBy(css = "[ng-model = \"date\"]")
	WebElement dropdown_dan;
	
	@FindBy(css = "[ng-model = \"month\"]")
	WebElement dropdown_mesec;
	
	@FindBy(css = "[ng-model = \"year\"]")
	WebElement dropdown_godina;
	
	@FindBy(name = "promo")
	WebElement checkbox1;
	
	@FindBy(name = "info")
	WebElement checkbox2;
	
	//konstruktor
		public LoginPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		}
		
	//metode
		public void unosImena(String ime) {
			wait.until(ExpectedConditions.visibilityOf(inputField_ime)).clear();
			inputField_ime.sendKeys(ime);
		}
		
		public void unosPrezimena(String prezime) {
			wait.until(ExpectedConditions.visibilityOf(inputField_prezime)).clear();
			inputField_prezime.sendKeys(prezime);
		}
		
		public void unosBrojaTelefona(String brojTelefona) {
			wait.until(ExpectedConditions.visibilityOf(inputField_brojTelefona)).clear();
			inputField_brojTelefona.sendKeys(brojTelefona);
		}
		
		public void unosEmaila(String mail) {
			wait.until(ExpectedConditions.visibilityOf(inputField_email)).clear();
			inputField_email.sendKeys(mail);
		}
		
		public void unosLozinke(String lozinka) {
			wait.until(ExpectedConditions.visibilityOf(inputField_lozinka)).clear();
			inputField_lozinka.sendKeys(lozinka);
		}
		
		public void odabirDanaRodjenja(String danRodjenja) {
			Select dan = new Select(dropdown_dan);
			dan.selectByVisibleText(danRodjenja);
		
			
		}
		
		public void odabirMesecaRodjenja(String mesecRodjenja) {
			Select mesec = new Select(dropdown_mesec);
			mesec.selectByVisibleText(mesecRodjenja);
		}
		
		public void odabirGodineRodjenja(String godinaRodjenja) {
			Select godina = new Select(dropdown_godina);
			godina.selectByVisibleText(godinaRodjenja);
		}
		
		public void klikNaPrviCheckbox() {
			checkbox1.click();
		}
		
		public void klikNaDrugiCheckbox() {
			checkbox2.click();
		}
		
		public void proveraDaLiJePrviCheckboxSelektovan() {
			if(checkbox1.isSelected()) {
				System.out.println("Prvi checkbox je selektovan");
			}
			else {
				System.out.println("Prvi checkbox nije selektovan");
			}
		}
		
		public void proveraDaLiJeDrugiCheckboxSelektovan() {
			if(checkbox2.isSelected()) {
				System.out.println("Drugi checkbox je selektovan");
			}
			else {
				System.out.println("Drugi checkbox nije selektovan");
			}
		}
		
		public void klikNaDugmeRegistracija() {
			buttons.get(1).click();
		}
}

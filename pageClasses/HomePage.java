package pageClasses;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	//elementi
	@FindBy(css = "#jedanSmer")
	WebElement radioButton_jedanSmer;
	
	@FindBy(css = "#povratna")
	WebElement radioButton_povratnoPutovanje;
	
	@FindBy(css = "#stanicaod")
	WebElement inputField_stanicaOd;
	
	@FindBy(css = "#stanicado")
	WebElement inputField_stanicaDo;
	
	@FindBy(css = "[title = \"Beograd Centar-PROKOP\"]")
	WebElement opcijaBeogradCentar;
	
	@FindBy(css = "[title=\"Novi Sad\"]")
	WebElement opcijaNoviSad;
	
	@FindBy(css = "[ng-click=\"open()\"]")
	WebElement ikonicaZaOtvaranjeKalendara;
	
	@FindBy(css = ".glyphicon-chevron-right")
	WebElement desnaStrelicaUnutarKalendara;
	
	@FindBy(css = ".btn.btn-default.btn-sm.active")
	WebElement aktivanDanUKalendaru;
	
	@FindBy(css = "#btntrazi")
	WebElement dugmeTrazi;
	
	@FindBy(css = ".btn-sv")
	List<WebElement> dugmeIzaberi;
	
	@FindBy(css = "[ng-disabled=\"(izabranivoz=='')\"]")
	WebElement dugmeDalje;
	
	
	
	//konstruktor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	//metode
	public void klikNaRadioButtonJedanSmer() {
		radioButton_jedanSmer.click();
	}
	
	public void klikNaRadioButtonPovratnoPutovanje() {
		radioButton_povratnoPutovanje.click();
	}
	
	public void unosTekstaUPoljeStanicaOd(String pocetnaDestinacija) {
		wait.until(ExpectedConditions.visibilityOf(inputField_stanicaOd)).clear();
		inputField_stanicaOd.sendKeys(pocetnaDestinacija);
	}
	
	public void unosTekstaUPoljeStanicaDo(String krajnjaDestinacija) {
		wait.until(ExpectedConditions.visibilityOf(inputField_stanicaDo)).clear();
		inputField_stanicaDo.sendKeys(krajnjaDestinacija);
	}
	
	public void odabirOpcijeBeogradCentar() {
		opcijaBeogradCentar.click();
	}
	
	public void odabirOpcijeNoviSad() {
		opcijaNoviSad.click();
	}
	
	public void klikNaIkonicuZaKalendar() {
		ikonicaZaOtvaranjeKalendara.click();
	}
	
	public void klikNaDesnuStrelicuUKalendaru() {
		desnaStrelicaUnutarKalendara.click();
	}
	
	public void odabirDanaUKalendaruKojiJeAktivan() {
		aktivanDanUKalendaru.click();
	}
	
	public void klikNaDugmeTrazi() {
		dugmeTrazi.click();
	}
	
	public void IzaberiPrvoDugmeUReduVoznje() {
		wait.until(ExpectedConditions.elementToBeClickable(dugmeIzaberi.get(1)));
		dugmeIzaberi.get(1).click();
	}
	
	public void klikNaDugmeDalje() {
		wait.until(ExpectedConditions.elementToBeClickable(dugmeDalje));
		dugmeDalje.click();
	}
	
	
}

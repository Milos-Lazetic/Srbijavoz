package testClasses;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage_testClass extends BaseTestClass{
	
	
	@BeforeMethod
	public void navigation() {
		driver.navigate().to(baseURL1);
	}
	
	@Test()
	public void eKarta() {
		home.unosTekstaUPoljeStanicaOd("be");
		home.odabirOpcijeBeogradCentar();
		home.unosTekstaUPoljeStanicaDo("no");
		home.odabirOpcijeNoviSad();
		home.klikNaIkonicuZaKalendar();
		home.klikNaDesnuStrelicuUKalendaru();
		home.odabirDanaUKalendaruKojiJeAktivan();
		home.klikNaDugmeTrazi();
		home.IzaberiPrvoDugmeUReduVoznje();
		home.klikNaDugmeDalje();
		System.out.println(driver.getCurrentUrl());
		WebElement element = driver.findElement(By.tagName("h4"));
		wait.until(ExpectedConditions.visibilityOf(element));
		String podnaslov = element.getText();
		assertTrue(podnaslov.contains("PRIJAVA"));
		
	}

		
	}


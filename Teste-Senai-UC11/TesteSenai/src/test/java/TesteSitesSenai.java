
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSitesSenai {
	private WebDriver driver;
	
	@Before
	public void openWebBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

@Test
public void testWebbrowser() {
	
	driver.get("https://informatica.sp.senai.br/");
	
	driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("excel");
	driver.findElement(By.id("Busca1_btnBusca")).click();
	
	
}
}

package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import preenchendoFormulario.Actions.MetodosActions;
import preenchendoFormulario.Utils.CalculadoraPage;

public class CadastroSite {
	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() {
		// driver.quit();
	}

	@Test
	public void preenchendoFormulario() throws InterruptedException {
		driver.get("https://phptravels.com/demo/");

		MetodosActions metodosActions = new MetodosActions(driver);
		metodosActions.escrever(By.name("first_name"), "José");
		metodosActions.escrever(By.name("last_name"), "Marques");
		metodosActions.escrever(By.name("business_name"), "Teste.Automação");
		metodosActions.escrever(By.name("email"), "jose@gmail.com");

		CalculadoraPage calculadoraPage = new CalculadoraPage(driver);
        calculadoraPage.RealizarCalculoEInserirResultado();
		calculadoraPage.clicarNoBotaoEnviar();

	}

}

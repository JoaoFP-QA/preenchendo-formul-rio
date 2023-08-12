package preenchendoFormulario.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CalculadoraPage {
	private WebDriver driver;

	public CalculadoraPage(WebDriver driver) {
		this.driver = driver;
	}

	public void RealizarCalculoEInserirResultado() throws InterruptedException {
		WebElement firstNumElement = driver.findElement(By.xpath("//*[@id='numb1']"));
		String firstNumAsStr = firstNumElement.getText();
		int var1 = Integer.parseInt(firstNumAsStr);

		WebElement secondNumElement = driver.findElement(By.xpath("//*[@id='numb2']"));
		String secondNumAsStr = secondNumElement.getText();
		int var2 = Integer.parseInt(secondNumAsStr);

		int total = var1 + var2;

		WebElement resultInsert = driver.findElement(By.xpath("//*[@id='number']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(resultInsert));
		resultInsert.sendKeys(String.valueOf(total));

		Thread.sleep(1000);

	}

	public void clicarNoBotaoEnviar() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#demo"))).click();
	}

}

package preenchendoFormulario.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MetodosActions {
	private WebDriver driver;

	public MetodosActions(WebDriver driver) {
		this.driver = driver;
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
}

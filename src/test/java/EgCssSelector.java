import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EgCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		WebElement w=driver.findElement(By.cssSelector("input#email"));
		w.sendKeys("saki@gmail.com");
		WebElement w1=driver.findElement(By.cssSelector("input.inputtext[id='pass']"));
		w1.sendKeys("123454");
		WebElement login=driver.findElement(By.cssSelector("button[name='login']"));
		login.click();
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EgAncestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver().setup();
WebDriver driver=new EdgeDriver();
//driver.get("https://www.guru99.com/");
driver.get("https://demo.guru99.com/test/delete_customer.php");
//WebElement w=driver.findElement(By.xpath("//b[text()='Enterprise Testing']//ancestor::div"));
	//w.click();
WebElement custId=driver.findElement(By.xpath("//input[@name='cusid']"));
custId.sendKeys("3434334");
///following
WebElement w=driver.findElement(By.xpath("//input[@type='submit']//following-sibling::input"));
w.click();
//preceding
//WebElement w1=driver.findElement(By.xpath("//input[@type='reset']//preceding-sibling::input"));
//w1.click();
	}

}

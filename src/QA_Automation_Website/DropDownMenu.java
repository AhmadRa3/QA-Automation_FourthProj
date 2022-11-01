package QA_Automation_Website;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownMenu {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "G:\\\\MyNewDriver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get("http://127.0.0.1:5500/index.html");
		
		
//(To Print One element		
		//String myOptions = driver.findElements(By.tagName("option")).get(2).getText();
		//System.out.println(myOptions);)
		
////////////////////////////////////////////////////////////////////////////////////////////		
		
//To Print All Elements 
		List <WebElement> myListOfOptions = driver.findElements(By.tagName("option"));
		
		for(int i=0;i<myListOfOptions.size();i++){
			
			
		System.out.println(myListOfOptions.get(i).getText());
		}
		
		
		
		
		
	}

}

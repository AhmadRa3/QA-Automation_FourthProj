package QA_Automation_Website;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\\\MyNewDriver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get("http://127.0.0.1:5500/index.html");
		String myTitle = driver.getTitle();
		System.out.println(myTitle);

	}

}

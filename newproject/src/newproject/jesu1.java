package newproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class jesu1 {

	public static void main (String args[]){
		//System.setProperty("webdriver.gecko1.driver","C:\\Users\\Jesu.Irudhaya.Dhasan\\Gechko1\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new FirefoxDriver();
	//	WebDriver driver = new ChromeDriver();
		
		
		String baseUrl = "\"file:///C:/Users/Jesu.Irudhaya.Dhasan/git/demodev/demodev/index.html\"";
        String expectedTitle = "Industrious by TEMPLATED"; 	
        String actualTitle = "";
		
		
		
		
        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Title Verification Test Passed!");
        } else {
            System.out.println("Title Verification Test Failed");
        }
    
        driver.close();
		
		
		
		
		
		
	}

}

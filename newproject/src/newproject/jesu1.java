package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class jesu1 {

	public static void main (String args[]){
		//System.setProperty("webdriver.gecko1.driver","C:\\Users\\Jesu.Irudhaya.Dhasan\\Gechko1\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new FirefoxDriver();
	//	WebDriver driver = new ChromeDriver();
		
		
		String baseUrl = "file:///C:/Users/Jesu.Irudhaya.Dhasan/git/demodev/demodev/index.html";
        String expectedTitle = "Industrious by TEMPLATED"; 	
        String actualTitle = "";
        String exp="test8800";
		
		
		
        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Title Verification Test Passed!");
        } else {
            System.out.println("Title Verification Test Failed");
        }
    
        
        String xPathItemSelector = "//*[@id=\"header\"]/a";
        WebElement dropDownItem = driver.findElement(By.xpath(xPathItemSelector));
        if (dropDownItem.isDisplayed() ) {
        	     	
        	 System.out.println("Heading is existd!");
        	 String dropdown1 = driver.findElement(By.className("logo")).getText();
     		
           	 if (dropdown1.matches(exp)){
                 System.out.println("Heading is correct and testing passed");
             }
             else{
                 System.out.println("Heading is wrong and testcase failed");
             }
        	 
        
        } else {
            System.out.println("Heading Verification Test Failed");
        };

		
   	
         	 
        
        
        
        driver.close();
		
		
		
		
		
		
	}

}

package section_1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class openfirefoxbrowser {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "D:\\softwar java\\firefox26\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();    // upcasting
	 driver.get("https://www.google.com/");
	}

}

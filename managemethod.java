package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
public class managemethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91917\\Downloads\\chromedriver-win64\\chromedriver-win64.chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://chat.openai.com/");
		Options opt=dr.manage();
		Window w=opt.window();
		w.maximize();
		Thread.sleep(3000);
		
		/*Dimension d=new Dimension(200,400);
		dr.manage().window().setSize(d);
		
		Point p=new Point(200,300);
		dr.manage().window().setSize(p); */
		Thread.sleep(5000);
		dr.quit();
		
		//dr.manage();
	}

}

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run extends Datas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Datas dat = new Datas();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(dat.url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		RahuShetty rs = new RahuShetty(driver);
		rs.login(dat.us, dat.pw);
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

	}



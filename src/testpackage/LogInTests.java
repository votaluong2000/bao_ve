package testpackage;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


class LogInTests {

	private WebDriver driver;

	LogInTests() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");//dòng này chạy dành cho trình duyệt chrome
		driver = new ChromeDriver();
		driver.get("http://localhost/test1/Project%20for%20Testing/SportsCorner");// link web cần buil và test
		driver.manage().window().maximize();//tùy chọn 1 giao diện cung cấp danh sách phương pháp truy cập trả về giao diện 
		//quản lý của sổ hiện tại và tối đa hóa cửa sổ được chọn hiện tại

	}

	@Test
	void testUserLogIn_TestCaseID577() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));//tìm biến đăng nhập email
		WebElement password = driver.findElement(By.id("loginpassword"));//tìm biến đăng nhập password
		WebElement loginbutton = driver.findElement(By.id("btn-login"));// tìm nút đăng nhập
		// sau khi tìm các biến xong sẽ tìm giá trị
		email.sendKeys("");//email
		password.sendKeys("");//password
		loginbutton.click();//tìm nút đăng nhập
		Thread.sleep(2000);// thời gian chạy là 2000 mili giây

		WebElement logintext = driver.findElement(By.id("logintext"));//xác định phần tử đã nằm trong thẻ logintext chưa
		assertNotEquals(null, logintext);//trường hợp login không được sẽ không trả về giá trị nào mà quay lại tràn login
		driver.close();//đóng trình duyệt mà bạn đang trực tiếp sử dụng, hay đang tương tác lên nó

	}

	@Test
	void testUserLogIn_TestCaseID578() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("us0023@gmail.com");
		password.sendKeys("");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();

	}

	@Test
	void testUserLogIn_TestCaseID579() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("arima@gmail.com");
		password.sendKeys("");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();
	}

	@Test
	void testUserLogIn_TestCaseID580() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("us0024@gmailcom");
		password.sendKeys("");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();
	}

	@Test
	void testUserLogIn_TestCaseID581() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("");
		password.sendKeys("q00005");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();
	}

	@Test
	void testUserLogIn_TestCaseID582() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("us0023@gmail.com");
		password.sendKeys("q00005");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement cruyffquote = driver.findElement(By.id("cruyffquoteid"));
		assertNotEquals(null, cruyffquote);
		driver.close();
	}

	@Test
	void testUserLogIn_TestCaseID583() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("arima@gmail.com");
		password.sendKeys("q00006");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();
	}

	@Test
	void testUserLogIn_TestCaseID584() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("us0024@gmailcom");
		password.sendKeys("q00006");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();
	}

	@Test
	void testUserLogIn_TestCaseID585() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("");
		password.sendKeys("ansary");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();
	}

	@Test
	void testUserLogIn_TestCaseID586() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("us0023@gmail.com");
		password.sendKeys("ansary");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();
	}

	@Test
	void testUserLogIn_TestCaseID587() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("arima@gmail.com");
		password.sendKeys("ansary");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();
	}

	@Test
	void testUserLogIn_TestCaseID588() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("us0024@gmailcom");
		password.sendKeys("ansary");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();
	}

	@Test
	void testUserLogIn_TestCaseID589() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("us0023@gmail.com");
		password.sendKeys("q00006");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();
	}

	@Test
	void testUserLogIn_TestCaseID590() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("us0024@gmail.com");
		password.sendKeys("q00006");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement cruyffquote = driver.findElement(By.id("cruyffquoteid"));
		assertNotEquals(null, cruyffquote);
		driver.close();
	}

}

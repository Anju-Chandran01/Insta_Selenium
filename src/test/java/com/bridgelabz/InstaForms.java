package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InstaForms {
	
//	LOGIN page
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("anju_ozhankal");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Anju123@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div")).submit();
		Thread.sleep(2000);
		driver.close();
	}


//	Login with facebook in login page
	@Test
	public void loginWithFacebook() throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[5]/button/span[2]")).click();
		Thread.sleep(2000);
	}


//	Forget password in login page
	@Test
	public void forgotPassword() throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.className("_2Lks6")).click();
		Thread.sleep(2000);
	}

	
//SIGN UP	
	@Test
	public void signUp() throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[2]/div/p/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("emailOrPhone")).sendKeys("anjuchandrancs01@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("fullName")).sendKeys("Anju Chandran");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("anju_ozhangal");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Anju162@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div[1]/div[2]/form/div[7]/div/button")).click();
		Thread.sleep(2000);
	}
	
// Login from SIGN UP page
	@Test
	public void loginInSignupPage() throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[2]/div/p/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div[2]/p/a")).click();
	}
	
//	Login with facebook from SIGN UP page
	@Test
	public void loginWithFacebook_InSignupPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[2]/div/p/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div[1]/div[2]/form/div[1]/button")).click();
		Thread.sleep(2000);
	}
}

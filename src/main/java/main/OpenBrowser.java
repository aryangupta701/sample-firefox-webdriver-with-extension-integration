package main;
import java.io.File;
import java.util.ArrayList;

import javax.sound.sampled.Port;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.OperatingSystem;

public class OpenBrowser {
	static String url;
	OpenBrowser(String url)
	{
		this.url = url ;
		System.out.println(url);
	}
  public void openWindow() {
	  
	System.out.println(url);
	WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.LINUX).setup();
	
    FirefoxOptions options = new FirefoxOptions();
    options.setBinary("/usr/bin/firefox");
    FirefoxProfile profile = new FirefoxProfile();
    profile.addExtension(new File("/home/aryangupta701/Documents/katalonRecorder/temp-extension/extension.xpi"));
//    profile.setPreference("extensions.Auth-Steps-Recorder.background-script.port-name", "authenticationRecorder");
    options.setProfile(profile);
//    options.setHeadless(true);

    WebDriver driver = new FirefoxDriver(options);
    driver.get("https://youtube.com");

  }
}




// Wait for the background script to establish a connection


// Receive a message from the web extension



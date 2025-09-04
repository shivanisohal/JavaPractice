package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class switch2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("browser List :\n chrome \n firefox");
        System.out.println(" enter browser name=");
        String browser = sc.next();
        WebDriver driver;

        switch (browser) {
            case "chrome":
                driver= new ChromeDriver();
                driver.get("https://mvnrepository.com/");
                break;
            case "firefox":
                driver=new FirefoxDriver();
                driver.get("https://www.ajio.com/");
                break;
            default:
                System.out.println("we are not supporting this browser");
                break;

        }
    }
}

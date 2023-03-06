package HW03012023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class HW2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");


        List<WebElement> checkboxes =driver.findElement(By.cssSelector("input[class='cb1-element']"));
        for (WebElement checkbox: checkboxes) {
            String option=checkbox.getAttribute("value");
            if(option.equalsIgnoreCase("Option-3")) {
                checkbox.click();
            }
        }


    }
}

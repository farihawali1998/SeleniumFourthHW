package HW03012023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        WebElement link = driver.findElement(By.cssSelector("input[type='checkbox']"));


        //link.click();


        Boolean selected = link.isSelected();
        System.out.println(selected);


        if (!selected) {
            link.click();
        }

        selected=link.isSelected();
        System.out.println(selected);
    }
    }


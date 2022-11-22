package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.Utility;

public class LoginTest extends Utility {
      String baseUrl = "https://opensource-demo.orangehrmlive.com/";

      @Before
      public void setUp(){
            openBrowser(baseUrl);
      }
      @Test
      public void userShouldLoginSuccessfullyWithValidCredentials(){
            //Enter username and password
            sendTextElement(By.name("username"),"Admin");
            sendTextElement(By.name("password"),"admin123");

            //click on login button
            clickOnElement(By.xpath("//button [@type = 'submit']"));

            //Verify the header text
            String expectedText = "Dashboard";
            String actualText = getTextFromElement(By.xpath("//span/h6 [text()='Dashboard']"));
            Assert.assertEquals("Dashbord text is not displayed", expectedText, actualText);
      }
      @After
      public void tearDown(){
         closeBrowser();
      }
}

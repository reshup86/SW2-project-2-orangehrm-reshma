package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.Utility;

public class ForgotPasswordTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //Click on forgot password
        clickOnElement(By.xpath("//form/div/p [text() = 'Forgot your password? ']"));
        //Verify the text
        String expectedText = "Reset Password";
        String actualText = getTextFromElement(By.xpath("//form/h6 [text()= 'Reset Password']"));
        Assert.assertEquals("Reset password text is not displayed",expectedText,actualText);
    }
    @After
    public void tearDown(){
       closeBrowser();
    }
}

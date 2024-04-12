import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
 
@Test
public class ForgetPasswordPage extends BaseTest{
     
    @Test
    public void getHeading() {
         
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='forgotPasswordLink']/a")).click();
        String heading = driver.findElement(By.xpath("//*[@id='content']/div[1]/div[2]/h1")).getText();
        System.out.println("Title : "+ heading );
        Assert.assertEquals(heading, "Forgot Your Password?");
    }
     
}

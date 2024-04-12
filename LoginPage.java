import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
 
@Test
public class LoginPage extends BaseTest{
     
    @Test
    public void validCredentials() throws InterruptedException {
 
            driver.findElement(By.name("txtUsername")).sendKeys("Admin");           
            driver.findElement(By.name("txtPassword")).sendKeys("admin123");
            driver.findElement(By.id("btnLogin")).click();
             String newPageText = driver.findElement(By.xpath("//*[@id='content']/div/div[1]/h1")).getText();
            System.out.println("newPageText :" + newPageText);
            Assert.assertEquals(newPageText,"Dashboard");
 
    }
 
}

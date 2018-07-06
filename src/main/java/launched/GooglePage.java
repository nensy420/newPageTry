package launched;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class GooglePage {
   private WebElement searchObj ;
    private WebElement buttomSearch;

   public void inputWord(){

       searchObj.findElement(By.id("lst-ib")).sendKeys("automation");

   }
}

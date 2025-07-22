package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MailPage {
  @FindBy(xpath="//div[@text='mailaddress']")
  private WebElement mailaddressarea;
}

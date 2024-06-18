package Tests;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTests {
    @Test
    public void textBoxFakerTest(){
        String f1=ukFaker.name().fullName();
        String eMail=ukFaker.name().username();
        String cAdd=ukFaker.address().cityName();
        String pAdd=ukFaker.address().fullAddress();
        String domain="@test.com";

        homepage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Text Box");
        waitTime();
        textBoxPage.enterFullName(f1);
        textBoxPage.enterMail(eMail);
        textBoxPage.enterCAddress(cAdd);
        textBoxPage.enterPAddress(pAdd);
        textBoxPage.clickSubmit();
        waitTime();

    }

}

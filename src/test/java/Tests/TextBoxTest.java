package Tests;

import java.util.Locale;


import org.testng.Assert;
import org.testng.annotations.Test;

git merge <branch-name>
import Pages.ButtonsPage;


public class TextBoxTest extends BaseTests {
    @Test
    public void textBoxFakerTest(){
        String f1=ukFaker.name().fullName();
        String eMail=ukFaker.name().username();
        String cAdd=ukFaker.address().cityName();
        String pAdd=ukFaker.address().fullAddress();
        String domain="@test.com";

        homepage.chooseHomePageMenu("Elements");
        buttonPage.chooseElementsMenu("Text Box");
        waitTime();
        textBoxPage.enterFullName(f1);
        textBoxPage.enterMail(eMail.toLowerCase(Locale.ROOT)+domain);
        textBoxPage.enterCAddress(cAdd);
        textBoxPage.enterPAddress(pAdd);
        textBoxPage.clickSubmit();
        waitTime();

        Assert.assertEquals(textBoxPage.assertionResponse("Name"),"Name:"+f1);
        Assert.assertEquals(textBoxPage.assertionResponse("Email"),"Email:"+eMail+domain);
        Assert.assertEquals(textBoxPage.assertionResponse("Current Address"),"Current Address :"+cAdd);
        Assert.assertEquals(textBoxPage.assertionResponse("Permanent Address"),"Permananet Address :"+pAdd);
    }

}

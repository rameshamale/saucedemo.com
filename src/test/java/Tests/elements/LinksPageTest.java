package Tests.elements;
import Tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LinksPageTest extends BaseTests {
    @Test
    public void testHomeLink(){
        homepage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Links");
        linksPage.clickLinks("Home");
    }
    @Test
    public void testHomenBMso(){
        homepage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Links");
        linksPage.clickLinks("nBMso");
    }
    @Test
    public void testCreatedLink(){
        homepage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Links");
        linksPage.clickApiLinks("Created");
        String createdLinkResponse=linksPage.response();
        System.out.println(createdLinkResponse);
        Assert.assertEquals("Link has responded with staus 201 and status text Created","createdLinkResponse");
        linksPage.clickApiLinks("No Content");
        linksPage.clickApiLinks("Bad Request");
        linksPage.clickApiLinks("Unauthorized");
        linksPage.clickApiLinks("Forbidden");
        linksPage.clickApiLinks("Not Found");
    }
}

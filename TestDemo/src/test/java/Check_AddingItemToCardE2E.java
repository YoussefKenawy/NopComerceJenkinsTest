import Pages.LandingPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Check_AddingItemToCardE2E extends TestBase {

    LandingPage landingPage;

    @BeforeClass
    public void registerUser() {
        landingPage = new LandingPage(driver);
        landingPage.clickOnRegisterBtn();
        softAssert.assertEquals(landingPage.registerPageTitle(), "Register");
        landingPage.ChoseMaleGender();
        landingPage.enterFirstName();
        landingPage.enterLastName();
        landingPage.selectDayOfBirth();
        landingPage.selectMonthOfBirth();
        landingPage.selectYearOfBirth();
        landingPage.enterEmail();
        landingPage.enterCompany();
        landingPage.enterPassword();
        landingPage.confirmPassword();
        landingPage.clickOnSubmitBtn();
        softAssert.assertTrue(landingPage.successRegistrationMsg());
        softAssert.assertAll();
    }

    @BeforeMethod
    public void LoginUser() {
        landingPage.clickOnLoginBtn();
        landingPage.enterEmail();
        landingPage.enterPassword();
        landingPage.submitLogin();
        softAssert.assertTrue(landingPage.isMyAccountBtnVisibleAfterLogin());
        softAssert.assertAll();
    }

    @Test
    public void CheckAddingItemToCardE2E()
    {
        
    }

}

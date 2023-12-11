package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPage extends PagePase
{

    public LandingPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(linkText = "Register")
     WebElement registerBtn;

    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    @FindBy(id = "gender-male")
    WebElement maleRadioBtn;

    @FindBy(id = "FirstName")
    WebElement fistNameInput;

    @FindBy(id = "LastName")
    WebElement lastNameInput;

    @FindBy(name = "DateOfBirthDay")
    WebElement daysList;

    @FindBy(name = "DateOfBirthMonth")
    WebElement monthList;

    @FindBy(name = "DateOfBirthYear")
    WebElement yearList;

    @FindBy(id = "Email")
    WebElement emailInput;

    @FindBy(id = "Company")
    WebElement companyInputField;

    @FindBy(id = "Password")
    WebElement passwordInput;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;

    @FindBy(id = "register-button")
    WebElement submitBtn;

    @FindBy(xpath = "//li[contains(text(),'The specified email already exists')]")
    WebElement registrationMsg;


    @FindBy(linkText = "Log in")
    WebElement loginBtn;

    @FindBy(xpath = "//div/button[@type='submit']")
    WebElement submitLogin;



    @FindBy(className = "ico-account")
    WebElement myAccountTypeAfterLogin;


    public Boolean isMyAccountBtnVisibleAfterLogin()
    {
       return  wait.until(ExpectedConditions.visibilityOf(myAccountTypeAfterLogin)).isDisplayed();
    }
    public void clickOnRegisterBtn()
    {
        wait.until(ExpectedConditions.elementToBeClickable(registerBtn)).click();
    }
    public void submitLogin()
    {
        wait.until(ExpectedConditions.elementToBeClickable(submitLogin)).click();
    }
    public void clickOnLoginBtn()
    {
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }
    public String registerPageTitle()
    {
        return wait.until(ExpectedConditions.visibilityOf(registerText)).getText();
    }

    public void ChoseMaleGender()
    {
        maleRadioBtn.click();
    }


    public void enterFirstName()
    {
        fistNameInput.sendKeys("Youssef");
    }

    public void enterLastName()
    {
        lastNameInput.sendKeys("Kenawy");
    }

    public void selectDayOfBirth()
    {
        Select selectday=new Select(daysList);
        selectday.selectByVisibleText("18");
    }
    public void selectMonthOfBirth()
    {
        Select selectMonth=new Select(monthList);
        selectMonth.selectByVisibleText("January");
    }
    public void selectYearOfBirth()
    {
        Select selectYear=new Select(yearList);
        selectYear.selectByVisibleText("1999");
    }

    public void enterEmail()
    {
      wait.until(ExpectedConditions.visibilityOf(emailInput)).sendKeys("youssefkenawy778@gmail.com");
    }

    public void enterCompany()
    {
        companyInputField.sendKeys("Sumerge");
    }

    public void enterPassword()
    {
        wait.until(ExpectedConditions.visibilityOf(passwordInput)).sendKeys("Mm123456@");
    }

    public void confirmPassword()
    {
        confirmPassword.sendKeys("Mm123456@");
    }
    public  void clickOnSubmitBtn()
    {
        submitBtn.click();
    }

    public Boolean successRegistrationMsg()
    {
       return wait.until(ExpectedConditions.visibilityOf(registrationMsg)).isDisplayed();
    }


}

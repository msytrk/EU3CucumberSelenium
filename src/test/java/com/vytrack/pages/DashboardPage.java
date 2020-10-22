package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class DashboardPage extends BasePage {


    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement userCredential;


}

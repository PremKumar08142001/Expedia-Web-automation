package com.expedia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.expedia.base.TestBase;

public class ExpediaHomePage extends TestBase{
	@FindBy(linkText="Flights")
	private WebElement fightTab;
	public ExpediaHomePage() {
		PageFactory.initElements(driver, this);
	}
	public void clickFlightTab() {
		fightTab.click();
	}
	public void preRequisite() {
		clickFlightTab();
	}

}
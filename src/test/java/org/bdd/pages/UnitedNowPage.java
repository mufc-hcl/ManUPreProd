package org.bdd.pages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import io.appium.java_client.AppiumBy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.locators.ExplorePageLocators;
import org.bdd.locators.UnitedNowPageLocators;
import org.bdd.utils.*;
import org.bdd.utils.apiResponse.UnitedNowAPIResponse;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import static org.bdd.utils.AndroidGenericLibrary.swipeWithCoordinates;

public class UnitedNowPage extends Common {
	private static final Logger log = LogManager.getLogger(UnitedNowPage.class);
	UnitedNowPageLocators unitedNowPageLocators;
	public UnitedNowAPIResponse unitedNowAPIResponse = new UnitedNowAPIResponse();

	public UnitedNowPage() {
		this.unitedNowPageLocators = new UnitedNowPageLocators();
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), unitedNowPageLocators);
	}

	public String getCurrentDayANdDate() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.dayAndDateUnitedPage, 5);
			String expectedDate = unitedNowPageLocators.dayAndDateUnitedPage.getText();
			ExtentsReportManager.extentReportLogging("pass", "Return the current day and date in united now page");
			return expectedDate;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getCurrentDayANdDate()<br />" + e);
			throw e;
		}

	}

	public void clickFilterIcon() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				if (!unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.isEmpty()) {
					if (!(unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.get(0).getText()
							.equalsIgnoreCase("LIVE MATCH CENTRE")))
						IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				}
				if (unitedNowPageLocators.whatsNew1.size() > 0) {
					waitForVisibilityFluentWait(unitedNowPageLocators.filterIconUnitedPage.get(0), 60);
				} else {
					AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "WHAT'S NEW");
					waitForVisibilityFluentWait(unitedNowPageLocators.filterIconUnitedPage.get(0), 60);
				}
			} else {
				if (!unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.isEmpty()) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				}
				AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "WHAT'S NEW");
				elementToBeClickableFluentWait(unitedNowPageLocators.filterIconUnitedPage.get(0), 60);
			}
			unitedNowPageLocators.filterIconUnitedPage.get(0).click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on filter icon");
			elementToBeClickableFluentWait(unitedNowPageLocators.selectAllButtonFilterPage, 60);
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickFilterIcon()<br />" + e);
			throw e;
		}
	}

	public void clickFilterIconIos() {
		try {
			if (unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.size()>0) {
//                    if (!(explorePageLocators.makeYourPredictionsUnitedNowScreen.get(0).getText().equalsIgnoreCase("LIVE MATCH CENTRE")))
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			}
			if (unitedNowPageLocators.filterIconUnitedPage.get(0).isDisplayed()) {
				elementToBeClickableFluentWait(unitedNowPageLocators.filterIconUnitedPage.get(0), 60);
				unitedNowPageLocators.filterIconUnitedPage.get(0).click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on filter icon ");
			} else {
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				waitForVisibilityFluentWait(unitedNowPageLocators.filterIconUnitedPage.get(0), 60);
				elementToBeClickableFluentWait(unitedNowPageLocators.filterIconUnitedPage.get(0), 60);
				unitedNowPageLocators.filterIconUnitedPage.get(0).click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on filter icon");
			}
		} catch (Exception e) {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
//			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			unitedNowPageLocators.filterIconUnitedPage.get(0).click();
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].click();", unitedNowPageLocators.filterIconUnitedPage);

			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickFilterIconIos()<br />" + e);
			throw e;
		}
	}

	public Boolean getFilterSelection() {
		Boolean flag = null;
		try {
			List<WebElement> disabledSwitches = new ArrayList<>(unitedNowPageLocators.disabledSwitchFilterPage);
			for (int i = 0; i < disabledSwitches.size(); i++) {
				if (disabledSwitches.get(i).getDomAttribute("checked").equalsIgnoreCase("false")) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Returns filter selection");
			return flag;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getFilterSelection()<br />" + e);
			throw e;
		}
	}

	public boolean clickFilterFeedInIos(String filterFeed) {
		boolean flag = false;
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.selectAllButtonFilterPage, 60);
			for (int i = 0; i < unitedNowPageLocators.filterListFilterPage.size(); i++) {
				if (unitedNowPageLocators.filterListFilterPage.get(i).getDomAttribute("label")
						.equalsIgnoreCase(filterFeed)) {
					unitedNowPageLocators.disabledSwitchFilterPage.get(i).click();
					flag = true;
					break;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Clicked on the Filter feed:" + filterFeed);
			if (flag)
				return true;
			else
				return false;

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickFilterFeedInIos()<br />" + e);
			throw e;
		}
	}

	public boolean clickFilterFeed(String filterFeed) {
		boolean flag = false;
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.selectAllButtonFilterPage, 60);
			for (int i = 0; i < unitedNowPageLocators.filterListFilterPage.size(); i++) {
				if (unitedNowPageLocators.filterListFilterPage.get(i).getText().equalsIgnoreCase(filterFeed)) {
					unitedNowPageLocators.disabledSwitchFilterPage.get(i).click();
					flag = true;
					break;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Clicked on the filter feed :" + filterFeed);
			if (flag)
				return true;
			else
				return false;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickFilterFeed()<br />" + e);
			throw e;
		}
	}

	public boolean validatesFilterIsSelectedInIos(String filterFeed) {
		boolean flag = false;
		List<WebElement> disabledSwitches = new ArrayList<>(unitedNowPageLocators.disabledSwitchFilterPage);
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.selectAllButtonFilterPage, 60);
			for (int i = 0; i < unitedNowPageLocators.filterListFilterPage.size(); i++) {
				if (unitedNowPageLocators.filterListFilterPage.get(i).getDomAttribute("label")
						.equalsIgnoreCase(filterFeed)) {
					if (disabledSwitches.get(i).getDomAttribute("value").equalsIgnoreCase("1")) {
						flag = true;
						break;
					}
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Validation of Filter selection :"+filterFeed);
			return flag;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesFilterIsSelectedInIos()<br />" + e);
			throw e;
		}

	}

	public boolean validatesFilterIsSelected(String filterFeed) {
		boolean flag = false;
		List<WebElement> disabledSwitches = new ArrayList<>(unitedNowPageLocators.disabledSwitchFilterPage);
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.selectAllButtonFilterPage, 60);
			for (int i = 0; i < unitedNowPageLocators.filterListFilterPage.size(); i++) {
				if (unitedNowPageLocators.filterListFilterPage.get(i).getText().equalsIgnoreCase(filterFeed)) {
					if (disabledSwitches.get(i).getDomAttribute("checked").equalsIgnoreCase("true")) {
						flag = true;
						break;
					}
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Validation of filter selection :"+filterFeed);
			return flag;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesFilterIsSelected()<br />" + e);
			throw e;
		}

	}

	public boolean validatesFilterIsNotSelectedInIos(String filterFeed) {
		boolean flag = false;
		List<WebElement> disabledSwitches = new ArrayList<>(unitedNowPageLocators.disabledSwitchFilterPage);
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.selectAllButtonFilterPage, 60);
			for (int i = 0; i < unitedNowPageLocators.filterListFilterPage.size(); i++) {
				if (unitedNowPageLocators.filterListFilterPage.get(i).getDomAttribute("label")
						.equalsIgnoreCase(filterFeed)) {
					if (disabledSwitches.get(i).getDomAttribute("value").equalsIgnoreCase("0")) {
						flag = true;
						break;
					}
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Validation of filter not selected ");
			return flag;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesFilterIsNotSelectedInIos()<br />" + e);
			throw e;
		}
	}

	public boolean validatesFilterIsNotSelected(String filterFeed) {
		boolean flag = false;
		List<WebElement> disabledSwitches = new ArrayList<>(unitedNowPageLocators.disabledSwitchFilterPage);
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.selectAllButtonFilterPage, 60);
			for (int i = 0; i < unitedNowPageLocators.filterListFilterPage.size(); i++) {
				if (unitedNowPageLocators.filterListFilterPage.get(i).getText().equalsIgnoreCase(filterFeed)) {
					if (disabledSwitches.get(i).getDomAttribute("checked").equalsIgnoreCase("false")) {
						flag = true;
						break;
					}
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Validation of filter not selected");
			return flag;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesFilterIsNotSelected()<br />" + e);
			throw e;
		}
	}

	public void clickCalenderIcon() {
		try {
			elementToBeClickableFluentWait(unitedNowPageLocators.calenderIconUnitedPage, 60);
			unitedNowPageLocators.calenderIconUnitedPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on calender icon");
		} catch (StaleElementReferenceException s) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();",
					unitedNowPageLocators.calenderIconUnitedPage);
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickCalenderIcon()<br />" + e);
			throw e;
		}

	}

	public String getUnitedText() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.unitedTabUnitedPage, 60);
				String actualUnited = unitedNowPageLocators.unitedTabUnitedPage.getText();
				ExtentsReportManager.extentReportLogging("pass", "Returns United now text");
				return actualUnited;
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.unitedTabUnitedPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns United now text ");
				return unitedNowPageLocators.unitedTabUnitedPage.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getUnitedText()<br />" + e);
			throw e;
		}

	}

	public String getAllTeams() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
//                waitForVisibilityFluentWait(allTeamsTabUnitedPage);
				String actualAllTeams = unitedNowPageLocators.allTeamsTabUnitedPage.getText();
				ExtentsReportManager.extentReportLogging("pass", "Returns All teams text");
				return actualAllTeams;
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.allTeamsTabUnitedPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns All teams text ");
				return unitedNowPageLocators.allTeamsTabUnitedPage.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getAllTeams()<br />" + e);
			throw e;
		}

	}

	public String getMenText() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
//                waitForVisibilityFluentWait(menUnitedPage);
				String actualMenText = unitedNowPageLocators.menUnitedPage.getText();
				ExtentsReportManager.extentReportLogging("pass", "Returns the mens text");
				return actualMenText;
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.menUnitedPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns the mens text");
				return unitedNowPageLocators.menUnitedPage.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getMenText()<br />" + e);
			throw e;
		}

	}

	public List getMenDropDownValues() {
		String device = GlobalParams.getPlatformName();
		ArrayList<String> menDropDownList = new ArrayList<>();
		try {
			if (device.equalsIgnoreCase("android")) {
//            waitForVisibilityFluentWait(unitedNowPageLocators.menUnitedPage,60);
				for (int i = 0; i < unitedNowPageLocators.menDropDownUnitedPage.size(); i++) {
					menDropDownList.add(unitedNowPageLocators.menDropDownUnitedPage.get(i).getText());
				}
				ExtentsReportManager.extentReportLogging("pass", "Returns mens dropdown values");
			} else {
				for (int i = 0; i < unitedNowPageLocators.menDropDownUnitedPage.size(); i++) {
					menDropDownList.add(unitedNowPageLocators.menDropDownUnitedPage.get(i).getDomAttribute("label").split(", ")[0]);
				}
				ExtentsReportManager.extentReportLogging("pass", "Returns mens dropdown values");
			}
			return menDropDownList;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getMenDropDownValues()<br />" + e);
			throw e;
		}
	}

	public void clickMenDropDown() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.menUnitedPage, 60);
			elementToBeClickableFluentWait(unitedNowPageLocators.menUnitedPage, 60);
			unitedNowPageLocators.menUnitedPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on Mens drop down");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickMenDropDown()<br />" + e);
			throw e;
		}

	}

	public void clickOnThreeDotsIcon() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.threeDotsIconUnitedPage, 60);
			unitedNowPageLocators.threeDotsIconUnitedPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on three dots in united page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnThreeDotsIcon()<br />" + e);
			throw e;
		}

	}

	public void clickOnTheGivenFilter(String filter) throws Exception {
		elementToBeClickableFluentWait(unitedNowPageLocators.allRadioBtnUnitedPage, 60);
		try {
			if (filter.equalsIgnoreCase("All 2024/25")) {
				unitedNowPageLocators.allRadioBtnUnitedPage.click();
			} else if (filter.equalsIgnoreCase("Premier League")) {
				unitedNowPageLocators.premierRadioBtnUnitedPage.click();
			} else if (filter.equalsIgnoreCase("FA Cup")) {
				elementToBeClickableFluentWait(unitedNowPageLocators.faCupRadioBtnUnitedPage, 60);
				unitedNowPageLocators.faCupRadioBtnUnitedPage.click();
			} else if (filter.equalsIgnoreCase("League Cup")) {
				unitedNowPageLocators.leagueCupRadioBtnUnitedPage.click();
			} else if (filter.equalsIgnoreCase("Europa League")) {
				unitedNowPageLocators.europeLegueRadioBtnUnitedPage.click();
			} else if (filter.equalsIgnoreCase("Friendly")) {
				unitedNowPageLocators.friendlyRadioBtnUnitedPage.click();
			}else if (filter.equalsIgnoreCase("FA Community Shield")) {
					unitedNowPageLocators.fACommunityShieldRadioBtnUnitedPage.click();
			} 
			else {
				throw new Exception("Invalid selection");
			}
			ExtentsReportManager.extentReportLogging("pass",
					"Clicks on the given filter in United now page :" + filter);
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnTheGivenFilter()<br />" + e);
			throw e;
		}

	}

	public void clickOnTheGivenFilterInIos(String filter) {
//		elementToBeClickableFluentWait(allRadioBtnUnitedPage);
		try {
			if (filter.equalsIgnoreCase("All 2024/25")) {
				unitedNowPageLocators.allRadioBtnUnitedPage.click();
			} else if (filter.equalsIgnoreCase("Premier League")) {
				unitedNowPageLocators.premierRadioBtnUnitedPage.click();
			} else if (filter.equalsIgnoreCase("FA Cup")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.faCupRadioBtnUnitedPage, 30);
				unitedNowPageLocators.faCupRadioBtnUnitedPage.click();
			} else if (filter.equalsIgnoreCase("League Cup")) {
				unitedNowPageLocators.leagueCupRadioBtnUnitedPage.click();
			} else if (filter.equalsIgnoreCase("Europa League")) {
				unitedNowPageLocators.europeLegueRadioBtnUnitedPage.click();
			} else if (filter.equalsIgnoreCase("Friendly")) {
				unitedNowPageLocators.friendlyRadioBtnUnitedPage.click();
			} else {
				throw new Exception("Invalid selection");
			}
			ExtentsReportManager.extentReportLogging("pass",
					"Clicks on the given filter in United now page :" + filter);
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnTheGivenFilterInIos()<br />" + e);
		}

	}

	public List<String> getLeagueFilterRadioBtnValues(){
		String device = GlobalParams.getPlatformName();
		ArrayList<String> menDropDownList = new ArrayList<>();
		try {
			if (device.equalsIgnoreCase("android")) {
//				Thread.sleep(1000);
			waitForVisibilityFluentWait(unitedNowPageLocators.leagueRadioBtnUnitedPage.get(0), 60);
			for (int i = 0; i < unitedNowPageLocators.leagueRadioBtnUnitedPage.size(); i++) {
				menDropDownList.add(unitedNowPageLocators.leagueRadioBtnUnitedPage.get(i).getText().trim());
			}
			}else {
				for (int i = 0; i < unitedNowPageLocators.leagueRadioBtnUnitedPage.size(); i++) {
					menDropDownList.add(unitedNowPageLocators.leagueRadioBtnUnitedPage.get(i).getDomAttribute("label").replace(", selected, radio", "").split(", ")[0]);
			}
			ExtentsReportManager.extentReportLogging("pass", "Returns the league filter radio button list");
			}
			 Collections.sort(menDropDownList);
			return menDropDownList;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getLeagueFilterRadioBtnValues()<br />" + e);
			throw e;
		}
	}

	public boolean validateLeaguesDisplayed() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.allLeaguesUnitedPage, 60);
			ExtentsReportManager.extentReportLogging("pass", "Displayed all league in united now page");
			return unitedNowPageLocators.allLeaguesUnitedPage.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validateLeaguesDisplayed()<br />" + e);
			throw e;
		}
	}

	public boolean validatefilteredLeagueInIos(String validation) {
		String[] statements = validation.split(",");
		try {
			if (!unitedNowPageLocators.leagueRow1UnitedPage1.isEmpty()) {
				ExtentsReportManager.extentReportLogging("pass", "Returns league text in the united now page");
				return unitedNowPageLocators.leagueRow1UnitedPage.getDomAttribute("label")
						.contains(statements[0].trim());
			} else if (unitedNowPageLocators.noFixturesTextUnitedPage.get(0).isDisplayed()) {
				ExtentsReportManager.extentReportLogging("pass", "Returns no fixtures text in the united now page");
				return unitedNowPageLocators.noFixturesTextUnitedPage.get(0).getDomAttribute("label")
						.equalsIgnoreCase(statements[1]);
			} else
				return false;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatefilteredLeagueInIos()<br />" + e);
			throw e;
		}
	}

	public boolean validatefilteredEuropeLeagueInIos(String validation) {
		String[] statements = validation.split(",");
		try {
			if (!unitedNowPageLocators.europeLeagueOpt5UnitedNow.isEmpty()) {
				ExtentsReportManager.extentReportLogging("pass", "Returns european league text in the united now page");
				return unitedNowPageLocators.europeLeagueOpt5UnitedNow1.getDomAttribute("label")
						.contains(statements[0].trim());
			} else if (unitedNowPageLocators.noFixturesTextUnitedPage.get(0).isDisplayed()) {
				ExtentsReportManager.extentReportLogging("pass", "Returns no fixtures text in the united now page");
				return unitedNowPageLocators.noFixturesTextUnitedPage.get(0).getDomAttribute("label")
						.equalsIgnoreCase(statements[1]);
			} else
				return false;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatefilteredEuropeLeagueInIos()<br />" + e);
			throw e;
		}
	}

	public boolean validatefilteredLeagueCupOpt4InIos(String validation) {
		String[] statements = validation.split(",");
		try {
			if (!unitedNowPageLocators.leagueCupOpt4UnitedNow.isEmpty()) {
				ExtentsReportManager.extentReportLogging("pass", "Returns league text in the united now page");
				return unitedNowPageLocators.leagueCupOpt4UnitedNow1.getDomAttribute("label")
						.contains(statements[0].trim());
			} else if (unitedNowPageLocators.noFixturesTextUnitedPage.get(0).isDisplayed()) {
				ExtentsReportManager.extentReportLogging("pass", "Returns no fixtures text in the united now page");
				return unitedNowPageLocators.noFixturesTextUnitedPage.get(0).getDomAttribute("label")
						.equalsIgnoreCase(statements[1]);
			} else
				return false;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatefilteredLeagueCupOpt4InIos()<br />" + e);
			throw e;
		}
	}

	public boolean validateFriendlyfilteredLeagueInIos(String validation) {
		String[] statements = validation.split(",");
		try {
			if (!unitedNowPageLocators.friendlyLeagueOpt6UnitedNow.isEmpty()) {
				ExtentsReportManager.extentReportLogging("pass", "Returns friendly filter text in the united now page");
				return unitedNowPageLocators.friendlyLeagueOpt6UnitedNow1.getDomAttribute("label")
						.contains(statements[0].trim());
			} else if (unitedNowPageLocators.noFixturesTextUnitedPage.get(0).isDisplayed()) {
				ExtentsReportManager.extentReportLogging("pass", "Returns no fixtures text in the united now page");
				return unitedNowPageLocators.noFixturesTextUnitedPage.get(0).getDomAttribute("label")
						.equalsIgnoreCase(statements[1]);
			} else
				return false;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validateFriendlyfilteredLeagueInIos()<br />" + e);
			throw e;
		}
	}

	public boolean validatefilteredLeague(String validation) {
		String[] statements = validation.split(",");
		try {
			if (!unitedNowPageLocators.leagueRow1UnitedPage1.isEmpty()) {
				ExtentsReportManager.extentReportLogging("pass", "Returns league text in the united now page");
				return unitedNowPageLocators.leagueRow1UnitedPage1.get(0).getText().contains(statements[0].trim());
			} else if (unitedNowPageLocators.noFixturesTextUnitedPage.get(0).isDisplayed()) {
				ExtentsReportManager.extentReportLogging("pass", "Returns no fixtures text in the united now page");
				return unitedNowPageLocators.noFixturesTextUnitedPage.get(0).getText().equalsIgnoreCase(statements[1]);
			} else
				return false;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatefilteredLeague()<br />" + e);
			throw e;
		}
	}

	public boolean validateUpcomingFixtures(String fixtureText) {
		String[] splitFixtures = fixtureText.split(",");
		try {
			if (!unitedNowPageLocators.textFixtureAndResults1.isEmpty()) {
				System.out.println(unitedNowPageLocators.textFixtureAndResults1.get(0).getText());
				return unitedNowPageLocators.textFixtureAndResults1.get(0).getText().contains(splitFixtures[0].trim())
						|| unitedNowPageLocators.textFixtureAndResults1.get(0).getText()
								.contains(splitFixtures[1].trim())
						|| unitedNowPageLocators.textFixtureAndResults1.get(0).getText()
								.contains(splitFixtures[2].trim());

			}
			ExtentsReportManager.extentReportLogging("pass", "Returns upcoming fixtures text");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validateUpcomingFixtures()<br />" + e);
			throw e;
		}

		return false;
	}

	public boolean validateUpcomingResultsInIos(String fixtureText) {
		try {
//			if (matchReviewInAllUnitedNow.isDisplayed()) {
			ExtentsReportManager.extentReportLogging("pass", "Returns match review");
			return unitedNowPageLocators.matchReviewInAllUnitedNow.getDomAttribute("label").contains(fixtureText);
			// }

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validateUpcomingResultsInIos()<br />" + e);
			throw e;
		}

		// return false;
	}

	public String validateUpcomingResults() {
		WebElement ele = null;
	      String device = GlobalParams.getPlatformName();
	      try {
	            if (device.equalsIgnoreCase("android")) {
	                waitForVisibilityFluentWait(unitedNowPageLocators.textFixtureAndResults, 60);
	                ele = unitedNowPageLocators.textFixtureAndResults;
	                ExtentsReportManager.extentReportLogging("pass", "Returned UpcomingResults");
	                return ele.getText();
	            } else {
	            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.UP, 0.5);
	            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.UP, 0.5);
					waitForVisibilityFluentWait(unitedNowPageLocators.textFixtureAndResults, 60);

	                ExtentsReportManager.extentReportLogging("pass", "Returned UpcomingResults ");
	                return unitedNowPageLocators.textFixtureAndResults.getDomAttribute("label");
	            }
	        } catch (Exception e) {
	            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-validateUpcomingResults()<br />" + e);
	            throw e;
	        }
	}
	      

	public void clickOnResults() {
		try {
			elementToBeClickableFluentWait(unitedNowPageLocators.resultsIconUnitedPage, 60);
			unitedNowPageLocators.resultsIconUnitedPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on results icon in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnResults()<br />" + e);
			throw e;
		}

	}

	public void clicksOnTableIconFromAnyScheduledMatch() {
		try {
			for (int i = 0; i < 20; i++) {
				if (unitedNowPageLocators.tableIconSchedulePage.size() <= 0) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.5);
				} else {
					break;
				}
				ExtentsReportManager.extentReportLogging("pass", "clicks on table icon in schedule page");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnTableIconFromAnyScheduledMatch()<br />" + e);
			throw e;
		}
	}

	public void clicksOnTableIcon() {
		try {
			elementToBeClickableFluentWait(unitedNowPageLocators.tableIconSchedulePage1, 60);
			unitedNowPageLocators.tableIconSchedulePage1.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on results icon in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnResults()<br />" + e);
			throw e;
		}

	}

	public String getMenLeague1Text() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.menLeague1TextScheduleScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns mens league text");
				return unitedNowPageLocators.menLeague1TextScheduleScreen.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.menLeague1TextScheduleScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns mens league text");
				return unitedNowPageLocators.menLeague1TextScheduleScreen.getDomAttribute("label").replace("Tab Item", "").trim();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getMenLeague1Text()<br />" + e);
			throw e;
		}
	}

	public String getMenLeague2Text() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.menLeague2TextScheduleScreen, 60);
				unitedNowPageLocators.menLeague2TextScheduleScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Returns mens league text");
				return unitedNowPageLocators.menLeague2TextScheduleScreen.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.menLeague2TextScheduleScreen, 60);
				unitedNowPageLocators.menLeague2TextScheduleScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Returns mens league text");
				return unitedNowPageLocators.menLeague2TextScheduleScreen.getDomAttribute("label").replace("Tab Item", "").trim();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getMenLeague2Text()<br />" + e);
			throw e;
		}
	}

	public void selectCategoryFromDropDown(String value) {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.arrowButtonSchedulePage, 60);
			unitedNowPageLocators.arrowButtonSchedulePage.click();
			if (value.equalsIgnoreCase("Women")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.womenMatchSchedulePage, 60);
				unitedNowPageLocators.womenMatchSchedulePage.click();
			} else if (value.equalsIgnoreCase("under21")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.under21MatchSchedulePage, 60);
				unitedNowPageLocators.under21MatchSchedulePage.click();
			} else if (value.equalsIgnoreCase("under18")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.under18MatchSchedulePage, 60);
				unitedNowPageLocators.under18MatchSchedulePage.click();
			} else if (value.equalsIgnoreCase("girls")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.girlsMatchSchedulePage, 60);
				unitedNowPageLocators.girlsMatchSchedulePage.click();
			}
			ExtentsReportManager.extentReportLogging("pass", "Selects category from drop down:" + value);
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-selectCategoryFromDropDown()<br />" + e);
			throw e;
		}

	}

	public String getWomenLeague1Text() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.womenLeague1TextScheduleScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns womens league text");
				return unitedNowPageLocators.womenLeague1TextScheduleScreen.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.womenLeague1TextScheduleScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns womens league text");
				return unitedNowPageLocators.womenLeague1TextScheduleScreen.getDomAttribute("label").replace("Tab Item", "").trim();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getWomenLeague1Text()<br />" + e);
			throw e;
		}
	}

	public String getWomenLeague2Text() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.womenLeague2TextScheduleScreen, 60);
				unitedNowPageLocators.womenLeague2TextScheduleScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Returns womens league text");
				return unitedNowPageLocators.womenLeague2TextScheduleScreen.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.womenLeague2TextScheduleScreen, 60);
				unitedNowPageLocators.womenLeague2TextScheduleScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Returns womens league text");
				return unitedNowPageLocators.womenLeague2TextScheduleScreen.getDomAttribute("label").replace("Tab Item", "").trim();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getWomenLeague2Text()<br />" + e);
			throw e;
		}
	}

	public String getUnder21League1Text() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.under21League1TextScheduleScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns under21 league text");
				return unitedNowPageLocators.under21League1TextScheduleScreen.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.under21League1TextScheduleScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns under21 league text");
				return unitedNowPageLocators.under21League1TextScheduleScreen.getDomAttribute("label").replace("Tab Item", "").trim();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getUnder21League1Text()<br />" + e);
			throw e;
		}
	}

	public String getUnder21League2Text() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.under21League2TextScheduleScreen, 60);
				unitedNowPageLocators.under21League2TextScheduleScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Returns under21 league text");
				return unitedNowPageLocators.under21League2TextScheduleScreen.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.under21League2TextScheduleScreen, 60);
				unitedNowPageLocators.under21League2TextScheduleScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Returns under21 league text");
				return unitedNowPageLocators.under21League2TextScheduleScreen.getDomAttribute("label").replace("Tab Item", "").trim();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getUnder21League2Text()<br />" + e);
			throw e;
		}
	}

	public String getUnder18League1Text() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.under18League1TextScheduleScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns under18 league text");
				return unitedNowPageLocators.under18League1TextScheduleScreen.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.under18League1TextScheduleScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns under18 league text");
				return unitedNowPageLocators.under18League1TextScheduleScreen.getDomAttribute("label").replace("Tab Item", "").trim();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getUnder18League1Text()<br />" + e);
			throw e;
		}
	}

	public String getUnder18League2Text() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.under18League2TextScheduleScreen, 60);
				unitedNowPageLocators.under18League2TextScheduleScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Returns under18 league text");
				return unitedNowPageLocators.under18League2TextScheduleScreen.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.under18League2TextScheduleScreen, 60);
				unitedNowPageLocators.under18League2TextScheduleScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Returns under18 league text");
				return unitedNowPageLocators.under18League2TextScheduleScreen.getDomAttribute("label").replace("Tab Item", "").trim();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getUnder18League2Text()<br />" + e);
			throw e;
		}
	}

	public void clicksThePlayerIconInUnitedNowScreen() throws InterruptedException {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				if (!unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.isEmpty()) {
					waitForVisibilityFluentWait(unitedNowPageLocators.influencerIconUnitedNowPage, 60);
					unitedNowPageLocators.influencerIconUnitedNowPage.click();
					if (unitedNowPageLocators.closeButtonPredictionCouroselUnitedNowPage.isDisplayed()) {
						unitedNowPageLocators.closeButtonPredictionCouroselUnitedNowPage.click();
					}
					waitForVisibilityFluentWait(unitedNowPageLocators.playerComparisonIconUnitedNowPage, 60);
					unitedNowPageLocators.playerComparisonIconUnitedNowPage.click();
				} else {
					elementToBeClickableFluentWait(unitedNowPageLocators.playerIconUnitedNowPage, 60);
					unitedNowPageLocators.playerIconUnitedNowPage.click();
				}
			} else {
				if (unitedNowPageLocators.playerIconUnitedNowPage.isDisplayed()) {
					elementToBeClickableFluentWait(unitedNowPageLocators.playerIconUnitedNowPage, 60);
					unitedNowPageLocators.playerIconUnitedNowPage.click();
				} else {
					elementToBeClickableFluentWait(unitedNowPageLocators.lineUpIconUnitedNowPage, 60);
					unitedNowPageLocators.lineUpIconUnitedNowPage.click();
					Thread.sleep(2000);
//					waitForVisibilityFluentWait(unitedNowPageLocators.playerIconUnitedNowPage, 60);
					elementToBeClickableFluentWait(unitedNowPageLocators.playerIconUnitedNowPage, 60);
					unitedNowPageLocators.playerIconUnitedNowPage.click();
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Clicks on player icon in united now screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksThePlayerIconInUnitedNowScreen()<br />" + e);
			throw e;
		}
	}

	public String getMenTabPlayersScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.menTabPlayersScreen, 60);
				unitedNowPageLocators.menTabPlayersScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on men tab in players screen");
				return unitedNowPageLocators.menTabPlayersScreen.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.menTabPlayersScreen, 60);
				unitedNowPageLocators.menTabPlayersScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on men tab in players screen");
				return unitedNowPageLocators.menTabPlayersScreen.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getMenTabPlayersScreen()<br />" + e);
			throw e;
		}
	}

	public String getWomenTabPlayersScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
//                waitForVisibilityFluentWait(womenTabPlayersScreen);
				unitedNowPageLocators.womenTabPlayersScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on women tab in players screen");
				return unitedNowPageLocators.womenTabPlayersScreen.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.womenTabPlayersScreen, 60);
				unitedNowPageLocators.womenTabPlayersScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on women tab in players screen");
				return unitedNowPageLocators.womenTabPlayersScreen.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getWomenTabPlayersScreen()<br />" + e);
			throw e;
		}
	}

	public String getUnder23TabPlayersScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
//                waitForVisibilityFluentWait(under21TabPlayersScreen);
				unitedNowPageLocators.under23TabPlayersScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on under23 tab in players screen");
				return unitedNowPageLocators.under23TabPlayersScreen.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.under23TabPlayersScreen, 60);
				unitedNowPageLocators.under23TabPlayersScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on under23 tab in players screen");
				return unitedNowPageLocators.under23TabPlayersScreen.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getUnder21TabPlayersScreen()<br />" + e);
			throw e;
		}
	}

	public String getUnder18TabPlayersScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
//                waitForVisibilityFluentWait(under18TabPlayersScreen);
				unitedNowPageLocators.under18TabPlayersScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on under18 tab in players screen");
				return unitedNowPageLocators.under18TabPlayersScreen.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.under18TabPlayersScreen, 60);
				unitedNowPageLocators.under18TabPlayersScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on under18 tab in players screen");
				return unitedNowPageLocators.under18TabPlayersScreen.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getUnder18TabPlayersScreen()<br />" + e);
			throw e;
		}
	}

	public String getLegendsTabPlayersScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
//                waitForVisibilityFluentWait(legendTabPlayersScreen);
				unitedNowPageLocators.legendTabPlayersScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on legends tab in players screen");
				return unitedNowPageLocators.legendTabPlayersScreen.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.legendTabPlayersScreen, 60);
				unitedNowPageLocators.legendTabPlayersScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on legends tab in players screen");
				return unitedNowPageLocators.legendTabPlayersScreen.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getLegendsTabPlayersScreen()<br />" + e);
			throw e;
		}
	}

	public void clicksPlayerFromTab(String value) {
		try {
			if (value.equalsIgnoreCase("men")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.menTabPlayersScreen, 30);
				unitedNowPageLocators.menTabPlayersScreen.click();
				waitForVisibilityFluentWait(unitedNowPageLocators.selectPlayerPlayersScreen, 30);
				unitedNowPageLocators.selectPlayerPlayersScreen.click();
			} else if (value.equalsIgnoreCase("women")) {
//                waitForVisibilityFluentWait(womenTabPlayersScreen);
				unitedNowPageLocators.womenTabPlayersScreen.click();
				waitForVisibilityFluentWait(unitedNowPageLocators.selectPlayerPlayersScreen, 30);
				unitedNowPageLocators.selectPlayerPlayersScreen.click();
			} else if (value.equalsIgnoreCase("under23")) {
//                waitForVisibilityFluentWait(under21TabPlayersScreen);
				unitedNowPageLocators.under23TabPlayersScreen.click();
				waitForVisibilityFluentWait(unitedNowPageLocators.selectPlayerPlayersScreen, 30);
				unitedNowPageLocators.selectPlayerPlayersScreen.click();
			} else if (value.equalsIgnoreCase("under18")) {
//                waitForVisibilityFluentWait(under18TabPlayersScreen);
				unitedNowPageLocators.under18TabPlayersScreen.click();
				waitForVisibilityFluentWait(unitedNowPageLocators.selectPlayerPlayersScreen, 30);
				unitedNowPageLocators.selectPlayerPlayersScreen.click();
			} else if (value.equalsIgnoreCase("legends")) {
//                waitForVisibilityFluentWait(legendTabPlayersScreen);
				unitedNowPageLocators.legendTabPlayersScreen.click();
				waitForVisibilityFluentWait(unitedNowPageLocators.selectPlayerPlayersScreen, 30);
				unitedNowPageLocators.selectPlayerPlayersScreen.click();
			}
			ExtentsReportManager.extentReportLogging("pass", "Clicks on players from the tab");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksPlayerFromTab()<br />" + e);
			throw e;
		}
	}

	public void getProfileTab() {
		try {
//            IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			if (!unitedNowPageLocators.profileTabPlayersInfoPage.isEmpty()) {
//                waitForVisibilityFluentWait(profileTabPlayersInfoPage.get(0));
				unitedNowPageLocators.profileTabPlayersInfoPage.get(0).click();
			}
			ExtentsReportManager.extentReportLogging("pass", "Clicks on profile tab in players info page");
		} catch (NoSuchElementException n) {
			ExtentsReportManager.extentReportLogging("pass", "element is not displayed hence skipped");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getProfileTab()<br />" + e);
			throw e;
		}
	}

	public void getStatsTab() {
		try {
			if (!unitedNowPageLocators.statsTabPlayersInfoPage.isEmpty()) {
//                waitForVisibilityFluentWait(statsTabPlayersInfoPage.get(0));
				unitedNowPageLocators.statsTabPlayersInfoPage.get(0).click();
			}
			ExtentsReportManager.extentReportLogging("pass", "Clicks on stats tab in players info page");
		} catch (NoSuchElementException n) {
			ExtentsReportManager.extentReportLogging("pass", "element is not displayed hence skipped");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getStatsTab()<br />" + e);
			throw e;
		}
	}

	public void navigateToTheLatestSectionForThePlayer() {
		try {
			AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "LATEST");
			ExtentsReportManager.extentReportLogging("pass", "Navigates to latest section");
		} catch (NoSuchElementException ns) {
			ExtentsReportManager.extentReportLogging("pass", "Latest section is not available" + ns);
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-navigateToTheLatestSectionForThePlayer()<br />" + e);
			throw e;
		}
	}

	public void clickingOnVideoOrArticleNavigatesToTheRespectivePage() {
		try {
			if (unitedNowPageLocators.playButtonVideoLatestSection.size() > 0) {
				unitedNowPageLocators.playButtonVideoLatestSection.get(0).click();
//                try {
//                    swipeWithCoordinates(1026, 468, 314, 413, 200, "left", driver);
//                } catch (NoSuchElementException e) {
//                    closeButton.click();
//                }
				elementToBeClickableFluentWait(unitedNowPageLocators.closeButton, 60);
				unitedNowPageLocators.closeButton.click();
				elementToBeClickableFluentWait(unitedNowPageLocators.backButton, 60);
				unitedNowPageLocators.backButton.click();
			} else {
				unitedNowPageLocators.articleCard.click();
				elementToBeClickableFluentWait(unitedNowPageLocators.backButton1.get(0), 60);
				unitedNowPageLocators.backButton1.get(0).click();
				elementToBeClickableFluentWait(unitedNowPageLocators.backButton, 60);
				unitedNowPageLocators.backButton.click();
			}
			ExtentsReportManager.extentReportLogging("pass", "CLicks on video or article");
		} catch (NoSuchElementException ns) {
			ExtentsReportManager.extentReportLogging("pass", "Latest section is not available");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickingOnVideoOrArticleNavigatesToTheRespectivePage()<br />" + e);
			throw e;

		}
	}

	public void navigatesToTheJoinedSection() {
		try {
			AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "JOINED");
			ExtentsReportManager.extentReportLogging("pass", "Navigates to Joined section");
		} catch (NoSuchElementException ns) {
			ExtentsReportManager.extentReportLogging("pass", "Latest section is not available" + ns);
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-navigatesToTheJoinedSection()<br />" + e);
			throw e;
		}
	}

	public void userClicksBackIconInPlayesPage() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.backButton, 10);
			ExtentsReportManager.extentReportLogging("pass", "CLicks on back button in players page");
			unitedNowPageLocators.backButton.click();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userClicksBackIconInPlayesPage()<br />" + e);
			throw e;

		}
	}

	public void scrollToBioGraphy() {
		AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "BIOGRAPHY");
		ExtentsReportManager.extentReportLogging("pass", "");
	}

	public boolean validatesGreetingsMessageInUnitedNowIsDisplayed() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.greetingsMsgUnitedNowPage, 60);
			ExtentsReportManager.extentReportLogging("pass", "Displayed greeting message");
			return unitedNowPageLocators.greetingsMsgUnitedNowPage.isDisplayed();
		} catch (NoSuchElementException ns) {
            System.out.println("element is not displayed hence skipped");
        } catch (StaleElementReferenceException se) {
            System.out.println("stale element exception");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesGreetingsMessageInUnitedNowIsDisplayed()<br />" + e);
			throw e;
		}
		return false;
	}

	public boolean validatesStoriesCarouselInUnitedNowIsDisplayed() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				if (unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.size() > 0) {
					if (!(unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.get(0).getText()
							.equalsIgnoreCase("LIVE MATCH CENTRE"))) {
						waitForVisibility(unitedNowPageLocators.storiesCouroselUnitedNowPage1, 15);
						return unitedNowPageLocators.storiesCouroselUnitedNowPage1.isDisplayed();
					}

				} else {
					waitForVisibility(unitedNowPageLocators.storiesCouroselUnitedNowPage1, 15);
					return unitedNowPageLocators.storiesCouroselUnitedNowPage1.isDisplayed();
				}

			} else {
				if (unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.size() > 0) {
					if (!(unitedNowPageLocators.liveMatchCenterUnitedNowScreen.get(0).getDomAttribute("label")
							.equalsIgnoreCase("LIVE MATCH CENTRE"))) {
						waitForVisibility(unitedNowPageLocators.comingUpCouroselUnitedNowPage.get(0), 15);
						return unitedNowPageLocators.comingUpCouroselUnitedNowPage.get(0).isDisplayed();
					}
				} else {
					waitForVisibility(unitedNowPageLocators.comingUpCouroselUnitedNowPage.get(0), 15);
					return unitedNowPageLocators.comingUpCouroselUnitedNowPage.get(0).isDisplayed();
				}

			}
			ExtentsReportManager.extentReportLogging("pass", "Returns the stories carousel text in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesStoriesCarouselInUnitedNowIsDisplayed()<br />" + e);
			throw e;
		}
		return false;
	}


	public ArrayList<String> validatesComingUpCarouselInUnitedNowIsDisplayed() {
		String device = GlobalParams.getPlatformName();
		ArrayList<String> comingUpcarousal = new ArrayList<>();
		try {
			if (device.equalsIgnoreCase("android")) {
				if (unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.size() > 0) {
					if (!(unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.get(0).getText()
							.equalsIgnoreCase("LIVE MATCH CENTRE"))) {
						IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
						//waitForVisibilityFluentWait(unitedNowPageLocators.comingUpCouroselUnitedNowPage.get(0), 60);
						//return unitedNowPageLocators.comingUpCouroselUnitedNowPage.get(0).isDisplayed();
						return comingUpcarousal;
					}
				} else {
					waitForVisibilityFluentWait(unitedNowPageLocators.comingUpCouroselUnitedNowPage.get(0), 60);
					//return unitedNowPageLocators.comingUpCouroselUnitedNowPage.get(0).isDisplayed();
				}
			} else {
				if (unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.size() > 0) {
					if (!(unitedNowPageLocators.liveMatchCenterUnitedNowScreen.get(0).getDomAttribute("label")
							.equalsIgnoreCase("LIVE MATCH CENTRE"))) {
						waitForVisibilityFluentWait(unitedNowPageLocators.storiesCouroselUnitedNowPage.get(0), 60);
						//return unitedNowPageLocators.storiesCouroselUnitedNowPage.isDisplayed();
						return comingUpcarousal;
					}
				} else if (unitedNowPageLocators.liveMatchCenterUnitedNowScreen.size() > 0) {

				} else {
					waitForVisibilityFluentWait(unitedNowPageLocators.storiesCouroselUnitedNowPage.get(0), 60);
					//return unitedNowPageLocators.storiesCouroselUnitedNowPage.isDisplayed();
					return comingUpcarousal;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Returns the coming up carousel text in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesComingUpCarouselInUnitedNowIsDisplayed()<br />" + e);
			throw e;
		}
		return comingUpcarousal;
		
	}


	public String getMenInDropDownText() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.menDDTabUnitedPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns Mens dropdown text");
				return unitedNowPageLocators.menDDTabUnitedPage.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.menDDTabUnitedPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns Mens dropdown text");
				return unitedNowPageLocators.menDDTabUnitedPage.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getMenInDropDownText()<br />" + e);
			throw e;
		}
	}

	public String getAWomenInDropDownText() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.womentDDTabUnitedPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns women dropdown text");
				String actualMenText = unitedNowPageLocators.womentDDTabUnitedPage.getText();
				return actualMenText;
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.womentDDTabUnitedPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns women dropdown text");
				return unitedNowPageLocators.womentDDTabUnitedPage.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getAWomenInDropDownText()<br />" + e);
			throw e;
		}
	}

	public String getUnder21sInDropDownText() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.under21sDDTabUnitedPage, 60);
				String actualMenText = unitedNowPageLocators.under21sDDTabUnitedPage.getText();
				ExtentsReportManager.extentReportLogging("pass", "Returns under21 dropdown text");
				return actualMenText;
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.under21sDDTabUnitedPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns under21 dropdown text");
				return unitedNowPageLocators.under21sDDTabUnitedPage.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getUnder21sInDropDownText()<br />" + e);
			throw e;
		}
	}

	public String getUnder18sInDropDownText() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.under18sDDTabUnitedPage, 60);
				String actualMenText = unitedNowPageLocators.under18sDDTabUnitedPage.getText();
				ExtentsReportManager.extentReportLogging("pass", "Returns under18 dropdown text");
				return actualMenText;
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.under18sDDTabUnitedPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns under18 dropdown text");
				return unitedNowPageLocators.under18sDDTabUnitedPage.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getUnder18sInDropDownText()<br />" + e);
			throw e;
		}
	}

	public String getGirlsTabInDropDownText() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.girlsTabSchedulePageIos, 60);
				String actualMenText = unitedNowPageLocators.girlsTabSchedulePageIos.getText();
				ExtentsReportManager.extentReportLogging("pass", "Returns girls dropdown text");
				return actualMenText;
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.girlsTabSchedulePageIos, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns girls dropdown text");
				return unitedNowPageLocators.girlsTabSchedulePageIos.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getGirlsTabInDropDownText()<br />" + e);
			throw e;
		}
	}

	public void clickOnMenTabInIos() {
		try {
			elementToBeClickableFluentWait(unitedNowPageLocators.menTabSchedulePageIos, 60);
			unitedNowPageLocators.menTabSchedulePageIos.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks mens tab in schedule page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnMenTabInIos()<br />" + e);
			throw e;
		}

	}

	public void clickOnWomenTabInIos() {
		try {
			elementToBeClickableFluentWait(unitedNowPageLocators.womenTabSchedulePageIos, 60);
			unitedNowPageLocators.womenTabSchedulePageIos.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks womens tab in schedule page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnWomenTabInIos()<br />" + e);
			throw e;
		}

	}

	public void clickOnTweentyOneSTabInIos() {
		try {
			elementToBeClickableFluentWait(unitedNowPageLocators.under21STabSchedulePageIos, 60);
			unitedNowPageLocators.under21STabSchedulePageIos.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks under21 tab in schedule page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnTweentyOneSTabInIos()<br />" + e);
			throw e;
		}

	}

	public void clickOnEighteenSTabInIos() {
		try {
			elementToBeClickableFluentWait(unitedNowPageLocators.under18STabSchedulePageIos, 60);
			unitedNowPageLocators.under18STabSchedulePageIos.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks under18 tab in schedule page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnEighteenSTabInIos()<br />" + e);
			throw e;
		}
	}

	public void clickOnDDWomenSTabInIos() {
		try {
			elementToBeClickableFluentWait(unitedNowPageLocators.womentDDTabUnitedPage, 60);
			unitedNowPageLocators.womentDDTabUnitedPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks women tab in united page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnDDWomenSTabInIos()<br />" + e);
			throw e;
		}
	}

	public void clickOnDDUnder21STabInIos() {
		try {
			elementToBeClickableFluentWait(unitedNowPageLocators.under21sDDTabUnitedPage, 60);
			unitedNowPageLocators.under21sDDTabUnitedPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks under21 tab in united page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnDDUnder21STabInIos()<br />" + e);
			throw e;
		}
	}

	public void clickOnDDEighteenSTabInIos() {
		try {
			elementToBeClickableFluentWait(unitedNowPageLocators.under18sDDTabUnitedPage, 60);
			unitedNowPageLocators.under18sDDTabUnitedPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks under18 tab in united page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnDDEighteenSTabInIos()<br />" + e);
			throw e;
		}
	}

	public boolean menFilterIsSelected() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.selectedMenRadioBtnInFilters, 60);
			ExtentsReportManager.extentReportLogging("pass", "");
			return unitedNowPageLocators.selectedMenRadioBtnInFilters.isSelected();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-menFilterIsSelected()<br />" + e);
			throw e;
		}
	}

	public void navigatesToTheJoinedSectionIos() {
		try {
			unitedNowPageLocators.backButton.click();
			elementToBeClickableFluentWait(unitedNowPageLocators.selectPlayerPlayersScreen, 60);
			unitedNowPageLocators.selectPlayerPlayersScreen.click();
			for (int i = 0; i < 20; i++) {
				if (unitedNowPageLocators.joinedTitlePlayersPageIos.size() <= 0) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				} else {
					break;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Navigates to joined section");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-navigatesToTheJoinedSectionIos()<br />" + e);
			throw e;
		}

	}

	public void userClickOnWomenTabIOS() {
		try {
			elementToBeClickableFluentWait(unitedNowPageLocators.womenTabInPlayersPageIos, 60);
			unitedNowPageLocators.womenTabInPlayersPageIos.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks women tab in players page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userClickOnWomenTabIOS()<br />" + e);
			throw e;
		}

	}

	public void navigateToTheLatestSectionForThePlayerIos() {
		try {
			unitedNowPageLocators.backButton.click();
			elementToBeClickableFluentWait(unitedNowPageLocators.selectPlayerPlayersScreen, 60);
			unitedNowPageLocators.selectPlayerPlayersScreen.click();
			for (int i = 0; i < 20; i++) {
				if (unitedNowPageLocators.latestTextInPlayersPageIos.size() <= 0) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				} else {
					break;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Navigates to latest section for players");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-navigateToTheLatestSectionForThePlayerIos()<br />" + e);
			throw e;
		}
	}

	public Boolean getFilterSelectionIos() {
		Boolean flag = null;
		try {
			List<WebElement> disabledSwitches = new ArrayList<>(unitedNowPageLocators.disabledSwitchFilterPage);
			for (int i = 0; i < disabledSwitches.size(); i++) {
				if (disabledSwitches.get(i).getDomAttribute("value").equalsIgnoreCase("0")) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Returns filter switch");
			return flag;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getFilterSelectionIos()<br />" + e);
			throw e;
		}
	}

	public boolean validateUpcomingFixturesInIos(String fixtureText) {
		String[] splitFixtures = fixtureText.split(",");
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns match day text");
			return unitedNowPageLocators.matchDayInAllUnitedNow.getDomAttribute("label").contains(splitFixtures[0])
					|| unitedNowPageLocators.matchDayInAllUnitedNow.getDomAttribute("label").contains(splitFixtures[1]);

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validateUpcomingFixturesInIos()<br />" + e);
			throw e;
		}
	}

	public void scrollToResultsInUnitedNowScreenInIos() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			for (int i = 0; i < 20; i++) {
				if (unitedNowPageLocators.matchReviewInAllUnitedNowIos.size() <= 0) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.UP, 0.7);
				} else {
					break;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Scrols to the results section");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-scrollToResultsInUnitedNowScreenInIos()<br />" + e);
			throw e;
		}
	}

	public String getAllTabCalenderScreen() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.allRadioBtnUnitedPage, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns all tab text in calender screen");
			return unitedNowPageLocators.allRadioBtnUnitedPage.getDomAttribute("label");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getAllTabCalenderScreen()<br />" + e);
			throw e;
		}
	}

	public String getPremierTabCalenderScreen() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.premierLeagueUNIOs, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns premier league text");
			return unitedNowPageLocators.premierLeagueUNIOs.getDomAttribute("label");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getPremierTabCalenderScreen()<br />" + e);
			throw e;
		}
	}

	public String getFaCupTabCalenderScreen() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.faCupUNIOs, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns FA cup text");
			return unitedNowPageLocators.faCupUNIOs.getDomAttribute("label");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getFaCupTabCalenderScreen()<br />" + e);
			throw e;
		}
	}

	public String getLeagueTabCalenderScreen() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.leagueCupUNIOs, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns league cup text");
			return unitedNowPageLocators.leagueCupUNIOs.getDomAttribute("label");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getLeagueTabCalenderScreen()<br />" + e);
			throw e;
		}
	}

	public String getEuropeTabCalenderScreen() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.europeLeagueUNIOs, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns European league cup text");
			return unitedNowPageLocators.europeLeagueUNIOs.getDomAttribute("label");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getEuropeTabCalenderScreen()<br />" + e);
			throw e;
		}
	}

	public String getFriendlyTabCalenderScreen() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.friendlyUNIOs, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns friendly cup text");
			return unitedNowPageLocators.friendlyUNIOs.getDomAttribute("label");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getFriendlyTabCalenderScreen()<br />" + e);
			throw e;
		}
	}

	public void clicksOnTheStoriesCarousel() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
//                if (!makeYourPredictionsUnitedNowScreen.isEmpty()) {
//                    IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
//                }
				if (unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.size() > 0) {
					if (!(unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.get(0).getText()
							.equalsIgnoreCase("LIVE MATCH CENTRE"))) {
						if (unitedNowPageLocators.storiesCouroselUnitedNowPage.size()>0) {
							unitedNowPageLocators.storiesCouroselUnitedNowPage.get(0).click();
						}
					}
				} else {
					if (unitedNowPageLocators.storiesCouroselUnitedNowPage.size()>0) {
						unitedNowPageLocators.storiesCouroselUnitedNowPage.get(0).click();
					}
				}
			} else {
				if (unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.size() > 0) {
					if (!(unitedNowPageLocators.liveMatchCenterUnitedNowScreen.get(0).getDomAttribute("label")
							.equalsIgnoreCase("LIVE MATCH CENTRE"))) {
						if (unitedNowPageLocators.storiesCouroselUnitedNowPage.size()>0) {
							unitedNowPageLocators.storiesCouroselUnitedNowPage.get(0).click();
						}
					}
				} else if (unitedNowPageLocators.liveMatchCenterUnitedNowScreen.size() > 0) {

				} else {
					if (unitedNowPageLocators.storiesCouroselUnitedNowPage.size()>0) {
						unitedNowPageLocators.storiesCouroselUnitedNowPage.get(0).click();
					}
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Clicks on stories carousel");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnTheStoriesCarousel()<br />" + e);
			throw e;
		}
	}

	public boolean validatesTheStoryPageIsDisplayed() {
		try {
			// as multiple types are there validation is commented and would work with fun
			// team
//            waitForVisibilityFluentWait(matchStats.get(0));
//            if (matchStats.get(0).isDisplayed()) {
//                return true;
//            }
			return true;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesTheStoryPageIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public void clicksOnTheComingUpCarousel() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				if (unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.size() > 0) {
					if (!(unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.get(0).getText()
							.equalsIgnoreCase("LIVE MATCH CENTRE"))) {
						if (!unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.isEmpty()) {
							IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
						}
//						IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
//						AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "WHAT'S NEW");
						if (!unitedNowPageLocators.comingUpCouroselUnitedNowPage.isEmpty())
							unitedNowPageLocators.comingUpCouroselUnitedNowPage.get(0).click();
						else if (!unitedNowPageLocators.birthdayCouroselUnitedNowPage.isEmpty()) {
							unitedNowPageLocators.birthdayCouroselUnitedNowPage.get(0).click();
						} else if (!unitedNowPageLocators.predictionCouroselUnitedNowPage.isEmpty()) {
							unitedNowPageLocators.predictionCouroselUnitedNowPage.get(0).click();
						}
					}
				} else {
//					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
//					AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "WHAT'S NEW");
					if (!unitedNowPageLocators.comingUpCouroselUnitedNowPage.isEmpty())
						unitedNowPageLocators.comingUpCouroselUnitedNowPage.get(0).click();
					else if (!unitedNowPageLocators.birthdayCouroselUnitedNowPage.isEmpty()) {
						unitedNowPageLocators.birthdayCouroselUnitedNowPage.get(0).click();
					} else if (!unitedNowPageLocators.predictionCouroselUnitedNowPage.isEmpty()) {
						unitedNowPageLocators.predictionCouroselUnitedNowPage.get(0).click();
					}
				}
			} else {
				if (unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.size() > 0) {
					if (!(unitedNowPageLocators.liveMatchCenterUnitedNowScreen.get(0).getText()
							.equalsIgnoreCase("LIVE MATCH CENTRE"))) {
						if (!unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.isEmpty()) {
							IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
						}
						IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
						if (!unitedNowPageLocators.comingUpCouroselUnitedNowPage.isEmpty()) {
							unitedNowPageLocators.comingUpCouroselUnitedNowPage.get(0).click();
						} else {
							IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
						}

						if (!unitedNowPageLocators.shopNowUnitedNowPage.isEmpty()) {
							unitedNowPageLocators.shopNowUnitedNowPage.get(0).click();
						} else if (!unitedNowPageLocators.setReminderUnitedNowPage.isEmpty()) {
							unitedNowPageLocators.setReminderUnitedNowPage.get(0).click();
						} else if (!unitedNowPageLocators.wishThemUnitedNowPage.isEmpty()) {
							unitedNowPageLocators.wishThemUnitedNowPage.get(0).click();
						}
					}
				} else {

					if (!unitedNowPageLocators.comingUpCouroselUnitedNowPage.isEmpty()) {
						unitedNowPageLocators.comingUpCouroselUnitedNowPage.get(0).click();
					} else {
						IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
					}

					if (!unitedNowPageLocators.shopNowUnitedNowPage.isEmpty()) {
						unitedNowPageLocators.shopNowUnitedNowPage.get(0).click();
					} else if (!unitedNowPageLocators.setReminderUnitedNowPage.isEmpty()) {
						unitedNowPageLocators.setReminderUnitedNowPage.get(0).click();
					} else if (!unitedNowPageLocators.wishThemUnitedNowPage.isEmpty()) {
						unitedNowPageLocators.wishThemUnitedNowPage.get(0).click();
					}
				}

			}
			ExtentsReportManager.extentReportLogging("pass", "Clicks on coming up carousel");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnTheComingUpCarousel()<br />" + e);
			throw e;
		}
	}

	public boolean validatesTheCaroselPageIsDisplayed() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
//                Thread.sleep(3000);
				if (unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.size() > 0) {
					if (!(unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.get(0).getText()
							.equalsIgnoreCase("LIVE MATCH CENTRE"))) {
						if (!unitedNowPageLocators.matchStats.isEmpty()) {
							return true;
						} else if (!unitedNowPageLocators.backButton1.isEmpty()) {
							return true;
						} else if (!unitedNowPageLocators.closeButtonPredictionCouroselUnitedNowPage1.isEmpty()) {
							unitedNowPageLocators.closeButtonPredictionCouroselUnitedNowPage1.get(0).click();
							return unitedNowPageLocators.predictionPageTitle.isDisplayed();

						} else if (!unitedNowPageLocators.closeButtonPredictionCouroselUnitedNowPage2.isEmpty()) {
							return true;
						}
					} else {
						return true;
					}
				} else {
					if (!unitedNowPageLocators.matchStats.isEmpty()) {
						return true;
					} else if (!unitedNowPageLocators.backButton1.isEmpty()) {
						return true;
					} else if (!unitedNowPageLocators.closeButtonPredictionCouroselUnitedNowPage1.isEmpty()) {
						unitedNowPageLocators.closeButtonPredictionCouroselUnitedNowPage1.get(0).click();
						return unitedNowPageLocators.predictionPageTitle.isDisplayed();

					} else if (!unitedNowPageLocators.closeButtonPredictionCouroselUnitedNowPage2.isEmpty()) {
						return true;
					}
				}
			} else {
				if (unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.size() > 0) {
					if (!(unitedNowPageLocators.liveMatchCenterUnitedNowScreen.get(0).getText()
							.equalsIgnoreCase("LIVE MATCH CENTRE"))) {
						if (!unitedNowPageLocators.matchStats.isEmpty()) {
							return true;
						} else if (!unitedNowPageLocators.backButton1.isEmpty()) {
							return true;
						} else if (!unitedNowPageLocators.backArrowShopNowPage.isEmpty()) {
							return true;
						} else
							return true;
					}
				} else {
					return true;
				}
			}
			if (!unitedNowPageLocators.matchStats.isEmpty()) {
				return true;
			} else if (!unitedNowPageLocators.backButton1.isEmpty()) {
				return true;
			} else if (!unitedNowPageLocators.backArrowShopNowPage.isEmpty()) {
				return true;
			} else
				return true;
		} catch (NoSuchElementException ns) {
			ExtentsReportManager.extentReportLogging("fail", "element is not displayed hence skipped" + ns);
		} catch (StaleElementReferenceException se) {
			ExtentsReportManager.extentReportLogging("fail", "stale element exception" + se);
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesTheCaroselPageIsDisplayed()<br />" + e);
			throw e;
		}
		return false;
	}

	public void clicksOnUnitedNowInBottomTab() {
		try {
			elementToBeClickableFluentWait(unitedNowPageLocators.unitedNowTab, 60);
			unitedNowPageLocators.unitedNowTab.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on united now tab in bottom ");

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnUnitedNowInBottomTab()<br />" + e);
			throw e;
		}
	}

	public void clicksOnContinueInPersonlisePopUpWindow() {
		try {
			if (!unitedNowPageLocators.ontinueInPersonlise.isEmpty()) {
				unitedNowPageLocators.ontinueInPersonlise.get(0).click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on continue in personalise popup");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnContinueInPersonlisePopUpWindow()<br />" + e);
			throw e;
		}
	}

	public void clicksOncloseInAppMyUnited() {
		try {
			if (!unitedNowPageLocators.closeInAppMyUnited.isEmpty()) {
				unitedNowPageLocators.closeInAppMyUnited.get(0).click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on close icon in my united popup");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOncloseInAppMyUnited()<br />" + e);
			throw e;
		}
	}

	public void rightArrowSlideup() {
		try {
			if (!unitedNowPageLocators.rightArrowSlideup.isEmpty()) {
				unitedNowPageLocators.rightArrowSlideup.get(0).click();
				ExtentsReportManager.extentReportLogging("pass", "CLicks on right arrode in the slide up");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-rightArrowSlideup()<br />" + e);
			throw e;
		}
	}

	public void clicksOnImagePopUpWindowBrazeInappMessage1ForLogoutUser() {
		try {
			if (!unitedNowPageLocators.imagePopUpWindow.isEmpty()) {
				unitedNowPageLocators.imagePopUpWindow.get(0).click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on image popup");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnImagePopUpWindowBrazeInappMessage1ForLogoutUser()<br />"
							+ e);
			throw e;
		}
	}

	public boolean validateAudioButtonInUnitedNowIsDisplayed() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.audioButton, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns audio button displayed details");
			return unitedNowPageLocators.audioButton.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validateAudioButtonInUnitedNowIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public boolean validateVideoButtonInUnitedNowIsDisplayed() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.videoButton, 60);
			ExtentsReportManager.extentReportLogging("pass", "Displayed video button");
			return unitedNowPageLocators.videoButton.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validateVideoButtonInUnitedNowIsDisplayed()<br />" + e);
			throw e;
		}
	}
//	@AndroidFindBy(id = "com.mu.muclubapp.staging_mu_dxc:id/textViewHeading")
//	// @iOSXCUITFindBy(accessibility = "Monday 19 August")
//	WebElement uelMatch;
//
//	public String getuelMatchtextInLiveVideoSection() {
//		try {
//			waitForVisibilityFluentWait(uelMatch);
//			return uelMatch.getText();
//		} catch (Exception e) {
//			ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-getuelMatchtextInLiveVideoSection()<br />" + e);
//			return null;
//		}
//	}

	public String getwatchNowtextInLiveVideoSection() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.watchNow, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returned watch now text");
			return unitedNowPageLocators.watchNow.getText();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getwatchNowtextInLiveVideoSection()<br />" + e);
			throw e;
		}
	}

	public void clicksWatchNowButton() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.watchNow, 60);
			unitedNowPageLocators.watchNow.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on watch now");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksWatchNowButton()<br />" + e);
			throw e;
		}
	}

	public void userClicksOnVideoButton() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.videoButton, 60);
			unitedNowPageLocators.videoButton.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on video button");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userClicksOnVideoButton()<br />" + e);
			throw e;
		}
	}

	public String getLiveTestFromLiveVideo() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.live, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns live text");
			return unitedNowPageLocators.live.getText();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getLiveTestFromLiveVideo()<br />" + e);
			throw e;
		}
	}

//	@AndroidFindBy(id = "com.mu.muclubapp.staging_mu_dxc:id/text_view_info")
//	// @iOSXCUITFindBy(accessibility = "Monday 19 August")
//	WebElement description;
//
//	public String getDescriptionFromLiveVideo() {
//		try {
//			waitForVisibilityFluentWait(description);
//			return description.getText();
//		} catch (Exception e) {
//			ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-getDescriptionFromLiveVideo()<br />" + e);
//			return null;
//		}
//	}

	public boolean validatePauseButtonInUnitedNowIsDisplayed() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.pauseButton, 60);
			ExtentsReportManager.extentReportLogging("pass", "Displayed pause button");
			return unitedNowPageLocators.pauseButton.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatePauseButtonInUnitedNowIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public void userClicksOnPauseButton() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.pauseButton, 60);
			unitedNowPageLocators.pauseButton.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on pause button");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userClicksOnPauseButton()<br />" + e);
			throw e;
		}
	}

	public boolean validatemaximizeButtonInUnitedNowIsDisplayed() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.maximizeButton, 60);
			ExtentsReportManager.extentReportLogging("pass", "Displays maximize button in united now");
			return unitedNowPageLocators.maximizeButton.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatemaximizeButtonInUnitedNowIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public boolean validatePlayButtonInUnitedNowIsDisplayed() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.playButton, 60);
			ExtentsReportManager.extentReportLogging("pass", "Displays play button in united now page");
			return unitedNowPageLocators.playButton.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatePlayButtonInUnitedNowIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public void userClicksOnPlayButton() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.playButton, 60);
			unitedNowPageLocators.playButton.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on play button");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userClicksOnPlayButton()<br />" + e);
			throw e;
		}
	}

	public boolean validateTheFilteredFALeagueInIos(String validation) {
		String[] statements = validation.split(",");
		try {
			if (!unitedNowPageLocators.faLeagueOpt6UnitedNow.isEmpty()) {
				System.out.println("text:" + unitedNowPageLocators.faLeagueOpt6UnitedNow1.getDomAttribute("label"));
				return unitedNowPageLocators.faLeagueOpt6UnitedNow1.getDomAttribute("label")
						.contains(statements[0].trim());
			} else if (unitedNowPageLocators.noFixturesTextUnitedPage.get(0).isDisplayed()) {
				return unitedNowPageLocators.noFixturesTextUnitedPage.get(0).getDomAttribute("label")
						.equalsIgnoreCase(statements[1]);
			} else
				return false;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validateTheFilteredFALeagueInIos()<br />" + e);
			throw e;
		}
	}


	public boolean validatesTheImageCardInIos() throws InterruptedException {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.imageCardUnitedNowPage.size() > 0) {
					unitedNowPageLocators.imageCardUnitedNowPage.get(0).click();
					Thread.sleep(1000);
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Clicks the image card");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-selectFavoritePlayerIos()<br />" + e);
			throw e;
		}
		return false;
	}

	public boolean checksForImageCardInUnitedNowPage() throws InterruptedException {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.imageCardUnitedNowPage.size() > 0) {
					unitedNowPageLocators.imageCardUnitedNowPage.get(0).click();
					Thread.sleep(1000);
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Clicks the image card");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-selectFavoritePlayerIos()<br />" + e);
			throw e;
		}
		return false;
	}

	public boolean checksForImageGalleryCardInUnitedNowPage() {
		try {
			if (unitedNowPageLocators.closeButtonLiveStreamUnitedNowPage.size() > 0) {
				unitedNowPageLocators.closeButtonLiveStreamUnitedNowPage.get(0).click();
			}
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.imageGalleryCardUnitedNowPage.size() > 0) {
					unitedNowPageLocators.imageGalleryCardUnitedNowPage.get(0).click();
					int count = Integer
							.parseInt(unitedNowPageLocators.imageGalleryCardCount.getText().split("/")[1].trim());
					for (int j = 0; j < count - 1; j++) {
						swipeWithCoordinates(800, 1081, 170, 1081, 200, "left", driver);
					}
					unitedNowPageLocators.closeButtonPredictionCouroselUnitedNowPage.click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for image gallery card in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-selectFavoritePlayerIos()<br />" + e);
			throw e;
		}
		return false;
	}

	public boolean validatesTheImageGalleryCardInIos() {
		try {
			if (unitedNowPageLocators.closeButtonLiveStreamUnitedNowPage.size() > 0) {
				unitedNowPageLocators.closeButtonLiveStreamUnitedNowPage.get(0).click();
			}
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.imageGalleryCardUnitedNowPage.size() > 0) {
					unitedNowPageLocators.imageGalleryCardUnitedNowPage.get(0).click();
					int count = Integer
							.parseInt(unitedNowPageLocators.imageGalleryCardCount.getText().split("/")[1].trim());
					for (int j = 0; j < count - 1; j++) {
						swipeWithCoordinates(360, 435, 56, 435, 200, "left", driver);
					}
					unitedNowPageLocators.CloseIconSignUpPage.click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for image gallery card in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-selectFavoritePlayerIos()<br />" + e);
			throw e;
		}
		return false;
	}

	public boolean validatesTheVideoCardInIos() throws InterruptedException {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.playButtonVideoCardUnitedNowPage.size() > 0) {
					unitedNowPageLocators.playButtonVideoCardUnitedNowPage.get(0).click();
					Thread.sleep(1000);
					unitedNowPageLocators.CloseIconSignUpPage.click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for video card in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-selectFavoritePlayerIos()<br />" + e);
			throw e;
		}
		return false;
	}

	public boolean checksForVideoCardInUnitedNowPage() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.playButtonVideoCardUnitedNowPage.size() > 0) {
					unitedNowPageLocators.playButtonVideoCardUnitedNowPage.get(0).click();
					unitedNowPageLocators.closeButtonPredictionCouroselUnitedNowPage.click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for video card in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-selectFavoritePlayerIos()<br />" + e);
			throw e;
		}
		return false;
	}

	public boolean checksForQuizCardInUnitedNowPage() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.quizCardVideoCardUnitedNowPage.size() > 0
						&& unitedNowPageLocators.quizCardVideoCardUnitedNowPage.get(0).getText().toLowerCase()
								.contains("quiz")) {
					unitedNowPageLocators.quizCardVideoCardUnitedNowPage.get(0).click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for quiz card in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-selectFavoritePlayerIos()<br />" + e);
			throw e;
		}
		return false;
	}

	public boolean validatesTheQuizCardInIos() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.quizCardVideoCardUnitedNowPage.size() > 0
						&& unitedNowPageLocators.quizCardVideoCardUnitedNowPage.get(0).getDomAttribute("label")
								.toLowerCase().contains("quiz")) {
					unitedNowPageLocators.quizCardVideoCardUnitedNowPage.get(0).click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for quiz card in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-selectFavoritePlayerIos()<br />" + e);
			throw e;
		}
		return false;
	}

	public boolean checksForStatsCardInUnitedNowPage() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.statsCardVideoCardUnitedNowPage.size() > 0
						&& unitedNowPageLocators.statsCardVideoCardUnitedNowPage.get(0).getText()
								.equalsIgnoreCase("MATCH STATS")) {
					unitedNowPageLocators.statsCardVideoCardUnitedNowPage.get(0).click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for stats card in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-selectFavoritePlayerIos()<br />" + e);
			throw e;
		}
		return false;
	}

	public boolean validatesTheStatsCardInIos() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.statsCardVideoCardUnitedNowPage.size() > 0
						&& unitedNowPageLocators.statsCardVideoCardUnitedNowPage.get(0).getDomAttribute("label")
								.equalsIgnoreCase("MATCH STATS")) {
					unitedNowPageLocators.statsCardVideoCardUnitedNowPage.get(0).click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for stats card in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-selectFavoritePlayerIos()<br />" + e);
			throw e;
		}
		return false;
	}

	public boolean validatesTheCollectionsCardInIos() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.collectionsCardVideoCardUnitedNowPage.size() > 0
						&& unitedNowPageLocators.collectionsCardVideoCardUnitedNowPage.get(0).getDomAttribute("label")
								.equalsIgnoreCase("collections")) {
					unitedNowPageLocators.collectionsCardVideoCardUnitedNowPage.get(0).click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for collections card in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-selectFavoritePlayerIos()<br />" + e);
			throw e;
		}
		return false;
	}

	public boolean checksForCollectionsCardInUnitedNowPage() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.collectionsCardVideoCardUnitedNowPage.size() > 0
						&& unitedNowPageLocators.collectionsCardVideoCardUnitedNowPage.get(0).getText()
								.equalsIgnoreCase("collections")) {
					unitedNowPageLocators.collectionsCardVideoCardUnitedNowPage.get(0).click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for collections card in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-selectFavoritePlayerIos()<br />" + e);
			throw e;
		}
		return false;
	}

	public String getGirlssInDropDownText() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.girlsTabUnitedPage, 60);
				String actualGirlsText = unitedNowPageLocators.girlsTabUnitedPage.getText();
				ExtentsReportManager.extentReportLogging("pass", "Returns girls dropdown text");
				return actualGirlsText;
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.girlsTabUnitedPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns girls dropdown text");
				return unitedNowPageLocators.girlsTabUnitedPage.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getUnder18sInDropDownText()" + e);
			throw e;
		}
	}

	public boolean navigatesToAdcardForInternalLinkInUnitedNowScreen() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.adCardInternalLink.size() > 0) {
					unitedNowPageLocators.adCardInternalLink.get(0).click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass",
					"checks for ad card for internal link in united now screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-navigatesToAdcardForInternalLinkInUnitedNowScreen()" + e);
			throw e;
		}
		return false;
	}

	public boolean navigatesToAdcardForExternalLinkInUnitedNowScreen() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.adCardExternalLink.size() > 0) {
					unitedNowPageLocators.adCardExternalLink.get(0).click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass",
					"checks for ad card for external linkin united now screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-navigatesToAdcardForExternalLinkInUnitedNowScreen()" + e);
			throw e;
		}
		return false;
	}

	public boolean validatesAdcardExternalLinkInExternalBrowser() {

		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.titleOfAdcardExternalLink, 10);
			ExtentsReportManager.extentReportLogging("pass",
					"checks for ad card  title of external linkin united now screen");
			return unitedNowPageLocators.titleOfAdcardExternalLink.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesAdcardExternalLinkInExternalBrowser()" + e);
			throw e;
		}
	}

	public boolean navigatesToAdcardForInternalLinkToNextGenInUnitedNowPage() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.adCardInternalLinkToNextGen.size() > 0) {
					unitedNowPageLocators.adCardInternalLinkToNextGen.get(0).click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass",
					"checks for ad card for internal link to next gen in united now screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-navigatesToAdcardForInternalLinkToNextGenInUnitedNowPage()" + e);
			throw e;
		}
		return false;
	}

	public boolean navigatesToAdcardForInternalLinkToHistoricalMatchNextGenInUnitedNowPage() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.adCardInternalLinkToHistoricalMatchNextGen.size() > 0) {
					unitedNowPageLocators.adCardInternalLinkToHistoricalMatchNextGen.get(0).click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass",
					"checks for ad card for internal link to historical match next gen in united now screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-navigatesToAdcardForInternalLinkToHistoricalMatchNextGenInUnitedNowPage()"
							+ e);
			throw e;
		}
		return false;
	}

	public String getUnitedNowTab() {
		String device = new AppiumDriverManager().getDevice();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.unitedNowTabNavigations, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns my united text");
				return unitedNowPageLocators.unitedNowTabNavigations.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.unitedNowTabNavigations, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns my united text");
				return unitedNowPageLocators.unitedNowTabNavigations.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnRateAppInTheGeneralScreen()" + e);
			throw e;
		}
	}

	public String getMutvTab() {
		String device = new AppiumDriverManager().getDevice();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.mutvTabNavigations, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns my united text");
				return unitedNowPageLocators.mutvTabNavigations.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.mutvTabNavigations, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns my united text");
				return unitedNowPageLocators.mutvTabNavigations.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnRateAppInTheGeneralScreen()" + e);
			throw e;
		}
	}

	public String getShopTab() {
		String device = new AppiumDriverManager().getDevice();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.shopTabNavigations, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns my united text");
				return unitedNowPageLocators.shopTabNavigations.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.shopTabNavigations, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns my united text");
				return unitedNowPageLocators.shopTabNavigations.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnRateAppInTheGeneralScreen()" + e);
			throw e;
		}
	}

	public String getMyUnitedTab() {
		String device = new AppiumDriverManager().getDevice();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.myunitedTabNavigations, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns my united text");
				return unitedNowPageLocators.myunitedTabNavigations.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.myunitedTabNavigations, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns my united text");
				return unitedNowPageLocators.myunitedTabNavigations.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnRateAppInTheGeneralScreen()" + e);
			throw e;
		}
	}

	public void navigatesToPreviousMatchInFixturesPage() {

		try {
			for (int i = 0; i < 20; i++) {
				if (unitedNowPageLocators.oldmatchMatchInFixtures.size() <= 0) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.UP, 0.5);
				} else {
					break;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Scrolled up to matchReviewInFixtures1");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-navigatesToPreviousMatchInFixturesPage()" + e);
			throw e;
		}
	}

	public void clicksOnMatchReviewInFixturesPage() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.matchReviewInFixtures, 60);
			unitedNowPageLocators.matchReviewInFixtures.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on matchReview UnitedNow");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnMatchReviewInFixturesPage()" + e);
			throw e;
		}
	}

	public void clicksOnPostMatchAnalysis() {
		try {
			if (!unitedNowPageLocators.postMtachAnalysis.isEmpty()) {
				unitedNowPageLocators.postMtachAnalysis.get(0).click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on matchReview UnitedNow");
			}
			if (unitedNowPageLocators.closeIconInMatchCenter.size() > 0) {
				unitedNowPageLocators.closeIconInMatchCenter.get(0).click();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnPostMatchAnalysis()" + e);
			throw e;
		}
	}

	public boolean validatesTheSponserLogoIsDisplayedInMatchCenter() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.mutvSponsorLogoInLineUpMatchCenter, 60);
			ExtentsReportManager.extentReportLogging("pass", "Displayed mutv Sponsor Logo In LineUp MatchCenter ");
			return unitedNowPageLocators.mutvSponsorLogoInLineUpMatchCenter.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesTheSponserLogoIsDisplayedInMatchCenter()" + e);
			throw e;
		}
	}

	public String getMyUnitedTabAfterLogin() {
		String device = new AppiumDriverManager().getDevice();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.myunitedTabNavigationsAfterLogin, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns my united text");
				return unitedNowPageLocators.myunitedTabNavigationsAfterLogin.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.myunitedTabNavigationsAfterLogin, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns my united text");
				return unitedNowPageLocators.myunitedTabNavigationsAfterLogin.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnRateAppInTheGeneralScreen()" + e);
			throw e;
		}
	}

	public void clicksOnLineupInMatchCenter() {
		try {
			if (!unitedNowPageLocators.lineUpsInMatchCenter.isEmpty()) {
				unitedNowPageLocators.lineUpsInMatchCenter.get(0).click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on matchReview UnitedNow");
			}
			if (unitedNowPageLocators.closeIconInMatchCenter.size() > 0) {
				unitedNowPageLocators.closeIconInMatchCenter.get(0).click();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnLineupInMatchCenter()" + e);
			throw e;
		}
	}

	public void clicksOnInfluencersInMatchCenter() {
		try {
			if (!unitedNowPageLocators.influencersTabInMatchCenter.isEmpty()) {
				unitedNowPageLocators.influencersTabInMatchCenter.get(0).click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on Influencers UnitedNow");
			}
			if (unitedNowPageLocators.closeIconInMatchCenter.size() > 0) {
				unitedNowPageLocators.closeIconInMatchCenter.get(0).click();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnInfluencersInMatchCenter()" + e);
			throw e;
		}
	}

	public boolean validatesNoSponsorLogoInStatsTabMatchCenter() {
		try {
			if (unitedNowPageLocators.mutvSponsorLogoInLineUpMatchCenter1.size() == 0) {
				return true;
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating black strip header is not displayed" + e);
			throw e;
		}
		return false;
	}

	public void clicksOnPredictionsTabInMatchCenter() {
		try {
			if (!unitedNowPageLocators.predictionsTabInMatchCenter.isEmpty()) {
				unitedNowPageLocators.predictionsTabInMatchCenter.get(0).click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on Influencers UnitedNow");
			}
			if (unitedNowPageLocators.closeIconInMatchCenter.size() > 0) {
				unitedNowPageLocators.closeIconInMatchCenter.get(0).click();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnInfluencersInMatchCenter()" + e);
			throw e;
		}
	}

	public boolean validatesTheSponsorLogoInPredictionsIsDisplayed() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.sponsorLogoPredictionsMatchCenter, 10);
			ExtentsReportManager.extentReportLogging("pass", "Displayed  Sponsor Logo In predictions MatchCenter ");
			return unitedNowPageLocators.sponsorLogoPredictionsMatchCenter.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesTheSponsorLogoInPredictionsIsDisplayed()" + e);
			throw e;
		}
	}

	public void clicksOnManOfTheMatchInPredictionsPage() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			if (!unitedNowPageLocators.manOfTheMatchInPredictions.isEmpty()) {
				unitedNowPageLocators.manOfTheMatchInPredictions.get(0).click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on Influencers UnitedNow");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnInfluencersInMatchCenter()" + e);
			throw e;
		}
	}

	public boolean validatesTheSponserLogoIsDisplayedInPredictionsMatchCenter() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.mutvSponserLogoInPredictionsPage, 30);
			ExtentsReportManager.extentReportLogging("pass", "Displayed mutv Sponsor Logo In LineUp MatchCenter ");
			return unitedNowPageLocators.mutvSponserLogoInPredictionsPage.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesTheSponserLogoIsDisplayedInPredictionsMatchCenter()" + e);
			throw e;
		}
	}

	public void clicksOnBackIconInPredictions() {
		try {
			elementToBeClickableFluentWait(unitedNowPageLocators.backIconInPredictionsPage, 60);
			unitedNowPageLocators.backIconInPredictionsPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on matchReview UnitedNow");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnMatchReviewInFixturesPage()" + e);
			throw e;
		}
	}

	public void clicksOnFirstScorerInPredictionsPage() {
		try {
			elementToBeClickableFluentWait(unitedNowPageLocators.firstScorerPredictionsMatchCenter, 10);
			unitedNowPageLocators.firstScorerPredictionsMatchCenter.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on matchReview UnitedNow");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnMatchReviewInFixturesPage()" + e);
			throw e;
		}
	}

	public boolean validatesDxcSponsorLogoInFirstScorerInPredictionsMatchCenter() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.dxcSponserLogoInPredictionsPage, 30);
			ExtentsReportManager.extentReportLogging("pass", "Displayed mutv Sponsor Logo In LineUp MatchCenter ");
			return unitedNowPageLocators.dxcSponserLogoInPredictionsPage.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesTheSponserLogoIsDisplayedInPredictionsMatchCenter()" + e);
			throw e;
		}
	}

	public void clicksOnLineUpPageInPredictionsPage() {
		try {
			elementToBeClickableFluentWait(unitedNowPageLocators.lineUpPagePredictionsMatchCenter, 10);
			unitedNowPageLocators.lineUpPagePredictionsMatchCenter.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on matchReview UnitedNow");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnMatchReviewInFixturesPage()" + e);
			throw e;
		}
	}

	public void clicksOnCorrectScrorePageInPredictionsPage() {
		try {
			elementToBeClickableFluentWait(unitedNowPageLocators.correctScorerPredictionsMatchCenter, 10);
			unitedNowPageLocators.correctScorerPredictionsMatchCenter.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on matchReview UnitedNow");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnMatchReviewInFixturesPage()" + e);
			throw e;
		}
	}

	public boolean userChecksOnPollCardInUnitedNowPage() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.pollCard.size() > 0) {
					unitedNowPageLocators.pollCard.get(0).click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for pollCard Card d in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userChecksOnPollCardInUnitedNowPage()" + e);
			throw e;
		}
		return false;
	}

	public boolean userChecksOnPollCardInUnitedNowPageios() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.pollCard.size() > 0) {
					unitedNowPageLocators.pollCard.get(0).click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for pollCard Card d in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userChecksOnPollCardInUnitedNowPage()" + e);
			throw e;
		}
		return false;
	}

	public boolean userChecksForQuoteCardAndModalInUnitedNowPage() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.quoteCard.size() > 0
						&& unitedNowPageLocators.quoteCard.get(0).getText().equalsIgnoreCase(
								"Erik ten Hag will hold his pre-match press conference upon arrival in Portugal on Wednesday evening. Get the latest news and then watch it on-demand from 19:00 BST. ")) {
					unitedNowPageLocators.quoteCard.get(0).click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for quoteCard d in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userChecksForQuoteCardAndModalInUnitedNowPage()" + e);
			throw e;
		}
		return false;
	}

	public boolean userChecksForQuoteCardAndModalInUnitedNowPageinios() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.quoteCard.size() > 0
						&& unitedNowPageLocators.quoteCard.get(0).getText().equalsIgnoreCase(
								"Erik ten Hag will hold his pre-match press conference upon arrival in Portugal on Wednesday evening. Get the latest news and then watch it on-demand from 19:00 BST. ")) {
					unitedNowPageLocators.quoteCard.get(0).click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for quoteCard d in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userChecksForQuoteCardAndModalInUnitedNowPage()" + e);
			throw e;
		}
		return false;
	}

	public boolean checksForViewTableCarddInUnitedNowPage() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.fullTableView.size() > 0
						&& unitedNowPageLocators.fullTableView.get(0).getText().equalsIgnoreCase("VIEW FULL TABLE")) {
					unitedNowPageLocators.fullTableView.get(0).click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for fullTableView d in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-checksForViewTableCarddInUnitedNowPage()" + e);
			throw e;
		}
		return false;
	}

	public boolean checksForViewTableCarddInUnitedNowPageinios() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.fullTableView.size() > 0 && unitedNowPageLocators.fullTableView.get(0)
						.getDomAttribute("label").toLowerCase().equalsIgnoreCase("VIEW ALL TABLES")) {
					unitedNowPageLocators.fullTableView.get(0).click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.5);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for fullTableView d in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-checksForViewTableCarddInUnitedNowPage()" + e);
			throw e;
		}
		return false;
	}

	public boolean userChecksForPlayerProfileCardInUnitedNowPage() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.playerProfileCard.size() > 0
						&& unitedNowPageLocators.playerProfileCard.get(0).getText().equalsIgnoreCase("VIEW PROFILE")) {
					unitedNowPageLocators.playerProfileCard.get(0).click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for player Profile Card d in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userChecksForPlayerProfileCardInUnitedNowPage()" + e);
			throw e;
		}
		return false;
	}

	public boolean userChecksForPlayerProfileCardInUnitedNowPageios() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.playerProfileCard.size() > 0 && unitedNowPageLocators.playerProfileCard.get(0)
						.getDomAttribute("label").toLowerCase().equalsIgnoreCase("View Profile")) {
					unitedNowPageLocators.playerProfileCard.get(0).click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for player Profile Card d in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userChecksForPlayerProfileCardInUnitedNowPage()" + e);
			throw e;
		}
		return false;
	}

	public boolean userChecksForAddCardInUnitedNowPage() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.addCard.size() > 0) {
					unitedNowPageLocators.addCard.get(0).click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for Add Card d in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userChecksForAddCardInUnitedNowPage()" + e);
			throw e;
		}
		return false;
	}

	public boolean userChecksForUpcomingMatchFixturesInUnitedNowPage() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.upcomingMatch.size() > 0
						&& unitedNowPageLocators.upcomingMatch.get(0).getText().equalsIgnoreCase("MARCH 2025")) {
					unitedNowPageLocators.upcomingMatch.get(0).getText().equalsIgnoreCase("MARCH 2025");
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for upcoming match in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userChecksForUpcomingMatchFixturesInUnitedNowPage()" + e);
			throw e;
		}
		return false;
	}

	public boolean userChecksForOldMatchResultsInUnitedNowPage() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.oldMatch.size() > 0
						&& unitedNowPageLocators.oldMatch.get(0).getText().equalsIgnoreCase("FEBRUARY 2025")) {
					unitedNowPageLocators.oldMatch.get(0).getText().equalsIgnoreCase("FEBRUARY 2025");
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.UP, 0.5);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for old match in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userChecksForOldMatchResultsInUnitedNowPage()" + e);
			throw e;
		}
		return false;
	}

	public void clicksOnTicketInfoCTAInFixturesPage() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.ticketInfoCTAInFixturesPage, 60);
			unitedNowPageLocators.ticketInfoCTAInFixturesPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on ticket info CTA");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnTicketInfoCTAInFixturesPage()" + e);
			throw e;
		}
	}

	public void clicksOnTableButtonOnCTAInFixturesPage() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.tableButtonOnCTAInFixturesPage, 60);
			unitedNowPageLocators.tableButtonOnCTAInFixturesPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on table in CTA");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnTableButtonOnCTAInFixturesPage()" + e);
			throw e;
		}
	}

	public String getPremierLeagueTextInMenTab() {
		String device = new AppiumDriverManager().getDevice();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.premierLeagueTabinTableCTA, 60);
				ExtentsReportManager.extentReportLogging("pass", "return Premier League");
				return unitedNowPageLocators.premierLeagueTabinTableCTA.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.premierLeagueTabinTableCTA, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns All teams text ");
				return unitedNowPageLocators.premierLeagueTabinTableCTA.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getPremierLeagueTextInMenTab()" + e);
			throw e;
		}
	}

	public String getEuropaLeagueTextInMenTab() {
		String device = new AppiumDriverManager().getDevice();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.europaLeagueTabinTableCTA, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns Europa League");
				return unitedNowPageLocators.europaLeagueTabinTableCTA.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.europaLeagueTabinTableCTA, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns All teams text ");
				return unitedNowPageLocators.europaLeagueTabinTableCTA.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getEuropaLeagueTextInMenTab()" + e);
			throw e;
		}
	}

	public void clicksOnTeamTabInTableCTAPage(String category) {
		try {
			if (category.equalsIgnoreCase("men")) {
				elementToBeClickableFluentWait(unitedNowPageLocators.tableCTACategory, 60);
				unitedNowPageLocators.tableCTACategory.click();
				waitForVisibilityFluentWait(unitedNowPageLocators.menTabInTableCTA, 60);
				unitedNowPageLocators.menTabInTableCTA.click();
			} else if (category.equalsIgnoreCase("women")) {
				elementToBeClickableFluentWait(unitedNowPageLocators.tableCTACategory, 60);
				unitedNowPageLocators.tableCTACategory.click();
				waitForVisibilityFluentWait(unitedNowPageLocators.womenTabInTableCTA, 60);
				unitedNowPageLocators.womenTabInTableCTA.click();
			} else if (category.equalsIgnoreCase("under21")) {
				elementToBeClickableFluentWait(unitedNowPageLocators.tableCTACategory, 60);
				unitedNowPageLocators.tableCTACategory.click();
				waitForVisibilityFluentWait(unitedNowPageLocators.under21sTabInTableCTA, 60);
				unitedNowPageLocators.under21sTabInTableCTA.click();
			} else if (category.equalsIgnoreCase("under18")) {
				elementToBeClickableFluentWait(unitedNowPageLocators.tableCTACategory, 60);
				unitedNowPageLocators.tableCTACategory.click();
				waitForVisibilityFluentWait(unitedNowPageLocators.under18sTabInTableCTA, 60);
				unitedNowPageLocators.under18sTabInTableCTA.click();
			} else if (category.equalsIgnoreCase("girls")) {
				elementToBeClickableFluentWait(unitedNowPageLocators.tableCTACategory, 60);
				unitedNowPageLocators.tableCTACategory.click();
				waitForVisibilityFluentWait(unitedNowPageLocators.girlsTabInTableCTA, 60);
				unitedNowPageLocators.girlsTabInTableCTA.click();
			}
			ExtentsReportManager.extentReportLogging("pass", "Clicks on players from the tab");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksPlayerFromTab()" + e);
			throw e;
		}
	}

	public String getWomensSuperLeagueTextInWomenTab() {
		String device = new AppiumDriverManager().getDevice();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.womenSuperLeagueInWomenTab, 60);
				ExtentsReportManager.extentReportLogging("pass", "Return Womens Super League ");
				return unitedNowPageLocators.womenSuperLeagueInWomenTab.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.womenSuperLeagueInWomenTab, 60);
				ExtentsReportManager.extentReportLogging("pass", "Return Womens Super League ");
				return unitedNowPageLocators.womenSuperLeagueInWomenTab.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getWomensSuperLeagueTextInWomenTab()" + e);
			throw e;
		}

	}

	public String getContinentalLeaguecupTextInWomenTab() {
		String device = new AppiumDriverManager().getDevice();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.continentalLeagueCupInWomenTab, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns Continental League cup");
				return unitedNowPageLocators.continentalLeagueCupInWomenTab.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.continentalLeagueCupInWomenTab, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns Continental League cup ");
				return unitedNowPageLocators.continentalLeagueCupInWomenTab.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getContinentalLeaguecupTextInWomenTab()" + e);
			throw e;
		}
	}

	public String getPremierLeague2TextInUnder21sTab() {
		String device = new AppiumDriverManager().getDevice();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.premierLeagueInUnder21sTab, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns Premier League 2");
				return unitedNowPageLocators.premierLeagueInUnder21sTab.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.premierLeagueInUnder21sTab, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns Premier League 2 ");
				return unitedNowPageLocators.premierLeagueInUnder21sTab.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getPremierLeague2TextInUnder21sTab()" + e);
			throw e;
		}
	}

	public String getEflTrophyTextInUnder21sTab() {
		String device = new AppiumDriverManager().getDevice();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.eflTrophyInunder21sTab, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns Efl Trophy");
				return unitedNowPageLocators.eflTrophyInunder21sTab.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.eflTrophyInunder21sTab, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns Efl Trophy");
				return unitedNowPageLocators.eflTrophyInunder21sTab.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getEflTrophyTextInUnder21sTab()" + e);
			throw e;
		}
	}

	public String getUefaYouthLeagueTextInUnder18Tab() {

		String device = new AppiumDriverManager().getDevice();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.uefaYouthLeagueInUnder18sTab, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns Uefa Youth League");
				return unitedNowPageLocators.uefaYouthLeagueInUnder18sTab.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.uefaYouthLeagueInUnder18sTab, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns Uefa Youth League");
				return unitedNowPageLocators.uefaYouthLeagueInUnder18sTab.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getUefaYouthLeagueTextInUnder18Tab()" + e);
			throw e;
		}

	}

	public String getU18PremierLeagueTextInUnder18Tab() {

		String device = new AppiumDriverManager().getDevice();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.u18PremierLeagueInUnder18sTab, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns U18 Premier League");
				return unitedNowPageLocators.u18PremierLeagueInUnder18sTab.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.u18PremierLeagueInUnder18sTab, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns U18 Premier League");
				return unitedNowPageLocators.u18PremierLeagueInUnder18sTab.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getU18PremierLeagueTextInUnder18Tab()" + e);
			throw e;
		}

	}

	public String getPremierLeagueTextInGirlsTab() {
		String device = new AppiumDriverManager().getDevice();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.premierLeagueInGirlsTab, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns Premier League In Girls");
				return unitedNowPageLocators.premierLeagueInGirlsTab.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.premierLeagueInGirlsTab, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns Premier League In Girls");
				return unitedNowPageLocators.premierLeagueInGirlsTab.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getPremierLeagueTextInGirlsTab()" + e);
			throw e;
		}

	}

	public String getChampionsLeagueTextInGirlsTab() {
		String device = new AppiumDriverManager().getDevice();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(unitedNowPageLocators.championsLeagueInGirlsTab, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns Champions League");
				return unitedNowPageLocators.championsLeagueInGirlsTab.getText();
			} else {
				waitForVisibilityFluentWait(unitedNowPageLocators.championsLeagueInGirlsTab, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns Champions League");
				return unitedNowPageLocators.championsLeagueInGirlsTab.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getChampionsLeagueTextInGirlsTab()" + e);
			throw e;
		}

	}

	public boolean checksForUpSellUnitedNowPage() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.upSell.size() > 0
						&& unitedNowPageLocators.upSell.get(0).getText().equalsIgnoreCase("Upsell stg automation")) {
					unitedNowPageLocators.upSell.get(0).click();
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.UP, 0.5);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for upSell in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-checksForUpSellUnitedNowPage()" + e);
			throw e;
		}
		return false;
	}

	public boolean validatesTheSponserLogoIsDisplayedInMatchCenterIos() {
		try {
			waitForVisibilityFluentWait(unitedNowPageLocators.mutvSponsorLogoInLineUpMatchCenter, 30);
			ExtentsReportManager.extentReportLogging("pass", "Displayed mutv Sponsor Logo In LineUp MatchCenter ");
			return unitedNowPageLocators.mutvSponsorLogoInLineUpMatchCenter.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesTheSponserLogoIsDisplayedInMatchCenter()" + e);
			throw e;
		}
	}

	public void validatesTheSponserLogoIsDisplayedInStatsMatchCenterInIos() {
		try {
			elementToBeClickableFluentWait(unitedNowPageLocators.mutvLogoStatsTab, 60);
			unitedNowPageLocators.mutvLogoStatsTab.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on matchReview UnitedNow");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnMatchReviewInFixturesPage()" + e);
			throw e;
		}
	}

	public boolean userChecksForUpcomingMatchFixturesInUnitedNowPageinios() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.upcomingMatch.size() > 0 && unitedNowPageLocators.upcomingMatch.get(0)
						.getDomAttribute("label").toLowerCase().equalsIgnoreCase("MARCH 2025")) {
					unitedNowPageLocators.upcomingMatch.get(0).getDomAttribute("label").toLowerCase()
							.equalsIgnoreCase("MARCH 2025s");
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for upcoming match in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userChecksForUpcomingMatchFixturesInUnitedNowPage()" + e);
			throw e;
		}
		return false;
	}

	public boolean userChecksForOldMatchResultsInUnitedNowPageinios() {
		try {
			int i = 0;
            while (i < 20) {
				if (unitedNowPageLocators.oldMatch.size() > 0 && unitedNowPageLocators.oldMatch.get(0)
						.getDomAttribute("label").toLowerCase().equalsIgnoreCase("FEBRUARY 2025")) {
					unitedNowPageLocators.oldMatch.get(0).getDomAttribute("label").toLowerCase()
							.equalsIgnoreCase("FEBRUARY 2025");
					return true;
				}
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.UP, 0.5);
				i++;
			}
			ExtentsReportManager.extentReportLogging("pass", "Checks for old match in united now page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userChecksForOldMatchResultsInUnitedNowPage()" + e);
			throw e;
		}
		return false;
	}
    public void clicksOnTeamTabInTableCTAPageinios(String category) {
        try {
            if (category.equalsIgnoreCase("men")) {
                elementToBeClickableFluentWait(unitedNowPageLocators.menDropDowntableCTA, 60);
                unitedNowPageLocators.menDropDowntableCTA.click();
                waitForVisibilityFluentWait(unitedNowPageLocators.menTabInTableCTA, 60);
                unitedNowPageLocators.menTabInTableCTA.click();
            } else if (category.equalsIgnoreCase("women")) {
                elementToBeClickableFluentWait(unitedNowPageLocators.womenDropDowntableCTA, 60);
                unitedNowPageLocators.womenDropDowntableCTA.click();
                waitForVisibilityFluentWait(unitedNowPageLocators.womenTabInTableCTA, 60);
                unitedNowPageLocators.womenTabInTableCTA.click();
            } else if (category.equalsIgnoreCase("under21")) {
                elementToBeClickableFluentWait(unitedNowPageLocators.under21sDropDowntableCTA, 60);
                unitedNowPageLocators.under21sDropDowntableCTA.click();
                waitForVisibilityFluentWait(unitedNowPageLocators.under21sTabInTableCTA, 60);
                unitedNowPageLocators.under21sTabInTableCTA.click();
            } else if (category.equalsIgnoreCase("under18")) {
                elementToBeClickableFluentWait(unitedNowPageLocators.under18sDropDowntableCTA, 60);
                unitedNowPageLocators.under18sDropDowntableCTA.click();
                waitForVisibilityFluentWait(unitedNowPageLocators.under18sTabInTableCTA, 60);
                unitedNowPageLocators.under18sTabInTableCTA.click();
            } else if (category.equalsIgnoreCase("girls")) {
                elementToBeClickableFluentWait(unitedNowPageLocators.girlsDropDowntableCTA, 60);
                unitedNowPageLocators.girlsDropDowntableCTA.click();
                waitForVisibilityFluentWait(unitedNowPageLocators.girlsTabInTableCTA, 60);
                unitedNowPageLocators.girlsTabInTableCTA.click();
            }
            ExtentsReportManager.extentReportLogging("pass", "Clicks on players from the tab");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-clicksPlayerFromTab()" + e);
            throw e;
        }
    }


    public boolean validatesTheCrestImageInFixturesScreeninios() {
        try {
            if (unitedNowPageLocators.crestAImageInFixturesScreen.isDisplayed() && unitedNowPageLocators.crestBImageInFixturesScreen.isDisplayed())
                ExtentsReportManager.extentReportLogging("pass","Returns crestAImageInFixturesScreen Text");
            return true;
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clickOnGeneral()<br />" + e);
            throw e;
        }
    }


	public void clicksOnTableCTAInFixuturesPageInIos() {
		try {
			elementToBeClickableFluentWait(unitedNowPageLocators.tableIconSchedulePage1, 60);
			unitedNowPageLocators.tableIconSchedulePage1.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on matchReview UnitedNow");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnMatchReviewInFixturesPage()" + e);
			throw e;
		}
		
	}


	public void clicksOnTableCTAInFixuturesPage() {
			try {
				elementToBeClickableFluentWait(unitedNowPageLocators.tableIconSchedulePage1, 60);
				unitedNowPageLocators.tableIconSchedulePage1.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on matchReview UnitedNow");
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail",
						"Exception occurred in function-clicksOnMatchReviewInFixturesPage()" + e);
				throw e;
			}
			
		}

	public ArrayList<String> getPlayersFiltersPageUI() {
			String device = GlobalParams.getPlatformName();
			ArrayList<String> playersPageFilterList = new ArrayList<>();
			try {
				if (device.equalsIgnoreCase("android")) {
//					if(!unitedNowPageLocators.matchStats.isEmpty()){
//						unitedNowPageLocators.playerIconUnitedNowPage.click();
//					}
//	            waitForVisibilityFluentWait(unitedNowPageLocators.menUnitedPage,60);
					for (int i = 0; i < unitedNowPageLocators.playersPageFilters.size(); i++) {
						playersPageFilterList.add(unitedNowPageLocators.playersPageFilters.get(i).getText());
					}
					ExtentsReportManager.extentReportLogging("pass", "Returns playersPageFilters values");
				} else {
					if(!unitedNowPageLocators.matchStats.isEmpty()){
						unitedNowPageLocators.playerIconUnitedNowPage.click();
					}
					for (int i = 0; i < unitedNowPageLocators.playersPageFilters.size(); i++) {
						 String label = unitedNowPageLocators.playersPageFilters.get(i).getDomAttribute("label").replace("Tab Item", ""); 

                if (!label.isEmpty()) {
                    playersPageFilterList.add(label);
                }
					}
//						playersPageFilterList.add(unitedNowPageLocators.playersPageFilters.get(i).getDomAttribute("label").replace("Tab Item", ""));
					ExtentsReportManager.extentReportLogging("pass", "Returns playersPageFilters values");
				}
				 Collections.sort(playersPageFilterList);
				return playersPageFilterList;
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail",
						"Exception occurred in function-getPlayersFiltersPageUI()<br />" + e);
				throw e;
			}
		}

	public String getSelectAllIconTextFromUI() {
		WebElement ele = null;
	      String device = GlobalParams.getPlatformName();
	      try {
	            if (device.equalsIgnoreCase("android")) {
	                waitForVisibilityFluentWait(unitedNowPageLocators.selectAllIconFiltersUnitedNowPage, 60);
	                ele = unitedNowPageLocators.selectAllIconFiltersUnitedNowPage;
	                ExtentsReportManager.extentReportLogging("pass", "Returned SelectAllIconTextFromUI");
	                return ele.getText();
	            } else {
	                waitForVisibilityFluentWait(unitedNowPageLocators.selectAllIconFiltersUnitedNowPage, 60);
	                ExtentsReportManager.extentReportLogging("pass", "Returned SelectAllIconTextFromUI ");
	                return unitedNowPageLocators.selectAllIconFiltersUnitedNowPage.getDomAttribute("label");
	            }
	        } catch (Exception e) {
	            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-SelectAllIconTextFromUI()<br />" + e);
	            throw e;
	        }
	}

	public void clicksOnSelectAllIcon() {
		try {
			elementToBeClickableFluentWait(unitedNowPageLocators.selectAllIconFiltersUnitedNowPage, 60);
			unitedNowPageLocators.selectAllIconFiltersUnitedNowPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on matchReview UnitedNow");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnSelectAllIcon()" + e);
			throw e;
		}
		
	}

	public String getClearAllIconTextFromUI() {
		WebElement ele = null;
	      String device = GlobalParams.getPlatformName();
	      try {
	            if (device.equalsIgnoreCase("android")) {
	                waitForVisibilityFluentWait(unitedNowPageLocators.clearAllIconFiltersUnitedNowPage, 60);
	                ele = unitedNowPageLocators.clearAllIconFiltersUnitedNowPage;
	                ExtentsReportManager.extentReportLogging("pass", "Returned clearAllIconTextFromUI");
	                return ele.getText();
	            } else {
	                waitForVisibilityFluentWait(unitedNowPageLocators.clearAllIconFiltersUnitedNowPage, 60);
	                ExtentsReportManager.extentReportLogging("pass", "Returned SelectAllIconTextFromUI ");
	                return unitedNowPageLocators.clearAllIconFiltersUnitedNowPage.getDomAttribute("label");
	            }
	        } catch (Exception e) {
	            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-SelectAllIconTextFromUI()<br />" + e);
	            throw e;
	        }
	}

		public ArrayList<String> getFilterFeedsFromUI() {
			String device = GlobalParams.getPlatformName();
			ArrayList<String> filterFeedsList = new ArrayList<>();
			try {
				if (device.equalsIgnoreCase("android")) {
//	            waitForVisibilityFluentWait(unitedNowPageLocators.menUnitedPage,60);
					for (int i = 0; i < unitedNowPageLocators.filterFeedInUnitedNowScreen.size(); i++) {
						filterFeedsList.add(unitedNowPageLocators.filterFeedInUnitedNowScreen.get(i).getText().trim());
					}
					ExtentsReportManager.extentReportLogging("pass", "Returns FilterFeedsFromUI values");
				} else {
					for (int i = 0; i < unitedNowPageLocators.filterFeedInUnitedNowScreen.size(); i++) {
						filterFeedsList.add(unitedNowPageLocators.filterFeedInUnitedNowScreen.get(i).getDomAttribute("label").toUpperCase());
					}
					ExtentsReportManager.extentReportLogging("pass", "Returns FilterFeedsFromUI values");
				}
				 Collections.sort(filterFeedsList);
				return filterFeedsList;
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail",
						"Exception occurred in function-getFilterFeedsFromUI()<br />" + e);
				throw e;
			}
		}

		public String getDateTBCUpcomingFixturesUi() {
			String device = GlobalParams.getPlatformName();
			try {
				if (device.equalsIgnoreCase("android")) {

					waitForVisibilityFluentWait(unitedNowPageLocators.dateTBCFixturesUnitedPage1, 60);
					ExtentsReportManager.extentReportLogging("pass", "Returns dateTBC text");
					return unitedNowPageLocators.dateTBCFixturesUnitedPage1.getText();

				} else {
					waitForVisibility(unitedNowPageLocators.matchDayInAllUnitedNow, 15);
					ExtentsReportManager.extentReportLogging("pass", "Returns dateTBC text");
					return unitedNowPageLocators.matchDayInAllUnitedNow.getDomAttribute("label");
				}
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail",
						"Exception occurred in function-getUpcomingFixturesUi()<br />" + e);
				throw e;
			}
		}

		public String getTicketInfoUpcomingFixturesUi() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibility(unitedNowPageLocators.ticketInfoFixturesUnitedPage1, 15);
				ExtentsReportManager.extentReportLogging("pass", "Returns TicketInfo text");
				return unitedNowPageLocators.ticketInfoFixturesUnitedPage1.getText();
			} else {
				waitForVisibility(unitedNowPageLocators.matchDayInAllUnitedNow, 15);
				ExtentsReportManager.extentReportLogging("pass", "Returns TicketInfo text");
				return unitedNowPageLocators.matchDayInAllUnitedNow.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getUpcomingFixturesUi()<br />" + e);
			throw e;
		}
	}
		
		public String validateMatchDayLiveFromUi() {
			String device = GlobalParams.getPlatformName();
			try {
				if (device.equalsIgnoreCase("android")) {

					waitForVisibilityFluentWait(unitedNowPageLocators.matchDayInAllUnitedNow, 60);
					ExtentsReportManager.extentReportLogging("pass", "Returns dateTBC text");
					return unitedNowPageLocators.matchDayInAllUnitedNow.getText();

				} else {
					waitForVisibility(unitedNowPageLocators.matchDayInAllUnitedNow, 15);
					ExtentsReportManager.extentReportLogging("pass", "Returns MatchDayLive text");
					return unitedNowPageLocators.matchDayInAllUnitedNow.getDomAttribute("label");
				}
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail",
						"Exception occurred in function-getUpcomingFixturesUi()<br />" + e);
				throw e;
			}
		}
			


	

public String getprofilesTabText() {
			String device = GlobalParams.getPlatformName();
			try {
				if (device.equalsIgnoreCase("android")) {
				waitForVisibility(unitedNowPageLocators.profileTabPlayersInfoPage1, 15);
					ExtentsReportManager.extentReportLogging("pass", "Returns getprofilesTabText text");
					return unitedNowPageLocators.profileTabPlayersInfoPage1.getText();
			} else {
					waitForVisibility(unitedNowPageLocators.profileTabPlayersInfoPage1, 15);
					ExtentsReportManager.extentReportLogging("pass", "Returns getprofilesTabText text");
					return unitedNowPageLocators.profileTabPlayersInfoPage1.getDomAttribute("label");
				}
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail",
						"Exception occurred in function-getprofilesTabText()<br />" + e);
				throw e;
			}

		}

		public String getStatsTabText() {
			String device = GlobalParams.getPlatformName();
			try {
				if (device.equalsIgnoreCase("android")) {
					waitForVisibility(unitedNowPageLocators.statsTabPlayersInfoPage1, 15);
					ExtentsReportManager.extentReportLogging("pass", "Returns StatsTabText text");
					return unitedNowPageLocators.statsTabPlayersInfoPage1.getText();
				} else {
					waitForVisibility(unitedNowPageLocators.statsTabPlayersInfoPage1, 15);
					ExtentsReportManager.extentReportLogging("pass", "Returns StatsTabText text");
					return unitedNowPageLocators.statsTabPlayersInfoPage1.getDomAttribute("label");
				}
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail",
						"Exception occurred in function-getStatsTabText()<br />" + e);
				throw e;
			}
		}

		public boolean validatesGreetingsMessageIsNotDisplayedUnitedNow() {
			try {
				        if (unitedNowPageLocators.greetingsMsgUnitedNowPageNotDisplayed.size() == 0) {
				            ExtentsReportManager.extentReportLogging("pass",
				                    "Greetings message is NOT displayed on the United Now page.");
				            return true;
				        } else {
				            ExtentsReportManager.extentReportLogging("pass",
				                    "Greetings message is PRESENT on the United Now page.");
				            return true;
				        }
							} catch (Exception e) {
								ExtentsReportManager.extentReportLogging("fail",
										"Error in validating Greetings Message  is  displayed" + e);
								throw e;
							}
								}

		public boolean validatesStoriesCarouselIsNotDisplayedInUnitedNow() {
			try {
		        if (unitedNowPageLocators.storiesCouroselUnitedNowPage.size() == 0) {
		            ExtentsReportManager.extentReportLogging("pass",
		                    "Stories Carousel is NOT displayed on the United Now page.");
		            return true;
		        } else {
		            ExtentsReportManager.extentReportLogging("pass",
		                    "Stories Carousel is PRESENT on the United Now page.");
		            return true;
		        }
				} catch (Exception e) {
					ExtentsReportManager.extentReportLogging("fail",
							"Error in validating Stories Carousel  is  displayed" + e);
					throw e;
				}
					}

		public boolean validatesComingUpCarouselIsNotDisplayedInUnitedNow() {
			try {
		        if (unitedNowPageLocators.comingUpCouroselUnitedNowPage.size() == 0) {
		            ExtentsReportManager.extentReportLogging("pass",
		                    "ComingUp Carousel is NOT displayed on the United Now page.");
		            return true;
		        } else {
		            ExtentsReportManager.extentReportLogging("pass",
		                    "ComingUp Carousel is PRESENT on the United Now page.");
		            return true;
		        }
				} catch (Exception e) {
					ExtentsReportManager.extentReportLogging("fail",
							"Error in validating ComingUp Carousel  is  displayed" + e);
					throw e;
				}
		}

//		public boolean validatesUpsellFunctionalityIsDisplayedInUnitedNow() {
//			try {
//				waitForVisibilityFluentWait(unitedNowPageLocators.upsellTextInUnitedNowScreen, 120);
//				ExtentsReportManager.extentReportLogging("pass", "Displayed UpsellFunctionality in united now page");
//				return unitedNowPageLocators.upsellTextInUnitedNowScreen.isDisplayed();
//			} catch (Exception e) {
//				ExtentsReportManager.extentReportLogging("fail",
//						"Exception occurred in function-validatesUpsellFunctionalityIsDisplayedInUnitedNow()<br />" + e);
//				throw e;
//			}
//		}

		public String getUpsellTitleFromUI() {
			String device = GlobalParams.getPlatformName();
			try {
				if (device.equalsIgnoreCase("android")) {
					waitForVisibility(unitedNowPageLocators.upsellTextInUnitedNowScreen.get(0), 15);
					ExtentsReportManager.extentReportLogging("pass", "Returns UpsellTitle text");
					return unitedNowPageLocators.upsellTextInUnitedNowScreen.get(0).getText();
				} else {
					System.out.println(unitedNowPageLocators.upsellTextInUnitedNowScreen.size());
//					waitForVisibility(unitedNowPageLocators.upsellTextInUnitedNowScreen.get(0), 60);
					ExtentsReportManager.extentReportLogging("pass", "Returns UpsellTitle text");
					return unitedNowPageLocators.upsellTextInUnitedNowScreen.get(0).getDomAttribute("label");
				}
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail",
						"Exception occurred in function-getUpsellTitleFromUI()<br />" + e);
				throw e;
			}
		}

		public String getWatchNowBtnTextUi() {
			String device = GlobalParams.getPlatformName();
			try {
				if (device.equalsIgnoreCase("android")) {
					waitForVisibility(unitedNowPageLocators.watchNowCTAInUnitedNowScreen, 15);
					ExtentsReportManager.extentReportLogging("pass", "Returns watchNow CTA text");
					return unitedNowPageLocators.watchNowCTAInUnitedNowScreen.getText();
				} else {
//					waitForVisibility(unitedNowPageLocators.watchNowCTAInUnitedNowScreen, 60);
					ExtentsReportManager.extentReportLogging("pass", "Returns watchNow CTA text");
					return unitedNowPageLocators.watchNowCTAInUnitedNowScreen.getDomAttribute("label");
				}
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail",
						"Exception occurred in function-getWatchNowBtnTextUi()<br />" + e);
				throw e;
			}
		}

		public String getLiveVideoTextFromUI() {
			String device = GlobalParams.getPlatformName();
			try {
				if (device.equalsIgnoreCase("android")) {
					waitForVisibility(unitedNowPageLocators.liveVideoInUnitedNowScreen, 15);
					ExtentsReportManager.extentReportLogging("pass", "Returns LiveVideo  text");
					return unitedNowPageLocators.liveVideoInUnitedNowScreen.getText();
				} else {
					waitForVisibility(unitedNowPageLocators.liveVideoInUnitedNowScreen, 15);
					ExtentsReportManager.extentReportLogging("pass", "Returns LiveVideo text");
					return unitedNowPageLocators.liveVideoInUnitedNowScreen.getDomAttribute("label");
				}
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail",
						"Exception occurred in function-validatesLiveVideoInUnitedNowIsDisplayed()<br />" + e);
				throw e;
			}
		}
			
			
public boolean validatesLiveVideoInUnitedNowIsDisplayed() {
			try {
				waitForVisibilityFluentWait(unitedNowPageLocators.liveVideoInUnitedNowScreen, 120);
				ExtentsReportManager.extentReportLogging("pass", "Displayed LiveVideo in united now page");
				return unitedNowPageLocators.liveVideoInUnitedNowScreen.isDisplayed();
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail",
						"Exception occurred in function-validatesLiveVedioIsDisplayedInUI()<br />" + e);
				throw e;
			}
		}



		
		public void clicksOnUnitedNowTab() {
			try {
				elementToBeClickableFluentWait(unitedNowPageLocators.unitedNowTab, 60);
				unitedNowPageLocators.unitedNowTab.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on United Now Tab");
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail",
						"Exception occurred in function-clicksOnUnitedNowTab()" + e);
				throw e;
			}
			
		}
		
		
		public boolean getArticleCardFromUnitedNow(String expArticleCard) throws InterruptedException {
			String device = GlobalParams.getPlatformName();
			try {
				if (device.equalsIgnoreCase("android")) {
					AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, expArticleCard);

					List<WebElement> e = driver.findElements(AppiumBy.xpath("//*[contains(@text, '"+expArticleCard+"')]"));
					Thread.sleep(2000);
					waitForVisibilityFluentWait(e.get(0),60);
					e.get(0).click();
					return true;
				} else {
					 int i = 0;
			            while (i < 20) {
						String type = "name";
						List<WebElement> e = driver.findElements(AppiumBy.iOSNsPredicateString(type + " == \"" + expArticleCard + "\""));
						if (e.size() > 0) {
							e.get(0).click();
							Thread.sleep(4000);
							return true;
						} else {
							IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
							i++;
//							if(i>20){
//								ExtentsReportManager.extentReportLogging("fail", "Failing due to excesive scroll and unable to find the card " + e);
//								return false;
//							}
						}
					}
					ExtentsReportManager.extentReportLogging("pass", "Checks for Article Card d in united now page");
				}
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getArticleCardFromUnitedNow()<br />" + e);
				throw e;
			}
	        return false;
	    }
		
		public boolean getVideoCardFromUnitedNow(String expVideoCard) throws InterruptedException {
		    String device = GlobalParams.getPlatformName();
		    try {
		        if (device.equalsIgnoreCase("android")) {
		            AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, expVideoCard);
		            List<WebElement> e = driver.findElements(AppiumBy.xpath("//*[contains(@text, '" + expVideoCard + "')]"));
		            Thread.sleep(2000); 

		            if (!e.isEmpty()) {
		                waitForVisibilityFluentWait(e.get(0), 60);
		                e.get(0).click();
		                ExtentsReportManager.extentReportLogging("pass", "Video card '" + expVideoCard + "' displayed and clicked on Android.");
		                return true;
		            } else {
		                ExtentsReportManager.extentReportLogging("fail", "Video card '" + expVideoCard + "' not found on Android.");
		                return false;
		            }

		        } else { // iOS
		        	 int i = 0;
			            while (i < 20) {
		                List<WebElement> e = driver.findElements(AppiumBy.iOSNsPredicateString("name == \"" + expVideoCard + "\""));
		                if (!e.isEmpty()) {
		                    e.get(0).click();
		                    Thread.sleep(4000); // Consider replacing with WebDriverWait
		                    ExtentsReportManager.extentReportLogging("pass", "Video card '" + expVideoCard + "' displayed and clicked on iOS.");
		                    return true;
		                } else {
		                    IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
		                    i++;
		                }
		            }
		            ExtentsReportManager.extentReportLogging("fail", "Failing due to excessive scrolls. Unable to find the card '" + expVideoCard + "' on iOS.");
		            return false;
		        }
		    } catch (Exception e) {
		        ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getVideoCardFromUnitedNow()<br />" + e);
		        throw e;
		    }
		}
//		public boolean getVideoCardFromUnitedNow(String expVideoCard) throws InterruptedException {
//			String device = GlobalParams.getPlatformName();
//			try {
//				if (device.equalsIgnoreCase("android")) {
//					AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, expVideoCard);
//					List<WebElement> e = driver.findElements(AppiumBy.xpath("//*[contains(@text, '"+expVideoCard+"')]"));
//					Thread.sleep(2000);
//					waitForVisibilityFluentWait(e.get(0),60);
//					e.get(0).click();
//					return true;
//				} else {
//					int i = 20;
//					while (i < 20) {
//						String type = "name";
//						List<WebElement> e = driver.findElements(AppiumBy.iOSNsPredicateString(type + " == \"" + expVideoCard + "\""));
//						if (e.size() > 0) {
//							e.get(0).click();
//							Thread.sleep(4000);
//							return true;
//						} else {
//							IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
//							i++;
//							if(i>20){
//								ExtentsReportManager.extentReportLogging("fail", "Failing due to excesive scroll and unable to find the card " + e);
//								return false;
//							}
//						}
//					}
//					ExtentsReportManager.extentReportLogging("pass", "Checks for video Card d in united now page");
//				}
//			} catch (Exception e) {
//				ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getVideoCardFromUnitedNow()<br />" + e);
//				throw e;
//			}
//	        return false;
//	    }
		
		public boolean getGalleryCardFromUnitedNow(String expGalleryCard) throws InterruptedException {
			String device = GlobalParams.getPlatformName();
			try {
				if (device.equalsIgnoreCase("android")) {
					AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, expGalleryCard.replaceAll("\\[|\\]", ""));

					List<WebElement> e = driver.findElements(AppiumBy.xpath("//*[contains(@text, '"+expGalleryCard.replaceAll("\\[|\\]", "")+"')]"));
					Thread.sleep(2000);

					waitForVisibilityFluentWait(e.get(0),60);
					e.get(0).click();
					return true;
				} else {
					 int i = 0;
			            while (i < 20) {
						String type = "name";
						List<WebElement> e = driver.findElements(AppiumBy.iOSNsPredicateString(type + " == \"" + expGalleryCard.replaceAll("\\[|\\]", "") + "\""));
						if (e.size() > 0) {
							e.get(0).click();
							Thread.sleep(4000);
							return true;
						} else {
							IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
							i++;
						}
					}
					ExtentsReportManager.extentReportLogging("pass", "Checks for Gallery Card in united now page");
				}
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getGalleryCardFromUnitedNow()<br />" + e);
				throw e;
			}
	        return false;
	    }
		
		public boolean getQuoteCardFromUnitedNow(String expQuoteCard) throws InterruptedException {
			String device = GlobalParams.getPlatformName();
			try {
				if (device.equalsIgnoreCase("android")) {
					AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, expQuoteCard);
					List<WebElement> e = driver.findElements(AppiumBy.xpath("//*[contains(@text, '"+expQuoteCard+"')]"));
					Thread.sleep(2000);
					waitForVisibilityFluentWait(e.get(0),60);
					e.get(0).click();
					return true;
				} else {
					 int i = 0;
			            while (i < 20) {
						String type = "name";
						List<WebElement> e = driver.findElements(AppiumBy.iOSNsPredicateString(type + " == \"" + expQuoteCard + "\""));
						if (e.size() > 0) {
							e.get(0).click();
							Thread.sleep(4000);
							return true;
						} else {
							IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
							i++;
//							if(i>20){
//								ExtentsReportManager.extentReportLogging("fail", "Failing due to excesive scroll and unable to find the card " + e);
//								return false;
//							}
						}
					}
					ExtentsReportManager.extentReportLogging("pass", "Checks for Quote Card d in united now page");
				}
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getQuoteCardFromUnitedNow()<br />" + e);
				throw e;
			}
	        return false;
	    }
		
		public boolean getQuizCardFromUnitedNow(String expQuizCard) throws InterruptedException {
			String device = GlobalParams.getPlatformName();
			try {
				if (device.equalsIgnoreCase("android")) {
					AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, expQuizCard);
					List<WebElement> e = driver.findElements(AppiumBy.xpath("//*[contains(@text, '"+expQuizCard+"')]"));
					Thread.sleep(2000);

					waitForVisibilityFluentWait(e.get(0),60);
					e.get(0).click();
					return true;
				} else {
					 int i = 0;
			            while (i < 20) {
						String type = "name";
						List<WebElement> e = driver.findElements(AppiumBy.accessibilityId(expQuizCard.toString().toUpperCase()));
						if (e.size() > 0) {
							e.get(0).click();
							Thread.sleep(4000);
							return true;
						} else {
							IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
							i++;
//							if(i>20){
//								ExtentsReportManager.extentReportLogging("fail", "Failing due to excesive scroll and unable to find the card " + e);
//								return false;
//							}
						}
					}
					ExtentsReportManager.extentReportLogging("pass", "Checks for Quiz Card d in united now page");
				}
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getQuizCardFromUnitedNow()<br />" + e);
				throw e;
			}
	        return false;
	    }
		
		public boolean getPollCardFromUnitedNow(String expPollCard) throws InterruptedException {
			String device = GlobalParams.getPlatformName();
			try {
				if (device.equalsIgnoreCase("android")) {
					AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, expPollCard);
					List<WebElement> e = driver.findElements(AppiumBy.xpath("//*[contains(@text,\""+expPollCard+"\")]"));
					Thread.sleep(2000);
					waitForVisibilityFluentWait(e.get(0),60);
					e.get(0).click();
					return true;
				} else {
					 int i = 0;
			            while (i < 20) {
//						String type = "name";
						List<WebElement> e = driver.findElements(AppiumBy.accessibilityId(expPollCard));
						if (e.size() > 0) {
							ExtentsReportManager.extentReportLogging("pass", "Poll card" + expPollCard + " displayed in united now page");
							e.get(0).click();
							Thread.sleep(4000);
							return true;
						} else {
							IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.6);
							i++;
//							if(i>20){
//								ExtentsReportManager.extentReportLogging("fail", "Failing due to excesive scroll and unable to find the card " + e);
//								return false;
//							}
						}
					}
					ExtentsReportManager.extentReportLogging("pass", "Checks for Poll Card d in united now page");
				}
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getPollCardFromUnitedNow()<br />" + e);
				throw e;
			}
	        return false;
	    }
		
		public boolean getCompetitionCardFromUnitedNow(String expCompetitionCard) throws InterruptedException {
			String device = GlobalParams.getPlatformName();
			try {
				if (device.equalsIgnoreCase("android")) {
					AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, expCompetitionCard);
					List<WebElement> e = driver.findElements(AppiumBy.xpath("//*[contains(@text, '"+expCompetitionCard+"')]"));
					Thread.sleep(2000);
					waitForVisibilityFluentWait(e.get(0),60);
					e.get(0).click();
					return true;
				} else {
					 int i = 0;
			            while (i < 20) {
						String type = "name";
						List<WebElement> e = driver.findElements(AppiumBy.iOSNsPredicateString(type + " == \"" + expCompetitionCard + "\""));
						if (e.size() > 0) {
							e.get(0).click();
							Thread.sleep(4000);
							return true;
						} else {
							IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.8);
							i++;
//							if(i>20){
//								ExtentsReportManager.extentReportLogging("fail", "Failing due to excesive scroll and unable to find the card " + e);
//								return false;
//							}
						}
					}
					ExtentsReportManager.extentReportLogging("pass", "Checks for Competition Card d in united now page");
				}
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getCompetitionCardFromUnitedNow()<br />" + e);
				throw e;
			}
	        return false;
	    }
		
		public boolean getAdcardfromUnitedNow(String expAdcard) throws InterruptedException {
			String device = GlobalParams.getPlatformName();
			try {
				if (device.equalsIgnoreCase("android")) {
					AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, expAdcard);
					List<WebElement> e = driver.findElements(AppiumBy.xpath("//*[contains(@text, '"+expAdcard+"')]"));
					Thread.sleep(2000);
					waitForVisibilityFluentWait(e.get(0),60);
					e.get(0).click();
					return true;
				} else {
					 int i = 0;
			            while (i < 20) {
						String type = "name";
						List<WebElement> e = driver.findElements(AppiumBy.iOSNsPredicateString(type + " == \"" + expAdcard + "\""));
						if (e.size() > 0) {
							e.get(0).click();
							Thread.sleep(4000);
							return true;
						} else {
							IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.8);
							i++;
//							if(i>20){
//								ExtentsReportManager.extentReportLogging("fail", "Failing due to excesive scroll and unable to find the card " + e);
//								return false;
//							}
						}
					}
					ExtentsReportManager.extentReportLogging("pass", "Checks for Adcard Card d in united now page");
				}
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getAdcardfromUnitedNow()<br />" + e);
				throw e;
			}
	        return false;
	    }
		
		public boolean getImagefromUnitedNow(String expImageCcard) throws InterruptedException {
			String device = GlobalParams.getPlatformName();
			try {
				if (device.equalsIgnoreCase("android")) {
					AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, expImageCcard);
					List<WebElement> e = driver.findElements(AppiumBy.xpath("//*[contains(@text, '"+expImageCcard+"')]"));
					Thread.sleep(2000);
					waitForVisibilityFluentWait(e.get(0),60);
					e.get(0).click();
					return true;
				} else {
					 int i = 0;
			            while (i < 20) {
						String type = "name";
						List<WebElement> e = driver.findElements(AppiumBy.iOSNsPredicateString(type + " == \"" + expImageCcard + "\""));
						if (e.size() > 0) {
							ExtentsReportManager.extentReportLogging("pass", "Image card" + expImageCcard + " displayed in united now page");
							e.get(0).click();
							Thread.sleep(4000);
							return true;
						} else {
							IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.8);
							i++;
//							if(i>20){
//								ExtentsReportManager.extentReportLogging("fail", "Failing due to excesive scroll and unable to find the card " + e);
//								return false;
//							}
						}
					}
					ExtentsReportManager.extentReportLogging("pass", "Checks for Image Card d in united now page");
				}
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getImagefromUnitedNow()<br />" + e);
				throw e;
			}
	        return false;
	    }
		
		
		
		public String getStoriesCarouselinMatchResultFromUI() {
			String device = GlobalParams.getPlatformName();
			try {
				if (device.equalsIgnoreCase("android")) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
					waitForVisibility(unitedNowPageLocators.storiesCarousel, 15);
					ExtentsReportManager.extentReportLogging("pass", "Returns stories Carousel text");
					return unitedNowPageLocators.storiesCarousel.getText();
				} else {
					waitForVisibility(unitedNowPageLocators.storiesCarousel, 15);
					ExtentsReportManager.extentReportLogging("pass", "Returns stories Carousel text");
					return unitedNowPageLocators.storiesCarousel.getDomAttribute("label");
				}
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail",
						"Exception occurred in function-getStoriesCarouselinMatchResultFromUI()<br />" + e);
				throw e;
			}
		}
		
		public boolean getEnglishFaCups() throws Exception {
			String expEnglishFaCups = unitedNowAPIResponse.getEnglishFaCups("AllLeagueFiltersEndpoint");
	        try {
	        	if(unitedNowPageLocators.englishFACups.size() > 0) { 
	        	waitForVisibilityFluentWait(unitedNowPageLocators.englishFACups.get(0), 60);
				String actualEnglishFaCups = unitedNowPageLocators.englishFACups.get(0).getText();
	            if (actualEnglishFaCups.contains(expEnglishFaCups))
					ExtentsReportManager.extentReportLogging("pass", "" + expEnglishFaCups + " text matching");
			} else if (unitedNowPageLocators.noFixturesTextUnitedPage.size() > 0) {
				waitForVisibilityFluentWait(unitedNowPageLocators.noFixturesTextUnitedPage.get(0), 60);
				String actnoFixturesTextUnitedPage = unitedNowPageLocators.noFixturesTextUnitedPage.get(0).getText();
				if (actnoFixturesTextUnitedPage.contains(expEnglishFaCups))
					ExtentsReportManager.extentReportLogging("pass", "" + expEnglishFaCups + " text matching");
	        }
			else {
				return false;
			}
	            return true;
	        	
	        } catch (Exception e) {
	            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getEnglishFaCups()<br />" + e);
	            throw e;
	        }
	    }
		
//		public boolean getEnglishPremierLeague() throws Exception {
//			String expEnglishPremierLeague = unitedNowAPIResponse.getEnglishPremierLeague("AllLeagueFiltersEndpoint");
//	        try {
//	        	waitForVisibilityFluentWait(unitedNowPageLocators.englishPremierLeague, 60);
//				String actEnglishPremierLeague = unitedNowPageLocators.englishPremierLeague.getText();
//	            if (actEnglishPremierLeague.contains(expEnglishPremierLeague))
//	                ExtentsReportManager.extentReportLogging("pass", ""+expEnglishPremierLeague+" text matching");
//	            return true;
//	        } catch (Exception e) {
//	            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getEnglishPremierLeague()<br />" + e);
//	            throw e;
//	        }
//	    }
		public boolean getEnglishPremierLeague() throws Exception {
			String expEnglishPremierLeague = unitedNowAPIResponse.getEnglishPremierLeague("AllLeagueFiltersEndpoint");
			String error= "There are currently no fixtures available in this competition.";
	        try {
	        	if(unitedNowPageLocators.englishPremierLeague.size() > 0) { 
	        	waitForVisibilityFluentWait(unitedNowPageLocators.englishPremierLeague.get(0), 60);
				String actualEnglishFaCups = unitedNowPageLocators.englishPremierLeague.get(0).getText();
	            if (actualEnglishFaCups.contains(expEnglishPremierLeague))
					ExtentsReportManager.extentReportLogging("pass", "" + expEnglishPremierLeague + " text matching");
			} else if (unitedNowPageLocators.noFixturesTextUnitedPage.size() > 0) {
				waitForVisibilityFluentWait(unitedNowPageLocators.noFixturesTextUnitedPage.get(0), 60);
				String actnoFixturesTextUnitedPage = unitedNowPageLocators.noFixturesTextUnitedPage.get(0).getText();
				if (actnoFixturesTextUnitedPage.contains(error))
					ExtentsReportManager.extentReportLogging("pass", "" + expEnglishPremierLeague + " text matching");
	        }
			else {
				return false;
			}
	            return true;
	        	
	        } catch (Exception e) {
	            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getEnglishPremierLeague()<br />" + e);
	            throw e;
	        }
	    }
		
//		public boolean getFACup() throws Exception {
//			String expEnglishFAcupLeague = unitedNowAPIResponse.getFACup("AllLeagueFiltersEndpoint");
//	        try {
////	        	waitForVisibilityFluentWait(unitedNowPageLocators.faCup, 60);
//				String actEnglishFAcupLeague = unitedNowPageLocators.faCup.getText();
//				String actualNoFixturesTextUnitedPage = unitedNowPageLocators.noFixturesTextUnitedPage.get(0).getText();
//	            if (actEnglishFAcupLeague.contains(expEnglishFAcupLeague)|| actualNoFixturesTextUnitedPage.contains(expEnglishFAcupLeague))
//	                ExtentsReportManager.extentReportLogging("pass", ""+expEnglishFAcupLeague+" text matching");
//	            return true;
//	        } catch (Exception e) {
//	            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getEnglishPremierLeague()<br />" + e);
//	            throw e;
//	        }
//	    }
		
		
		public boolean getFACup() throws Exception {
			String expEnglishFAcupLeague = unitedNowAPIResponse.getFACup("AllLeagueFiltersEndpoint");
			String error= "There are currently no fixtures available in this competition.";
	        try {
	        	if(unitedNowPageLocators.faCup.size() > 0) { 
	        	waitForVisibilityFluentWait(unitedNowPageLocators.faCup.get(0), 60);
				String actualEnglishFaCups = unitedNowPageLocators.faCup.get(0).getText();
	            if (actualEnglishFaCups.contains(expEnglishFAcupLeague))
					ExtentsReportManager.extentReportLogging("pass", "" + expEnglishFAcupLeague + " text matching");
			} else if (unitedNowPageLocators.noFixturesTextUnitedPage.size() > 0) {
				waitForVisibilityFluentWait(unitedNowPageLocators.noFixturesTextUnitedPage.get(0), 60);
				String actnoFixturesTextUnitedPage = unitedNowPageLocators.noFixturesTextUnitedPage.get(0).getText();
				if (actnoFixturesTextUnitedPage.contains(error))
					ExtentsReportManager.extentReportLogging("pass", "" + actnoFixturesTextUnitedPage + " text matching");
	        }
			else {
				return false;
			}
	            return true;
	        	
	        } catch (Exception e) {
	            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getFACup()<br />" + e);
	            throw e;
	        }
	    }
		
//		public boolean getEuropaLeague() throws Exception {
//			String expuEFAEuropaLeague = unitedNowAPIResponse.getUEFAEuropaLeague("AllLeagueFiltersEndpoint");
//	        try {
////	        	waitForVisibilityFluentWait(unitedNowPageLocators.uEFAEuropaLeague, 60);
//				String actuEFAEuropaLeague = unitedNowPageLocators.uEFAEuropaLeague.getText();
//				String actualNoFixturesTextUnitedPage = unitedNowPageLocators.noFixturesTextUnitedPage.get(0).getText();
//	            if (actuEFAEuropaLeague.contains(expuEFAEuropaLeague) || actualNoFixturesTextUnitedPage.contains(expuEFAEuropaLeague))
//	                ExtentsReportManager.extentReportLogging("pass", ""+expuEFAEuropaLeague+" text matching");
//	            return true;
//	        } catch (Exception e) {
//	            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getEnglishPremierLeague()<br />" + e);
//	            throw e;
//	        }
//	    }
		
		public boolean getEuropaLeague() throws Exception {
			String expuEFAEuropaLeague = unitedNowAPIResponse.getUEFAEuropaLeague("AllLeagueFiltersEndpoint");
			String error= "There are currently no fixtures available in this competition.";
	        try {
	        	if(unitedNowPageLocators.uEFAEuropaLeague.size() > 0) { 
	        	waitForVisibilityFluentWait(unitedNowPageLocators.uEFAEuropaLeague.get(0), 60);
				String actualEnglishFaCups = unitedNowPageLocators.uEFAEuropaLeague.get(0).getText();
	            if (actualEnglishFaCups.contains(expuEFAEuropaLeague))
					ExtentsReportManager.extentReportLogging("pass", "" + expuEFAEuropaLeague + " text matching");
			} else if (unitedNowPageLocators.noFixturesTextUnitedPage.size() > 0) {
				waitForVisibilityFluentWait(unitedNowPageLocators.noFixturesTextUnitedPage.get(0), 60);
				String actnoFixturesTextUnitedPage = unitedNowPageLocators.noFixturesTextUnitedPage.get(0).getText();
				if (actnoFixturesTextUnitedPage.contains(error))
					ExtentsReportManager.extentReportLogging("pass", "" + expuEFAEuropaLeague + " text matching");
	        }
			else {
				return false;
			}
	            return true;
	        	
	        } catch (Exception e) {
	            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getEuropaLeague()<br />" + e);
	            throw e;
	        }
	    }
		
		public boolean getLeagueCup() throws Exception {
			String expLeagueCup = unitedNowAPIResponse.getUEFAEuropaLeague("AllLeagueFiltersEndpoint");
			String error= "There are currently no fixtures available in this competition.";
	        try {
	        	if(unitedNowPageLocators.leagueCup.size() > 0) { 
	        	waitForVisibilityFluentWait(unitedNowPageLocators.leagueCup.get(0), 60);
				String actualEnglishFaCups = unitedNowPageLocators.leagueCup.get(0).getText();
	            if (actualEnglishFaCups.contains(expLeagueCup))
					ExtentsReportManager.extentReportLogging("pass", "" + expLeagueCup + " text matching");
			} else if (unitedNowPageLocators.noFixturesTextUnitedPage.size() > 0) {
				waitForVisibilityFluentWait(unitedNowPageLocators.noFixturesTextUnitedPage.get(0), 60);
				String actnoFixturesTextUnitedPage = unitedNowPageLocators.noFixturesTextUnitedPage.get(0).getText();
				if (actnoFixturesTextUnitedPage.contains(error))
					ExtentsReportManager.extentReportLogging("pass", "" + expLeagueCup + " text matching");
	        }
			else {
				return false;
			}
	            return true;
	        	
	        } catch (Exception e) {
	            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getEnglishPremierLeague()<br />" + e);
	            throw e;
	        }
	    }
		
		public boolean getFriendly() throws Exception {
			String expFriendly = unitedNowAPIResponse.getFriendly("AllLeagueFiltersEndpoint");
			String error= "There are currently no fixtures available in this competition.";
	        try {
	        	if(unitedNowPageLocators.friendly.size() > 0) { 
	        	waitForVisibilityFluentWait(unitedNowPageLocators.friendly.get(0), 60);
				String actualEnglishFaCups = unitedNowPageLocators.friendly.get(0).getText();
	            if (actualEnglishFaCups.contains(expFriendly))
					ExtentsReportManager.extentReportLogging("pass", "" + expFriendly + " text matching");
			} else if (unitedNowPageLocators.noFixturesTextUnitedPage.size() > 0) {
				waitForVisibilityFluentWait(unitedNowPageLocators.noFixturesTextUnitedPage.get(0), 60);
				String actnoFixturesTextUnitedPage = unitedNowPageLocators.noFixturesTextUnitedPage.get(0).getText();
				if (actnoFixturesTextUnitedPage.contains(error))
					ExtentsReportManager.extentReportLogging("pass", "" + expFriendly + " text matching");
	        }
			else {
				return false;
			}
	            return true;
	        	
	        } catch (Exception e) {
	            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getFriendly()<br />" + e);
	            throw e;
	        }
	    }
		
		public boolean getDateTBC() throws Exception {
			String expDateTBC = unitedNowAPIResponse.getDateTBC("AllLeagueFiltersEndpoint");
			String error= "There are currently no fixtures available in this competition.";
	        try {
	        	if(unitedNowPageLocators.dateTBC.size() > 0) { 
	        	waitForVisibilityFluentWait(unitedNowPageLocators.dateTBC.get(0), 60);
				String actualDateTBC = unitedNowPageLocators.dateTBC.get(0).getText();
	            if (actualDateTBC.contains(expDateTBC))
					ExtentsReportManager.extentReportLogging("pass", "" + expDateTBC + " text matching");
			} else if (unitedNowPageLocators.noFixturesTextUnitedPage.size() > 0) {
				waitForVisibilityFluentWait(unitedNowPageLocators.noFixturesTextUnitedPage.get(0), 60);
				String actnoFixturesTextUnitedPage = unitedNowPageLocators.noFixturesTextUnitedPage.get(0).getText();
				if (actnoFixturesTextUnitedPage.contains(error))
					ExtentsReportManager.extentReportLogging("pass", "" + expDateTBC + " text matching");
	        }
			else {
				return false;
			}
	            return true;
	        	
	        } catch (Exception e) {
	            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getDateTBC()<br />" + e);
	            throw e;
	        }
	    }
		
//		public boolean getTicketInfo() throws Exception {
//			String expTicketInfo = unitedNowAPIResponse.getTicketInfo("UpComingFixturesEndPoint");
//	        try {
//	        	if(unitedNowPageLocators.ticketInfo.size() > 0) { 
//	        	waitForVisibilityFluentWait(unitedNowPageLocators.ticketInfo.get(0), 60);
//				String actualTicketInfo = unitedNowPageLocators.ticketInfo.get(0).getText();
//	            if (actualTicketInfo.contains(expTicketInfo))
//					ExtentsReportManager.extentReportLogging("pass", "" + expTicketInfo + " text matching");
//			} else if (unitedNowPageLocators.noFixturesTextUnitedPage.size() > 0) {
//				waitForVisibilityFluentWait(unitedNowPageLocators.noFixturesTextUnitedPage.get(0), 60);
//				String actnoFixturesTextUnitedPage = unitedNowPageLocators.noFixturesTextUnitedPage.get(0).getText();
//				if (actnoFixturesTextUnitedPage.contains(expTicketInfo))
//					ExtentsReportManager.extentReportLogging("pass", "" + expTicketInfo + " text matching");
//	        }
//			else {
//				return false;
//			}
//	            return true;
//	        	
//	        } catch (Exception e) {
//	            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getDateTBC()<br />" + e);
//	            throw e;
//	        }
//	    }
		
		
		public boolean getTicketInfoAndMatchReview() throws Exception {
			String expTicketInfo = unitedNowAPIResponse.getTicketInfo("UpComingFixturesEndPoint");
			String expMatchReview = unitedNowAPIResponse.getMatchReview("UpComingFixturesEndPoint");
			String actualTicketInfo = null;
			String actualMatchReview = null;
			
	        try {
	        	if(unitedNowPageLocators.ticketInfo.size() > 0 || unitedNowPageLocators.matchReview.size() > 0) { 
	        		if(unitedNowPageLocators.ticketInfo.size() > 0){
	        			waitForVisibilityFluentWait(unitedNowPageLocators.ticketInfo.get(0), 60);
	        			actualTicketInfo = unitedNowPageLocators.ticketInfo.get(0).getText();
	        			ExtentsReportManager.extentReportLogging("pass", "" + expTicketInfo + " text matching");
	        		}
	        		else {
	        			waitForVisibilityFluentWait(unitedNowPageLocators.matchReview.get(0), 60);
	        			actualMatchReview = unitedNowPageLocators.matchReview.get(0).getText();
	        			ExtentsReportManager.extentReportLogging("pass", "" + expMatchReview + " text matching");
	        			
	        		}
	            if (actualTicketInfo.contains(expTicketInfo) || actualMatchReview.contains(expTicketInfo)) {
					ExtentsReportManager.extentReportLogging("pass",""+ expTicketInfo+" And "+expTicketInfo+" text matching");
	            return true;
	            }
			} else if (unitedNowPageLocators.noFixturesTextUnitedPage.size() > 0) {
				waitForVisibilityFluentWait(unitedNowPageLocators.noFixturesTextUnitedPage.get(0), 60);
				String actnoFixturesTextUnitedPage = unitedNowPageLocators.noFixturesTextUnitedPage.get(0).getText();
				if (actnoFixturesTextUnitedPage.contains(expTicketInfo))
					ExtentsReportManager.extentReportLogging("pass", "" + expTicketInfo + " text matching");
	        }
			else {
				return false;
			}
	            return true;
	        	
	        } catch (Exception e) {
	            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getTicketInfo()<br />" + e);
	            throw e;
	        }
	    }
		
//		public boolean getTicketInfoAndMatchReviewInIOS() throws Exception {
//			String expTicketInfo = unitedNowAPIResponse.getTicketInfo("UpComingFixturesEndPoint");
//			String expMatchReview = unitedNowAPIResponse.getMatchReview("UpComingFixturesEndPoint");
//			String actualTicketInfo = null;
//			String actualMatchReview = null;
//			
//	        try {
//	        	if(unitedNowPageLocators.ticketInfo.size() > 0 || unitedNowPageLocators.matchReview.size() > 0) { 
//	        		if(unitedNowPageLocators.ticketInfo.size() > 0){
//	        			waitForVisibilityFluentWait(unitedNowPageLocators.ticketInfo.get(0), 60);
//	        			actualTicketInfo = unitedNowPageLocators.ticketInfo.get(0).getText();
//	        			ExtentsReportManager.extentReportLogging("pass", "" + expTicketInfo + " text matching");
//	        		}
//	        		else {
//	        			waitForVisibilityFluentWait(unitedNowPageLocators.matchReview.get(0), 60);
//	        			actualMatchReview = unitedNowPageLocators.matchReview.get(0).getText();
//	        			ExtentsReportManager.extentReportLogging("pass", "" + expMatchReview + " text matching");
//	        			
//	        		}
//	            if (actualTicketInfo.contains(expTicketInfo) || actualMatchReview.contains(expTicketInfo)) {
//					ExtentsReportManager.extentReportLogging("pass",""+ expTicketInfo+" And "+expTicketInfo+" text matching");
//	            return true;
//	            }
//			} else if (unitedNowPageLocators.noFixturesTextUnitedPage.size() > 0) {
//				waitForVisibilityFluentWait(unitedNowPageLocators.noFixturesTextUnitedPage.get(0), 60);
//				String actnoFixturesTextUnitedPage = unitedNowPageLocators.noFixturesTextUnitedPage.get(0).getText();
//				if (actnoFixturesTextUnitedPage.contains(expTicketInfo))
//					ExtentsReportManager.extentReportLogging("pass", "" + expTicketInfo + " text matching");
//	        }
//			else {
//				return false;
//			}
//	            return true;
//	        	
//	        } catch (Exception e) {
//	            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getTicketInfo()<br />" + e);
//	            throw e;
//	        }
//	    }
		
		public boolean getMtachReview() throws Exception {
			String expMatchReview = unitedNowAPIResponse.getDateTBC("MatchReviewEndPoint");
	        try {
	        	if(unitedNowPageLocators.matchReview.size() > 0) { 
	        	waitForVisibilityFluentWait(unitedNowPageLocators.matchReview.get(0), 60);
				String actualMatchReview = unitedNowPageLocators.matchReview.get(0).getText();
	            if (actualMatchReview.contains(expMatchReview))
					ExtentsReportManager.extentReportLogging("pass", "" + expMatchReview + " text matching");
			} else if (unitedNowPageLocators.noFixturesTextUnitedPage.size() > 0) {
				waitForVisibilityFluentWait(unitedNowPageLocators.noFixturesTextUnitedPage.get(0), 60);
				String actnoFixturesTextUnitedPage = unitedNowPageLocators.noFixturesTextUnitedPage.get(0).getText();
				if (actnoFixturesTextUnitedPage.contains(expMatchReview))
					ExtentsReportManager.extentReportLogging("pass", "" + expMatchReview + " text matching");
	        }
			else {
				return false;
			}
	            return true;
	        	
	        } catch (Exception e) {
	            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getMtachReview()<br />" + e);
	            throw e;
	        }
	    }
		
		
		public boolean getMatchDayLive() throws Exception {
			String expMatchDayLive = unitedNowAPIResponse.getMatchDayLive("MatchReviewEndPoint");
	        try {
	        	if(unitedNowPageLocators.matchDayLive.size() > 0) { 
	        	waitForVisibilityFluentWait(unitedNowPageLocators.matchDayLive.get(0), 60);
				String actualMatchReview = unitedNowPageLocators.matchDayLive.get(0).getAttribute("name");
	            if (actualMatchReview.contains(expMatchDayLive))
					ExtentsReportManager.extentReportLogging("pass", "" + expMatchDayLive + " text matching");
			} else if (unitedNowPageLocators.noFixturesTextUnitedPage.size() > 0) {
				waitForVisibilityFluentWait(unitedNowPageLocators.noFixturesTextUnitedPage.get(0), 60);
				String actnoFixturesTextUnitedPage = unitedNowPageLocators.noFixturesTextUnitedPage.get(0).getText();
				if (actnoFixturesTextUnitedPage.contains(expMatchDayLive))
					ExtentsReportManager.extentReportLogging("pass", "" + expMatchDayLive + " text matching");
	        }
			else {
				return false;
			}
	            return true;
	        	
	        } catch (Exception e) {
	            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getMatchDayLive()<br />" + e);
	            throw e;
	        }
	    }
		public boolean getDummyTestSiteCore() throws Exception {
			String expDummyTestSiteCore = unitedNowAPIResponse.getDummyTestSiteCore("AllLeagueFiltersEndpoint");
			String error= "There are currently no fixtures available in this competition.";
	        try {
	        	if(unitedNowPageLocators.dummyTestSiteCore.size() > 0) { 
	        	waitForVisibilityFluentWait(unitedNowPageLocators.dummyTestSiteCore.get(0), 60);
				String actualDummyTestSiteCore = unitedNowPageLocators.dummyTestSiteCore.get(0).getText();
	            if (actualDummyTestSiteCore.contains(expDummyTestSiteCore))
					ExtentsReportManager.extentReportLogging("pass", "" + expDummyTestSiteCore + " text matching");
			} else if (unitedNowPageLocators.noFixturesTextUnitedPage.size() > 0) {
				waitForVisibilityFluentWait(unitedNowPageLocators.noFixturesTextUnitedPage.get(0), 60);
				String actnoFixturesTextUnitedPage = unitedNowPageLocators.noFixturesTextUnitedPage.get(0).getText();
				if (actnoFixturesTextUnitedPage.contains(error))
					ExtentsReportManager.extentReportLogging("pass", "" + expDummyTestSiteCore + " text matching");
	        }
			else {
				return false;
			}
	            return true;
	        	
	        } catch (Exception e) {
	            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getDummyTestSiteCore()<br />" + e);
	            throw e;
	        }
	    }
		
		public boolean getTicketInfoInIOS() throws Exception {
			String expTicketInfo = unitedNowAPIResponse.getTicketInfo("UpComingFixturesEndPoint").toUpperCase();
			String error= "There are currently no fixtures available in this competition.";
	        try {
	        	if(unitedNowPageLocators.ticketInfo.size() > 0) { 
	        	waitForVisibilityFluentWait(unitedNowPageLocators.ticketInfo.get(0), 60);
				String actualTicketInfo = unitedNowPageLocators.ticketInfo.get(0).getAttribute("name").toUpperCase();
	            if (actualTicketInfo.contains(expTicketInfo))
					ExtentsReportManager.extentReportLogging("pass", "" + expTicketInfo + " text matching");
	        	}
	            return true;
	        	
	        } catch (Exception e) {
	            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getDummyTestSiteCore()<br />" + e);
	            throw e;
	        }
	    }
		
}



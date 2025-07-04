package org.bdd.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class Common {
    public final AppiumDriver driver = new AppiumDriverManager().getAppiumDriver();
    public static Scenario scenario;
    //	LogManagement consoleLog = new LogManagement();
    public static final long WAIT = 15;

    public void waitForVisibility(WebElement e, long duration) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void waitForVisibility(By e, long duration) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.visibilityOfElementLocated(e));
    }

    public void waitForVisibilityFluentWait(WebElement e, long duration) {
        FluentWait<AppiumDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(duration))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void elementToBeClickable(WebElement e, long duration) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.elementToBeClickable(e));

    }

    public void elementToBeClickableFluentWait(WebElement e, long duration) {
        FluentWait<AppiumDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(duration))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.elementToBeClickable(e));
    }

    public void clear(WebElement e) {
        waitForVisibility(e, 15);
        e.clear();
    }

    public void click(WebElement e) {
        e.click();
    }

    public void click(WebElement e, String msg) {
        waitForVisibility(e, 15);
//		consoleLog.log().info(msg);
        e.click();
    }

    public void click(By e, String msg) {
        waitForVisibility(e, 15);
//		consoleLog.log().info(msg);
        driver.findElement(e).click();
    }

    public void sendKeys(WebElement e, String txt) {
//        waitForVisibility(e);
        try {
            e.sendKeys(txt);
        } catch (Exception e1) {
        }
    }

    public void sendKeys(WebElement e, String txt, String msg) {
//        waitForVisibility(e);
//		consoleLog.log().info(msg);
        e.sendKeys(txt);
    }

    public String getDomAttribute(WebElement e, String attribute) {
        waitForVisibility(e, 15);
        return e.getDomAttribute(attribute);
    }

    public String getDomAttribute(By e, String attribute) {
        waitForVisibility(e, 15);
        return driver.findElement(e).getDomAttribute(attribute);
    }

    public void clickElement(WebElement element, String elementname) throws IOException {
        try {
//            test.log(Status.INFO, "Click on" + elementname);
            // JavascriptExecutor js = (JavascriptExecutor) driver;
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            wait.until(ExpectedConditions.visibilityOf(element));

            if (element.isDisplayed()) {
                Actions actions = new Actions(driver);
                actions.moveToElement(element).click().build().perform();
            }
        } catch (Exception e) {

        }
    }

    // Getting the current date and day in EEEE,MMMM format
    public String getDateAndDay() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE dd MMMM");
        return dateFormat.format(date);
    }

    public String getDayandFutureDay(int no) {
        Date now = new Date();
        SimpleDateFormat dateFormat;
        // Setting the date in MMMM format
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.DAY_OF_YEAR, no);
        Date reqDate = cal.getTime();
        // Setting the date in MMMM format
        dateFormat = new SimpleDateFormat("EEE d");
        return dateFormat.format(reqDate).toUpperCase();

    }

    public String getDayandFutureDayIos(int no) {
        Date now = new Date();
        SimpleDateFormat dateFormat;
        // Setting the date in MMMM format
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.DAY_OF_YEAR, no);
        Date reqDate = cal.getTime();
        // Setting the date in MMMM format
        dateFormat = new SimpleDateFormat("EEE dd");
        return dateFormat.format(reqDate).toUpperCase();

    }

    public static int setGenerateTwoDigitsRandomNumber() {
        int min = 10;
        int max = 20;
        return (int) (Math.random() * (max - min + 1) + min);
    }
    
    public static String apiEnv() {
        return System.getProperty("env");
    }
    
    private static final String PASSWORD_FILE = System.getProperty("user.dir") + "/src/main/resources/pw_store.txt";

    /**
     * Reads the current password from file and generates a new one.
     * @return A map with keys: OLD (current password), NEW (newly generated password)
     * @throws IOException if reading the file fails
     */
    public static String getOldPassword() throws IOException {
        Map<String, String> allPasswords = readPasswordsFromFile();
        String env = Common.apiEnv();
        return allPasswords.getOrDefault(env, "");
    }

    public static String getNewPassword() {
    	String env = capitalizeFirstLetter(Common.apiEnv());
        String timestamp = new SimpleDateFormat("MMddHHmm").format(new Date());
        return env + "@" + timestamp;
    }
    
    public static String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    public static void updatePasswordFile(String newPassword) throws IOException {
    	String env = Common.apiEnv();
        Map<String, String> allPasswords = readPasswordsFromFile();
        allPasswords.put(env, newPassword); // Update only current env password
        writePasswordsToFile(allPasswords);
    }

    private static Map<String, String> readPasswordsFromFile() throws IOException {
        Map<String, String> passwords = new HashMap<>();
        Path path = Paths.get(PASSWORD_FILE);
        if (!Files.exists(path)) return passwords;

        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            String[] parts = line.split("=", 2);
            if (parts.length == 2) {
                passwords.put(parts[0].trim(), parts[1].trim());
            }
        }
        return passwords;
    }

    private static void writePasswordsToFile(Map<String, String> passwords) throws IOException {
        List<String> lines = new ArrayList<>();
        for (Map.Entry<String, String> entry : passwords.entrySet()) {
            lines.add(entry.getKey() + "=" + entry.getValue());
        }
        Files.write(Paths.get(PASSWORD_FILE), lines);
    }

	public String getDateAndDayIOS() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE d MMMM");
		return dateFormat.format(date);
	}
}

# SauceDemo Automation

🚀 Automated test framework built with:
- Java
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager

## 📂 Structure
- **BaseTest.java** – sets up and tears down the browser
- **LoginTest.java** – sample test to open https://www.saucedemo.com/

## ▶️ How to run
1. Clone the repo
2. Install dependencies: `mvn clean install`
3. Run tests: `mvn test`

## 📌 Notes
- More tests and features coming soon!

# SauceDemo Automation Framework

🚀 Selenium automation framework for testing the [SauceDemo](https://www.saucedemo.com/) website, built using Java, TestNG, and Maven.

---

## 📌 **Current Status (Day 3):**
✅ Configured project structure using Maven  
✅ Implemented Page Object Model (POM) design  
✅ Added automated test cases:
- Valid login test using `@Parameters` (testng.xml)
- Data-driven login test using `@DataProvider`
- Add item to cart test
- Logout test

✅ Used TestNG annotations: `@BeforeMethod`, `@AfterMethod`  
✅ Added waits inside page objects for better stability

---

## 📦 **Project Structure**

# 📊 Day 4 – Added ExtentReports to SauceDemo automation framework

## ✅ What was done:
- Integrated **ExtentReports** for detailed HTML reports.
- Created utility: `utils/ExtentManager.java` to manage report instance.
- Updated `base.java` and `login.java` to create tests & log steps into the report.

---

## 📦 New file:



✅ Test Cases
- Login with valid credentials
- Add item to cart
- Logout and verify login page

## 🏗 Framework
- Uses Page Object Model (POM)

# Day 5: Automated Testing Enhancements – Screenshot on Failure

## ✅ What was done
- Added `ScreenshotUtils` utility:
  - Captures screenshot on test failure
  - Names screenshots with test name & timestamp
  - Saves to `screenshots/` folder
- Updated `@AfterMethod` in base/test class:
  - Detects test result status (`ITestResult`)
  - If failed: takes screenshot and attaches to ExtentReport
  - Logs pass, fail, or skip automatically
- Committed & pushed changes to GitHub after resolving merge with `git pull`

---

## 📦 **Key classes & methods**
- `utils/ScreenshotUtils.java`  
  → static method `takeScreenshot(WebDriver, testName)`
- `@AfterMethod` in base/test class  
  → automatically logs actual test result (no manual test.pass/fail needed)

---

## 🧠 **Why this matters**
- Automatic screenshots help debugging failures
- Makes ExtentReports professional & clear
- Keeps console, reports & screenshots always in sync

---

## 🛠 **Tools & Libraries**
- Selenium Java
- TestNG
- ExtentReports
- Apache Commons IO (`FileUtils`)

---
Day 6 (Jenkins Setup): CI for SauceDemo Automation
🛠 Project:
SauceDemo automation framework using:

Java + Selenium + TestNG

Maven

ExtentReports

Jenkins for CI

✅ What was done on Day 6 (Jenkins)
We set up Jenkins to run our test automation automatically every day and show reports.

Steps done:

1️⃣ Installed Jenkins (locally):

Downloaded from jenkins.io

Started Jenkins locally

Installed suggested plugins on first setup

2️⃣ Created a Freestyle Job in Jenkins:

Job name: SauceDemo-Automation

Configured:

Build trigger: set to build daily (e.g., using cron H 9 * * * → every day at 9 AM)

Clicking the link opens the ExtentReport in browser:

Shows passed / failed tests, duration, details, exceptions.
  


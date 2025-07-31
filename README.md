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


✅ Test Cases
- Login with valid credentials
- Add item to cart
- Logout and verify login page

## 🏗 Framework
- Uses Page Object Model (POM)

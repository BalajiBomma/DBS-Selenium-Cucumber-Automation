# DBS Website Selenium Cucumber Automation Project

This is a real-time Selenium automation project for testing the **DBS Bank website** using Java, Selenium WebDriver, Cucumber (BDD), and JUnit.

## 📌 Features Covered

- Launch DBS Bank homepage
- Select market as India
- Navigate to Personal Banking
- Click on "Learn More" under Personal Banking
- Validate Customer Services and Contact Page

## 🛠️ Tech Stack

- **Language**: Java
- **Framework**: Cucumber BDD with JUnit
- **Browser**: Chrome
- **Automation Tool**: Selenium WebDriver
- **Build Tool**: Maven
- **Reports**: Cucumber HTML and JSON reports
- **IDE**: IntelliJ IDEA

## 📂 Project Structure
src/
├── main/
│ └── java/
│ └── com/balaji/utils/DriverManager.java
├── test/
│ └── java/
│ ├── Runner/TestRunner.java
│ ├── Steps/BaseClass.java
│ ├── Steps/launchSteps.java
│ └── com/balaji/hooks/Hooks.java
│ └── features/Launch.feature

## ✅ How to Run the Project

1. Clone the repository
2. Make sure you have Java, Maven, and ChromeDriver set up
3. Run the following command:
4. Reports will be generated inside:
- `target/cucumber-reports/CucumberHTML.htm`
- `target/cucumber-reports/Cucumber.json`

## 📸 Screenshots

Screenshots of failures are saved under the `screenshots/` folder if any step fails.

## 🧠 Author

**Balaji Bomma**  
Automation Tester | Java | Selenium | Cucumber  
📧 balajibomma190@gmail.com   
🌐 GitHub: [BalajiBomma](https://github.com/BalajiBomma)



```bash
git add README.md
git commit -m "Added detailed project README"
git push


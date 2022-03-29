# <span style="color:blue;">***YourLogoApp Selenium Automation***</span>

YourLogo shopping site, using Java, Selenium, POM, TestNG, Cucumber, Singleton, dependency injection and Cucumber reports.

Note: Test results may vary as the website might tends to change a lot.

Author: Vijayalakshmi Date: 28/03/2022

Last updated: 28/03/2022

#Component details implemented with below modules

Cucumber -  we are moving towards BDD framework to reduce the gap between technical and non-technical. Please refer to [HomePage.feature](https://github.com/AutomationCoding/AutomationPractice-TechChallennge/blob/8f64c8546c533a65f173cf9af37e0ef658a963f9/AutomationPractice/src/test/resources/features/HomePage/HomePage.feature)

TestNG So many questions around it, why TestNg? if already having a cucumber. My simple answer is TestNg helps to run the test cases in parallel. So I have used to run the test cases in parallel.
Extent Report It provides a simple HTML report - You can see the sample HTML report in the Output folder.
Selenium I believe I don't have to say any thing related to it.
#Folder structure

Output Contains output reports, and and also screen shots.
Resource Contains configuration files, and also browser drivers.
Testdata Contains both master and project files. I have created a two layer of test data sheets. it helps to manage the test data input sheets for multiple environments.

**Testing notes**

Code was implemented using Eclipse IDE. Programming Language: Java (Java 8 is being used.) Selenium is used for automation actions. Page Object Model and Page Factory has been using as part of Selenium approach. Chosen web browser: Chrome (chromedriver.exe used to communicate with Selenium.) Created using a BDD approach in order to better understanding of all parties included. Achieved using Cucumber. To manage dependencies, build and run it MAVEN project was implemented. TestNG is implemented in order to run the BDD approach. Extent reports is used for reporting purposes. Page Object Model is used to separate locators per page and code re utilization.

**How to install and run the project (Windows)**

Download Java a. C:\Program Files\Java\jdk1.8.0_181 b. Edit Windows environment variables, JAVA_HOME: C:\Program Files\Java\jdk1.8.0_181 c. Edit Windows environment variables, Path: C:\Program Files\Java\jdk1.8.0_181\bin d. Check JRE: java -version in CMD e. Check JDK: javac -version in CMD
Download MAVEN a. C:\Libs\apache-maven-3.5.4 b. Edit Windows environment variables, Maven document states add M2_HOME only, but some programs still reference Maven folder with MAVEN_HOME, so, it’s safer to add both: C:\Libs\apache-maven-3.5.4 c. Edit Windows environment variables, Path: C:\Libs\apache-maven-3.5.4\bin d. Check maven: mvn -version in CMD

**How to run**

Execute the CucumberRunner.class present in Runner package of the project.
Reports - Found under ExtentReports folder in the project

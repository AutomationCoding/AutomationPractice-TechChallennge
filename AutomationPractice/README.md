# <span style="color:blue;">***YourLogoApp Selenium Automation***</span>

YourLogo shopping site, using Java, Selenium, POM, TestNG, Cucumber, Singleton, dependency injection and Cucumber reports.

Note: Test results may vary as the website might tends to change a lot.

Author: Vijayalakshmi Date: 28/03/2022

Last updated: 28/03/2022

#Component details implemented with below modules

**Cucumber - ** we are moving towards BDD framework to reduce the gap between technical and non-technical. Please refer to [HomePage.feature](https://github.com/AutomationCoding/AutomationPractice-TechChallennge/blob/8f64c8546c533a65f173cf9af37e0ef658a963f9/AutomationPractice/src/test/resources/features/HomePage/HomePage.feature)

**Extent Report -** Is an open-source, powerful reporting library used for detailed, and visually appealing reports for automation tests. It can integrate with testing frameworks like JUnit, TestNG, etc. Extent reports are HTML-based documents that can carry detailed information about the test executed along with custom logs, screenshots and use a pie chart to represent an overview of the test.
You can see the sample HTML report in the Output folder [ExtentReport](https://github.com/AutomationCoding/AutomationPractice-TechChallennge/blob/260865b0d21a48b4f1d395a79714dec402ff3d20/AutomationPractice/ExtentReport/ExtentHtml.html)

**Selenium Framework -**  is a suite of automation testing tools that is based on the JavaScript framework. It could run the tests directly on the target browser, drive the interactions on the required web page and rerun them without any manual input. I believe I don't have to say more related to it.

**Page Object Model(POM)** is a design pattern in Selenium that creates an object repository for storing all web elements. It is useful in reducing code duplication and improves test case maintenance.
In Page Object Model, consider each web page of an application as a class file. Each class file will contain only corresponding web page elements. Using these elements, testers can perform operations on the website under test.
**Advantages**
1. Helps with easy maintenance
2. Helps with reusing code: 
3. Readability and Reliability of scripts

**Testing notes**

Code was implemented using Eclipse IDE. Programming Language: Java (Java 8 is being used.) Selenium is used for automation actions. Page Object Model and Page Factory has been using as part of Selenium approach. Chosen web browser: Chrome (chromedriver.exe used to communicate with Selenium.) Created using a BDD approach in order to better understanding of all parties included. Achieved using Cucumber. To manage dependencies, build and run it MAVEN project was implemented. TestNG is implemented in order to run the BDD approach. Extent reports is used for reporting purposes. Page Object Model is used to separate locators per page and code re utilization.

**How to install and run the project (Windows)**

Download Java a. C:\Program Files\Java\jdk1.8.0_181 b. Edit Windows environment variables, JAVA_HOME: C:\Program Files\Java\jdk1.8.0_181 c. Edit Windows environment variables, Path: C:\Program Files\Java\jdk1.8.0_181\bin d. Check JRE: java -version in CMD e. Check JDK: javac -version in CMD
Download MAVEN a. C:\Libs\apache-maven-3.5.4 b. Edit Windows environment variables, Maven document states add M2_HOME only, but some programs still reference Maven folder with MAVEN_HOME, so, it???s safer to add both: C:\Libs\apache-maven-3.5.4 c. Edit Windows environment variables, Path: C:\Libs\apache-maven-3.5.4\bin d. Check maven: mvn -version in CMD

**How to run**

Execute the CucumberRunner.class present in Runner package of the project.
Reports - Found under ExtentReports folder in the project

Output Contains output reports and and also screen shots. [Output Folder](https://github.com/AutomationCoding/AutomationPractice-TechChallennge/tree/main/AutomationPractice/ExtentReport)
Resource Contains configuration files, and also browser drivers. [Resource Folder](https://github.com/AutomationCoding/AutomationPractice-TechChallennge/tree/main/AutomationPractice/src/test/resources)

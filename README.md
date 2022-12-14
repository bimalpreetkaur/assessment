# Assessment task

## Problem:

Automate below mentioned test scenario:

Verify that a pre-registered user (with valid email and password) is able to log into the application successfully.

## Solution

Automated test script which opens the application URL and log in the user using email id and password.
POM Based Page object model Selenium Automation Framework is used to create the test script.

(All manual test scenarios are placed under test_scenarios folder)

## Prerequisities

- Java
- Selenium
- Maven
- Chrome browser
- MAC/windows operating system
- IDE (any IDE of your choice)

## Project explaination
1. Object Repository:
UIMap is a concept for defining, storing, and serving UI elements of an application or a website. The UIMap properties file contains a set of ‘key-value’ pairs, where key is an alias of the UI element, and a value is the locator.
2. Test Data:
Data set stores the data files, Script reads test data from external data sources and executes test based on it. Data sets increases test coverage by performing testing with various inputs and reduce the number of overall test scripts needed to implement all the test cases.
3. Test Automation Scripts:
A test is considered as a single action or a sequence of actions, that defines whether a specific feature meets functional requirements. It has multiple test files / packages / class files which will be executed based on the configurations defined in testng.xml.
4. Reports / Executed Results:
Test report/results is a document which contains summary of test activities. After execution is completed, it is very important to communicate the test results and findings to the project manager along with the screenshots for failed tests and with that decisions can be made for the release.
6. POM.xml file: In order to maintain the dependencies of the tools used in this framework POM.xml is created.


## Tools Used in this Framework:

1. Selenium :
Selenium is a well know open source testing framework, which is widely used for testing Web-based applications. Selenium Webdriver supports most of all browsers to run your test cases and many programming languages like C#, Java, Python, Ruby, .Net, Perl, PHP, etc. to create and modify your test scripts.

2. Eclipse IDE:
Eclipse is an integrated development environment (IDE) for Java. The Eclipse IDE is the most known product of the Eclipse Open Source project.

3. Java:
Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. 

4. TestNG:
TestNG is an automation testing framework in which NG stands for “Next Generation”. The design goal of TestNG is to cover a wider range of test categories: unit, functional, end-to-end, integration, etc., with more powerful and easy-to-use functionalities.

5. Maven:
Maven is a build automation tool used primarily for Java projects. Maven can also be used to build and manage projects written in C#, Ruby, Scala, and other languages. 

6. Log4j:
Log4j is a fast, reliable and flexible logging framework which is written in java. It is an open-source logging API for java. Simply the logging means some way to indicate the state of the system at runtime. Logs are used to capture and persists the important data and make it available for analysis at any point in time.

## File Formats Used in the Framework:
1. properties file – We use properties file to store and retrieve data.
2. java file – Is used to create and execute test classes as test scripts.
3. xml file - Is used to maintain dependencies.

## Usage:

Prerequisites :-
You should have Java and IDE installed in your machine and Internet Connectivity.

- Clone the Repository (got clone https://github.com/bimalpreetkaur/assessment.git).
- Open IDE.
- Click on the File menu.
- Select Open Projects from file System.
- Click on directory.
- Locate the project.
- Click on finish.

Execute test -

- Go to root directory of the project and build the dependencies and execute test using mvn clean install.

Test Output -

Test Report
- Navigate to the test output folder.
- Navigate to surefire-reports folder.
- Open the index.html file for test output report.

Test Log
- Navigate to Log folder
- Open log4j.log file for test logs.
   
 
# Limitations -

Below mentioned enhancements are not yet implemented in this framework:

TestNG xml file for execution.

Data provider which allows the user to to pass multiple sets of data to the application using excel files.

Apache POI that allows user to create, modify, and display MS Office files using Java programs.

ExtentReports library useful for enhancing the reporting with results as pie charts.

 
       
  

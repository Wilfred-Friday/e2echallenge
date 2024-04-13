# Automated Test Solution with Selenium, Maven, and Cucumber

# Overview
This project provides an automated test solution using Selenium, Maven, and Cucumber with Java. It aims to provide a robust and scalable test framework for web application testing.
# Prerequisites
* Java JDK (8 or above)
* Maven
* Git
# Installation
Clone the Repository
git clone https://github.com/Wilfred-Friday/e2echallenge.git
cd your-repository

# Install Dependencies
Run the following command to install all the necessary dependencies using Maven:
* mvn clean install

# Run All Tests
To run all the tests, execute the following Maven command:
* mvn test

# Run Specific Test
To run a specific Cucumber feature file, use the following command:
* mvn test -Dcucumber.options="src/test/resources/features/feature-name.feature"

# Test Reports
After running the tests, you can find the Cucumber HTML reports in the _**target/cucumber-reports**_ directory. Open index.html in a web browser to view the detailed test reports.


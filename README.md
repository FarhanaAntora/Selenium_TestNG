# Selenium_TestNG
## Prerequisites

1. Install jdk 8 or any LTS version
2. Download and extract Apache Maven 3.8.4 or any latest version
3. Configure JAVA_HOME and MAVEN_HOME
4. Stable internet connection

## How to run this project

1. Clone the repo
2. Open terminal in the root folder
3. Give the following command

```
 gradle clean test
```
```
allure generate allure-results --clean -o allure-report
```
```
allure serve allure-results
```



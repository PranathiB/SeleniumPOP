# Selenium Java Page Object Pattern Boilerplate


This is a sample template that can be used to get a head start with Selenium Java using Page Object Patterns.  This uses Cleartrip website to write a simple login test with invalid credentials.

####Folder Structure:
Test directory has all the necessary sub folders and tests within it.
````
test/pages: contains the classes for the pages
test/controls: contains the UI elements like button, text box to which you can pass the selector and value and get the webelement as the return object.
test/models: contains the data model objects
````
####To use this boilerplate follow the below steps
1. Clone the repo
2.  Run the following command from the project folder 
```
mvn compile
```
```
mvn test
```

The pom.xml has dependencies for chromedriver, htmluntidriver and pantomjs. These drivers can be used by changing the driver instance creation
To run on chrome:
 ```
 mvn test -Dwebdriver.chrome.driver=/path/to/chromedriver
 ```   

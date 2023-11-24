# Implementing LoggerLike log4j

## Description
***

## Functions/Features 

It contains implementation of logger with different design patterns .
1. Should be able to log in more than one place like console, LOg file, database etc.
2. Should be able to log multiple category of messages like INFO, DEBUG, ERROR etc.
3. Category and place of logging should be configurable.

## Components Involved

1. Logger -which will be exposed to the application
2. Category - This should be selected at run time based on parameter.
3. Sink -  This should be selected at run on time based on some parameter. eg where we have to save/show the logs. console, files or databases.

## Pattern Choices
1. For Logger, we will use Singleton
2. For Categories, we will use Chain of responsibility because the value is getting decreased or stricter level by level: INFO->ERROR->DEBUG
3. For Sink , 
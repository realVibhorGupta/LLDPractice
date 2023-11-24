package logger.sink;


import logger.logger.LogObserver;

public class FileLogger implements LogObserver {
    @Override
    public void log(String message) {
        System.out.println("Writing to File " + message);
    }
}
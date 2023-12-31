package logger.category;

import logger.logger.AbstractLogger;
import logger.logger.LoggerSubject;

public class ErrorLogger  extends AbstractLogger {


    public ErrorLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void display(String msg, LoggerSubject loggerSubject) {

        loggerSubject.notifyAllObserver(2,"ERROR : "+msg);
    }
}

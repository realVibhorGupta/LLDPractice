package logger.category;

import logger.logger.AbstractLogger;
import logger.logger.LoggerSubject;

public class DebugLogger extends AbstractLogger {

    DebugLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void display(String msg, LoggerSubject loggerSubject) {

        loggerSubject.notifyAllObserver(1,"DEBUG : "+msg);
    }
}
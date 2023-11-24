package logger.category;

import logger.logger.AbstractLogger;
import logger.logger.LoggerSubject;

public class InfoLogger extends AbstractLogger {

    public InfoLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void display(String msg, LoggerSubject loggerSubject) {

        loggerSubject.notifyAllObserver(1,"INFO : "+msg);
    }
}

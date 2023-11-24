package logger.logger;

public abstract class AbstractLogger {
    //tells the level of The logs
    protected int levels;
    private AbstractLogger nextLevelLogger;

    void setNextLevelLogger(AbstractLogger nextLevelLogger) {
        this.nextLevelLogger = nextLevelLogger;
    }

    void logMessage(int levels, String msg, LoggerSubject loggerSubject){
        if(this.levels==levels){
            display(msg, loggerSubject);
        }

        if (nextLevelLogger!=null) {
            nextLevelLogger.logMessage(levels, msg, loggerSubject);
        }
    }
    protected abstract void display(String msg, LoggerSubject loggerSubject);

}

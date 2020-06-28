package me.nickaburnett.logger;

public enum LogLevel {
    INFO(AnsiColor.GREEN, "INFO"),
    WARN(AnsiColor.YELLOW, "WARN"),
    ERROR(AnsiColor.LIGHT_RED, "ERROR")
    ;
    private final AnsiColor logColor;
    private final String logName;
    LogLevel(final AnsiColor logColor, final String logName) {
        this.logColor = logColor;
        this.logName = logName;
    }
    public AnsiColor getLogColor() {
        return this.logColor;
    }
    public String getLogName() {
        return this.logName;
    }
    public String getLogString() {
        final String logString = AnsiDecor.BOLD.getAnsi() + AnsiColor.GRAY.getForeground() + "[" + this.logColor.getForeground() + this.logName + AnsiColor.GRAY.getForeground() + "]" + AnsiColor.RESET.getForeground() + " " + AnsiColor.LIGHT_GRAY.getForeground();
        return logString;
    }
}

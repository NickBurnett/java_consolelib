package me.nickaburnett.logger;

public class ConsoleLogger {
    public static void main(String[] args) {
        log(LogLevel.INFO, "This is a test of the _0_ module...", AnsiColor.GREEN.getForeground() + AnsiDecor.ITALIC.getAnsi() + AnsiDecor.BOLD.getAnsi() + "Console Logger");
        log(LogLevel.WARN, "This is a test warning log...");
        log(LogLevel.ERROR, "This is a test for the error log level!");
    }
    public static void log(final LogLevel logLevel, final String message, final String... args) {
        String log = message;
        for (int i = 0; i < args.length; i++) {
            log = log.replaceAll("_" + i + "_", args[i] + AnsiColor.RESET.getForeground() + AnsiColor.LIGHT_GRAY.getForeground());
        }
        log = logLevel.getLogString() + log;
        System.out.println(log);
    }
}

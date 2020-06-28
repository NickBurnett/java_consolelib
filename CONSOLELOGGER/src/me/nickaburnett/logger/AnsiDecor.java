package me.nickaburnett.logger;

public enum AnsiDecor {
    BOLD("\u001b[1m"),
    FAINT("\u001b[2m"),
    ITALIC("\u001b[3m"),
    UNDERLINE("\u001b[4m")
    ;
    private String ansi;
    AnsiDecor(final String ansi) {
        this.ansi = ansi;
    }
    public String getAnsi() {
        return this.ansi;
    }
}

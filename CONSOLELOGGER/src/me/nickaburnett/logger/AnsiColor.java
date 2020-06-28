package me.nickaburnett.logger;

/**
 * Represents an Ansi Color.
 *
 * RGB Format is \u001b[38;2;R;G;Bm
 * Background is 48 rather than 38
 */
public enum AnsiColor {
    RESET("\u001b[0m", "\u001b[0m"),
    GREEN("\u001b[38;2;0;255;0m", "\u001b[48;2;0;255;0m"),
    YELLOW("\u001b[38;2;255;255;0m", "\u001b[48;2;255;255;0m"),
    RED("\u001b[38;2;255;0;0m", "\u001b[48;2;255;0;0m"),
    LIGHT_RED("\u001b[38;2;255;60;60m", "\u001b[48;2;255;60;60m"),
    LIGHT_GRAY("\u001b[38;2;160;160;160m", "\u001b[48;2;160;160;160m"),
    GRAY("\u001b[38;2;90;90;90m", "\u001b[48;2;90;90;90m")
    ;

    private final String foreground;
    private final String background;
    AnsiColor(final String foreground, final String background) {
        this.foreground = foreground;
        this.background = background;
    }
    public String getForeground() {
        return this.foreground;
    }
    public String getBackground() {
        return this.background;
    }
}

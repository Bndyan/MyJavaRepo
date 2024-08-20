package konsole;
/**
 * Farben in der Konsole
 *
 *
 * https://stackoverrun.com/de/q/1423991
 *
 * https://de.wikipedia.org/wiki/ANSI-Escapesequenz
 * https://en.wikipedia.org/wiki/ANSI_escape_code
 *
 * @author Thomas Freese
 * @version 26.08.2020
 */
public class FarbenKonsole {
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void main(String[] args) {
        System.out.println(ANSI_CYAN_BACKGROUND + "This text has a cyan background but default text!" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "This text has blue text but a default background!" + ANSI_RESET);
        System.out.println(ANSI_GREEN_BACKGROUND + ANSI_RED + "This text has a green background and red text!" + ANSI_RESET);
        System.out.println(ANSI_CYAN +   "Background is black und color text ist red" + ANSI_RED);
        System.out.println(ANSI_CYAN_BACKGROUND+"Background is black und color text ist red" + ANSI_RED);

    }
}

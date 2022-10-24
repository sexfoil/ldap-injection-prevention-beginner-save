import java.util.List;

public class FilterHelper {

    private static final List<String> LOGIN_ESCAPED_SYMBOLS = List.of("\\", "#", "+", "<", ">", ",", ";", "\"", "=");

    private static final List<String> SEARCH_ESCAPED_SYMBOLS = List.of("*", "(", ")", "\\", "NUL");


    public static boolean isValidLoginInput(String input) {
        return !input.startsWith(" ") && !input.endsWith(" ")
                && LOGIN_ESCAPED_SYMBOLS.stream().noneMatch(input::contains);
    }


    public static boolean isValidSearchInput(String input) {
        return SEARCH_ESCAPED_SYMBOLS.stream().noneMatch(input::contains);
    }

}

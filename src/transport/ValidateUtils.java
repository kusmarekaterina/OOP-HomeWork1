package transport;

public class ValidateUtils {

    public static String validateString(String value, String defaultValue) {
        return (value == null || value.isEmpty() || value.isBlank() ? defaultValue : value);
    }

    public static Integer validateNum(Integer value, Integer defaultValue) {
        return (value == null || value < 0 ? defaultValue : value);
    }
}


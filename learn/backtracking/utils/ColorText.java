package utils;

import enums.Colors;

public class ColorText {

    public static String colorize(String message, Colors color) {
        return color.getValue() + message + Colors.RESET.getValue();
    }

    public static String removeColorCodes(String str) {
        return str.replaceAll("\u001B\\[[;\\d]*m", "");
    }
}

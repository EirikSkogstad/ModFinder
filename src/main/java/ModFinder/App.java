package ModFinder;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import static ModFinder.Values.*;

public class App
{
    public static void main(String[] args) {
        String option = args[0];
        String optionClipboard = OPTION_CLIPBOARD;

        switch (option) {
            case OPTION_CLIPBOARD:
                openFromClipboard();
                break;
            case OPTION_PATH:
                openFromPathString(args[1]);
                break;
            default:
                System.exit(0);
                break;
        }
    }

    private static void openFromClipboard() {
        String clipboardString = getStringFromClipboard();
        ModListParser modListParser = new ModListParser(clipboardString);
    }

    private static String getStringFromClipboard() {
        try {
            return (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        } catch (UnsupportedFlavorException | IOException e) {
            System.exit(0);
        }
        return "";
    }

    private static void openFromPathString(String path) {

    }
}

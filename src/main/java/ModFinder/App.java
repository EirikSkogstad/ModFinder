package ModFinder;

import java.net.URI;
import java.util.List;

import static ModFinder.Values.*;

public class App
{
    public static void main(String[] args) {
        String option = args[0];

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
        String clipboardString = DesktopHandler.getStringFromClipboard();
        ModListParser modListParser = new ModListParser(clipboardString);
        List<Mod> mods = modListParser.getMods();

        mods.stream()
                .map(Mod::getNexusmodsURI)
                .map(URI::create)
                .forEach(DesktopHandler::openWebPage);
        System.exit(0);
    }



    private static void openFromPathString(String path) {

    }
}

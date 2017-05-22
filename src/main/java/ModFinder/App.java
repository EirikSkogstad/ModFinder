package ModFinder;

import java.net.URI;
import java.util.List;

import static ModFinder.Values.*;

public class App
{
    private static String game;
    public static void main(String[] args) {
        String option = args[0];
        game = args[1];

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
        ModListParser modListParser = new ModListParser(clipboardString, game);
        List<Mod> mods = modListParser.getMods();

        for (Mod mod : mods) {
            String nexusUrl = mod.getNexusUrl();
            URI uri = URI.create(nexusUrl);
            DesktopHandler.openWebPage(uri);
        }
        System.exit(0);
    }



    private static void openFromPathString(String path) {

    }
}

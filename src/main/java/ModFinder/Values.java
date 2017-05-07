package ModFinder;

import java.util.Arrays;
import java.util.HashSet;

public class Values
{
    public static final String OPTION_CLIPBOARD = "-clipboard";
    public static final String OPTION_PATH = "-path";
    public static final String SEPARATOR_CHAR = ",";
    public static final String NEXUS_URL = "http://www.nexusmods.com";
    public static final String MOD_ID = "mod_id";
    public static final String MOD_INSTALLED_NAME = "mod_installed_name";
    public static final String LINE_BREAK = "\n";
    public static final HashSet<String> NEXUS_GAMES_URL = new HashSet<>(Arrays.asList(
            "skyrim",
            "skyrimspecialedition",
            "fallout4",
            "newvegas"
    ));

    private Values() {
        // No need for a constructor here.
    }
}

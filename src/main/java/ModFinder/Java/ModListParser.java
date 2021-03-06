package ModFinder.Java;

import ModFinder.Mod;

import java.util.ArrayList;
import java.util.List;

import static ModFinder.Java.Values.MOD_ID;
import static ModFinder.Java.Values.MOD_INSTALLED_NAME;
import static ModFinder.Java.Values.SEPARATOR_CHAR;

public class ModListParser
{
    private CSVFormat csvFormat;
    private List<Mod> mods;
    private String game;

    public ModListParser(String rawData, String game) {
        this.game = game;
        initializeParser(rawData);
    }

    private void initializeParser(String rawData) {
        validateInput(rawData);
        String[] lines = getLinesFromString(rawData);
        csvFormat = new CSVFormat(lines[0]);
        parseMods(lines);
    }

    private void validateInput(String input) {
        //TODO validate input better.
    }

    private void parseMods(String[] lines) {
        mods = new ArrayList<>();
        int modNameIndex = csvFormat.getColumnNumber(MOD_INSTALLED_NAME);
        int modIdIndex = csvFormat.getColumnNumber(MOD_ID);

        // From 1 since we don't need the format line.
        for (int i = 1; i < lines.length; i++) {
            String line = lines[i];
            String[] modValues = line.split(SEPARATOR_CHAR);
            Mod mod = new Mod(
                    Integer.parseInt(modValues[modIdIndex]),
                    game,
                    modValues[modNameIndex]
            );
            mods.add(mod);
        }
    }

    private String[] getLinesFromString(String string) {
        return string.split(Values.LINE_BREAK);
    }

    public List<Mod> getMods() {
        return mods;
    }
}

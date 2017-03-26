package ModFinder;

import java.util.List;

public class ModListParser
{
    private CSVFormat csvFormat;
    private List<Mod> mods;

    public ModListParser(String rawData) {
        initializeParser(rawData);
    }

    private void initializeParser(String rawData) {
        validateInput(rawData);
        String[] lines = getLinesFromString(rawData);
        csvFormat = new CSVFormat(lines[0]);
        parseMods(lines);
    }

    private void validateInput(String input) {

    }


    private void parseMods(String[] lines) {

    }

    private String[] getLinesFromString(String string) {
        String[] split = string.split(System.lineSeparator());
    }

    public List<Mod> void getMods() {

    }
}

package ModFinder;

import java.util.HashMap;
import java.util.Optional;

import static ModFinder.Values.*;

public class CSVFormat
{
    private HashMap<String, Integer> columnTitles;

    public CSVFormat(String formatLineString) {
        columnTitles = new HashMap<>();
        analyzeFormat(formatLineString);
    }

    private void analyzeFormat(String formatLineString) {
        String[] columnTitles = formatLineString.split(SEPARATOR_CHAR);

        for (int i = 0; i < columnTitles.length; i++) {
            String columnTitle = columnTitles[i];
            this.columnTitles.put(columnTitle, i);
        }
    }

    public Integer getColumnNumber(String columnTitle) {
        return columnTitles.get(columnTitle);
    }
}

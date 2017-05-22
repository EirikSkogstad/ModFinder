package ModFinder;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Access NEXUS webpage and fetch URL for mod download.
 */
public class WebPageReader
{
    private int numberOfConcurrentDownloads = 4;

    public static String getFirstDownload(String nexusUrl) {
        try {
            nexusUrl += "?tab=2";
            Document document = Jsoup.connect(nexusUrl).get();
            Elements downloadPopboxes = document.getElementsByTag("a");
            ArrayList<String> modDownloadUrls = new ArrayList<>();
            for (Element element : downloadPopboxes) {
                // Blank attribute only present on manual download <a>
                modDownloadUrls.add(
                        element.getElementsByAttributeValue("target", "_blank").attr("href")
                );
            }


            System.out.println("");
        } catch (IOException e) {
        }


        return "";
    }

    public static void main(String[] args) {
        getFirstDownload("http://www.nexusmods.com/skyrim/mods/83559/");
    }
}

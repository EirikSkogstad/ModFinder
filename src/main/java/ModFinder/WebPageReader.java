package ModFinder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Access NEXUS webpage and fetch URL for mod download.
 */
public class WebPageReader
{
    private final String nexusUrl;
    private ArrayList downloadURLS;

    public WebPageReader(String nexusUrl) throws IOException {
        nexusUrl = nexusUrl + "?tab=2";
        this.nexusUrl = nexusUrl + "&navtag=http://www.nexusmods.com/skyrim/ajax/modfiles/?id=83443&pUp=1";
        fetchHtml();
    }

    private void fetchHtml() throws IOException {
        String html = Jsoup.connect(nexusUrl).userAgent("Mozilla").get().html();
        Document document = Jsoup.parse(html);

        Elements select = document.select(".popbox");
        System.out.println(html.toString());
        for (Element element : select) {
            System.out.println(element.toString());
            Element a = element.getElementsByTag("a").first();
            //System.out.println(a);
        }
        downloadURLS = new ArrayList<>();
    }

    public List<URL> getDownloadUrls() {
        throw new NullPointerException();
    }

    public static void main(String[] args) throws IOException {
        String rawUrl = "http://www.nexusmods.com/skyrim/mods/83443";
        String processedUrl = "http://www.nexusmods.com/skyrim/mods/83443?tab=2&navtag=http://www.nexusmods.com/skyrim/ajax/modfiles/?id=83443&pUp=1";
        WebPageReader webPageReader = new WebPageReader(processedUrl);
    }
}

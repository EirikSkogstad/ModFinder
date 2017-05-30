package Kotlin

class WebPageReader(val nexusUrl: String) {
    init {
        val connection = org.jsoup.Jsoup.connect(nexusUrl)
    }

    private fun fetchHtml() {
        val html = org.jsoup.Jsoup.connect(nexusUrl).userAgent("Mozilla").get().html()
        val document = org.jsoup.Jsoup.parse(html)

        val select = document.select(".popbox")
        println(html.toString())
        for (element in select) {
            println(element.toString())
            val a = element.getElementsByTag("a").first()
            //System.out.println(a);
        }
        val downloadURLS: List<String> = listOf()
    }
}
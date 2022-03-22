package src;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import src.Cryptocurrency;

public class WebScrape {
    public static void main(String[] args) {
        Cryptocurrency[] cry;
        int n = 0;

        String url = "https://coinmarketcap.com/";

        try {
            Document document = Jsoup.connect(url).get();

            Element table = document.select("table[class=h7vnx2-2 czTsgW cmc-table]").first();

            String title = document.title();
            System.out.println("Page title: " + title);

            for (Element element : table.select("tr")) {
                for (Element td : element.select("td")) {
                    cry[n].setpos(td.text());
                    cry[n].setname(td.text());
                    cry[n].setprice(td.text());
                    cry[n].setdayP(td.text());
                    cry[n].setmonthP(td.text());
                    cry[n].setmarketcap(td.text());
                    cry[n].setvolume24h(td.text());
                    cry[n].setcirculatingvol(td.text());
                    n++;
                }
            }
        } catch (IOException ex) {
            System.out.println("The error is: " + ex.getMessage());
        }
        
    }return cry;
}
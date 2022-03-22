package src;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WebScrape 
{
    public static void main(String[] args) 
    {
        String url = "https://coinmarketcap.com/";        
        try 
        {
            Document document = Jsoup.connect(url).get();
            
            Element table = document.select("table[class=h7vnx2-2 czTsgW cmc-table]").first();
            
            String title = document.title();
            System.out.println("Page title: " + title);

            for (Element element:table.select("tr"))
            {
                for (Element td:element.select("td"))
                {
                    System.out.println(td.text());
                }
            }
        }
        catch (IOException ex) 
        {
            System.out.println("The error is: " + ex.getMessage());
        }
    }    
}
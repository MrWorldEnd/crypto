import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class WebScrape {
    public static void main(String[] args) {
        String url = "https://sharestobeclosed.telegraph.co.uk/indices/financials/index/MCX";
        
        try {
            Document document = Jsoup.connect(url).get();
            
            String title = document.title();
            System.out.println("Page title: " + title);

            System.out.println(document.body());
        }
        catch (IOException ex) {
            System.out.println("The error is: " + ex.getMessage());
        }
        
    }
    
}
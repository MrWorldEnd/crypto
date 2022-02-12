package src;

import javax.inject.Named;
import javax.enterprise.context.RequestScooped;

/**
 *
 * @author st1259
 */

@Named(value = "newJSFManagedBean")
@RequestScooped
public class NewJSFManagedBean {
    public NewJSFManagedBean() {
    }
    public String getCrypto(CryptoMarket market){
        String plint;
        Cryptocurrency[] tmparr = market.getCryptocoins();
        int x = 0;
    
        while(tmparr.length > x){
            System.out.println(tmparr[x].getl());
            x++;
        }
        return plint;
    }
}

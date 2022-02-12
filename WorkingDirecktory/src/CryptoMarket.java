package src;

public class CryptoMarket{
    Cryptocurrency []coins;
    long marketcap;
    long dayvolume;

    public Cryptocurrency[] getCryptocoins(){return this.coins;}
    public long getmarketcap(){return this.marketcap;}
    public long getdayvolume(){return this.dayvolume;}
}
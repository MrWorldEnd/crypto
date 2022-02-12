package src;

public class Cryptocurrency {
    private String name;
    private String prefix;
    private double price;
    private double weekPchang;
    private double dayPchange;
    private double monthPchange;
    private double yearPchange;
    private long marketcap;
    private long volume;

    public String getname() {return this.name;}
    public String getprefix() {return this.prefix;}

    public double getprice() {return this.price;}
    public double getdayP() {return this.dayPchange;}
    public double getweekP() {return this.weekPchang;}
    public double getmonthP() {return this.monthPchange;}
    public double getyearP() {return this.yearPchange;}


    public long getmarketcap() {return this.marketcap;}
    public long getvolume() {return this.volume;}

}
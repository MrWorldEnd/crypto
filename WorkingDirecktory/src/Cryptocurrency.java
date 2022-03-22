package src;

public class Cryptocurrency {
    private int position;
    private String name;
    private String prefix;
    private double price;
    private double weekPchang;
    private double dayPchange;
    private double monthPchange;
    private double yearPchange;
    private long marketcap;
    private long volume;
    private long volume24h;
    private String circulatingvolume;

    public long getvolume24h() {
        return volume24h;
    }

    public void setvolume24h(long x) {
        volume24h = x;
    }

    public int getpos() {
        return this.position;
    }

    public void setpos(int x) {
        position = x;
    }

    public String getname() {
        return this.name;
    }

    public void setname(String name) {
        name = x;
    }

    public String getprefix() {
        return this.prefix;
    }

    public void setprifix(String x) {
        prefix = x;
    }

    public double getprice() {
        return this.price;
    }

    public void setprice(double x) {
        price = x;
    }

    public double getdayP() {
        return this.dayPchange;
    }

    public setdayP(double x) {
        dayPchange = x;
    }

    public double getweekP() {
        return this.weekPchang;
    }

    public void setweekp(double x) {
        weekPchang = x;
    }

    public double getmonthP() {
        return this.monthPchange;
    }

    public double setmonthP(double x) {
        monthPchange = x;
    }

    public double getyearP() {
        return this.yearPchange;
    }

    public void setyearP(double x) {
        yearPchange = x;
    }

    public long getmarketcap() {
        return this.marketcap;
    }

    public void setmarketcap(long x) {
        marketcap = x;
    }

    public long getvolume() {
        return this.volume;
    }

    public void setvolume(long x) {
        volume = x;
    }

    public String getcircirculatingvolume() {
        return circulatingvolume;
    }

    public void setcirculatingvol(String x) {
        circulatingvolume = x;
    };

    public String getl() {
        String div = "</td><td>";
        return "<td>" + this.name + div + this.prefix + div + this.price + div + this.dayPchange + div + this.weekPchang
                + "</td>";
    }
}

package adx.audioxd.ura2;

public class Izpis {
    private String tekst;

    public Izpis(String tekst) {
        this.tekst = tekst;
    }

    public void print() {
        System.out.println(this.tekst);
    }

    public void prilepi(String ekstra) {
        this.tekst += ekstra;
    }
}

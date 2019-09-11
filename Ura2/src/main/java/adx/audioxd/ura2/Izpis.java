package adx.audioxd.ura2;

public class Izpis {
    public static void main(String... args) {

    }

    // ---------------------- //
    //   CLASS
    // ---------------------- //

    private String tekst;

    public Izpis(String tekst) {
        this.tekst = tekst;
    }

    public void print() {
        System.out.println(this.tekst);
    }
}

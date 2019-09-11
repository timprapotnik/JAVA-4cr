package adx.audioxd.ura2;


/**
 * Napiši program Naloga_2_Pozdrav, ki izpiše: "Uspeh ni naklučen!" in "To je SERŠ!". Ta
 * program mora imeti poseben razred izpis tekstov na ekran
 */
public class Main {
    public static void main(String... args) {
        Izpis iz = new Izpis("Uspeh ni naklučen!");
        Izpis iz2 = new Izpis("To je SERŠ!");

        iz.print();
        iz2.print();
    }
}

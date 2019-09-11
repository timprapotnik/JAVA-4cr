package adx.audioxd.ura2;


/**
 * 1. Na USB namesti okolje Eclipse
 * 2. V zvezek zapiši program Naloga 1
 * 3. V zvezek zapiši program Naloga 2
 * <p>
 * Naloge:
 * 1. Napiši program ki izpiše "Uspeh ni naklučen!"
 * 2. Napiši program Naloga_2_Pozdrav, ki izpiše: "Uspeh ni naklučen!" in "To je SERŠ!". Ta
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

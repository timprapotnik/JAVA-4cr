package adx.audioxd.ura4;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        System.out.println("Vnesi 5 števil: ");

        Scanner input = new Scanner(System.in);
        int single = 0, duble = 0, multi = 0;
        for (int i = 0; i < 5; i++) {
            int n = input.nextInt();
            if (n < 10 && n > -10) {
                single++;
            } else if (n < 100 && n > -100) {
                duble++;
            } else {
                multi++;
            }
        }
        System.out.println("Enomestnih je: " + single + ", Dvomestnih je: " + duble + ", Večmestnih pa: " + multi);
    }
}

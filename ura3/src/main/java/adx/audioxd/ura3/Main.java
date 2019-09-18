package adx.audioxd.ura3;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        System.out.println("Vnesi 5 števil: ");

        Scanner input = new Scanner(System.in);
        int single = 0, multi = 0;
        for (int i = 0; i < 5; i++) {
            int n = input.nextInt();
            if (n <= 9 && n >= -9) {
                single++;
            } else {
                multi++;
            }
        }
        System.out.println("Enomestnih je: " + single + ", Večmestnih pa: " + multi);
    }
}

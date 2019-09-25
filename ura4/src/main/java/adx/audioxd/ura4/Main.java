package adx.audioxd.ura4;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        System.out.print("Vnesi celo število: ");
        System.out.flush();

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int decimals = 1;
        while((number = number/10) != 0) {
            decimals ++;
        }

        System.out.println("Decimalk je: " + decimals);

        switch(decimals) {
            case 1: System.out.println("Število je enomestno"); break;
            case 2: System.out.println("Število je dvomestno"); break;
            case 3: System.out.println("Število je tromestno"); break;
            default: System.out.println("Število je večmestno"); break;
        }
    }
}

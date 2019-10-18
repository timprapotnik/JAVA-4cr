package adx.audioxd.ura5;

import java.util.Scanner;

public class Main {
    public static class Animal {
        public Animal() {
        }

        public void talk() {
            System.out.println("Grrr");
        }

        public void walk() {
            System.out.println("I'm walking");
        }
    }

    public static class Dog extends Animal {
        @Override
        public void talk() {
            System.out.println("Woff Woff");
        }
    }

    public static class Cat extends Animal {
        @Override
        public void talk() {
            System.out.println("Meow Meow");
        }
    }

    public static class Fox extends Animal {
        @Override
        public void talk() {
            System.out.println("Ra-ta-ta-ta-ta-ta-ta");
        }
    }


    public static void main(String... args) {
        Animal[] animals = new Animal[]{
                new Animal(),
                new Dog(),
                new Cat(),
                new Fox()
        };

        for (Animal a : animals) {
            a.talk();
        }
    }
}

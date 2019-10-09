package adx.audioxd.ura4;

import java.util.Scanner;

public class Main {
    // Enchantment
    public static interface IEnchantmentInfo {
        String getName();

        String getDisplayName();

        int getMaxLvl();

        default boolean hasLevel() {
            return getMaxLvl() != 1;
        }
    }
    public static class EnchantmentInfo implements IEnchantmentInfo {
        private final String name;
        private final int maxLvl;

        public EnchantmentInfo(String name, int maxLvl) {
            this.name = name;
            this.maxLvl = maxLvl;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getMaxLvl() {
            return maxLvl;
        }

        @Override
        public String getDisplayName() {
            return name;
        }
    }

    public static interface IEnchantment {
        IEnchantmentInfo getInfo();

        // TODO events
    }
    public static class Enchantment implements IEnchantment {
        private final EnchantmentInfo info;

        public Enchantment(EnchantmentInfo info) {
            this.info = info;
        }

        @Override()
        public EnchantmentInfo getInfo() {
            return info;
        }
    }

    //
    public static interface IEnchanted {
        int getLvl();

        IEnchantment getEnchantment();
    }
    public static class Enchanted implements IEnchanted {
        private final int lvl;
        private final IEnchantment enchantment;

        public Enchanted(int lvl, IEnchantment enchantment) {
            this.lvl = lvl;
            this.enchantment = enchantment;
        }

        @Override
        public int getLvl() {
            return lvl;
        }

        @Override
        public IEnchantment getEnchantment() {
            return enchantment;
        }
    }


    //
    public static interface CanEnchant {
    }  // boolean canEnchant();

    public static class CanEnchantBuilder {
    }


    // Event system
    public static enum Priority {}

    public static interface Listener {
    }

    public static interface Executer {
    }

    public static class EventListener {
    }

    public static class EventList {
    }

    public static class EventBus {
    }


    public static void main(String... args) {
        System.out.print("Vnesi celo število: ");
        System.out.flush();

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        System.out.println("Število je" + (number % 2 == 0 ? "Sodo" : "Loho"));

        int decimals = 1;
        while ((number = number / 10) != 0) {
            decimals++;
        }

        System.out.println("Decimalk je: " + decimals);

        switch (decimals) {
            case 1:
                System.out.println("Število je enomestno");
                break;
            case 2:
                System.out.println("Število je dvomestno");
                break;
            case 3:
                System.out.println("Število je tromestno");
                break;
            default:
                System.out.println("Število je večmestno");
                break;
        }
    }
}

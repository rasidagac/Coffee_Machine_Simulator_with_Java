package machine;

public class Espresso implements CoffeeType {
    public int getWater() {
        return 250;
    }

    public int getMilk() {
        return 0;
    }

    public int getCoffeeBeans() {
        return 16;
    }

    public int getPrice() {
        return 4;
    }
}
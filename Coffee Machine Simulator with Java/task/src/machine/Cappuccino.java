package machine;

public class Cappuccino implements CoffeeType {
    public int getWater() {
        return 200;
    }

    public int getMilk() {
        return 100;
    }

    public int getCoffeeBeans() {
        return 12;
    }

    public int getPrice() {
        return 6;
    }
}
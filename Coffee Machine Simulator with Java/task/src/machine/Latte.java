package machine;

public class Latte implements CoffeeType {
    public int getWater() {
        return 350;
    }

    public int getMilk() {
        return 75;
    }

    public int getCoffeeBeans() {
        return 20;
    }

    public int getPrice() {
        return 7;
    }
}
package machine;

public class CoffeeMachine {
    private int water = 400;
    private int milk = 540;
    private int coffeeBeans = 120;
    private int cups = 9;
    private int money = 550;

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        CoffeeMachineController controller = new CoffeeMachineController(coffeeMachine);
        controller.decideAction();
    }

    public void buyCoffee(CoffeeType coffee) {
        if (this.water < coffee.getWater()) {
            System.out.println("Sorry, not enough water!");
        } else if (this.milk < coffee.getMilk()) {
            System.out.println("Sorry, not enough milk!");
        } else if (this.coffeeBeans < coffee.getCoffeeBeans()) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (this.cups < 1) {
            System.out.println("Sorry, not enough disposable cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            makeCoffee(coffee);
        }
        System.out.println();
    }

    private void makeCoffee(CoffeeType coffee) {
        this.water -= coffee.getWater();
        this.milk -= coffee.getMilk();
        this.coffeeBeans -= coffee.getCoffeeBeans();
        this.money += coffee.getPrice();
        this.cups--;
    }

    public void fillIngredients(int water, int milk, int coffeeBeans, int cups) {
        this.water += water;
        this.milk += milk;
        this.coffeeBeans += coffeeBeans;
        this.cups += cups;
    }

    public void takeMoney() {
        System.out.println("I gave you $" + this.money + "\n");
        this.money = 0;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getCups() {
        return cups;
    }

    public int getMoney() {
        return money;
    }
}

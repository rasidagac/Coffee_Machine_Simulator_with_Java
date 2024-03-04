package machine;

import java.util.Scanner;

public class CoffeeMachineController {
    private final CoffeeMachine coffeeMachine;

    public CoffeeMachineController(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void decideAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = scanner.nextLine();
        System.out.println();

        switch (action) {
            case "buy":
                selectTypeOfCoffee();
                decideAction();
                break;
            case "fill":
                fillIngredients();
                decideAction();
                break;
            case "take":
                coffeeMachine.takeMoney();
                decideAction();
                break;
            case "remaining":
                printIngredients();
                decideAction();
                break;
            case "exit":
                break;
        }
    }

    private void selectTypeOfCoffee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String type = scanner.nextLine();

        switch (type) {
            case "1":
                coffeeMachine.buyCoffee(new Espresso());
                break;
            case "2":
                coffeeMachine.buyCoffee(new Latte());
                break;
            case "3":
                coffeeMachine.buyCoffee(new Cappuccino());
                break;
            case "back":
                break;
        }
    }

    private void fillIngredients() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int coffeeBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int cups = scanner.nextInt();
        System.out.println();
        coffeeMachine.fillIngredients(water, milk, coffeeBeans, cups);
    }

    private void printIngredients() {
        System.out.println("The coffee machine has:");
        System.out.println(coffeeMachine.getWater() + " ml of water");
        System.out.println(coffeeMachine.getMilk() + " ml of milk");
        System.out.println(coffeeMachine.getCoffeeBeans() + " g of coffee beans");
        System.out.println(coffeeMachine.getCups() + " disposable cups");
        System.out.println("$" + coffeeMachine.getMoney() + " of money" + "\n");
    }
}
package machine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CoffeeMachine order = new CoffeeMachine();

//        order.printStats();
        String action;
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scan.nextLine();
//            System.out.println();
            if (action.equalsIgnoreCase("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String type = scan.nextLine();
                if (type.equalsIgnoreCase("back")) {
                    continue;
                } else {
                    order.buy(type);
                }
            } else if (action.equalsIgnoreCase("fill")) {
                System.out.println("Write how many ml of water you want to add:");
                int addWater = scan.nextInt();
                System.out.println("Write how many ml of milk you want to add:");
                int addMilk = scan.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add:");
                int addCoffeeBeans = scan.nextInt();
                System.out.println("Write how many disposable cups you want to add:");
                int addCups = scan.nextInt();
                order.fill(addWater, addMilk, addCoffeeBeans, addCups);
            } else if (action.equalsIgnoreCase("take")) {
                order.take();
            } else if (action.equalsIgnoreCase("remaining")) {
                order.printStats();
            } else if (action.equalsIgnoreCase("exit")){
                break;
            }
        }
    }
}

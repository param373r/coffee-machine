package machine;
public class CoffeeMachine {
    int totalWater;
    int waterPerServe;
    int totalMilk;
    int milkPerServe;
    int totalCoffeeBeans;
    int beansPerServe;
    int totalCups;
    int totalMoney;
    int costPerServe;
    public CoffeeMachine() {
        this.totalWater = 400;
        this.totalMilk = 540;
        this.totalCoffeeBeans = 120;
        this.totalCups = 9;
        this.totalMoney = 550;
    }
    public void buy(String type) {
        switch (type) {
            case "1" -> {
                waterPerServe = 250;
                milkPerServe = 0;
                beansPerServe = 16;
                costPerServe = 4;
            }
            case "2" -> {
                waterPerServe = 350;
                milkPerServe = 75;
                beansPerServe = 20;
                costPerServe = 7;
            }
            case "3" -> {
                waterPerServe = 200;
                milkPerServe = 100;
                beansPerServe = 12;
                costPerServe = 6;
            }
            default -> {
                return;
            }
        }

        if (hasEnoughResources()) {
            totalWater -= waterPerServe;
            totalMilk -= milkPerServe;
            totalCoffeeBeans -= beansPerServe;
            totalCups--;
            totalMoney += costPerServe;
        }
        System.out.println();
    }
    public void fill(int addWater, int addMilk, int addCoffeeBeans, int addCups) {
        totalWater += addWater;
        totalMilk += addMilk;
        totalCoffeeBeans += addCoffeeBeans;
        totalCups += addCups;
    }
    public void take() {
        System.out.printf("I gave you $%d\n\n", totalMoney);
        totalMoney = 0;
    }
    public void printStats() {
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water\n", totalWater);
        System.out.printf("%d ml of milk\n", totalMilk);
        System.out.printf("%d g of coffee beans\n", totalCoffeeBeans);
        System.out.printf("%d disposable cups\n", totalCups);
        System.out.printf("$%d of money\n", totalMoney);
        System.out.println();
    }
    public boolean hasEnoughResources() {
        if (totalWater - waterPerServe < 0) {
            System.out.println("Sorry, not enough water!");
            return false;
        } else if (totalMilk - milkPerServe < 0) {
            System.out.println("Sorry, not enough milk!");
            return false;
        }else if (totalCoffeeBeans - beansPerServe < 0) {
            System.out.println("Sorry, not enough beans!");
            return false;
        }else if (totalCups <= 0) {
            System.out.println("Sorry, not enough cups!");
            return false;
        } else {
            System.out.println("I have enough resources, making you a coffee!");
        }
        return true;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // create scanner object
        Scanner scanner = new Scanner(System.in);

        // boolean changes when user decides to stop shopping
        boolean sessionIsOver = false;

        // initialize objects from our created classes
        Customer cust1 = new Customer();
        Merchandise mask = new Merchandise("Mask", 45.67, 15);
        Merchandise sword = new Merchandise("Sword", 156.78, 4);
        OnSaleMerchandise fakeBlood = new OnSaleMerchandise("Fake Blood", 100, 45, 0.5);


        // this loop runs until the user decides to quit
        while(!sessionIsOver) {
            boolean inputValid = false;
            int userInput = -1;

            while(!inputValid) {

                // prints currently updated menu
                System.out.println("1. " + mask.getProductName() + ", " + mask.getPrice() + "kr, " + mask.getUnitsLeft() + " left.");
                System.out.println("2. " + sword.getProductName() + ", " + sword.getPrice() + "kr, " + sword.getUnitsLeft() + " left.");
                System.out.println("3. " + fakeBlood.getProductName() + ", " + fakeBlood.getPrice() + "kr, " + fakeBlood.getUnitsLeft() + " left.");
                System.out.println("4. Quit");

                System.out.print("Chose your option: ");
                userInput = scanner.nextInt();

                if(userInput > 0 && userInput < 5) {
                    inputValid = true;
                } else {
                    System.out.println("Please write a number between 1 - 4");
                }
            }

            // this section checks what option the user chooses, adds the cost of that item
            // to the total cost and subtracts 1 item from the number of items
            if(userInput == 1) {
                cust1.addTotalCost(mask.soldUnit());
            } else if(userInput == 2) {
                cust1.addTotalCost(sword.soldUnit());
            } else if(userInput == 3) {
                cust1.addTotalCost(fakeBlood.soldUnit());
            } else {
                // print total cost rounded to the closest integer and the total number of units bought
                System.out.println("Your total cost is: " + Math.round(cust1.getTotalCost()) + " for " + cust1.getNumberOfUnits() + " units.");
                sessionIsOver = true;
            }


        }

    }
}
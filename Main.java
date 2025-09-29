import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in); //accessible to the whole program

    public static void main(String[] args) {

        if (!login()) {
            System.out.println("Too many failed attempts. Exiting...");
            scanner.close();
            return;
        }

        // java banking program
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning) {
            // display menu
            System.out.println("***************"); //seperaters
            System.out.println("BANKING PROGRAM");
            System.out.println("***************"); //seperaters
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************"); //seperaters

            // get and process user choice

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch(choice){ 
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }

        }


        System.out.println("***************************");
        System.out.println("Thank you! Have a nice day!");
        System.out.println("***************************");

        scanner.close();
    }
    
    static boolean login() {
        final int CORRECT_PIN = 1234;
        final int MAX_ATTEMPTS = 3;
        int attempts = 0;

        System.out.println("WELCOME TO MY BANKING PROGRAM");
        System.out.println("*****************************");

        while (attempts < MAX_ATTEMPTS) {
            System.out.println("Enter your 4 digit PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == CORRECT_PIN) {
                System.out.println("Login successful!");
                System.out.println("*****************");
                return true;
            } else {
                attempts++;
                System.out.println("Incorrect PIN. Attempts left: " + (MAX_ATTEMPTS - attempts));
            }
        }

        return false; 
    }

    static void showBalance(double balance){
        System.out.println("***************");
        System.out.printf("£%.2f\n", balance);
    }

    static double deposit() {

        double amount;

        System.out.print("Enter an amount to be deposited; ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("The amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }

    }

    static double withdraw(double balance){

        double amount;

        System.out.print("Enter amount to be withdrawn:  ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if(amount < 0){
            System.out.println("(Amount can't be negative)");
            return 0;
        }
        else{
            return amount;
        }
        
    }


    
}

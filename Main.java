import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // java banking program

        Scanner scanner = new Scanner(System.in);
        double balance;
        boolean isRunning = true;
        int choice;

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
            case 1 -> System.out.println("SHOW BALANCE");
            case 2 -> System.out.println("DEPOSIT");
            case 3 -> System.out.println("WITHDRAW");
            case 4 -> isRunning = false;
            default -> System.out.println("INVALID CHOICE");
        }

        // showBalance()

        // deposit()

        //withdraw()

        // EXIT MESSAGE

        scanner.close();
    }
    
}

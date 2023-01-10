import java.util.Scanner;

public class BankAccount {
    private int balance;
    private int previousTransaction;
    private String customerName;
    private String customerId;

 public BankAccount(String customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }


    private void deposit(int amount) {
        if (amount != 0) {
            balance += amount;
            previousTransaction = amount;
        }
    }

    private void withdraw(int amount) {
        if (amount != 0) {
            balance -= amount;
            previousTransaction -= amount;
        }
    }

    private void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No Transaction occurred");
        }
    }

    public void showMenu() {
     char option='\0';
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome "+customerName);
        System.out.println("your ID is "+customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("=============================================================================================");
            System.out.println("Enter an option");
            System.out.println("=============================================================================================");
            option = sc.next().charAt(0);
            System.out.println("\n");
            switch (option){
                case 'A':
                    System.out.println("-------------------------------------------------");
                    System.out.println("Balance = "+balance);
                    System.out.println("-------------------------------------------------");
                    System.out.println("\n");
                    break;
                case 'B':
                    System.out.println("--------------------------------------------------");
                    System.out.println("Enter an amount to deposit");
                    System.out.println("--------------------------------------------------");
                    int amount=sc.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                case 'C':
                    System.out.println("---------------------------------------------------");
                    System.out.println("Enter an amount to Withdraw");
                    System.out.println("---------------------------------------------------");
                    int amount2=sc.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;
                case 'D':
                    System.out.println("--------------------------------------------");
                    getPreviousTransaction();
                    System.out.println("--------------------------------------------");
                    System.out.println("\n");
                    break;
                case 'E':
                    System.out.println("*****************************************************************************");
                    break;
                default:
                    System.out.println("Invalid option!!. Please enter again");
                    break;
            }
        }while (option!='E');
        System.out.println("Thank for using our services");
    }

}

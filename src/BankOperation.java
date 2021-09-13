import java.sql.SQLOutput;
import java.util.Scanner;

public class BankOperation {
    public static void main(String[] args) {
        System.out.print("Enter account type: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        AccountHolderFactory accountHolderFactory = new AccountHolderFactory();
        AccountHolder anyone = accountHolderFactory.getAccountHolder(input);
        System.out.println("Anyone's account Number: " + anyone.getAccountNumber());
        System.out.println("Anyone Account Balance: " + anyone.getAccountBalance());

            //For deposit amount
        System.out.println("Enter your Deposit amount: ");
        Scanner scanner1 = new Scanner(System.in);
        float depositInput = scanner1.nextFloat();
        anyone.Deposit(depositInput);
        System.out.println("Anyone Account Balance after deposit: " + anyone.getAccountBalance());

            //for withdraw
        System.out.println("Enter withdraw amount: ");
        Scanner scanner2 = new Scanner(System.in);
        float withdrawInput = scanner2.nextFloat();
        anyone.withdraw(withdrawInput);
        System.out.println("Anyone Account Balance after withdraw : " + anyone.getAccountBalance());


        anyone.updateAccountBalance();
        System.out.println("Anyone's account Balance after interest: " + anyone.getAccountBalance());

    }
}

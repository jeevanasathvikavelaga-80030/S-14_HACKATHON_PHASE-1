import java.util.Scanner;

public class BankAccount
{
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount)
    {
        balance = balance + amount;
    }

    void withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance = balance - amount;
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }

    double checkBalance()
    {
        return balance;
    }

    void displayAccount()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int number = sc.nextInt();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.next();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(number, name, balance);

        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.print("Enter Withdrawal Amount: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.println("Final Account Details:");
        account.displayAccount();
    }
}

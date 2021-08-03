import java.util.Scanner;

public class HDFCBank {
    public static void main(String[] args) {
        System.out.println("Welcome to HDFC Bank.");
        AccountHolder accountHolder=new AccountHolder("rahul","rahul",7878874,8990);
        chooseOptions(accountHolder);

    }

    public static void chooseOptions(AccountHolder accountHolder){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1.Account Details\n2.Deposit\n3.Withdraw\n4.Show Balance");
        int ch=scanner.nextInt();
        switch (ch){
            case 1:
                System.out.println("Account holder is "+accountHolder.getName());
                System.out.println("Password is "+accountHolder.getPassword());
                System.out.println("Account Number is "+accountHolder.getAccountNumber());
                System.out.println("Balance is "+accountHolder.getBalance());
                break;
            case 2: deposit(accountHolder);
                break;
            case 3:withdraw(accountHolder);
                break;
            case 4:showBalance(accountHolder);
                break;
            default:
                System.out.println("Invalid input");
        }
        scanner.close();
    }

    public static void deposit(AccountHolder accountHolder){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to deposit");
        double amount = scanner.nextDouble();
        accountHolder.depositAmount(amount);
        System.out.println("Total Balance after deposit is: "+accountHolder.getBalance());
        scanner.close();
    }


    public static void withdraw(AccountHolder accountHolder){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        accountHolder.withdraw(amount);
        System.out.println("Total Balance after withdrawal: "+accountHolder.getBalance());
        scanner.close();

    }
    public static void showBalance(AccountHolder accountHolder){
        System.out.println("Total Balance is: "+accountHolder.getBalance());

    }
}

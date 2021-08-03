public class AccountHolder {
    private String name;
    private String password;
    private double balance;
    private double accountNumber;

    public AccountHolder(String name, String password, double accountNumber, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void depositAmount(double depositAmount){
        balance+=depositAmount;
    }
    public void withdraw(double withdrawAmount){
        if (balance<withdrawAmount)
            System.out.println("Insufficient Balance");
        else
            balance-=withdrawAmount;
    }
}

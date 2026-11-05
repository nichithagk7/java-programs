public class account{
    String accountHolderName;
    double balance;
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
    void checkBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args) {
        account account = new account();
        account.accountHolderName = "Rahul";
        account.balance = 1000;
        account.checkBalance();
        account.deposit(500);
        account.withdraw(200);
        account.checkBalance();
    }
}

import java.time.LocalDate;

public class Account {
    private String accountName;
    private String accountNumber;

    private LocalDate creationDate;

    private double accountBalance;

    public Account(String accountName, String accountNumber, double accountBalance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.creationDate = LocalDate.now();
    }

    public void depositMoney(int amount) {
        accountBalance += amount;
        System.out.println(amount + " have been deposited into your account. Current balance is " + accountBalance);
    }

    public void withdrawMoney(int amount) {
        if(accountBalance < amount) {
            System.out.println("You do not have enough money in your account. Current balance is" + accountBalance);
        } else {
            accountBalance -= amount;
            System.out.println(amount + " have been withdrawn from your account. Current balance is " + accountBalance);
        }
    }

    public void updateAccountName(String newName) {
        accountName = newName;
        System.out.println("Account name has been updated to " + newName);
    }

    @Override
    public String toString() {
        return "Account name: " + accountName +
                "\nAccount number: " + accountNumber +
                "\nAccount balance: " + accountBalance +
                "\nAccount creation date: " + creationDate;
    }

}

import java.util.ArrayList;
public class Bank {
    private String bankName;

    private int lastAccountNumber = 0;
    private ArrayList<Account> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
    }

    public String getBankName() {
        return this.bankName;
    }

    public ArrayList<Account> getAccounts() {
        return this.accounts;
    }

    public int getLastAccountNumber() {
        return this.lastAccountNumber;
    }
    public void addAccount(Account account) {
        lastAccountNumber++;
        accounts.add(account);
    }

    public Account searchAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

}

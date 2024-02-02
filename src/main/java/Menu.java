import java.util.Scanner;

public class Menu {

    private void goToMainMenuView(Scanner scanner) {
        String userInput = "";
        while (!userInput.equals("0")) {
            System.out.println("press 0 to go to main menu");
            userInput = scanner.nextLine();
        }
    }

    private void createAccountView(Bank bank) {
        System.out.println("You are on the Create account page.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String accountName = scanner.nextLine();
        System.out.println("Please enter your initial deposit:");
        double accountBalance = scanner.nextDouble();
        scanner.nextLine();
        int accountNumber = bank.getLastAccountNumber() + 1;
        Account account = new Account(accountName, accountNumber, accountBalance);
        bank.addAccount(account);
        System.out.println("New account created successfully.");
        System.out.println(account);
        goToMainMenuView(scanner);
    }

    private void displayAllAccountsView(Bank bank) {
        System.out.println("You are on the Display all accounts page. Here are all the accounts:");
        for (Account account : bank.getAccounts()) {
            System.out.println(account);
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        goToMainMenuView(scanner);
    }

    private void updateAccountView(Bank bank) {
        System.out.println("You are on the update account page.");
        System.out.println("Please enter account number:");
        Scanner scanner = new Scanner(System.in);
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        Account account = bank.searchAccount(accountNumber);
        if(account == null) {
            System.out.println("Account not found.");
        } else {
            System.out.println("Account found. Account name is: " + account.getAccountName());
            System.out.println("Please enter new account name:");
            String accountName = scanner.nextLine();
            account.updateAccountName(accountName);
        }
        goToMainMenuView(scanner);
    }

    private void deleteAccountView(Bank bank) {
        System.out.println("You are on the delete account page.");
        System.out.println("Please enter account number:");
        Scanner scanner = new Scanner(System.in);
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        Account account = bank.searchAccount(accountNumber);
        if(account == null) {
            System.out.println("Account not found.");
        } else {
            bank.getAccounts().remove(account);
            System.out.println("Account deleted successfully.");
        }
        goToMainMenuView(scanner);
    }

    private void depositMoneyView(Bank bank) {
        System.out.println("You are on the deposit money page.");
        System.out.println("Please enter your account number:");
        Scanner scanner = new Scanner(System.in);
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        Account account = bank.searchAccount(accountNumber);
        if(account == null) {
            System.out.println("Account not found.");
        } else {
            System.out.println("Please enter amount to deposit:");
            int amount = scanner.nextInt();
            scanner.nextLine();
            account.depositMoney(amount);
        }
        goToMainMenuView(scanner);
    }

    private void withdrawMoneyView(Bank bank) {
        System.out.println("You are on the withdraw money page.");
        System.out.println("Please enter your account number:");
        Scanner scanner = new Scanner(System.in);
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        Account account = bank.searchAccount(accountNumber);
        if(account == null) {
            System.out.println("Account not found.");
        } else {
            System.out.println("Please enter amount to withdraw:");
            int amount = scanner.nextInt();
            scanner.nextLine();
            account.withdrawMoney(amount);
        }
        goToMainMenuView(scanner);
    }

    private void searchAccountView(Bank bank) {
        System.out.println("You are on the search account page.");
        System.out.println("Please enter account number:");
        Scanner scanner = new Scanner(System.in);
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        Account account = bank.searchAccount(accountNumber);
        if(account == null) {
            System.out.println("Account not found.");
        } else {
            System.out.println(account);
        }
        goToMainMenuView(scanner);
    }
    public void showMenu(Bank bank) {
        boolean menuFlag = true;
        while(menuFlag) {
            System.out.println("You are on the main menu of " + bank.getBankName() + ". Please select an option:");
            System.out.println("1. Create a new account");
            System.out.println("2. Display all accounts");
            System.out.println("3. Update an account(change account name)");
            System.out.println("4. Delete an account");
            System.out.println("5. Deposit an amount into your account");
            System.out.println("6. Withdraw an amount from your account");
            System.out.println("7. Search for account");
            System.out.println("8. Exit");

            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            scanner.nextLine();
            switch (userInput) {
                case 1:
                    createAccountView(bank);
                    break;
                case 2:
                    displayAllAccountsView(bank);
                    break;
                case 3:
                    updateAccountView(bank);
                    break;
                case 4:
                    deleteAccountView(bank);
                    break;
                case 5:
                    depositMoneyView(bank);
                    break;
                case 6:
                    withdrawMoneyView(bank);
                    break;
                case 7:
                    searchAccountView(bank);
                    break;
                case 8:
                    menuFlag = false;
                    System.out.println("Exiting.....\n Thank you for using " + bank.getBankName() + " services.");
                    break;
            }
        }
    }
}

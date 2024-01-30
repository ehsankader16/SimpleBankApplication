import java.util.Scanner;

public class Menu {
    private void createAccountView(Bank bank) {

    }

    private void displayAllAccountsView(Bank bank) {

    }

    private void updateAccountView(Bank bank) {

    }

    private void deleteAccountView(Bank bank) {

    }

    private void depositMoney(Bank bank) {

    }

    private void withdrawMoney(Bank bank) {

    }

    private void searchAccount(Bank bank) {

    }
    public void showMenu(Bank bank) {
        boolean menuFlag = true;
        while(menuFlag) {
            System.out.println("You are on the main menu of " + bank.getBankName() + ". Please select an option:");
            System.out.println("1. Create a new account");
            System.out.println("2. Display all accounts");
            System.out.println("3. Update an account");
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
                    depositMoney(bank);
                    break;
                case 6:
                    withdrawMoney(bank);
                    break;
                case 7:
                    searchAccount(bank);
                    break;
                case 8:
                    menuFlag = false;
                    System.out.println("Exiting.....\n Thank you for using " + bank.getBankName() + " services.");
                    break;
            }
        }
    }
}

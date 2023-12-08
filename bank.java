import java.util.*;
import java.lang.*;

class bank_account
{
    private String myname;
    private int acc_number;
    private String acc_type;
    private int current_balance;
    // defining a constructor for assigning initial values to all the variables..
    bank_account(String name, int acc_num, String type, int balance)
    {
        myname = name;
        acc_number = acc_num;
        acc_type = type;
        current_balance = balance;
    }
    // defining a function or method to display all the initial values
    public void display_details ()
    {
        System.out.println(" BANK ACCOUNT DETAILS..\n");
        System.out.println(" NAME : "+ myname +"\n");
        System.out.println(" ACCOUNT NUMBER : "+ acc_number + "\n");
        System.out.println(" ACCOUNT TYPE : "+ acc_type + "\n");
        System.out.println(" Your Current Available Balance Amount : "+ current_balance + "\n");
    }
    public void deposit_amount()
    {
        int deposit;
        System.out.println(" Welcome to Amount Deposition Screen .. \n");
        System.out.println(" How much amount are you willing to deposit..? \n");
        Scanner myinput = new Scanner(System.in);
        deposit = myinput.nextInt();
        current_balance = deposit + current_balance ;
        System.out.println(" Your Current Balance Amount after deposition is.. \n"+ current_balance);

    }
    public void withdraw_amount()
    {
        int withdraw;
        System.out.println(" How much money are you willing to withdraw..\n");
        Scanner user = new Scanner(System.in);
        withdraw = user.nextInt();
        if ( withdraw > current_balance)
        {
            System.out.println(" Sorry dear "+ myname+ ", your withdrawl amount exceeds your current available balance..\n");
        }
        else
        {
            current_balance = current_balance - withdraw ;
        }
        System.out.println(" Your Current available balance after withdrawl is.. \n"+ current_balance);
    }

}

public class bank
{
    public static void main (String []args) {
        int choice=0;
        String name, acc_type;
        int acc_num, curr_balance;
        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to Bank Details assignation Screen ..!! \n");
        System.out.println(" Bank Account Details Entry.. \n");
        System.out.println(" PLease enter your name.. \n");
        name = input.nextLine();
        System.out.println(" Please enter your account number.. \n");
        acc_num = input.nextInt();
        System.out.println(" Please enter account type.. \n");
        acc_type = input.next();
        System.out.println(" PLease enter current balance...\n");
        curr_balance = input.nextInt();

        // creating an object instance for the above defined class..
        bank_account acc = new bank_account(name, acc_num, acc_type, curr_balance);
        System.out.println(" Your all details have been initialized successfully..\n");
        acc.display_details();
        System.out.println(" MENU FOR YOU.. \n");
        System.out.println(" 1. WITHDRAW AMOUNT  \n");
        System.out.println(" 2. DEPOSIT AMOUNT  \n");
        System.out.println(" 3. DISPLAY BANK DETAILS  \n");
        while (choice != 4) {
            System.out.println(" Please enter your choice.. \n");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    acc.withdraw_amount();
                    break;
                case 2:
                    acc.deposit_amount();
                    break;
                case 3:
                    acc.display_details();
                    break;

            }

        }
    }
}
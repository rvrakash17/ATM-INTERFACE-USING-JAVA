//OASIS INFOBYTE TASK 2 : ATM INTERFACE...
//BY AKASH R...
import java.util.Scanner;
public class ATM
{
    private static final String Receiver = " ";
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int deposit;
            int balance = 50000;
            double Withdraw;
            Integer Transaction = 0;
            double Password;
            String AccountHolderName;
            Integer AccountNumber;
            double amount;
            String TransactionHistory = null;
            System.out.println("ATM INTERFACE"); 
            System.out.println("\n1.Login:");
            System.out.println("\n2.Withdraw:");
            System.out.println("\n3.Balance:");
            System.out.println("\n4.Deposit:");
            System.out.println("\n5.Transfer:");
            System.out.println("\nEnter your choice:");
            int Choice = sc.nextInt();
            switch (Choice){
                case 1:
                System.out.println("Enter your name here:");
                AccountHolderName = sc.next();
                System.out.println("Enter your password here:");
                Password = sc.nextDouble();
                System.out.println("Enter Account Number only last 4 digits:");
                AccountNumber = sc.nextInt();
                System.out.println("Login completed.");
                break;
                 case 2:
                  System.out.println("Enter the amount to be withdrawn:");
            amount = sc.nextDouble();
            try{
                if(balance >= amount)
                {
                    balance -= amount;
                    System.out.println("Withdrawal Successfully done");
                    String remove = "RS" + amount + "Withdrawn";
                    TransactionHistory = TransactionHistory.concat(remove);
                }
                else{
                    System.out.println("Insufficient Balance.");
                }
                }
                catch(Exception e)
                {

                }
                break;
case 3:
System.out.println("Balance :" + balance);
break;
case 4:
System.out.println("Enter money to be deposite:");
deposit = sc.nextInt();
balance = balance + deposit;
System.out.println("Your Money has been successfully deposited");
System.out.println("");
break;
case 5:
System.out.println("Enter account holder's name:");
AccountHolderName = sc.next();
System.out.println("Enter the amount to be transferred:");
amount = sc.nextDouble();
try{
    if(balance >= amount)
    {
        if(amount <= 50000.00){
            Transaction++;
            balance -= amount;
            System.out.println("Amount sucessfully transferred to:"+AccountHolderName);
            String string = "RS" + amount + "transferred";
            TransactionHistory = TransactionHistory.concat(string);
        }else
        System.out.println("Sorry it has gone failed");
    }else
    System.out.println("Insufficient balance.");
}
catch(Exception e)
{}
break;
}
System.exit(0); 
}
} 
}
import java.util.*;

public class Main {
	
	public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    	
    	//BANK 
    	
    	/*
        BankAccount bob_acct = new BankAccount(1000, -1000);
        BankAccount lisa_acct = new BankAccount(1000, -1000);

        System.out.println("Balances In The Account :");
        System.out.println("BOB ACCOUNT | balance = " + bob_acct.getBalance());
        System.out.println("LISA ACCOUNT | balance = " + lisa_acct.getBalance());
        System.out.println("");
        System.out.println("-------------------------------------");

        
        boolean transfer_mode = bob_acct.transfer(500,lisa_acct);
        if(transfer_mode) {
            System.out.println("!TRANSACTION DONE!");
            System.out.println("-------------------");
            System.out.println("Balances In The Account after the transaction :");
            System.out.println("BOB ACCOUNT | balance = " + bob_acct.getBalance());
            System.out.println("LISA ACCOUNT | balance = " + lisa_acct.getBalance());

        }else {
        	System.out.println("ERROR: TRANSFER IS NOT POSSIBLE");
        }
        
        
        transfer_mode = bob_acct.transfer(1600,lisa_acct);
        
        if(transfer_mode) {
            System.out.println("!TRANSACTION DONE!");
            System.out.println("-------------------");
            System.out.println("Balances In The Account after the transaction :");
            System.out.println("BOB ACCOUNT | balance = " + bob_acct.getBalance());
            System.out.println("LISA ACCOUNT | balance = " + lisa_acct.getBalance());

        }else {
        	System.out.println("ERROR: TRANSFER IS NOT POSSIBLE : overdraft ");
        }
        
        
        */
    	//-----------------------------------------------------------
    	//Rectangle 
    	
    	System.out.println("num 1 | Please enter the length, width  of the rectangle : ");
    	Rectangle r1 = new Rectangle(input.nextInt(), input.nextInt());
    	System.out.println("");
    	System.out.println("num 2 | Please enter the length, width of the rectangle : ");
    	Rectangle r2 = new Rectangle(input.nextInt(), input.nextInt());
    	System.out.println("----------------");
    	System.out.println("");

    	System.out.println("num 1 ");
    	r1.draw();
    	System.out.println("");
    	System.out.println("num 2 ");
    	r2.draw();
    	System.out.println("----------------");

    	System.out.println("After changing the scale");
    	r1.scale(2);
    	r1.draw();
    	System.out.println("");
    	System.out.println("----------------");
    	System.out.println("num1");
    	System.out.println(r1.toString());
    	System.out.println("");
    	System.out.println("num2");
    	System.out.println(r2.toString());

      }

    }



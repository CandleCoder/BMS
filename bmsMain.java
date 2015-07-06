import java.io.BufferedReader;
import java.io.InputStreamReader;

import mani.util.TypeAccount.Business_acct;
import mani.util.TypeAccount.Checking_acct;
import mani.util.TypeAccount.Sav_acct;

class  Bank_improved
{
	public static void main(String args[]) 
	{
	    String str;
		int choice,check_acct=1,quit=0;
		choice=0;

         Checking_acct Checking_obj = new Checking_acct();
		 Sav_acct sav_obj = new Sav_acct();
		 Business_acct business_obj = new Business_acct();  

         System.out.println("\n Welcome to console based Bank Management System \n");


while( quit!=1)
{
		try{
		   BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		   System.out.print("Type 1 for Checking Account 2 for saving and Any no for Business Account : ");
		   System.out.flush();
		   str=obj.readLine();
		   check_acct=Integer.parseInt(str);
		   }
		   catch(Exception e) {}

	if(check_acct==1)
	 {
        do//For Current Account
		{
		System.out.println("\n\nChoose Your Choices ");
		System.out.println("1) New Record Entry ");
		System.out.println("2) Display Record Details on the basis of Account number ");
		System.out.println("3) Deposit");
		System.out.println("4) Withdraw");
		System.out.println("5) Quit");
 	    System.out.print("Enter your choice :  ");
		System.out.flush();
		      try{
			       BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
				   str=obj.readLine();
				   choice=Integer.parseInt(str);

				          switch(choice)
				           {
							case 1 :  //New Record Entry
								Checking_obj.newEntry();
							               break;
							case 2 :  //Displaying Record Details
								Checking_obj.display();
								           break;
							case 3 : //Deposit...
								Checking_obj.deposit();
								           break;
							case 4 : //Withdraw...
								Checking_obj.withdraw();
								            break;
							case 5  :  System.out.println("\n\n Closing Checking account ");
								            break;
							default : System.out.println("\nInvalid Choice \n\n");
						  }
					}
				catch(Exception e)
				{}
			}while(choice!=5);
	}
	else if(check_acct==2)
	 {
       do//For Current Account
		{
		System.out.println("\n\nChoose Your Choices ");
		System.out.println("1) New Record Entry ");
		System.out.println("2) Display Record Details on the basis of Account Number ");
		System.out.println("3) Deposit");
		System.out.println("4) Withdraw");
		System.out.println("5) Quit");
	    System.out.print("Enter your choice :  ");
		System.out.flush();
		      try{
			       BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
				   str=obj.readLine();
				   choice=Integer.parseInt(str);

				          switch(choice)
				           {
							case 1 :  //New Record Entry
								sav_obj.newEntry();
							               break;
							case 2 :  //Displaying Record Details on the basis of Account Number
								sav_obj.display();
								           break;
								           
							
							case 3 : //Deposit...
								sav_obj.deposit();
								           break;
							case 4 : //Withdraw...
								sav_obj.withdraw();
								            break;
							case 5  :  System.out.println("\n\n Closing Saving Account ");
								            break;
							default : System.out.println("\nInvalid Choice \n\n");
						  }
					}
				catch(Exception e)
				{}
			}while(choice!=5);
	}
else
  {
	  do//For Saving Account
		{
		System.out.println("Choose Your Choices ");
		System.out.println("1) New Record Entry ");
		System.out.println("2) Display Record Details on the basis of Account Number ");
		System.out.println("3) Deposit into your account ");
		System.out.println("4) Withdraw from your account ");
		System.out.println("5) Quit from this App");
 	    System.out.print("Enter your choice(one at a time) :  ");
		System.out.flush();
		      try{
			       BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
				   str=obj.readLine();
				   choice=Integer.parseInt(str);

				          switch(choice)
				           {
							case 1 :  //New Record Entry
								business_obj.newEntry();
							               break;
							case 2 :  //Displaying Record Details on the basis of Account Number
								business_obj.display();
								           break;
								           
							case 3 : //Deposit...
								business_obj.deposit();
								           break;
							case 4 : //Withdraw...
								business_obj.withdraw();
								            break;
							case 5  :  System.out.println("\n\n Closing Business Account ");
								            break;
							default : System.out.println("\nInvalid Choice \n\n");
						  }
					}
				catch(Exception e)
				{}
			}while(choice!=5);
	  }

try{
BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
System.out.print("\nEnter 1 for Exit : ");
System.out.flush();
str=obj.readLine();
quit=Integer.parseInt(str);
}catch (Exception e){}
}
  }
}
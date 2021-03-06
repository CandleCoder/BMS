package mani.util.TypeAccount;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Business_acct {
	

	 final int max_limit=20;
	 final  int min_limit=1;
	 final double min_bal=10000;
    private  String name[]=new String[20];
	 private  int accNo[]=new int[20];
	 private  String accType[]=new String[20];
    private  double balAmt[]=new double[20];
    static  int totRec=0;
	
	//Intializing Method
	public void initialize()
	{
	     for(int i=0;i<max_limit;i++)
		 {
			name[i]="";
			accNo[i]=0;
			accType[i]="";
			balAmt[i]=0.0;
		 }
	}

	public void newEntry() {
		
		String str;
		   if (totRec>max_limit)
		   {
		        System.out.println("\n\n\nSorry we cannot admit you in our bank \n\n\n");
		   }

		   if(true)   //Allows to create new entry
		   {
		   totRec++;         // Incrementing Total Record			   
		   System.out.println("\n\n\n Entering new Records");
		   try{
		            accNo[totRec]=totRec;    //Created  AutoNumber  to accNo so no invalid id occurs
            System.out.println("Account Number :  "+accNo[totRec]);
					
		         BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
				 System.out.print("Enter Name :  ");
				 System.out.flush();
				 name[totRec]=obj.readLine();

				 accType[totRec]="Business Account";
				 System.out.println("Account Type : "+accType[totRec]);					 

				do{
				       System.out.print("Enter Initial  Amount to be deposited : ");
				       System.out.flush();
				       str=obj.readLine();
				       balAmt[totRec]=Double.parseDouble(str);
					 }while(balAmt[totRec]<min_bal);      //Validation that minimun amount must be 500

			  System.out.println("\n\n\n");
			    }
			catch(Exception e)
			{}
		   }
		
		
	}

	public void display() {
		
		String str;
		  int acno=0;
		  boolean valid=true;
		  			 
		  System.out.println("\n\n Displaying details of customer\n");
		  try{
		     BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
			 System.out.print("Enter Account number : ");
			 System.out.flush();
			 str=obj.readLine();
			 acno=Integer.parseInt(str);
			  if (acno<min_limit  || acno>totRec)   //To check whether accNo is valid or Not
		         {
		              System.out.println("\n\n\nInvalid Account Number \n\n");
					  valid=false;
		         }

				if (valid==true)
				  {	 
					System.out.println("\n\nAccount Number : "+accNo[acno]);
					System.out.println("Name : "+name[acno]);
					System.out.println("Account Type : "+accType[acno]);
					System.out.println("Balance Amount : "+balAmt[acno]+"\n\n\n");
				  }
			 }
		catch(Exception e)
		{}
		
		
	}

	public void deposit() {
	
		 String str;
		  double amt;
		  int acno;
		  boolean valid=true;
		  System.out.println("\n\n\n Deposite the amount you need to");
		  
		  try{
		       //Reading deposit value
		       BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

				    System.out.print("Enter Account No : ");
					System.out.flush();
					str=obj.readLine();
					acno=Integer.parseInt(str);
					 if (acno<min_limit || acno>totRec)   //To check whether accNo is valid or Not
			         {
			              System.out.println("\n\n\nInvalid Account Number \n\n");
						  valid=false;
			         }
    
	   	         if (valid==true)
				   {
						System.out.print("Enter Amount you want to Deposit  : ");
						System.out.flush();
						str=obj.readLine();
						amt=Double.parseDouble(str);

						balAmt[acno]=balAmt[acno]+amt;

						//Displaying Depsit Details
						System.out.println("\nAfter Updation ");
						System.out.println("Account Number :  "+acno);
						System.out.println("Balance Amount :  "+balAmt[acno]+"\n\n\n");
					}
			 }
		catch(Exception e)
		{}
		
		
	}

	public void withdraw() {
		
		
		String str;
		  double amt,checkamt,penalty;
		  int acno;
		  boolean valid=true;
		  System.out.println("\n\n\n Withdraw the required amount :");
		  
		  try{
		       //Reading deposit value
		       BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
			   
					System.out.print("Enter Account No : ");
					System.out.flush();
					str=obj.readLine();
					acno=Integer.parseInt(str);

					  if (acno<min_limit || acno>totRec)   //To check whether accNo is valid or Not
						 {
							System.out.println("\n\n\nInvalid Account Number \n\n");
							valid=false;
						}

					if (valid==true)
				    {
					        System.out.println("Balance is : "+balAmt[acno]);
							System.out.print("Enter Amount you want to withdraw  : ");
							System.out.flush();
							str=obj.readLine();
							amt=Double.parseDouble(str);

							checkamt=balAmt[acno]-amt;

							if(checkamt >= min_bal)
							 {
								balAmt[acno]=checkamt;
								//Displaying Depsit Details
								System.out.println("\nAfter Updation...");
								System.out.println("Account Number :  "+acno);
								System.out.println("Balance Amount :  "+balAmt[acno]+"\n\n\n");
							}
							else
							 {
								System.out.println("\n\nYour Balance has gone down and so penalty is calculated");
								//Bank policy is to charge 20% on total difference of balAmt and min_bal to be maintain
								penalty=((min_bal - checkamt)*20)/100;
								balAmt[acno]=balAmt[acno]-(amt+penalty);
								System.out.println("Now your balance revels : "+balAmt[acno]+"\n\n\n");
							}
					}
			 }
		catch(Exception e)
		{}
	}


}

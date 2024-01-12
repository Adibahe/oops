import java.util.Scanner;
import java.time.*;
import java.util.Random;

interface Debitable{
	void Withdraw();
}
abstract class BankAccount implements Debitable{
	int AccountNumber;
	String AddharNumber;
	String ownerName;
	double ROI;
	double Balance=0;
	Boolean status;
	LocalDateTime creationDate;
	Random rand =new Random();
	Scanner scan = new Scanner(System.in);
	BankAccount(){
	 
 	System.out.println("Enter AddharNumber:");
 	AddharNumber=scan.next();
 	System.out.println("Enter owner Name:");
 	ownerName=scan.next();
	 
	}
	void Display(){
		System.out.println("=======Account details=======");
		System.out.println("owner's name: "+ownerName);
		System.out.println("AddharNumber: "+AddharNumber);
		System.out.println("Account number: "+AccountNumber);
		System.out.println("ROI: "+ROI);
		this.UpdateIntrest();
	}
   
	void openAccount(){
    	creationDate=LocalDateTime.now();
 	System.out.println("You'r account is created ,at "+creationDate);
 	status=true;
	}
   
	void Depoist(double amount){
 	if(status==true){
     	Balance=Balance+amount;
 	}
	}
   
	abstract void closeAccount();
   
	void UpdateIntrest(){
 	System.out.println("Update your intrest rate:");
 	ROI=scan.nextDouble();
	}

	public void Withdraw(){
 	System.out.println("Enter the ammount to be withdrawn:");
 	double z=scan.nextDouble();
 	if(Balance<z)
 	System.out.println("Insufficient Balance");
	 
 	else{
	this.UpdateIntrest();
 	Balance=Balance-z;
 	System.out.println("Current Balance: "+Balance);
 	}
	}
}
class FixedDepoistAccount extends BankAccount{
	Scanner scan = new Scanner(System.in);
	int LockinPeriod;
	double simpleIntrest;
	FixedDepoistAccount(){
 	super();
 	int a=(int)(Math.random()*1000)+55000;
 	AccountNumber=a;
	 
 	System.out.println("Enter Lockin period");
 	LockinPeriod=scan.nextInt();
	 
 	if(LockinPeriod>10 || LockinPeriod<=0)
 	System.out.println("Lockin period can't be 0 or more than 10 years");


 	if(LockinPeriod>=1 && LockinPeriod<2)
 	ROI=6;
 	else if(LockinPeriod>=2 && LockinPeriod<=5)
 	ROI=6.5;
 	else
 	ROI=7;
	}
	void UpdateIntrest(){
 	Double simpleIntrest=(Balance*ROI*5)/100;
 	System.out.println("Balance after adding intrest:"+(Balance+simpleIntrest));
    Balance+=simpleIntrest;
	}
	void closeAccount(){
	System.out.println("Account is closed");
	System.out.println("Account refunded:"+Balance);

	}
}
class SavingAccount extends BankAccount implements Debitable{
	Scanner scan = new Scanner(System.in);
	SavingAccount(){
    	super();
    	int a= (int)(Math.random()*1000)+11000;
    	AccountNumber=a;
    	ROI=4;
	}
    
	void closeAccount(){
	System.out.println("==============================");
	status=false;
 	System.out.println("Your account is now closed");
 	System.out.println("Refund Balance"+Balance);
	}
   void UpdateIntrest(){
 	Double simpleIntrest=(Balance*ROI*5)/100;
 	System.out.println("Balance after adding intrest"+(Balance+simpleIntrest));
    Balance+=simpleIntrest;
	}
}
class Lab_5{
	public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	System.out.println("select: 1 for Creating a FD account, 2 for creating a savings account");
	int a=scan.nextInt();
	if(a==1){
    	FixedDepoistAccount fd=new FixedDepoistAccount();
    	fd.openAccount();
    	System.out.println("Enter amount to be Depoisted");
    	fd.Depoist(scan.nextDouble());
    	
		while(a==1 || a==3 ||a==2){

    	System.out.println("choose 2 to close account, 3 to withdraw or press any number to exit");
    	a=scan.nextInt();
    	if(a==2){
    	fd.closeAccount();
		break;
		}
		else if(a==3){
			System.out.println("Withdraw option not available");
			fd.Display();
		}
    	else
    	System.out.println("have a good day!!");
	}
	}
	else{
    	SavingAccount sa=new SavingAccount() ;
    	sa.openAccount();
    	System.out.println("Enter amount to be Depoisted");
    	sa.Depoist(scan.nextDouble());

		while(a==2 || a==3){
    	System.out.println("choose 2 to close account, 3 to withdraw money or press any number to exit");
    	a=scan.nextInt();
    	if(a==2){
    	sa.closeAccount();
		break;
		}
    	else if(a==3){
    	sa.Withdraw();
		sa.Display();
		}
    	else
    	System.out.println("have a good day!!");
	}
	}
	scan.close();
	}
}


package practise;
import java.util.*;
class Account{
	  String holdername;
	  long accNo;
	  String bankname;
	  double balance=500.0;
	  Account( String holdername,long accNo,String bankname){
		  this.holdername=holdername;
		  this.accNo=accNo;
		  this.bankname=bankname;
	  }
	  void deposit(double amount) {
		  this.balance+=amount;
		  System.out.println("Updated amount is : "+this.balance);
	  }
	  void withdraw(double amount) {
		 if(this.balance<amount) {
			 System.out.println("Insufficient Balance ");
		 }
		 else {
			 this.balance-=amount;
			 System.out.println("Withdraw Successfull : "+this.balance);
		 }
	  }
	  void display() {
		  System.out.println("Account Details ");
		  System.out.println("Holder Name : "+holdername);
		  System.out.println("Account Num : "+accNo);
		  System.out.println("Bank Name : "+bankname);
		  System.out.println("Balance : "+balance);
	  }
}
class SavingAcc extends Account{
	String orgname;
	SavingAcc( String holdername,long accNo,String bankname,String orgname){
		super(holdername,accNo,bankname);
		this.orgname=orgname;
	}
	void display() {
		super.display();
		System.out.println("Organization name : "+orgname);
	}
}
class CurrentAcc extends Account{
	String tinNum;
	 CurrentAcc(String holdername,long accNo,String bankname,String tinNum){
		 super(holdername, accNo, bankname);
		 this.tinNum=tinNum;
	 }
	 void display() {
		 super.display();
		 System.out.println("TIN number : "+tinNum);
	 }
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner c=new Scanner(System.in);
    System.out.println("Choose Account type :");
    System.out.println("1.Savings Account :");
    System.out.println("2.Current Account :");
    int choice=c.nextInt();
    if(choice==1) {
    	System.out.println("Enter Account details comma seperated form ");
    	c.nextLine();
    	String details=c.nextLine();
    	String[]det=details.split(",");
    	SavingAcc sav=new SavingAcc(det[0],Long.valueOf(det[1]),det[2],det[3]);
    	System.out.println("Choose an operation :");
    	System.out.println("1.Deposit ");
    	System.out.println("2.Withdraw ");
    	System.out.println("3.Display Account details ");
    	int oper=c.nextInt();
    	if(oper==1) {
    		System.out.println("Enter the amount deposit : ");
    		sav.deposit(c.nextDouble());
    	}
    	else if(oper==2) {
    		System.out.println("Enter the withdraw amount : ");
    		sav.withdraw(c.nextDouble());
    	}
    	else {
    	sav.display();
       }
  
	}
	}
}



import java.util.*;
import java.lang.*;
import java.io.*;

class bank{
	
	String DepositorName;
	int AccountNum;
	String AccountType;
	double AccountBalance;
	
	void Intialized(String HN, String AT, double b) {
		DepositorName = HN;
		AccountType = AT;
		AccountBalance = b;
		
		Random r1 = new Random();
		AccountNum = r1.nextInt(100000);
		System.out.println("Your Account Num - " + AccountNum);
	}
	
	void Deposite(double Amount) {
		if(AccountNum==0) {
			System.out.println("not");
		}
		else {
			AccountBalance = AccountBalance + Amount;
			System.out.println("Succefully !!!");
		}
	}
	
	void withDraw(double Amount) {
		if(AccountNum==0) {
			System.out.println("not");
		}
		else if(AccountBalance>Amount) {
			AccountBalance = AccountBalance - Amount;
			System.out.println("Succefully !!!");
		}
		else {
			System.out.println("Insufficient !!!");
		}
	}
	
	void DisplayDetail() {
		if(AccountNum==0) {
			System.out.println("not");
		}
		else {
			System.out.println("Acoount Holder Name = " + DepositorName);
			System.out.println("Balnce Available = " + AccountBalance);
		}
	}
	
	
	
}



public class Bank_Account {

	public static void main(String[] args) {
		
		bank b1 = new bank();
		
		int con=0;
		while(con==0) {
			
			int c;
			Scanner sc = new Scanner(System.in);
			System.out.println("1.OpenA");
			System.out.println("2.Depo");
			System.out.println("3.WithD");
			System.out.println("4.Detail");
			System.out.println("5.Exit");
			System.out.println("Choice");
			c = sc.nextInt();
			if(c==1) {
				System.out.println("Name - ");
				String NameAH = sc.next();
				
				System.out.println("TypeA");
				String AT = sc.next();
				
				System.out.println("Opning Bal");
				double bal = sc.nextDouble();
				b1.Intialized(NameAH, AT, bal);
//				break;
				
			}
			if(c==2) {
				System.out.println("ENter De Am");
				double de = sc.nextDouble();
				b1.Deposite(de);
//				break;
			}
			if(c==3) {
				System.out.println("Amount to Cred");
				double cre = sc.nextDouble();
				b1.withDraw(cre);
//				break;
			}
			if(c==4) {
				b1.DisplayDetail();
//				break;
			}
			if(c==5) {
				con =1;
				System.out.println("thanks");
//				break;
				
			}
			System.out.println("Press 0 to con ");
			con = sc.nextInt();
			
		}
		
		

		
	

	}

}

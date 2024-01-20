import java.util.Scanner;

public class _04_Switch_Case {
	public static void main(String [] args) {
		
		Scanner kk =new Scanner (System.in);
		
//	  NOTE  -  do while() 	loop ithe "switch case" madhe work karat nahi.	
		
		int choice;
		System.out.println("1.Open door\n2.Close\n3.Tv\n4.Call\n5.fan\n0.exit");
		do {
			System.out.print("Enter choice - ");
			choice = kk.nextInt();
		
			switch(choice){
				case 1:
					System.out.println("Door Is Open");
					break;
				case 2:
					System.out.println("Door IS Close");
					break;
				case 3:
					System.out.println("Tv Is On Now");
					break;
				case 4:
					System.out.println("Plz Call Him");
					break;
				case 5:
					System.out.println("Fan Is On Now");
					break;
				default:
					break;
			}
		}while(choice!=0);
		System.out.println("Thank you!!!!");
		
		
// WAP to Print Hello world 5 time by "do while" loop
		
		int i =0;
		do {
			System.out.println("Hey Man");
//			i++;
		}while(i!=0);
		
				
		
		
	}

}

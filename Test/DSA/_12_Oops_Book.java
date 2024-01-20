import java.util.*;


class Book{
	
	String name;
	float cost;
	int Nopages;
	
	public void Set() {
		
		Scanner kk = new Scanner(System.in);  
		
		System.out.print("Enter Name of Book - ");
		name = kk.nextLine();
		
		System.out.print("Enter Cost - ");
		cost = kk.nextFloat();
		
		System.out.print("Enter Num_Of_Pages - ");
		Nopages = kk.nextInt();
		
	}
	
	void show() {
		System.out.println("");
		System.out.printf("Name of Book = %s \nand Cost = %.2f  \nand No_Pages = %d ",name,cost,Nopages);
	}
	
	
}


public class _12_Oops_Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		Book b2 = new Book();
		
		b1.Set();
		System.out.println();
		b2.Set();
		
		if(b1.cost>b2.cost) {
			System.out.println("\nBook Name "+ b1.name + " Has More Cost Rs- "+b1.cost);
		}
		else {
			System.out.println("Book Name "+ b2.name + " Has More Cost Rs- "+b2.cost);
		}
		
//		b1.show();
//		b2.show();
		
		
		
		

	}

}

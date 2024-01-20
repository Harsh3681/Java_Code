import java.util.*;
import java.util.Random;

class games{
	
	public int Usernum;
	public int Compnum;
	
	games(){
		
		Random random = new Random();
		Compnum = random.nextInt(100);
		
	}
	
	public int getComp() {
		return Compnum;
	}

	void setUserInput() {
		
		Scanner kk = new Scanner (System.in);
		System.out.print("Enter the num - ");
		Usernum = kk.nextInt();
	}
	
	public int getUserInput() {
		return Usernum;
	}
	
	public void info() {
		
		if(Usernum>Compnum && (Compnum-15) > 100) {
			System.out.println("Put Value Between "+ (Compnum-15) + " - "+ (Compnum + 15));
			
		}
		if(Usernum>Compnum && (Compnum-10) > 90) {
			System.out.println("Put Value Between "+ (Compnum-10) + " - "+ (Compnum + 10));
			
		}
		else if(Usernum>Compnum && (Compnum-7) > 70) {
			System.out.println("Put Value Between "+ (Compnum-7) + " - "+ (Compnum + 7));
			
		}
		else if(Usernum>Compnum && (Compnum-5) > 60) {
			System.out.println("Put Value Between "+ (Compnum-5) + " - "+ (Compnum + 5));
			
		}
		
		else if(Usernum>Compnum && (Compnum-3) > 40) {
			System.out.println("Put Value Between "+ (Compnum-3) + " - "+ (Compnum + 3));
			
		}
		else if(Usernum<Compnum && (Compnum-15) >= 90) {
			System.out.println("Put Value Between 90 to 100 ");
			
		}
		else if(Usernum<Compnum && (Compnum+10) <= 100) {
			System.out.println("Put Value Between "+ (Compnum-10) + " - "+ (Compnum+10));
			
		}
		else if(Usernum<Compnum && (Compnum+7) <= 22) {
			System.out.println("Put Value Between "+ (Compnum-7) + " - "+ (Compnum+7));
			
		}
		else if(Usernum<Compnum && (Compnum+5) <= 15) {
			System.out.println("Put Value Between "+ (Compnum-5) + " - "+ (Compnum+5));
			
		}
		else if(Usernum<Compnum && (Compnum+3) <= 10) {
			System.out.println("Put Value Between "+ (Compnum-3) + " - "+ (Compnum+3));
		}
		
		
		if(Usernum == Compnum) {
			System.out.println("Win... !");
		}
		else {
			System.out.println("Loss...!");
		}
	}
	
	boolean Check() {
		
		if(Usernum == Compnum) {
			return true;
		}
		
		else {
			return false;
		}
	
	}
}


public class Exercises_Oops_Rondom_Num_Selection_Game {

	public static void main(String[] args) {
		
		games p1 = new games();

		p1.setUserInput();
		
		int comp = p1.getComp();	
		
		for(int i=5; i>1; i--) {
			System.out.println("U have left "+ (i-1) + " Chances");
			p1.info();
			p1.setUserInput();
			if(p1.Check()==true ) {
				break;
			}
		}

//		System.out.println(p1.Check());
		
		System.out.println("Comp genetated num = "+ comp);
		
		
	
		
		

	}

}

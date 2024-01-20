import java.util.*;
import java.util.Random;


public class Practice_4_RPS_Game {
	
	public static void main(String[] args) {
		
//		0 - rock
//		1 - Paper
//		2 - Scissor
		
		Scanner kk =new Scanner(System.in);
		System.out.print("0.Rock\n1.Paper\n2.Sesoir\nChoice- ");
		int userCho = kk.nextInt();
		
		Random random = new Random();
		int comCho = random.nextInt(3);
		
		if(userCho == comCho) {
			System.out.println("Draw");
		}
		
		else if(userCho==0 && comCho==2  ||  userCho==1 && comCho==0  || userCho==2  && comCho==1){
			System.out.println("You Win .... !");
		}
		else {
			System.out.println("You Loss....!");
		}
		
		System.out.print("Comp Choice - " + comCho);
		
		
		
		
		
		

	}

}

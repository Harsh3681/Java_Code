package Company;

public class Bulb {

	public static void main(String[] args) {
//		Q) if we have "n" no of bulbs
//		 let's say "10" bulb. In 1st voltage fluctuation all "ON"
//		bulb's will turn "OFF" and  "OFF" bulb will turn "ON"
//		in 2nd all 2's multiple 2,4,6,8,..........so on will toggle( "ON"
//		bulb's will turn "OFF" && "OFF" bulb will turn "ON" )
//		same for 3's multiple 3,6,9,12,15,....... so on
		
//		so on  up to "n" no of bulbs
		
//		Solu ---> if any "number" has "even" no of factors then it participate in "even num" of event and always turn "Off"
		
//		and  if any "number" has "Odd" no of factors then it participate in "Odd num" of event and always turn "ON"
//		And  if we see all "Odd No factors number is "Perfect square" see below
		
//		all this below are square 4,9,16,25
		
//		4 multiples are 1*4, 2*2, 4*1		<---total multiples "3" i.e "odd"
//		9 multiples are 1*9 ,3*3, 9*1		<---total multiples "3" i.e "odd"
//		16 multiples are 1*16, 2*8, 4*4, 8*2, 16*1	<---total multiples "5" i.e "odd"
		
//		so on ......... for all square hence they always turn "ON" after "Toggle"
		
//		Q)  we need to find the "number" at the end turn "ON".
		
		
		int a = 30;
		System.out.println("Here is numbers which turn ON Always");
		for(int i=1; i<a ; i++) {
			System.out.print(" "+ i*i);
		}
		
	}

}

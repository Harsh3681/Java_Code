package _1_Recursion;

public class Tower_Of_Hanoi_Prooble_Solve_Recursion {

	public static void TOH(char sourse, char support, char destination, int NoOfDisk) {
		if(NoOfDisk>0) {
			TOH(sourse,destination,support, NoOfDisk-1);
			System.out.println("Move 1 disk from "+sourse+" to "+ destination+" using "+support);
			TOH(support, sourse, destination, NoOfDisk-1);
		}
	}
	
//	In the above code we are first moving the n-1 disk from Tower A to Tower B, then moving that nth disk from Tower A to Tower C, and finally, 
//	the remaining n-1 disk from Tower B to Tower C. And we are doing this recursively for the n-1 disk
	
	public static void main(String[] args) {
		TOH('A','B','C',3);
	}

}

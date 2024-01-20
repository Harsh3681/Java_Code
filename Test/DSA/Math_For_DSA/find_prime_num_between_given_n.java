package Math_For_DSA;

public class find_prime_num_between_given_n {

//	so if initially all are "false" then nums which we make "true" during operation are "Not prime" num
	
//	so here we thought to make all that nums which are multiple of "prime" num to be "true" so that they are "not prime" <---- that the logic
	
//	"False" in array means num is "Prime"
	
	static void find(int n, boolean[] prime) {
		for(int i=2; i*i<=n ; i++) {
			if(!prime[i]) {	// means is it "False" i.e correct
				for(int j= i*2; j<=n; j+=i) { // here make all "multiple" of Prime num to "true" ans "j+=i" becz we take multiple so "j" must need to run j+=i let 2 so 2+i =4 then 6, 8, 10..... same for 3 , 4 and all
					prime[j] = true;
				}
			}
		}
		
		for(int i=2; i<=n ; i++) {
			if(!prime[i]) {
				System.out.print(i+" ");
			}
		}
			
	}
	
	public static void main(String[] args) {
		
//		  Time complexity
//		  O(n*Log(Log(n)))
		
		
		int n=20;
		boolean[] prime= new boolean[n+1]; // here all the nums initially "False" and n+1 becz "n" itself "inclusive"
		find(n, prime);
	}

}

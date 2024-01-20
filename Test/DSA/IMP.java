
import java.util.*;

public class IMP {

	public static void main(String[] args) {
		// for math
		
		// 		% 	operator for getting quotient     ex  53%10 =  ans  = 3
		// 		/   operator for getting remainder	  ex.  53/10 =  ans = 5
		
		
		
// -----------------------------------------------------------------------------
		
		// Arrange the Array according there index position
		// let intdex be i=0  = i+1
		
		// [0,1,2,3]
		// [1,2,3,4]
		// after swap count how much swap required
		
		
		
		List<Integer> v = new ArrayList<Integer>();
		int c=0;
		 
        // populate the v
		v.add(3);
		v.add(2);
		v.add(1);
        v.add(0);
      
        // printing the v before swap
        System.out.println("Before swap: " + v);
       
        for(int i=0; i<v.size()-1; i++) {
        	if(v.get(i) != i+1) {
        		
        		Collections.swap(v, i, i+1);
        		c++;
        	}
        }
        System.out.println(c);
        

        // printing the v after swap
        System.out.println("After swap: " + v);
		
	}

	

}


public class _09_Call_by_Reference_With_Methods {

//	If We create An method()
	
	static void change(int x) {
		x = 9; 
	}
	
//	But In Case OF AN Array 
	
	static void change2(int a[]) {
		a[0] = 99;
	}
	
	public static void main(String[] args) {
		
		int p = 7;
		change(p);
		System.out.println("Value OF p = "+ p);		// o/t  7
		
//		Here this Happen due to value is passed it's "copy" and not actual value
//		But In Case Of Array it is not same
//		let's see
		
		int arr[] = {4,6,7,9,4,3};
		change2(arr);
		
		System.out.println("Value OF 0th place = "+ arr[0]);		// o/t	99
		
//		because here value is passed it's reference arr  <-- is one kind of object here which pass it's reference
	}

}

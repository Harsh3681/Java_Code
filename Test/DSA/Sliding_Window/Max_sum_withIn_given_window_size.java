package Sliding_Window;

public class Max_sum_withIn_given_window_size {

	public static void main(String[] args) {
		
		int arr[] = {1,3,5,4,11,1,33,4};
		int max=0,i=0,j=0,s=0,k=2,n=arr.length;
		
//		Here we need to find the max sum within window size 3
//		EX. 8,2,9 having max sum i.e 19 
//		ans = 19
		
	
		while(j<n) {
			s+=arr[j];
			if(j-i+1!=k) {
				j++;
			}
			else if(j-i+1==k) {
				max = Math.max(max, s);
				while(i<=j) {
					s-=arr[i];
					i++;
				}
				j++;
			}
		}
		
		System.out.println(max);
		
		
	}

}

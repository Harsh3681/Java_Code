package Binary_Search;

public class Amazon_Que {
	
	public static int ans(int arr[], int tar) {
		int start = 0, end = 1;
		
		while(tar>arr[end]) {
			int temp = end+1;   // it's an new start why we take the temp becz we can't change start before assign value
			
//			formula ---> 		 end = previous end + sizeOfbox * 2
//	here how we take sizeOfbox ---->	 (end-start+1)	
			
			end= end+(end-start+1)*2;
			start = temp;
		}
		
		return binarySearch(arr,tar,start,end);

	}
	
	
	public static int binarySearch(int arr[],int tar,int start, int end) {

		while(start<=end) {
			int mid = start + (end-start)/2;
			if(tar<arr[mid]) {
				end = mid-1;
			}else if(tar>arr[mid]) {
				start = mid+1;
			}else {
				return mid;
			}
		}
		
		return -1;
		
	}
	
	
	public static void main(String[] args) {
//		Don't know why is it not working 
		
		int tar =11;
		int arr[] = {2,4,6,6,7,9,11,15,17,19,22};		
		System.out.println(ans(arr,tar));
		
	}

}

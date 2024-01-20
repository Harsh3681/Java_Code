package ArraysClass_And_CollectionsClass;
public class solve {
	

	
//	public static void find(HashMap<Integer,Integer> hm, int target) {
//		for(Integer i: hm.values()) {
//			for(Integer j: hm.values()) {
//				if(i+j==target) {
//					System.out.println(i + " , "+j);
//					break;
//				}
//			}
//		}
//	}
	
	
//	----------------------------------------------------------------------------------------

//			linkedList Sort	
	
//	Integer l1 = [1,2,4];
//	Integer l2 = [1,3,4];
	
//	public static void link(LinkedList<Integer> l1, LinkedList<Integer> l2) {
//		
//		LinkedList<Integer> l3 = new LinkedList<>();
//		l1.sort(Comparator.naturalOrder());
//		l2.sort(Comparator.naturalOrder());
//		l3.addAll(l1);
//		l3.addAll(l2);
//		l3.sort(Comparator.naturalOrder());
//		System.out.println(l3);
//	}
	

//	----------------------------------------------------------------------------------------

//	public static int[] arrange(int nums[]) {
//		int size = nums.length;
//		
//		int ans[] = new int[size];
//		for(int i=0; i<size; i++) {
//			ans[i] = nums[nums[i]];
//		}
//	    
//		return ans;
		
	
		
//		2nd approch
	
		
		
//		int n = nums.length;       
//        for(int i=0; i<n; i++){
            // this is done to keep both old and new value together. 
            // going by the example of [5,0,1,2,3,4]
            // after this nums[0] will be 5 + 6*(4%6) = 5 + 24 = 29;
            // now for next index calulation we might need the original value of num[0] which can be obtain by num[0]%6 = 29%6 = 5;
            // if we want to get just he new value of num[0], we can get it by num[0]/6 = 29/6 = 4
//            nums[i] = nums[i] + n*(nums[nums[i]] % n);
//        }
      
//        for(int i=0; i<n; i++){
//            nums[i] = nums[i]/n;
//        }
//        
//        return nums;
		
		
	
//	}
	
	
//	----------------------------------------------------------------------------------------
	
//	Removing Duplicate element
	
	
//	public static int removeDuplicates(int[] nums) {
//		
//		
//		int i=0;
//		for(int j=1; j<nums.length; j++) {
//			if(nums[i] == nums[j]) {
//				continue;
//			}
//			nums[++i] = nums[j];
//		}
//		
//		return i+1;
//		
//		
//	}
	
	
//	----------------------------------------------------------------------------------------

//		Last Index
	
//	public static int jio(String s, String f) {
//		int k = s.lastIndexOf(f);
//		return k;
//		
//	}
			
//	----------------------------------------------------------------------------------------
	
//	parentheses		problem
	
	
//	public static boolean parentheses(String s) {
//		
//		Stack<Character> st = new Stack<>();
//		int l = s.length();
//		for(int i=0; i<l; i++) {
//			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ) {
//				st.push(s.charAt(i));
//			}
//			else {
//				if(!st.isEmpty()) {
//					if(s.charAt(i) == ')' && st.peek()== '(' ) {
//						st.pop();
//					}
//					else if(s.charAt(i) == ']' && st.peek()== '[' ) {
//						st.pop();
//					}
//					else if(s.charAt(i) == '}' && st.peek()== '{' ) {
//						st.pop();
//					}
//					else {
//						
//						return false;
//					}
//				}
//				else {
//					return false;
//				}
//			}
//		}
//		return st.isEmpty();
//		
//	}
	
//	----------------------------------------------------------------------------------------

	
//	InsertAtPosition
	
//	public static int InsertAtPosition(int[] nums, int target) {
//		int l = nums.length;
//		ArrayList<Integer> arr = new ArrayList<>();
////		Integer arr[] = new Integer[l];
//		for(int i=0; i<l; i++) {
//			arr.add(i, nums[i]);
//		}
//		
//		if(arr.contains(target)) {
//			return arr.indexOf(target);
//		}
//		
//		else {
//			arr.add(target);
//			arr.sort(Comparator.naturalOrder());
//			
//		}
//		
//		return arr.indexOf(target);
//	}
	
	
//	----------------------------------------------------------------------------------------

//			Length Of Last Word
	
//	public static int LastWord(String s) {
		
//		"    fly me   to   the moon  "
//		"Hello World"
//		"luffy is still joyboy"
		
//		int l=s.length();
//		int c=0;
//		for(int i=l-1; i>=0 ; i--) {
//			if(s.charAt(i)!=' ') {
//				c++;
//			}
//			else {
//				if(c>0) {
//					return c;
//				}
//			}
//		}
//		
//		return c;
//		
//	}

	
//	----------------------------------------------------------------------------------------

//	  Plus One completed
	
//	public static int[] plusOne(int [] arr) {
//		
//		int n = arr.length;
//		for(int i=n-1; i>=0; i--) {
//			if(arr[i]==9) {
//				arr[i]=0;
//			}
//			else {
//				arr[i]+=1;
//				return arr;
//			}
//			
//			
//		}
//		
//		int [] nev = new int[n+1];
//		nev[0] = 1;
//		
//		return nev;
//		
//	}

	
//	----------------------------------------------------------------------------------------
		
//		concatination of 2 arrays
	
//	public static int[] concatinate(int [] nums) {
//		
//		int arr[] = new int[nums.length*2];
//
//		
//		for(int i=0; i<nums.length; i++) {
//			arr[i] = arr[nums.length +i] = nums[i];
//		}
//		
//		return arr;
//	
//	}
	
//	----------------------------------------------------------------------------------------
	
//			runningSum	Completed 
	
//	public static int[] runningSum(int[] num) {
//		
//		for(int i=1; i<num.length; ++i) {
//			num[i] += num[i-1];
//		}
//		
//		return ans;
//		
//	}
	
//	----------------------------------------------------------------------------------------

//	"Binary Addition"		bakii
	
//	public static String addBinary(String a, String b) {
		
//		 11    	 1
//		1010  1011
//		String s="";
//		int v[] = new int[a.length()];
//		char k;
//		
//		for(int i=a.length()-1; i>=0; i--) {
//			if(a.charAt(i)!='0' || a.charAt(i)!='1' ) {
//				return s;
//			}
//			k = a.charAt(i);
//			if(k==b.charAt(i)) {
//				v[i] = 1;
//			}
//			else {
//				v[i] = 0;
//			}
//		}
//		return v.toString();
//		
//	}
	
//	----------------------------------------------------------------------------------------
		
//	public static int sqrt(int x) {			// remaining
//		long y=1;
//		while(y*y<=x) {
//			y++;
//		}
//		return (int) (y-1);
//		
//	}


	
//	----------------------------------------------------------------------------------------
	
	





	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int n=3;
//		System.out.print(n+"");
//		while(n!=1) {
//			int m=n;
//			if(m%2==0) {
//				m = m/2;
//			}
//			else {
//				m = (m*3)+1;
//			}
//			n = m;
//			System.out.print(" "+m);
//		}
		
		
		
		
//		----------------------------------------------------------------------------------------		
		
//		int counter = 10;
//		System.out.println(BigInteger.valueOf(counter).testBit(0));
		
		
//		----------------------------------------------------------------------------------------		
		
//		int arr[] = {1,2};				// remaining
//		int arr2[] = {3,4};	
//		int l =arr.length + arr2.length;
//		int arr3[] = new int[l];
//		for(int i=0; i<l; i++) {
//			if(i<arr.length) {
//				arr3[i] = arr[i];
//			}
//			else {
//				arr3[i] = arr2[i-arr.length];
//			}
//		}
//		Arrays.sort(arr3);
//		int s =0;
//		for(int i=0; i<l; i++) {
//			s += arr3[i];
//		}
//		
//		for(int i=0; i<l; i++) {
//			if(l%2==0) {
//				double s = arr[Math.ceil(l/2)] + arr[Math.floor(1/2)]; 
//			}
//		}
//		else {
//			median = (double) 
//		}
		
//		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(arr));
		
		
//		for(int i=0; i<l; i++) {
//			
//			System.out.print(arr3[i] + " ");
//		}
		
			
//		----------------------------------------------------------------------------------------		
		
//		sqr.t
		
//		int x=8;							// space complexcity of this function is O(1)
//		System.out.println(sqrt(x));		// and time complexcity is O(under root of x)
		
//		----------------------------------------------------------------------------------------
		
//		"Binary Addition"		bakii
		
//		String a="11";
//		String b="1";
//		System.out.println(addBinary(a,b));
		
//		----------------------------------------------------------------------------------------
		
//		runningSum	Completed 		
		
//		int num[] = {2,1,1,1,1};	
//		runningSum(num);
			

//		----------------------------------------------------------------------------------------
		
//		concatination of 2 arrays
		
//		int a[] = {1,2,3,1};
//		System.out.println(concatinate(a));		
		
//		----------------------------------------------------------------------------------------
		
//		Plus One completed			explain below
		
//		int arr[] = {2,3,5,8}; 
//		plusOne(arr);
		
//		int n = arr.length;
//		for(int i=n-1; i>=0; i--) {
//			if(arr[i]==9) {
//				arr[i]=0;
//				System.out.println(arr[i]);
//			}
//			else {
//				arr[i]+=1;
//				System.out.println(arr[i]);
//			}
//			
//			
//		}
//		
//		int [] nev = new int[n+1];
//		nev[0] = 1;
//		
//		for(int i=0;i<nev.length; i++) {
//			System.out.print(nev[i]+" ");
//		}
	
		
		
		
		
//		----------------------------------------------------------------------------------------
		
//		Length Of Last Word
		
		
//		String s = "    fly me   to   the moon  ";
//		System.out.println(LastWord(s));
		
//		----------------------------------------------------------------------------------------
		
//		InsertAtPosition
		
//		int num[] = {1,3,5,6};
//		System.out.println(InsertAtPosition(num, 7));
		
		
//		----------------------------------------------------------------------------------------
//		parentheses	 problem
		
//		String s = "(){}[]";
//		System.out.println(parentheses(s));
		
		
//		----------------------------------------------------------------------------------------
	
//		Last Index
		
//		String s = "hello";
//		String f = "ll";
//		
//		System.out.println(jio(s,f));

//		----------------------------------------------------------------------------------------

		
//		Date d = new Date();
//		System.out.println(d);
		

//		----------------------------------------------------------------------------------------

		
//		Removing Duplicate element
		
//		int nums[] = {0,0,1,1,1,2,2,3,3,4};
//		System.out.println(removeDuplicates(nums));
	
//		----------------------------------------------------------------------------------------

		
//		ArrayList<Integer> ar = new ArrayList<>();
//		ar.add(2);
//		ar.add(3);
//		ar.add(6);
//		ar.add(4);
//		
//		System.out.println(ar);
//		
//		HashMap<Integer, Integer> h = new HashMap<>();
//		for(int i=0;i<ar.size(); i++) {
//			h.put(i,ar.get(i));
//		}
//		
//		find(h,7);
		
		
		
//		----------------------------------------------------------------------------------------
		
		
		
//		strs = ["dog","racecar","car"]
		
//		String arr[ ]= {"flower","ow","flight"};
//		String ot = "";
//		
//		if(arr.length==0) {
//			System.out.println("");
//		}
//		else if(arr.length==1) {
//			System.out.println(arr[0]);
//		}
//		else {
//			int le = arr[0].length();
//			Arrays.sort(arr);
//			StringBuilder res = new StringBuilder();
//			for(int i=0; i<le; i++) {
//				if(arr[0].charAt(i) == arr[arr.length-1].charAt(i)) {			//   arr.length-1  means last ele in array  "flight
//					res.append(arr[0].charAt(i));
//				}
////				else stop the comparison   
//				
//				else {
//					break;
//				}
//			}
//			ot = res.toString();
//		}
//		
//		if(ot=="") {
//			System.out.println("''");
//		}
//		else {
//			System.out.println(ot);
//		}
		

//		----------------------------------------------------------------------------------------
		
//		String s = "III";			// LVIII	MCMXCIV     III
//		int result=0;
		
//		HashMap<Character,Integer> num = new HashMap<>();
//		num.put('I',1 );
//		num.put('V', 5);
//		num.put('X', 10);
//		num.put('L', 50);
//		num.put('C', 100);
//		num.put('D', 500);
//		num.put('M', 1000);
//		
//		for(int i=0; i<s.length(); i++) {
//			if(i>0 && num.get(s.charAt(i)) > num.get(s.charAt(i-1))) {
//				result += num.get(s.charAt(i)) - 2*num.get(s.charAt(i-1));
//			}
//			else {
//				result += num.get(s.charAt(i));
//			}
//		}
//		System.out.println(result);
		
		

//		----------------------------------------------------------------------------------------
		
//		linkedList Sort
		
////		Integer l1 = [1,2,4];
////		Integer l2 = [1,3,4];
//		LinkedList<Integer> l1 = new LinkedList<>();
//		LinkedList<Integer> l2 = new LinkedList<>();
//		l1.add(2);
//		l1.add(4);
//		l1.add(1);
//		l2.add(4);
//		l2.add(1);
//		l2.add(3);
//
//		link(l1,l2);
		

		
//		----------------------------------------------------------------------------------------

//		int nu = -121;
//		int s=0;
//		int r=0;
//		int tem=nu;
//		while(nu!=0) {
//			r = nu%10;
//			s = (s*10)+r;
//			nu = nu/10;
//
//		}
//		if(s==tem && tem>0 ) {
//			System.out.println("Palli");
//		}
//		else {
//			System.out.println("Not");
//		}
		
		
		
//		----------------------------------------------------------------------------------------

		
		
//		nums = [5,0,1,2,3,4]
//		Output: [4,5,0,1,2,3]
		
//		int arr[] = {5,0,1,2,3,4};
//		arrange(arr);
		
		
	}



}

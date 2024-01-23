package CollectionFrameWorkInJava;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

//		all operation carry out in " O(log n) "  like "TreeSet"

		//		Map Interface

		//A)	HashMap		* 
		//B)	TreeMap		* 
		//C)	EnumMap
		//D)	LinkedHashMap
		//E)	WeakHashMap

public class _4_5HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Map<Integer, String> num = new HashMap<>();
		Map<Integer, String> num1 = new HashMap<Integer, String>();
	
		num1.put(1, "one");
		num1.put(2, "two");
		num1.put(5, "five");
		num1.put(6, "six");
		num1.putIfAbsent(null, null);
		System.out.println(num1);
		Set<Integer> st = new HashSet<>();
		
		
		num1.putIfAbsent(11, "eleone");
		
		num1.remove(1);
		
		num1.replace(2,"three");
		num1.replace(2,"yee");
		
		num1.putIfAbsent(3, "three");
		num1.replace(2, "three", "thirty");
//		System.out.println(num.containsKey(5);
		
//		 int max =Integer.MAX_VALUE;
//		 System.out.println(max);
		
		System.out.println(num1.entrySet());
//		Map.Entry<K, V>
		System.out.println(num1.get(3));				// we put  key here and get the value
		
		
//		System.out.println(num.values());
//		System.out.println(num.keySet());
		
//		for(java.util.Map.Entry<Integer, String> i : num.entrySet()) {			
//			System.out.println(i.getKey());
//			System.out.println(i.getValue());
//		}
		
		
		//		for(String s : num.values()) {		// by num.values() get only num		and by num.keySet()
//			System.out.println(s);
//		}
		
//		System.out.println(num);
		
//		-----------------------------------------------------------------------------------------
		
//		#############  	IMP    #############
		
//		How can we find an "key"  by specifying an "value" of an key
		// here below is code
		
		System.out.println("\n\nMe Entry Map");
		
		String val = "five";
		
		for(Map.Entry<Integer, String> en : num1.entrySet()) {
			System.out.println(en);
			
			if(en.getValue()==val) {
				System.out.println("key of value "+ val +" is "+ en.getKey());
			}
			System.out.println(en.getValue());
			System.out.println(en.getKey());
			String v =en.getValue();
			
		
		}
		
		
		
		
		
		
		
		
	}

}

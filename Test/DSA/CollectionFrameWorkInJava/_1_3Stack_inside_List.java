package CollectionFrameWorkInJava;
import java.util.*;



public class _1_3Stack_inside_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List <String> an = new Stack<>();		// Valid

		Stack <String> stk = new Stack<>();
		
		stk.add("bottom");
		stk.add("jay1");
		stk.add("jay2");
		stk.add("jay3");
		stk.add("jay343");
		stk.setElementAt("Har", 1);
		stk.set(2, "Mar");
	
		String ak[] = new String[stk.size()];
	
		stk.copyInto(ak); 
	
	 
	 
		System.out.println("me "+Arrays.toString(ak));
		System.out.println(stk.isEmpty());
		System.out.println(stk.empty());
		
		System.out.println(stk.size());
		System.out.println(stk.capacity());
	
		System.out.println(stk);
		
		System.out.println(stk.peek());
		
		stk.pop();
		
		System.out.println(stk);
		
		stk.push("nayan");
		
		stk.add(2, "geetika");
		
		System.out.println(stk);
		
		Stack<String> mani = new Stack<>();
		
		mani.addElement("sd");
		
		mani.add("top");
		
		stk.addAll(mani);
		
		System.out.println(stk);
		
		stk.addAll(2, mani);
		
		System.out.println(mani);
		System.out.println(stk);
		
		System.out.println(stk.contains("jay0"));
		
		System.out.println(stk.containsAll(mani));
		
		System.out.println(stk.firstElement());
		
		System.out.println(stk.capacity());
		Stack<String> s = new Stack<>();
		s = (Stack)stk.clone();
		
		System.out.println(s);
//		System.out.println(mani.peek());

		
	}
		

}

import java.util.*;

/*
 * 		Static Method()		In interfaces
 * 		Static Method Is method which is associated with "Class" Not with Object  or 		with "Interface" <---why with interface becz
 * 		we are able to create reference of interface easily.........
 * 
 * 
 * 		Default Method()
 *		default method allow as to "add new functionality" in "existing interfaces"
 */



interface camera{
	
	void takeSnap();
	void recordVideo();
	
	default void flash() {			// without "default keyword" it show in inhereted class of camera" to implement the method or "make class abstract"
	
		System.out.println("Starting Flash Of Mobile");
	}
}

interface wifi{
	
	String[] getNetwork();		// Array Method
	
	void connToNetwork(String net);
}

class MyCellPhone{			// Superclass
	
	void Receive(int RecNum) {
		System.out.println("Received Call...."+ RecNum);
	}
	
	void callNum(int ConNum) {
		System.out.println("Calling.... "+ ConNum);
	}
	
}

class MySmartPhone extends MyCellPhone implements camera , wifi{			//  "extends" and "implements" both same time

	@Override
	public String[] getNetwork() {
		String[] getNetwork = {"Jio", "Artel", "Vodaphone","VI" };
		
		System.out.println("Getting List Of Network");
		
		return getNetwork;
	}

	@Override
	public void connToNetwork(String net) {
		System.out.println("Connect To Network " + net);
		
	}

	@Override
	public void takeSnap() {
		System.out.println("Know We Take Phone");
		
	}

	@Override
	public void recordVideo() {
		System.out.println("Best Video Recorder");
		
	}
	
	public void flash() {
		System.out.println("Stating Flash OF My SmartPhone");
	}
	
}



public class _22_2Example_Of_Interface {

	public static void main(String[] args) {
		
		MySmartPhone m = new MySmartPhone();
		
		String [] arr ;		// create an array of String	to store the name of an array
		
		arr = m.getNetwork();		// and calling method by obj	"m"	
		
		for( String x : arr) {
			System.out.println(x);
		}
		
		m.connToNetwork("jio");
		
		m.flash();			// before overriding the method in "Subclass"
		
	}

}

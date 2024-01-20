
import java.util.*;

public class _01_Application_We_Are_Able_To_Create_by_JAva {
	
	
			/*		Application_We_Are_Able_To_Create_by_JAVA
			 * 
			 * 		1) Stand Alone Application		Ex. Simple Calculator		<---------
			 * 			we are using Swings, AWT, java FX, NeatBeans 
			 * 	
			 * 		2) Client Side Application						<---------
			 * 			we are using "java.net" package	under this package we have "Client Socket and Server Socket" classes
			 * 
			 * 		J2EE
			 * 		1) Web Application						<---------
			 * 
			 * 				we can create the web appliction by using the "servlet", "JSP", "Filter", or by using "Tag libraries"
			 * 				By using any one of this we can create web application in java
			 * 
			 * 				By using Servlet we can create the facebook kind of application where we deploy our application on "web"
			 * 				we can acceses this application by any browser
			 * 	
			 * 
			 * 		EJB - Enterprise Java Beans
			 * 
			 * 		1) "Enterprise java Application"	create by "EJB"				<---------
			 * 
			 * 				means one application(device) can talk to another device (means multiple distributed services)
			 * 				"EJB" will create the services and that Services talk to each other.
			 * 		
			 * 		
			 * 		1) "Enteroperable Application"		build by Core Java			<---------
			 * 
			 * 				means if java Application want to talk to with Application Build in "Other Languages" like .Net, PHP	etc
			 * 				There We need to talk by "XML" or "JSON" format.
			 * 				XML - Extensible Markup Language
			 * 				JSON - Java-Script Object Notation.				
			 * 
			 * 				"Enteroperable Application"		build by Core Java  
			 *					by "API's"  like  Jax-rpc,  jax-ws,  jax-rs by using this API's we can build "Enteroperable Application"
			 * 
			 * 		
			 * 	
			 * 
			 * */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t,n;
		int a[]= new int[100] ;
		Scanner sc = new Scanner(System.in);
		System.out.println("e");
		t = sc.nextInt();
		for(int i=0; i<t; i++){
			System.out.println("n");
		    n = sc.nextInt();
		    for(int j=0; j<a.length; j++){
		        a[j] = sc.nextInt();
		        System.out.println("3");
		    }
		}
//		int p, q;
		for(int p=0; p<a.length; p++){
		    for(int q=0; q<a.length; q++){
		        if(a[p]==a[q+1]){
		            System.out.println("YES");
		            break;
		        }
		        
		    }
		}
		System.out.println("NO");
		
		

	}

}

package Cryptography_Practical;

import java.util.Scanner;

public class Ceasar_Cipher {
	
public static String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static String Encryption(String inp, int k) {
		String enString = "";
		for(int i=0; i<inp.length(); i++) {
			if(Character.compare(inp.charAt(i), ' ')==0) {
				enString+=' ';
				continue;
			}
			int pos = alpha.indexOf(inp.charAt(i));	// here we get char "alpha" position
			int encryptedPos  = (pos + k) % 52;
			char encryptedChar = alpha.charAt(encryptedPos);
			
			enString+=encryptedChar;
		}
		
		return enString;
	}
	
	public static String decryption(String inp, int k) {
		inp = inp.toLowerCase();
		String deCrypString = "";
		for(int i=0; i<inp.length(); i++) {
			if(Character.compare(inp.charAt(i),' ')==0) {
				deCrypString+=' ';
				continue;
			}
			int pos = alpha.indexOf(inp.charAt(i));
			int decryptPos = (pos-k)%52;
			if(decryptPos<0) {
				decryptPos = alpha.length() + decryptPos;
			}
			
			char newChar = alpha.charAt(decryptPos);
			deCrypString+=newChar;
		}
		
		return deCrypString;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string for encryption");
		String inputStr = sc.nextLine();
		System.out.println("Enter the key ");
		int key = Integer.valueOf(sc.nextLine());
//		int key  = sc.nextInt();		// work same as above
		System.out.println("Encrypted Data ===> " + Encryption(inputStr, key));
		System.out.println("Decrypted Data ===> " + decryption(Encryption(inputStr, key), key));
		sc.close();
	}

}

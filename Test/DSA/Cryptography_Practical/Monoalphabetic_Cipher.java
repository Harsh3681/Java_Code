package Cryptography_Practical;

import java.util.Scanner;

public class Monoalphabetic_Cipher {
	public static String normalStr = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static String CodedChar = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
	
	public static String Encryption(String s, String k) {
		String EncryptStr = "";
		for(int i=0; i<s.length(); i++) {
			for(int j=0; j<52; j++) {
				if(s.charAt(i)==normalStr.charAt(j)) {
					EncryptStr+=k.charAt(j);		// here use "j"
					break;
				}
				if(s.charAt(i)==' ' || s.charAt(i)=='-') {
					EncryptStr+=s.charAt(i);
					break;
				}
			}
		}
		return EncryptStr;
	}
	
	public static String Decryption(String s, String k) {
		String DecryptStr = "";
		for(int i=0; i<s.length(); i++) {
			for(int j=0; j<52; j++) {
				if(s.charAt(i)==k.charAt(j)) {
					DecryptStr+=normalStr.charAt(j);		// here use "j"
					break;
				}
				if(s.charAt(i)==' ' || s.charAt(i)=='-') {
					DecryptStr+=s.charAt(i);
					break;
				}
			}
		}
		return DecryptStr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string for encryption");
		String inputStr = sc.nextLine();
		System.out.println("Enter the key ");
		String key = sc.nextLine();
		String encryptedString = Encryption(inputStr, key);
		System.out.println("Encrypted message: "
		+ encryptedString);
		System.out.println("Decrypted message: "
		+ Decryption(encryptedString, key));
		sc.close();
	}

}

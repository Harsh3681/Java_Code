package Cryptography_Practical;

public class Vigenere_Cipher {
	
	public static String generateKey(String s, String key) {
		String keyString = "";
		int l = s.length();
		for(int i=0; ;i++) {
			if(l==i) {
				i=0;
			}
			if(s.length()==key.length()) {
				break;
			}
			key+=s.charAt(i);
		}
		return key;
	}
	public static String cipherText(String s, String key) {
		String cipherString = "";
		for(int i=0; i<s.length(); i++) {
			int x = (s.charAt(i) + key.charAt(i))%26;
			x+='A';
			cipherString+=(char)x;
		}
		
		
		return cipherString;
	}
	public static String plainText(String s, String key) {
		String plainString="";
		
		for(int i=0; i<s.length() && i<key.length(); i++) {
			int x = (s.charAt(i) - key.charAt(i)+26)%26; // 2 times 26
			x+='A';
			plainString+=(char)x;
		}
		
		return plainString;
	}
	
	
	
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String Str = "VigenereCipher";
		String Keyword = "HACK";
		String str = Str.toUpperCase();
		String keyword = Keyword.toUpperCase();
		String key = generateKey(str, keyword);
		String cipher_text = cipherText(str, key);
		System.out.println("Ciphertext : "+ cipher_text + "\n");
		System.out.println("Original/Decrypted Text : "+plainText(cipher_text, key));
	}

}

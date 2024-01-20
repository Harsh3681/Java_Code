package Clg_Practice;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.util.Arrays;

public class CNS_Ass_5 {
	
	public static byte[] sha1(String message) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        byte[] digest = md.digest(message.getBytes());
        return digest;
    }

    public static String sha1Hex(String message) throws Exception {
        byte[] digest = sha1(message);
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
	
//	public static String sha1(String message) {
//        try {
//            // Initialize the SHA-1 message digest
//            MessageDigest digest = MessageDigest.getInstance("SHA-1");
//
//            // Convert the message string to bytes and update the digest
//            byte[] messageBytes = message.getBytes(StandardCharsets.UTF_8);
//            digest.update(messageBytes);
//
//            // Calculate the hash value
//            byte[] hashBytes = digest.digest();
//
//            // Convert the hash value to a string of hexadecimal characters
//            StringBuilder hexString = new StringBuilder();
//            for (byte b : hashBytes) {
//                String hex = Integer.toHexString(0xff & b);
//                if (hex.length() == 1) {
//                    hexString.append('0');
//                }
//                hexString.append(hex);
//            }
//            return hexString.toString();
//        } catch (NoSuchAlgorithmException e) {
//            throw new RuntimeException(e);
//        }
//    }
	
	public static void main(String[] args) throws Exception {
		 // User input for the message string
//        String message = "Hello, World!";
//
//        // Calculate SHA-1 hash
//        String hash = sha1(message);
//
//        // Display the calculated SHA-1 hash
//        System.out.println("SHA-1 Hash of the message: " + hash);
//
//        // Demonstrate using the hash value (for example, here just displaying the first 8 characters)
//        System.out.println("First 8 characters of the hash: " + hash.substring(0, 8));
    
		
		String message = "Hello World";
        String hash = sha1Hex(message);
        System.out.println("Hash: " + hash);
		
		
		
		
		
		
		
	}

}

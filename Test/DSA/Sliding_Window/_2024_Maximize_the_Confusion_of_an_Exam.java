package Sliding_Window;

public class _2024_Maximize_the_Confusion_of_an_Exam {
	
	public static int FindAns(String s, int k, char c){
        int i=0, j=0, ans=0, cnt=0, n=s.length();
        while(j<n){
            if(s.charAt(j)==c){
                cnt++;
            }
            while(cnt>k && i<n){
                if(s.charAt(i)==c){
                    cnt--;
                }
                i++;    
            }
            ans = Math.max(j-i+1,ans);
            j++;
        }
        return ans;
    }
	
	public static void main(String[] args) {
		
//		Q) A teacher is writing a test with n true/false questions, 
//		with 'T' denoting true and 'F' denoting false. He wants to 
//		confuse the students by maximizing the number of consecutive 
//		questions with the same answer (multiple trues or multiple falses in a row).
//		You are given a string answerKey, where answerKey[i] is the original answer
//		to the ith question. In addition, you are given an integer "K" , the maximum number
//		of times you may perform the following operation:
//		Change the answer key for any question to 'T' or 'F' (i.e., set answerKey[i] to 'T' or 'F').
//		Return the maximum number of consecutive 'T's or 'F's in the answer key after performing the operation at most k times.
		
		
//		Input: answerKey = "TTFF", k = 2
//				Output: 4
//				Explanation: We can replace both the 'F's with 'T's to make answerKey = "TTTT".
//				There are four consecutive 'T's.
//				Example 2:
//
//				Input: answerKey = "TFFT", k = 1
//				Output: 3
//				Explanation: We can replace the first 'T' with an 'F' to make answerKey = "FFFT".
//				Alternatively, we can replace the second 'T' with an 'F' to make answerKey = "TFFF".
//				In both cases, there are three consecutive 'F's.
		

			String answerKey = "TFFT";
			int k = 1;
	        int ans1 = FindAns(answerKey,k,'T');
	        int ans2 = FindAns(answerKey,k,'F');
	        
	        System.out.println("a1 "+ ans1 + " a2 "+ ans2);
	        
	        System.out.println(Math.max(ans1,ans2));
		   
	}

}

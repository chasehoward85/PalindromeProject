import java.io.*;
import java.util.*;

public class PalindromeProject {

	public static void main(String[] args) {

		Scanner kbReader = new Scanner(System.in);
		System.out.println("Input a word:");
		String word = kbReader.nextLine();
		tester(word, 0);

	}
	
	public static String tester(String w, int x){
		
		int mid;
		String revWord = "";
		String fh = "";
		String sh = "";
		
		mid = w.length() / 2;
		
		if(x == 0){	
			fh = w.substring(0, mid);
			
			for(int i = 0 ; i < fh.length(); i++){
					String word2 = fh.substring(fh.length()-1-i,fh.length()-i);
					revWord += word2;
				}
			
			sh = tester(w, mid);
		}
						
		if(x != mid){
			if(revWord.equals(sh)){
				System.out.println("Yes, this is a palindrome.");
			}
			else{
				System.out.println("No, this is not a palindrome, try again.");
			}
		}
		
		if(x == mid){
			sh = w.substring(mid + 1);
		}
		return sh;
	}
}
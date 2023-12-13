package JavaBasics;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class sample9 {
		
		public static void main(String[] args) {
			String s="madam";
			String res="";
			for (int i = s.length()-1; i >=0; i--) {
				char c = s.charAt(i);
				res=res+c;
			}
		if (s.equals(res)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		}
}
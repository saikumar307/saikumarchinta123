package javaProgrammes;

public class sample2 {
	public static void main(String[] args) {
		String s="madam";
		String rev=" ";
		for (int i =s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			rev=rev+c;
			
		}if (s.equals(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palidrome");
		}
	}
}

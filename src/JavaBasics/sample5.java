package JavaBasics;

public class sample5 {
	public static void main(String[] args) {
		int num =123;
		
		int n =num;
		
		int rem =0;
		
		int res =0;
		
		while (num>0) {
			
			rem =num%10;
			
			res =(res *10)+rem;
			
			num =num /10;
			
		}
		if (n==res) {
			
			System.out.println("The number is palindrome");
			
		}
		else {
			System.out.println("The number is palindrome");
		}
		
	}
	
	
}

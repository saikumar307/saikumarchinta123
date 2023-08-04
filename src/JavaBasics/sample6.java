package JavaBasics;

public class sample6 {
		
	public static void main(String[] args) {
		int num = 153;
		
		int n = num;
		
		int rem =0;
		
		int res =0;
		
		
		while (num >0) {
			
			rem =num %10;
			
			res =res+(rem*rem*rem);
			
			num = num /10;
			
			
		}
		if (n==res) {
			
			System.out.println("The given number is armstrong");
			
		}
		else {
			System.out.println("the given number is not a armstrong");
		}
	}
}

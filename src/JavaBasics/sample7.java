package JavaBasics;

public class sample7 {
	
	public static void main(String[] args) {
		
		
		int num = 183;
		
		int rem =0;
		
		int res =0;
		
		
		while (num>0) {
			rem = num%10;
			res =rem+res;
			
			num =num/10;
			
			
		}
		System.out.println(res);
	}
}

package JavaBasics;

public class demo6 {
	
	
	public static void main(String[] args) {
		String s="welcome to java class";
		
		String[] sp = s.split("");
		
		String rev="";
		
		for (int i = sp.length-1; i >=0; i--) {
			
			String temp =sp[i];
			
			rev = rev+temp+"";
			
			
		}
		
		System.out.println(rev);
		
	}
}

package JavaBasics;

public class demo7 {
	
	
	public static void main(String[] args) {
		
		
		String s= "welcome to java class";
		
		String[] sp = s.split("");
		
		String rev ="";
		
		for (String s1 : sp) {
			char c = s1.charAt(0);
			String sub = s1.substring(1);
			
			rev = rev+Character.toUpperCase(c)+sub+"";
		}
		
		System.out.println(rev);
	}
}

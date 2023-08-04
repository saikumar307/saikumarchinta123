package javaProgrammes;



public class sample3 {
	public static void main(String[] args) {
		  String s="saikumar";
		  String res="";
		  for (int i = res.length()-1; i >=0; i--) {
			char c = s.charAt(i);
			res=res+c;
			
		}
		  System.out.println(res);
	}
}
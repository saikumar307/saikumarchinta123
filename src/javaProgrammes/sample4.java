package javaProgrammes;

public class sample4 {
	public static void main(String[] args) {
		String s="SAIKUMAR307@gmail.com";
		String cap="";
		int capcount=0;
		String small="";
		int smallcount=0;
		String digit="";
		int digitcount=0;
		String spl="";
		int splcount=0;
		for (int i = 0; i <s.length(); i++) {
			char a = s.charAt(i);
			if (a>= 'A' && a<='Z') {
				cap=cap+a;
				capcount++;
				
				
				}
			else if (a>= 'a' && a<='z') {
				small=small+a;
				smallcount++;
				
			}
			else if (a>= '0' && a<='9') {
				digit=digit+a;
				digitcount++;
			}
			else {
				spl=spl+a;
				splcount++;
			}
		}
		
		System.out.println("capital:"+cap);
		System.out.println("capitalcount:"+capcount);
		System.out.println("small:"+small);
		System.out.println("smallcount:"+smallcount);
		System.out.println("digit:"+digit);
		System.out.println("digitcount:"+digitcount);
		System.out.println("spl:"+spl);
		System.out.println("splcount:"+splcount);

		
		
		
		
		
		
		
		
	}
}

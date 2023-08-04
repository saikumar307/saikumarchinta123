package javaProgrammes;

import java.util.LinkedHashSet;
import java.util.Set;

public class sample {
	public static void main(String[] args) {
	
	String str="java python java sql selenium python sql";
	String res =" ";
	Set<String> si=new LinkedHashSet<String>();
	String[] sp=str.split(" ");
	for (String s : sp) {
		si.add(s);
		
		
	}
	for (String x : si) {
		res=res+x+" ";
		
		
	}
	
	System.out.println(res);
	
	
	
	}}
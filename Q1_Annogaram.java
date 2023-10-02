package Test;

import java.util.Arrays;

public class Q1_Annogaram {

	public static void main(String[] args) {
		String a="tea";
		String b="eat";
		char[] a1=a.toCharArray();
		char[] b1=b.toCharArray();
		//first lenght is same
		Arrays.sort(a1);
		Arrays.sort(b1);
		
		if(Arrays.equals(a1, b1)) {
			System.out.println("annogram");
			
		}
		else {
			System.out.println("not annogram");
		}
		 
		
		
	}

}

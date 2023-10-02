package Test;

public class Q8_StringSum {

	public static void main(String[] args) {

		String a="3-1+4";
		String[] b=a.split("");
		int c=Integer.parseInt(b[0]);
		int d=Integer.parseInt(b[2]);
		int e=Integer.parseInt(b[4]);
		System.out.println(c-d+e);
		
		
	}

}

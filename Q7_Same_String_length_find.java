













































package Test;

public class Q7_Same_String_length_find {

	public static void main(String[] args) {

		String b ="this program is a java program";
		String[] a=b.split(" "); 
		for(int i=0; i<a.length; i++) {
			int c=0;
			for(int j=0; j<a.length; j++) {
				if(a[i].length()==a[j].length()) {

					c++;
					
				}		
			}
		if(c>1) {
			System.out.println(a[i]);
		}
		}
		
		
	}

}

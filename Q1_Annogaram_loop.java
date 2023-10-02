package Test;

public class Q1_Annogaram_loop {

	public static void main(String[] args) {
		String a="tea";
		String b="eat";
		char[] c=a.toCharArray();
		char[] d=b.toCharArray();
		String y ="";
		String k="";
		
		for(int i=0; i<c.length; i++) {
			
			for(int j=i+1; j<c.length; j++) {
				if(c[i]>c[j]) {
					char x =c[i];
					c[i]=c[j];
					c[j]=x;			
				}			
			}
		y=y+c[i];
		
		}
		for(int i=0; i<d.length; i++) {
			for(int j=i+1; j<d.length; j++) {
				if(d[i]>d[j]) {
					char m =d[i];
					d[i]=d[j];
					d[j]=m;
					
				}
			
			}
k=k+d[i];
		}
	
	System.out.println(y);
	System.out.println(k);
	
	if(y.equals(k)) {
		System.out.println("This is annogram");
	}
	else {
		System.out.println("This is not annogram");
	}

	}

}

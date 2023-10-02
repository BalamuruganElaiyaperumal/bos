package Test;

public class Q4_dublicate_Nondublicate {

	public static void main(String[] args) {

String[] a= {"A","B","C","D","A","B","E"};
 

for(int i=0; i<a.length; i++) {
	int c=1;// 0 use only one duplicate count view
	for(int j=i+1; j<a.length; j++) {
		if(a[i]==a[j]) {
			c++;
			a[j]="0";
		}
	}
		if(c>1 && a[i]!="0") {//c==1 original && c>1 duplicate print
			
			System.out.println(a[i]+"-"+c);

	
	}

	
}

}
		
	}



package Test;

public class Q9_String_numbe_remove {

	public static void main(String[] args) {
		String x ="xyz523abc";
		char [] a =x.toCharArray();
		int cou=0;
		for(int i=0;i < a.length;i++) {
			if(a[i]>='a'&& a[i]<='z') {
				
			}
			else {
				if(cou<=0) {
					a[i]='@';
					cou++;
				}
			}
		}
		
		for(int i=a.length-1;i >=0;i--) {
			if(a[i]!='@') {
				System.out.print(a[i]);
			}
		}

	}

}

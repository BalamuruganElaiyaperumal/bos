package Test;

public class Q2_String_Accenting_lengthWise {

	public static void main(String[] args) {
   String a="i am from chennai and ";
   String[] b=a.split(" ");
   String c="";
   for(int i=0; i<b.length;i++) { 
	   for(int j=i+1; j<b.length; j++) {
		   if(b[i].length()<b[j].length()) {
			   c=b[i];
			   b[i]=b[j];
			   b[j]=c;
			   
		   }
	   }
   
	   System.out.println(b[i]);
   }
		
	}

}

package Test;

import java.util.ArrayList;
import java.util.List;

public class Q3_numberArray_add_8 {

	public static void main(String[] args) {

		List<Integer>c=new ArrayList<>();
		c.add(4);
		c.add(5);
		c.add(3);
		c.add(4);

int count=0;
		for(int i=0; i<c.size(); i++) {
			for(int j=i+1; j<c.size(); j++) {
				if(c.get(i)+c.get(j)==8) {
					count++;
					
				}
			}
		}

		System.out.println(count);
	}

}

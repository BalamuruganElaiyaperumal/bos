package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q6_ListMergeList {
public static void main(String[]args) {
	
	
	int[] a= {1,2,3,4,5};// List<integer>s=Arrays.aslist(a);//List<integer>s=Arrays.aslist(1,2,3,4,5)
	int[] b= {6,7,8,9,10};// List<integer>s=Arrays.aslist(b);//List<integer>s=Arrays.aslist(6,7,8,9,5)
	
	List<Integer>t=new ArrayList<>();
	
	List<Integer>u=new ArrayList<>();
for(Integer s:a) {
	t.add(s);
}
	for(Integer v:b) {
		u.add(v);
	}
	
	
	Stream.concat(t.stream(), u.stream()).collect(Collectors.toList()).forEach(x->System.out.println(x));
	
	
}
}

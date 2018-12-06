import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 1. asList 可以将数组转化为list，但是这种list 不能增删里面的元素，否则报错
 2. 改用Colletions 将数组转化为list，也有其他的方式。
 */

public class demo {
	public static void main(String[] args){
		String[] a={"0","1","2","3","4","5"};
		List<String> a_list = new ArrayList<String>(a.length);
		Collections.addAll(a_list, a);
		
		System.out.println(a_list);
		int x=5;
		a_list.remove(4);
		System.out.println(a_list);
		int z = a_list.size();
		for(int i=0;i<z;i++){
			System.out.println(a_list.get(i));
		}
		a_list.add(0, "9");
		System.out.println(a_list);
	}

}

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
		Integer[] a={0,1,2,3,4,5};
		List<Integer> a_list = new ArrayList<Integer>(a.length);
		//a_list.addAll(a);
		Collections.addAll(a_list, a);
		System.out.println(a_list);
		for(int i=0;i<a_list.size();i++){
			System.out.println(a_list.get(i));
		}
		
		int x=5;
		a_list.remove(0);
		System.out.println(a_list);
		int z = a_list.size();
		for(int i=0;i<z;i++){
			System.out.println(a_list.get(i));
		}
		//a_list.add(0, 9);
		System.out.println("test method");
		exchange(a_list);
	}
	public static List exchange(List input_lst){
		input_lst.add(0);
		input_lst.add('d');
		input_lst.add("Hello");
		input_lst.add(0.33);
		for(int i=0;i<input_lst.size();i++){
			System.out.println(input_lst.get(i));
		}
		return input_lst;
		
	}

}

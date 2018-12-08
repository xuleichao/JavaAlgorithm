import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

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
		Double[] left = {3.0,5.0,1.0};
		Double[] right = {4.0,2.0,5.0,6.0,7.0,3.0};
		List<Double> leftList = new ArrayList<Double>(left.length);
		List<Double> rightList = new ArrayList<Double>(right.length);
		Collections.addAll(leftList, left);
		Collections.addAll(rightList, right);
		List result = exchange(leftList, rightList);
		System.out.println("this is " + result);
	}
	public static List exchange(List left, List right){
		List new_list = new ArrayList();
		while(left.size()!=0 && right.size()!=0){
			double left_0 = (double) left.get(0);
			double right_0 = (double) right.get(0);
			
			if(left_0 >= right_0){
				new_list.add(right_0);
				right.remove(0);
			}
			else{
				new_list.add(left_0);
				left.remove(0);
			}
		}
		
		if(left.size()==0){
			new_list.addAll(right);
		}
		else{
			new_list.addAll(left);
		}
		
		System.out.println(left);
		System.out.println(right);
		System.out.print(new_list);
		return new_list;
		
	}

}

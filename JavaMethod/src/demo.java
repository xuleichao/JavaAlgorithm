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
		Double[] left = {3.0,5.0,1.0};
		Double[] right = {4.0,2.0,5.0,6.0,7.0,3.0};
		List<Double> leftList = new ArrayList<Double>(left.length);
		List<Double> rightList = new ArrayList<Double>(right.length);
		Collections.addAll(leftList, left);
		Collections.addAll(rightList, right);
		List result = exchange(leftList, rightList);
		System.out.println("this is " + result);
	}
	public static List MergeSorted(List inputs_list){
		// 合并排序函数
		
		return inputs_list;
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

		return new_list;
		
	}

}

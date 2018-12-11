import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/*
 1. asList 可以将数组转化为list，但是这种list 不能增删里面的元素，否则报错
 2. 改用Colletions 将数组转化为list，也有其他的方式。
 */

public class MergeSorted {
	public static void main(String[] args){
		Double[] left = {3.0,5.0,1.0};
		Double[] right = {4.0,2.0,5.0,6.0,7.0,3.0};
		List<Double> test_list = GnrtRandomList(20);
		System.out.println("raw list " + test_list);
		List result0 = MergeSorted(test_list);
		System.out.println("this is " + result0);
	}
	public static List GnrtRandomList(int num){
		List new_list = new ArrayList();
		for(int i=0;i<num;i++){
			Double x = (Double) Math.random()*100;
			new_list.add(x);
		}
		return new_list;
	}
	public static List MergeSorted(List inputs_list){
		// 合并排序函数
		int list_size = inputs_list.size();
		int half_length = list_size / 2;
		List left = new ArrayList();
		List right =new ArrayList();
		//获得左边元素集合
		for(int i=0;i<half_length;i++){
			left.add(inputs_list.get(i));
		}
		//获得右边元素集合
		for(int i=half_length;i<list_size;i++){
			right.add(inputs_list.get(i));
		}
		if(left.size()<=2 && right.size()<=2){
			left = tinySorted(left);
			right = tinySorted(right);
			return exchange(left, right);
		}
		else if(left.size()<=2 && right.size()>2){
			right = exchange(tinySorted(left), MergeSorted(right));
			return right;
		}
		else if(left.size()>2 && right.size()<=2){
			left = exchange(MergeSorted(left), tinySorted(right));
			return left;
		}
		else{
			return exchange(MergeSorted(left), MergeSorted(right));
		}
	}
	public static List tinySorted(List list){
		if(list.size() == 1){
			return list;
		}
		else{
			List new_array = new ArrayList();
			double a = (double) list.get(0);
			double b = (double) list.get(1);
			double r;
			if(a>=b){
				new_array.add(b);
				new_array.add(a);
				return new_array;
			}
			else{
				new_array.add(a);
				new_array.add(b);
				return new_array;
			}
		}
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSorted {
	public static void main(String[] args){
		double[] a = {1,2,3};
		double[] b = {2,4,3};
		merge(a, b);
	}
	public static double[] SortedMain(double[] input){
		return input;
		
	}
	
	public static double[] merge(double[] left, double[] right){
		List<double[]> leftArray = Arrays.asList(left);
		List<double[]> rightArray = Arrays.asList(right);
		List<double[]> newArray = new ArrayList<>();
		int left_len = left.length;
		int right_len = right.length;
		//进行数组首位比较合并
		while (left_len!=0 & right_len!=0){
			if (left[0]>=right[0]){
				double[] z = rightArray.get(0);
				newArray.add(z);
				rightArray.remove(0);
			}
			else{
				double[] z = leftArray.get(0);
				newArray.add(z);
				leftArray.remove(0);
			}
		}
		//System.out.printf(newArray,leftArray,rightArray);
		
		return right;
		
	}
}
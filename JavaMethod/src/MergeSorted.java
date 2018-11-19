import java.util.Arrays;

public class MergeSorted {
	public static void main(String[] args){
		double[] a = {1,2,3};
		SortedMain(a);
	}
	public static double[] SortedMain(double[] input){
		int len = input.length;
		double[] NumArray = null;
		if(len == 1){
			NumArray = input;
		}
		else if(len == 2){
			double i = input[0];
			double j = input[1];
			if(i >= j){
				NumArray[0] = i;
				NumArray[1] = j;
			}
			else{
				NumArray[0] = j;
				NumArray[1] = i;
			}
		}
		else{
			int split_0 = len / 2;
			int split_1 = len - split_0;
			System.out.println(split_1);
			int i,j;
			double[] input_0 = null;
			double[] input_1 = null;
			for(i=0;i<split_0;i++){
				input_0[i] = input[i];
			}
			for(j=split_0;j<split_1;j++){
				input_1[j] = input[j];
			}
			System.out.println(Arrays.toString(input_0));
			System.out.println(Arrays.toString(input_1));
		}
		return NumArray;
	}
}
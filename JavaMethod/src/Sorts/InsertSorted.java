package Sorts;
import java.util.Arrays;

public class InsertSorted {
	public static void main(String[] args){
		double[] re;
		double[] arr = {3,1,5,4,3,5,6,34,342,3,23,2.554,0.215,0.55,7,3,2};
		System.out.println("Hello World");
		re = insertSort(arr);
		System.out.println(Arrays.toString(re));
	}
	
	public static double[] insertSort(double[] input){
		int len = input.length;
		if (len >= 3){//���ȴ�����ʱִ������
			int j;
			for(j=1;j<len;j++){
				int i = j-1;
				double key = input[j];
				while (i >= 0 && input[i] > key){
					//����
					double mid;
					mid = key;
					input[i+1] = input[i];
					input[i] = mid;
					//����
					i = i - 1;
					//key = input[i];
				}
			}
		}
		return input;
	}

}
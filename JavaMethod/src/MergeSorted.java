import java.util.Arrays;

public class MergeSorted {
	public static void main(String[] args){
		System.out.println("test");
		double [] i = {5,4,3,2,1};
		double[] aa = MergeSort(i);
		System.out.println(Arrays.toString(aa));
	}
	public static double[] MergeSort(double[] input){
		int numLen = input.length;
		int mid = numLen / 2 - 1;
		System.out.println(mid);
		double[] new_input = {};
		double[] input_0 = Arrays.copyOfRange(input, 0, mid+1);
		double[] input_1 = Arrays.copyOfRange(input, mid+1, numLen);
		System.out.println(Arrays.toString(input_0));
		double[] newNum = new double[input.length];
		double i = input_0[0];
		double j = input_1[0];
		while((input_0 != null) & (input_1 != null)){
			//System.out.print(i,j);
			if(i > j){
				newNum[0] = i;
				input_0 = delete(input_0, 0);
				System.out.println(Arrays.toString(input_0));
				System.out.println(input_0.length==0);
				if(input_0.length==0){break;}
				else{
				i = input_0[0];}
			}
			else{
				newNum[0] = j;
				input_1 = delete(input_1, 0);
				System.out.println(Arrays.toString(input_1));
				if(input_1.length==0){break;}
				else{
				j = input_1[0];}
			}	
			System.out.println(Arrays.toString(newNum));
		}
		return newNum;
	}
	public static double[] delete(double[] input, int index){
		double[] newNum = new double[input.length-1];
		int count = 0;
		for(int i=0;i<input.length;i++){
			if(i != index){
				newNum[count] = input[i];
			}
		}
		return newNum;
	} 

}

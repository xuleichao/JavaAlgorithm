package Sorts;

public class SelectSorted {
	public static void main(String[] args){
		double[] l = {0.1, 0.5, 0.2, 0.005, 0.8};
		double[] list = selectsort(l);
		for(double i:list){
			System.out.println(i);
		}
		
	}
	public static double [] selectsort(double[] list){
		int len = list.length;
		for(int i=0;i<=len-1;i++){
			int k = i;
			int z = k;
			for(int j=k+1;j<len;j++){
				if(list[j] <= list[z]){
					z = j;
				}
			}
			double temp = list[k];
			list[k] = list[z];
			list[z] = temp;
			k += 1;
		}
		return list;
		
	}
}

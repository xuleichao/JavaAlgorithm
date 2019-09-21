package Practices;

public class FindMaxDemo {
	/*
	 * return the max in array
	 * recondition arr.length > 0
	 * */
	public static Comparable findMax(Comparable [] arr){
		int maxIndex = 0;
		for(int i=1; i<arr.length; i++){
			if (arr[i].compareTo(arr[maxIndex]) > 0){
				maxIndex = i;}
		}
		return arr[maxIndex];
	}
	
	public static void main(String [] args){
		Comparable [] sh1 = {  6,
						9,
						12 };
		String [] sh2 = {"Joe", "Bob", "Bill", "Zeke"};
		
		System.out.println(findMax(sh1));
		System.out.println(findMax(sh2));
	}

}

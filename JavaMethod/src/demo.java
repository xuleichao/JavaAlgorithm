import java.util.Arrays;
import java.util.List;

public class demo {
	public static void main(String[] args){
		String[] a={"0","1","2","3","4","5"};
		//String[] str=a.toString();
		List<String> a_list = Arrays.asList(a);
		int z = a_list.size();
		System.out.println(a_list);
		System.out.println(z);
		int x=5;
		a_list.remove(x);
		for(int i=0;i<z;i++){
			System.out.println(a_list.get(i));
		}
	}

}

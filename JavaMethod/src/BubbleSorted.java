import java.util.List;

public class BubbleSorted {
	public static void main(String[] args){
		MergeSorted merge = new MergeSorted();
		Object x = merge.GnrtRandomList(20);
		//System.out.println(x);
		bubblesorted(x);
	}
	public static List bubblesorted(Object x){
		boolean flag =  false;
		int inputs_size = ((List) x).size();
		while(!flag){
			for(int i=0;i<inputs_size-1;i++){
				for(int j=i+1;j<inputs_size-i;j++){
					System.out.printf("%d , %d\n",i,j);
			flag = true;
				}
			}
		}
		return (List) x;
	}
	public static Object swap(List<Object> list, int a, int b){
		//交换两个元素的位置
		
		//判断a,b是否超出列表的范围
		if((a<0 || a>list.size()) 
				|| (b<0 || b>list.size())){
			return false;
		}
		Object temp;
		temp = list.get(a);
		list.set(a, list.get(b));
		list.set(b, temp);
		return list;
	}
}

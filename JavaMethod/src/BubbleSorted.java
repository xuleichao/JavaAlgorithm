import java.util.List;

public class BubbleSorted {
	public static void main(String[] args){
		MergeSorted merge = new MergeSorted();
		Object x = merge.GnrtRandomList();
		System.out.println(x);
		List y = bubblesorted(x);
		System.out.println(y);
	}
	public static List bubblesorted(Object x){
		boolean flag =  false;
		int inputs_size = ((List) x).size();
		int count = 0;
		while(!flag){
			boolean f = false;
			for(int i=0;i<inputs_size-count-1;i++){
				double forth = (double) ((List) x).get(i);
				double back = (double) ((List) x).get(i+1);
				if(forth > back){
					x = swap((List<Object>) x, i, i+1);
					f = true;
				}
				
			}
			if(f != true){
				flag=true;
			}
			count += 1;
			
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

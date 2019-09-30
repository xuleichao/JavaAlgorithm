package Practices;
import java.util.Stack;


class validParentheses {
    private Stack<Character> stack = new Stack<>();
    //���Ϸ��Է���
    public boolean isValid(String s) {
	//�ַ���Ԫ����ջ
        if (s.length() == 0){
            return true;
        }
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{')
				stack.push(c);
			else{
				if (stack.isEmpty())
					return false;
				else{
					char newitem = stack.pop();
					if (c == ')' && newitem == '('){
                        if (stack.isEmpty())
						    continue;
                        
					}
					else if (c == ']' && newitem == '['){
                        if (stack.isEmpty())
						    continue;
                        
					}
					else if (c == '}' && newitem == '{'){
                        if (stack.isEmpty())
                            continue;
                        
					}
                    else
                        return false;
				
				}
			}
		}
		return stack.isEmpty();
	}
    
    public static void main(String [] args){
    	validParentheses A = new validParentheses();
    	System.out.println(A.isValid("[]}"));
    }
    }
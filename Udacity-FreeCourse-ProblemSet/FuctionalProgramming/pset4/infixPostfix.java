import java.util.*;
public class infixPostfix{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int flag=0;
		String expression=cin.nextLine();
		Stack<String> stack=new Stack<>();
		for(int i=0;i<expression.length();i++){
			if(isOperand(expression.charAt(i))){
				stack.push(expression.charAt(i)+"");
			}
			else{
				if(isOperator(expression.charAt(i))==false){
					flag=1;
					break;
				}
				String operator=stack.peek();
				stack.pop();
				String op=stack.peek();
				stack.pop();
				stack.push("("+op+expression.charAt(i)+operator+")");
			}
		}
		if(flag==1) System.out.println("Invalid");
		else{
			System.out.println(stack.peek());
		}
	}
	public static boolean isOperand(char c){
		return ((c >= 'a' && c<= 'z' )||(c >='A' && c<= 'Z' ));
	}
	public static boolean isOperator(char c){
		return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
	}
}

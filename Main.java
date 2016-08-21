import java.util.Stack;


public class Main {
	
	public static void main(String[] args){	
	
     	String input ="1+3-4";//"(1 +2)*3-(4^(5-6))";// "1+2*3-4^5+6";//"(1+2)*3-(4^(5-6))";
     	System.out.println(infixToPostfix(input));
		
	}
//Scan the string, if an operand is met, pop all the operands until operands lower precedence
//if ( is met, push into stack
//if +- is met, pop all operands until ) or empty, push this operand into stack
//if */^ is met, pop all operands until +-) or empty, push this operand into stack
//if ) is met, pop all operands until ) or empty, pop the (

	public static String infixToPostfix(String s){
		String output="";
		Stack stack=new Stack();
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			switch(ch){
			case '+':
			case '-':
			{
				while(!stack.isEmpty()&& (char)stack.peek()!='('){
					output += stack.pop();
				}
				stack.push(ch);
			}
				break;
			case '*':
			case '/':
			case '^':
			{
				while(!stack.isEmpty()&& (char)stack.peek()!='(' &&(char)stack.peek()!='+' && (char)stack.peek()!='-'){
					output += stack.pop();
				}
				stack.push(ch);
			}
				break;
			case '(':
				stack.push(ch);
			    break;
			case ')':
			{
				while(!stack.isEmpty()&& (char)stack.peek()!='('){
					output +=stack.pop();
				}
				if((char)stack.peek()=='('){
					stack.pop();
				}
			}
				break;
			default:
				output += ch;
				break;
			}
		}
		while(!stack.isEmpty()){
			output += stack.pop();
		}
		return output;
	}
	
}



import java.util.Stack;

public class InfixToPostfix {
	
	private String input,output="";
	private Stack stack;
	
	public InfixToPostfix(String s){
		input=s;
		stack=new Stack();
	}
	//Convert infix to postfix
	//Use stack, put operators on stack
	//Immediately output numbers(operands)
	//*/^ is higher than +-, +- is higher than (
	// ( is high when it is an input symbol
	// ( is low when it is on the stack
	// ) pop stack until ( appears
	// operator: pop all stack until a lower operator, then push the operator
	
	public String doTrans(){
		
		for(int i=0;i<input.length();i++){
			char ch=input.charAt(i);
			switch(ch){
			case '+':
			case '-':
				gotOper(ch,1);
				break;
			case '*':
			case '/':
			case '^':
				gotOper(ch,2);
				break;
			case '(':
				stack.push(ch);
				break;
			case ')':
				gotParen();
				break;
			default:
				output += ch;
				break;
			}
		}
		while(!stack.isEmpty()){
			output += stack.pop();
		}
		System.out.println(output);
		return output;
	}
	
	public void gotOper(char opThis, int prec1){
		while(!stack.isEmpty()){
			char opTop=(char) stack.pop();
			if(opTop=='('){
				stack.push(opTop);
				break;
			}else{
				int prec2;
				if(opTop =='+' || opTop =='-'){
					prec2=1;
				}else{
					prec2=2;
				}
				if(prec2<prec1){
					stack.push(opTop);
					break;
				}else{
					output += opTop;
				}
			}
			
		}
		stack.push(opThis);
	}
	
	public void gotParen(){
		while(!stack.isEmpty()){
			char chx=(char) stack.pop();
			if(chx=='('){
				break;
			}else{
				output += chx;
			}
		}
	}

}

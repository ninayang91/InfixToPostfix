import java.util.Stack;


public class Main {
	
	public static void main(String[] args){	
	
     	String input ="(1 +2)*3-(4^(5-6))";// "1+2*3-4^5+6";//"(1+2)*3-(4^(5-6))";
		InfixToPostfix test = new InfixToPostfix(input);
		test.doTrans();
		
	}
	
}



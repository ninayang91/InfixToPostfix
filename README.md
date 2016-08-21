# InfixToPostfix
Convert an infix math expression to postfix

	//Convert infix to postfix

	//Use stack, put operators on stack

	//Immediately output numbers(operands)

	//*/^ is higher than +-, +- is higher than (

	// ( is high when it is an input symbol

	// ( is low when it is on the stack

	// ) pop stack until ( appears

	// operator: pop all stack until a lower operator, then push the operator

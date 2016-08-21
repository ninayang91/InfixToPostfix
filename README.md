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
	
	The preceden of "(" is 
		high, when it is an input symbol
		low, when it is on the stack
	For each symbol
		Operands: immediately output
		")":Pop stack symbols until a "(" appears
		Operators: Pop all stack symbols until a symbol of lower precedence, then push the operator

//Scan the string, if an operand is met, pop all the operands until operands lower precedence

//if ( is met, push into stack

//if +- is met, pop all operands until ) or empty, push this operand into stack

//if */^ is met, pop all operands until +-) or empty, push this operand into stack

//if ) is met, pop all operands until ) or empty, pop the (

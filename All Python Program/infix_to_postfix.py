def infix_to_postfix(expression):
    precedence = {'+': 1, '-': 1, '*': 2, '/': 2, '^': 3}
    output = []
    stack = []
    
    for char in expression:
        if char.isalnum():  # Operand goes directly to output
            output.append(char)
        elif char in precedence:  # Operator
            while (stack and stack[-1] != '(' and 
                   precedence.get(stack[-1], 0) >= precedence[char]):
                output.append(stack.pop())
            stack.append(char)
        elif char == '(':
            stack.append(char)
        elif char == ')':
            while stack and stack[-1] != '(':
                output.append(stack.pop())
            stack.pop()  # Remove '(' from stack
    
    while stack:
        output.append(stack.pop())
    
    return "".join(output)

# Taking user input
expr = input("Enter an infix expression: ")
print("Postfix Expression:", infix_to_postfix(expr))

def calculator():
    while True:
        try:
            num1 = float(input("Enter first number: "))
            operator = input("Enter operator (+, -, *, /): ")
            num2 = float(input("Enter second number: "))
            
            if operator == '+':
                result = num1 + num2
            elif operator == '-':
                result = num1 - num2
            elif operator == '*':
                result = num1 * num2
            elif operator == '/':
                if num2 == 0:
                    print("Error: Division by zero is not allowed.")
                    continue
                result = num1 / num2
            else:
                print("Invalid operator. Please enter one of +, -, *, /.")
                continue
            
            print("Result:", result)
            
            cont = input("Do you want to continue? (yes/no): ").lower()
            if cont != 'yes':
                print("Exiting calculator.")
                break
        except ValueError:
            print("Error: Please enter a valid number.")
        except Exception as e:
            print("Error:", e)

# Run the calculator
calculator()

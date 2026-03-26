import math

def add(x, y):
    return x + y

def subtract(x, y):
    return x - y

def multiply(x, y):
    return x * y

def divide(x, y):
    return x / y if y != 0 else "Error: Division by zero"

def power(x, y):
    return x ** y

def sqrt(x):
    return math.sqrt(x)

def sin_func(x):
    return math.sin(math.radians(x))

def cos_func(x):
    return math.cos(math.radians(x))

def tan_func(x):
    return math.tan(math.radians(x))

def factorial_func(x):
    return math.factorial(x) if x >= 0 else "Error: Factorial of negative number"

def main():
    while True:
        print("\nScientific Calculator")
        print("1. Addition")
        print("2. Subtraction")
        print("3. Multiplication")
        print("4. Division")
        print("5. Power")
        print("6. Square Root")
        print("7. Sine")
        print("8. Cosine")
        print("9. Tangent")
        print("10. Factorial")
        print("11. Exit")
        
        choice = input("Enter choice: ")
        
        if choice == '11':
            print("Exiting...")
            break
        
        if choice in ['1', '2', '3', '4', '5']:
            num1 = float(input("Enter first number: "))
            num2 = float(input("Enter second number: "))
            
            operations = {
                '1': add,
                '2': subtract,
                '3': multiply,
                '4': divide,
                '5': power
            }
            print("Result:", operations[choice](num1, num2))
        
        elif choice in ['6', '7', '8', '9', '10']:
         
            num = float(input("Enter number: "))
            
            operations = {
                '6': sqrt,
                '7': sin_func,
                '8': cos_func,
                '9': tan_func,
                '10': factorial_func
            }
            print("Result:", operations[choice](num))
        
        else:
            print("Invalid input. Please try again.")

if __name__ == "__main__":
    main()

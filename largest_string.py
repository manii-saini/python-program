def largest_string():
    user_input = input("Enter a list of words separated by space: ").split()
    largest = max(user_input, key=len)
    print("Largest string:", largest)

# Run the function
largest_string()

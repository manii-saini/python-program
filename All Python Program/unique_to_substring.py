def unique_string_from_substring():
    user_input = input("Enter a string: ")
    unique_chars = "".join(dict.fromkeys(user_input))  # Removing duplicates while preserving order
    print("Unique string:", unique_chars)

# Run the function
unique_string_from_substring()

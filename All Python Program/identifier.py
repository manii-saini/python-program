import keyword

def is_valid_identifier(identifier):
    if keyword.iskeyword(identifier):
        return False, "It is a Python keyword and cannot be used as an identifier."
    if not identifier.isidentifier():
        return False, "It does not follow Python's identifier naming rules."
    return True, "It is a valid identifier."

# Taking user input
identifier = input("Enter an identifier: ")

valid, message = is_valid_identifier(identifier)

print(f"'{identifier}': {message}")

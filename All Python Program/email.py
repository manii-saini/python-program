import re

def is_valid_email(email):
    # Regular expression for a basic email validation
    pattern = r'^[a-zA-Z][a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$'

    # Match the email against the pattern
    if re.match(pattern, email):
        return True
    return False

# Taking user input
email = input("Enter an email: ")

# Checking if the email is valid
if is_valid_email(email):
    print("Valid Email!")
else:
    print("Invalid Email!")
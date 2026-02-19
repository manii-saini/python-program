import re

def is_valid_indian_mobile(number):
    # Regular expression for Indian mobile numbers starting with "91"
    pattern = r"^91[6-9]\d{9}$"
    
    if re.match(pattern, number):
        return True
    else:
        return False

# Taking user input
mobile_number = input("Enter your mobile number (with country code 91): ")

# Checking validity
if is_valid_indian_mobile(mobile_number):
    print("✅ Valid Indian mobile number!")
else:
    print("❌ Invalid mobile number! It should start with 91 and have 10 digits after it.")
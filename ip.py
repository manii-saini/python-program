import re

def is_valid_ipv4(ip):
    # Regular expression pattern for IPv4
    pattern = r"^([0-9]{1,3}\.){3}[0-9]{1,3}$"
    if re.match(pattern, ip):
        # Split the IP and check each part is between 0-255
        parts = ip.split(".")
        if all(0 <= int(part) <= 255 for part in parts):
            return True
    return False

def is_valid_ipv6(ip):
    # Regular expression pattern for IPv6
    pattern = r"^([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$"
    return bool(re.match(pattern, ip))
    

# Taking user input
ip_address = input("Enter an IP address: ")

# Checking if it's a valid IP address
if is_valid_ipv4(ip_address):
    print("✅ Valid IPv4 address!")
elif is_valid_ipv6(ip_address):
    print("✅ Valid IPv6 address!")
else:
    print("❌ Invalid IP address!")

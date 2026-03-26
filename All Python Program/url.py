import re

def is_valid_url(url):
    # Regular expression for basic URL validation
    pattern = re.compile(
        r'^(https?://)?'  # Optional http or https
        r'([a-zA-Z0-9.-]+)\.([a-zA-Z]{2,6})'  # Domain name
        r'(:\d+)?'  # Optional port
        r'(/[\w./?%&=-]*)?$'  # Optional path
    )

    return re.match(pattern, url) is not None

# Taking user input
url = input("Enter a URL: ")

# Checking if the URL is valid
if is_valid_url(url):
    print("Valid URL!")
else:
    print("Invalid URL!")
from datetime import datetime, timedelta

def is_valid_date(date_string):
    try:
        # Try to parse the date in the format DD-MM-YYYY
        return datetime.strptime(date_string, "%d-%m-%Y")
    except ValueError:
        return None  # Return None if the date is invalid

# Taking user input
date_string = input("Enter a date (DD-MM-YYYY): ")
days_to_add = int(input("Enter number of days to increase: "))

# Checking if the date is valid
date_obj = is_valid_date(date_string)
if date_obj:
    # Increase the date
    new_date = date_obj + timedelta(days=days_to_add)
    print(f"Valid Date! New Date after {days_to_add} days: {new_date.strftime('%d-%m-%Y')}")
else:
    print("Invalid Date!")

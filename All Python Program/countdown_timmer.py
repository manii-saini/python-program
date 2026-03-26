import time

def countdown_timer():
    try:
        seconds = int(input("Enter the countdown time in seconds: "))
        while seconds:
            mins, secs = divmod(seconds, 60)
            timer = f"{mins:02}:{secs:02}"
            print(timer, end="\r")
            time.sleep(1)
            seconds -= 1
        print("Time's up!")
    except ValueError:
        print("Please enter a valid number.")

# Run the countdown timer
countdown_timer()

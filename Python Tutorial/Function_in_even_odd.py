def even_odd(num):
    if(num%2==0):
        return "even"
    else:
        return "odd"
num=int(input("Enter a number:"))
value=even_odd(num) 
print("The number is:",value)   
flag=1
n=int(input("Enter a number:"))

for i in range(2,n-1):
    if(n%i==0):
        falg=0
        break
    if(flag==1):
       print("number is prime")
    else:
       print("number is  not prime")

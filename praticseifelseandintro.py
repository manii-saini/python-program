print("manish")
a=5
b=6
sum=a+b
print("sum:",sum)

a>b
print("a:",a)
a<b
print("b:",b)
x=int(input("Enter a Frist number:"))
y=int(input("Enter a second number:"))

if(x>y):
    print("x is maximum:",x)
else:
    print("y is maximum:",y)

k=int(input("Enter a frist number:"))
l=int(input("Enter a second number:"))
m=int(input("Enter a three number:"))

if(k>l and k>m):
    print("k is maximum:",k)
elif(l>k and l>m):
    print("b ia maximum:",l)
else:
    print("m is maximum:",m)


    a1=int(input("Enter a frist number:"))
    b1=int(input("Enter a second number:"))
    c1=int(input("Enter a three number:"))

    if(a1>b1):
        if(a1>c1):
            print("a1 is maximum:",a1)
    else:
        print("c1 is maximum:",c1)
    if(b1>c1):
        if(b1>a1):
            print("b1 is maximum:",b1)
    else:
        print("c1 is maximum:",c1)


m=int(input("Enter a frist number:"))
n=int(input("Enter a second number:"))

if(m==n):
    print("m and n is equal")
elif(m>n):
    print("m is gresther then n")
else:
    print("n is greather then m")


    #loops

    for i in range(1,11):
        print("buddy")
    i=1
    while(i<=10):
        print("manish")
        i=i+1

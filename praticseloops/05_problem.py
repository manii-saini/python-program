num=int(input("Enter a number:"))
sum=0
i=1
while(i<=num):
    digit=num%10
    sum=sum+digit
    num=num/10
print("sum of n numbers:",sum)


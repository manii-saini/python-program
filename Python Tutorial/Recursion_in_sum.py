def sum_of_n(num):
    if(num==0):
        return
    return num+sum_of_n(num-1)
num=int(input("Enter a number:"))
sum=sum_of_n(num)
print("sum=",sum)

def show(num):
    if(num==0):
        return
    print(num)
    show(num-1)
num=int(input("Enter a number:"))
show(num)    
    
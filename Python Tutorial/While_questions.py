#Questiona 1
i=1
while(i<=100):
    print(i)
    i+=1

#Questuions 2
i=100
while(i>=1):
    print(i)
    i=i-1

#Questions 3
num=int(input("Enter a number to print table:"))
i=1
while(i<=10):
    print(num,"*",i,"=",num*i)
    i=i+1   

# Questions 4
List=[1,4,5,10,13,16,18,20,25]
idx=0
while(idx<len(List)):
    print(List[idx])
    idx=idx+1    

Tuple=(1,4,5,10,13,16,18,20,25)
x=16
idx1=0
while(idx1<len(Tuple)):
    if(Tuple[idx1]==x):
        print("Elemnt found at index:",idx)
        break
    idx1=idx1+1       
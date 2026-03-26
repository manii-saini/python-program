 # list and tuples program in praticse set
# list is mutuable
fruit=[1,3,6,8,9,7,5,10,2,4]
print(fruit)
print(fruit[1:5])

fruit[5]=100;
print(fruit)
# list function

fruit.sort()
print(fruit)

fruit.reverse()
print(fruit)

fruit.append(11)
print(fruit)

fruit.insert(3,12)
print(fruit)

fruit.pop(2)
print(fruit)

fruit.remove(3)
print(fruit)

f=[]
f1=input("Enter marks:")
f.append(f1)

f2=input("Enter marks:")
f.append(f2)

f3=input("Enter marks:")
f.append(f3)

f4=input("Enter marks:")
f.append(f4)

f5=input("Enter marks:")
f.append(f5)

f6=input("Enter marks:")
f.append(f6)

f7=input("Enter marks:")
f.append(f7)
print(f)
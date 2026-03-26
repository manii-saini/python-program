

                                                        # **** PYTHON *****
# first program 
print("hello world")

# comments
# This is a single-line comment
# This is another single-line comment
# This is yet another single-line comment

                                                 # **** variable*******
                     # Variables are the container for storing a data value like number and character

a=5
b=10
c=a+b
print("The value of a is:", a)
print("The value of b is:", b)
print("The value of c is:", c) 

                                                # Rules of a name of the variable
                                                # 1. Variable names can only contain letters, numbers, and underscores.
                                                # 2. Variable names must start with a letter or underscore.
                                                # 3. Variable names cannot start with a number.
                                                # 4. Variable names are case-sensitive.



                                                # Airthmetic operation
# a=int(input("Enter a first number:"))
# b=int(input("Enter a second number:"))
# print(f"The value of a={a}")
# print(f"The value of b={b}")
# c=a+b
# c1=a-b
# c2=a*b
# c3=a/b
# print("Addition=",c)
# print("substruction=",c1)
# print("multiplication=",c2)
# print("division=",c3)

                                                # assignment operation
a=a+3
print(a)
b=b+3
print(b)

                                                # comparision operator
if a==b:
    print("a is equal to b")
elif a>b:
    print("a is greater than b")
else:
    print("a is less than b")

                                                # logical operator
a1=a>b
print("A is greater then b:",a1)

b2=a<b
print("A is less then of b:",b2)


d1="My name is manish kumar saini \n\ti ma from dauus \nand currently living in ajmer"
print(d1)

print("Find the average of a and b is:",(a+b)/2)
print("Find the square of a:",a**2)
print("Find the square of a:",a*a)
print("Find the quibe of a:",a**3)
print("Find the quibe of a:",a*a*a)
print("Find the square of b:",b**2)
print("Find the square of b:",b*a)
print("Find the quibe of b:",b**3)
print("Find the quibe of b:",b*b*b)


                                            # **************STRING****************
                                             # String is data type in python.
                                            # String is the sequence of characters enclosed in a quotes
str1='manish'
str2="manish"
str3="""Manish"""   
print(str1)
print(str2)
print(str3)               


str="ManishSaini"
# indexing slicing
print(str[0:6])
print(str[0:5])
print(str[0:4])
print(str[0:3])
print(str[0:2])
print(str[0:1])
print(str[:11])
print(str[0:])
print(str[0:12:2])

str4="Manish"
print(str4[-5:-1])
print(str4[1:5])

                            # *************STRING FUNCTION****************
                            # **  String is the immutable data type in Python
                            # **  Once a string is created, it cannot be modified.

str5="manish saini"
print(len(str5))
print(str5.endswith("h"))
print(str5.startswith("K"))
print(str5.capitalize())
print(str5.title())
print(str5.upper())
print(str5.lower())
print(str5.find("s"))
print(str5.replace("saini","shrma"))
print(str5.count("i"))
print(str5.swapcase())
print(str5.rfind("i"))
print(str5.rindex("i"))
print(len("Python"))   
print(min("abcXYZ"))  
print(ord("A"))       
print(chr(65))   
str6="  manish  "
print(str6)
print(str6.strip())
print(len(str6))
print("43",str6.zfill(5))

s = "Python3"
print(s.isalpha()) 
print(s.isdigit())  
print(s.isalnum())  
print("123".isdigit())


                                            # ****** List ********
                                            # List is a collection of items for different data types.
                                            # Lists are mutable, meaning they can be changed.
                                            # List is ordered
list1 = [1, 2, 3, 4, 5]
print(list1)
print(type(list1))


friends=["rohan","manish",4,5,34.67,'mk',78,]
print(friends)
print(type(friends))
print(friends[0])
friends[0]="harry"
print(friends[0])
print(friends[1:3])



                                    # *** LIST FUNCTIONS ***

 # insert

list2 = ["manish","rohan",4,6,34.6,False]
print(list2)
list2.insert(3,"mk")
print(list2)

# append

list2.append("saini")
print(list2)

# sort

list1=[1,3,6,9,3,5]
print(list1)
list1.sort()
print(list1)

#  reverse

list3=[45,89,24,6,7,8]
print(list3)
list3.reverse()
print(list3)

# pop

list3.pop(3)
print(list3)


# remove

list3.remove(6)
print(list3)

# extends

list3.extend([34,89,78])
print(list3)

# index

list3.index(89)
print(list3)

# count

list3.count(7)
print(list3)

# copy

list4=[1,2,3,4]
list5=list4.copy()
print(list5)

# clear

list5.clear()
print(list5)

                    # Built in function of list

list6=[10,20,30]
print(list6)
print(max(list6))
print(min(list6))
print(sum(list6))
print(sorted(list6))


                                        # ******** Tuple ***********
                                        # Tuple is a collection of items that is ordered and unchangeable.
                                        # tuple is a immutable data type in python
                                        # Tuples are written with round brackets.
tuple1 = (1, 2, 3, 4, 5,"manish","saini",45.67,True)
print(tuple1)
print(type(tuple1))
print(tuple1[0])
print(tuple1[1:3])


                                    # TUPLE FUNCTION
t=("manish","saini",3,5,7,45.67,True)
print(t)

# count
c=t.count(3)
print(c)

# index

c1=t.index("saini")
print(c1)

# concatenation

t1=(1,2,3,4)
t2=(3,5,7,8)
t3=t1+t2
print(t3)

# repeat

t4=("manish","kumar","saini")
t5=t4*2
print(t5)

# max and min

print(max(t1))
print(min(t1))

# slicing and indexing

print(t1[0])
print(t1[1:3])
print(t1[:2])
print(t1[1:])
print(t1[::2])
print(t1[::-1])

                                        # PRATICSE SET OF 4

# Example 1
# fruits=[]
# f1=input("Enter your first fruit:")
# fruits.append(f1)
# f2=input("Enter your second fruit:")
# fruits.append(f2)
# f3=input("Enter your third fruit:")
# fruits.append(f3)
# f4=input("Enter your fourth fruit:")
# fruits.append(f4)
# f5=input("Enter your fifth fruit:")
# fruits.append(f5)
# f6=input("Enter your sixth fruit:")
# fruits.append(f6)
# f7=input("Enter your seventh fruit:")
# fruits.append(f7)

# print(fruits)


# Example 2
# marks=[]
# f1=int(input("Enter your first  student mark:"))
# marks.append(f1)
# f2=int(input("Enter your second student mark:"))
# marks.append(f2)
# f3=int(input("Enter your third student mark:"))
# marks.append(f3)
# f4=int(input("Enter your fourth student mark:"))
# marks.append(f4)
# f5=int(input("Enter your fifth student mark:"))
# marks.append(f5)
# f6=int(input("Enter your sixth student mark:"))
# marks.append(f6)
# f7=int(input("Enter your seventh student mark:"))
# marks.append(f7)

# marks.sort()

# print(marks)


# Example 3

tuple1=(2,4,5,6,7)
#tuple1[0]=3

# Example 4

list7=[67,89,6,5]
print(sum(list7))

# Example 5
tuple3=(3,9,670,4,7,0,4,70,0)
n=tuple3.count(0)
print(n)


                                        # ********Dictionary********
                                        # definition
                                        # A dictionary is a collection of key-value pairs.
                                        # Dictionaries are unordered, changeable, and do not allow duplicates.
                                        # They are written with curly brackets.
dict1={
    "name":"manish"
       ,"age":25,
       "city":"delhi"
       }
print(dict1)
print(type(dict1))
print(dict1["name"])
print(dict1)

                                                    # Properties of Dictionary
                                                    # 1. Unordered: The items in a dictionary do not have a defined order.
                                                    # 2. Mutable: You can change, add, or remove items after the dictionary has been created.
                                                    # 3. No Duplicates: Dictionaries cannot have duplicate keys.


                                                    # Function of dictionary
dict={
    "key":"value",
    "manish":1,
    "kumar":2,
    "saini":3
}

print(dict)

# items

print(dict.items())

# keyys

print(dict.keys())

# values

print(dict.values())

# update

dict.update({"manish":7})
print(dict)

# get

print(dict.get("saini"))  # if change the dict name the ouput in as none
print(dict["saini"]) # if change the dict name the ouput is an error message

# pop

dict.pop("manish")
print(dict)

# pop item
dict.popitem()
print(dict)


# clear

dict.clear()
print(dict)


                                    # **** SET ******
                                    # A set is a collection of unique elements.
                                    # Sets are unordered, mutable, and do not allow duplicates.
                                    # They are written with curly brackets.
set1={1,2,3,4,5}
print(set1)
print(type(set1))
print(set1)

                                # SET properties
                                # 1. Unordered: The items in a set do not have a defined order.
                                # 2. Mutable: You can change, add, or remove items after the set has been created.
                                # 3. No Duplicates: Sets cannot have duplicate elements.


                                # set Function
# add                                
set1.add(6)
print(set1)


# remove
set1.remove(2)
print(set1)

# discard
set1.discard(3)
print(set1)

# pop
set1.pop()
print(set1)

# clear
set1.clear()
print(set1)

# union

s2={2,6,8,4,8}
s3={5,8,5}
print(s2.union(s3))

# intersection

s2={2,6,8,4,8}
s3={5,8,5}
print(s2.intersection(s3))
  
                                    # praticse set of dict and set

# EXample 1
# s=set()
# n1=int(input("Enter the first number:"))
# s.add(n1)
# n2=int(input("Enter the second number:"))
# s.add(n2)
# n3=int(input("Enter the third number:"))
# s.add(n3)
# n4=int(input("Enter the fourth number:"))
# s.add(n4)
# n5=int(input("Enter the fifth number:"))
# s.add(n5)
# n6=int(input("Enter the sixth number:"))
# s.add(n6)
# n7=int(input("Enter the seventh number:"))
# s.add(n7)

# print(s)

# Example 2

s1=set()

s1.add(18)
s1.add('18')
print(s1)

# Example 3

s2=set()
s2.add(20)
s2.add(20.0)
s2.add('20')
print(s2)
print(len(s2))

# Example 4

# d={}
# name=input("Enter your name:")
# lang=input("Enter your language:")
# d.update({name:lang})

# name=input("Enter your name:")
# lang=input("Enter your language:")
# d.update({name:lang})

# name=input("Enter your name:")
# lang=input("Enter your language:")
# d.update({name:lang})

# name=input("Enter your name:")
# lang=input("Enter your language:")
# d.update({name:lang})

# print(d)

# Example 5
# s={2,4,[1,2]}# can note update the value of list in set beacuse i ma not inclue the value of list in a set
# print(s)
# s[3]=[4,5]
# print(s)



                                 # *******CONDITIONAL STATEMENTS*******
                                # defination
                                # conditiobal statement are used to perform differnt action basend on the different cindition
                                # if, elif, else are used to perform conditional statements in python

# if the condition is true then tha if block is executed 
# if the condion is flase then the else block block is executed
# the elif block is used to check multiple condition
# the elif block also known as a else if ladder block


# Example 1

# a=int(input("Enter the value of age:"))
# if(a>18):
#     print("you are eligible for vote")
# else:
#     print("You are note visible for note")
# print()    

# Example 2

# n=int(input("Enter a number"))
# if(n%2==0):
#     print("The number is even:",n)
# else:
#     print("The number is odd:",n)  
# print()    

# Example 3
# a=int(input("Enter the value of a:")) 
# b=int(input("Enter the value of b:")) 
# c=int(input("Enter the value of c:")) 
# print("a=",a)
# print("b=",b)
# print("c=",c)
# if(a>b and a>c):
#     print("A is biggest number:",a)
# elif(b>a and b>c):
#     print("B is biggest number:",b)
# else:
#     print("C is biggest number:",c)
# print()     

# # Example 4 multiple if block
# a1=int(input("Enter the value of a1:"))
# if(a1%2==0):
#     print("A1 is the even number:",a1)

# print()
# if(a1>18):
#     print("A1 is eligible for vote:",a1)
# elif(a1==18):
#     print("A1 is just eligilble forr vote",a1)
# else:
#     print("A1 is not eligible for vote:",a1)            


                                        # Praticse set of conditional statement

# Example 1
# n1=int(input("Enter a number first:"))  
# n2=int(input("Enter a number second:"))
# n3=int(input("Enter a number third:"))
# n4=int(input("Enter a number fourth:"))
# print("n1=",n1)
# print("n2=",n2)
# print("n3=",n3)
# print("n4=",n4)
# if(n1>n2 and n1>n3 and n1>n4):
#     print("n1 is biggest number:",n1)
# elif(n2>n1 and n2>n3 and n2>n4):
#     print("n2 is biggest number:",n2)  
# elif(n3>n1 and n3>n2 and n3>n4):
#     print("ne is biggest number:",n3)
# else:
#     print("n4 is biggest number:",n4)
#print()

# Example 2
# marks1=int(input("Enter first subject marks:"))
# marks2=int(input("Enter second subject marks:"))
# marks3=int(input("Enter third subject marks:"))

# total_percentage=(100*(marks1+marks2+marks3))/300;
# if(total_percentage>40 and marks1>=33 and marks2>=33 and marks3>=33):
#     print("You are passed:",total_percentage)
# else:
#     print("You are failed try to next year:",total_percentage)   
#print()    


# Example 3
#p1="click this"   
# p2="nice product"
# p3="manish"
# p4="saini"

# message=input("Enter your message:")
# if((p1 in message) or (p2 in message) or (p3 in message) or (p4 in message)):
#     print("The message is spam")
# else:
#     print("This message is not spam")
print()    

# Example 4
# a=int(input("Enter first number:"))
# b=int(input("Enter second number:"))
# c=int(input("Enter thrid number:"))
# print("a:",a)
# print("b:",b)
# print("c:",c)
# if(a>b):
#     if(a>c):
#         print("A is biggest:",a)
#     else:
#         print("C is biggest:",c)
# if(b>a):
#     if(b>c):
#         print("B is biggest:",b)
#     else:
#         print("C is biggest:",c)    

print()     


                                            # ******LOOPS*******
                                    
# The process in which the same sequence of statement will execute repetally until the given condition in not complte

# First method
print("1")        
print("2")   
print("3")   
print("4")   
print("5") 
print()

# second method for loops

for i in range(1,11):
    print(i)


                                                # ******While loop*******

# While loop is a entry contol loop and pre tested loop beacaus of this loop first the condition in cheked then the 
# statment will execute

# Example 1
i=1
while(i<6):
    print(i)
    i=i+1 
print()          

# Example 2    
l=["manish","kumar","saini","Ravi","saini"]
i=0
while(i<len(l)):
    print(l[i])
    i=i+1 


                                                # ****For LOOP******

# While loop is a entry contol loop and pre tested loop beacaus of this loop first the condition in cheked then the 
# statment will execute and for for loop is most popular loop 


# Example 1
for i in range(1,11):
    print(i) 

# Example 2
ll=["manish","kumar","saini","Ravi","saini"]
for i in ll:
    print(i)  
print()    

# Example 3
for i in range(0,100,4):
    print(i)
print()      

# Example 4
# n=int(input("Enter a number:"))
# for i in  range(1,11):
#     print(n,"*",i,"=",n*i)
# print()    

# # factorial
# num=int(input("Enter a number:"))
# f=1
# for i in range(1,num+1):
#     f=f*i
# print("Factorial:",f)  
# print()

# Example 6
t=("manish","kumar",1,2,"saini","mk")
for i in t:
    print(i)
else:
    print("done")   
print()  


                                                # **** BREAK STATEMENT******
                       # break statement is used to stop the current iteration in write now
for i in range(1,11):
    if(i==6):
        break
    print(i) 
print()      

                                                # *****Continue***********
                         # continue statement is used to skip to if value that is continue statement
                                                                                              
for i in range(1,11):
    if(i==6):
        continue
    print(i)
print()    
    

                                                # ******PASS STATEMENT********
                            # pass is a none statement in python are used with the list tuple and loops
for i in range(22):
    pass

i=0
while(i<11):
    print(i)
    i=i+1
print()    



                                                # *****FUNCTION*******
                                # function is the group of statement to perform a specofic task;
                                # function is the block of code to be exected;
# Example 1   simple program                             
a=5
b=6
c=7
average=(a+b+c)/3
print(average)   

print()

# Example 2  A function call mutiple time
def avg():
    a=6
    b=8
    c=5
    average=(a+b+c)/3
    print(average)
avg()
avg()
avg() 
print()

# Example 3 Passing the argument

def name(na,ending):
    print(f"Hello ,{na}")
    print(ending)
name("manish","thank you")   
name("kumar","thank you") 
name("saini","thanks")  
print()

# Example 4   Passing the default parameter

def name(na,ending="love you"):
    print(f"Hello ,{na}")
    print(ending)
name("manish")   
name("kumar") 
name("saini","thanks")  
print()


# Example 5


def name(na,ending="love you"):
    print(f"Hello ,{na}")
    print(ending)
    return "ok"
a=name("manish")     
print()



                                            # *****Recurrsion in python *********
                                            # A function call it self the is called the recurrsion in python.

# def factorial(n):
#     if(n==1 or n==0):
#         return 1
#     return n*factorial(n-1)
# n=int(input("Enter a number:"))
# print(f"The factorial is number is:{factorial(n)} ")



                                    # FILE ******* INPUT OUTPUT ********

                                    
f=open("myfile.txt")
data=f.read()
print(data)


st="you are my best friend"
f=open("file.txt","w")
f.write(st)


f=open("myfile.txt")
# line=f.readline()
# print(line,type(line))
line1=f.readline()
print(line1,type(line1))

line2=f.readline()
print(line2,type(line2))

line3=f.readline()
print(line3,type(line3))

line4=f.readline()
print(line4,type(line4))


st="manish kumar saini" 
f=open("myfile.txt","a")
f.write(st)
f.close()

                                                    # *****object oriented programmijg****** 
                                                    # class is the blue print of a object and it is user definded
                                                    # object is the run time antities like a person bank place

# Example 1
# class
class Employee:

    # class attribute
    name="manish"
    id="123"
    salary=12000

# object
manish=Employee()

# instance variable
manish.name="saini"
print(manish.name)
print(manish.id)
print(manish.salary) 

# Example 2

class Employee:

    # class attribute
    name="manish"
    id="123"
    salary=12000

    def showdata(self):
        print(f"The salary {self.salary} of {self.name}" )

    def __init__(self):
        print(f"name is {self.name}")
        print(f"id is {self.id}")
        print(f"salary is {self.salary}")

    @staticmethod
    def print():
        print("My name is manish kumar saini")    


# object
manish=Employee()
print()
manish.showdata()
print()
manish.print()



                                    # ***** Inheritance *********
                                    # the process of creating new class is called inhertiance.
                                    # The one class inherit the property of another class that is called inheritance
                                    # There are three types of inheritance 
                                    # 1.Single inheritance
                                    # 2.multilevel inhertotance
                                    # 3.multiple inheritace
                               # There are two of class 1 is called base class and another is called child class
                               # The base class is called parent class and super class
                               # # the derived class is child class and sub class  
# Example 1
# single inheritance
class Employee:
    name="manish"

    def showdata(self):
        print(f"The name is {self.name}")
class Employee1(Employee):
     salary=12000
     id=123
     def showdata1(self):
        print(f"The salary is {self.salary}")
        print(f"The name is {self.id}")
a=Employee1()
a.showdata() 
a.showdata1()
print()

# Example 2
# multilevel inheritance
class Employee:
    a=5
    def showdata(self):
        print(f"The value of a is: {self.a}")    
        
class Employee1(Employee):
    b=5
    def showdata1(self):
         print(f"The value of b is: {self.b}")  
     
class Employee2(Employee1):
    def showdata2(self):
         sum=self.a+self.b
         print("The sum is sum=",sum)
        
a.showdata()
b=Employee1()
b.showdata1()
c=Employee2()
c.showdata2()
print()


# Example 3
# multiple inheritance
class Employee:
    a=5
    @classmethod
    def showdata(self):
        print(f"The value of a is: {self.a}")    
        
class Employee1():
    b=5
    def showdata1(self):
         print(f"The value of b is: {self.b}")  
     
class Employee2(Employee,Employee1):
    def showdata2(self):
         sum=self.a+self.b
         print("The sum is sum=",sum)
        


c=Employee2()
c.a=6
c.showdata()
c.showdata1()
c.showdata2()


                                    # ****praticse set of Inheritance ******
# EXAMple 1
class TwoDVector:
    def __init__(self,i,j):
        self.i=i
        self.j=j
    def showdata(self):
        print(f"The Two D vector is {self.i}i+{self.j}j")
class ThreeDVector(TwoDVector):
    def __init__(self, i, j, k):
        super().__init__(i, j)
        self.k=k
    def showdata(self):
        super().showdata()
        print(f"The three D vector is {self.i}i+{self.j}j+{self.k}k")
obj=TwoDVector(1,2)
obj1=ThreeDVector(1,2,3) 
obj1.showdata()  
print() 


# Example 2
class Anumals:
    pass

class pet(Anumals):
    pass

class dog(pet):
    @staticmethod
    def brok():
        print("Bow Bow")
d=dog()
d.brok()  
print()      

# Example 3
class Employee:
    salary=234
    increment=20
    @property
    def salaryAfterIncerment(self):
        return {self.salary} +{self.salary} * {self.increment/100}
    
    @salaryAfterIncerment.setter
    def salaryAfterIncerment(self,salary):
        self.increment=((salary/self.salary) -1) *100
e=Employee()
e.salaryAfterIncerment=280.8
print(e.increment)
print()


# Example 4
class Complex:
    def __init__(self, r, i):
        self.r = r
        self.i = i

    def __add__(self, other):
        return Complex(self.r + other.r, self.i + other.i)

    def __str__(self):
        return f"{self.r} + {self.i}i"


# Objects
c1 = Complex(3, 4)
c2 = Complex(5, 6)

print(c1 + c2)   # __add__ call hoga


                                                    # ********Advanced Python*******
                                                    # Walrus operator

# if(n : =len([1,2,3,4,5])) >3:
#     print(f"The list is to long ({n} is exepersssion is e >3 "))
                                                        
        



                                            # ***** Exception Handling**********
# Example 1

# try:
#     n=int(input("Hey, Enter a number:"))
#     print(n)
# except Exception as e:
#     print("Please Enter a valid Number")    


# Example 2                                                

# try:
#      A=int(input("Hey, Enter first number:"))
#      B=int(input("Hey,Enter second number:"))
#      sum=A/B
#      print("Sum is =",sum)
# except ValueError as v:
#     print("Please Enter a valid value")    
# except ZeroDivisionError as e:
#     print("The zero division error") 
# except Exception as ee:
#     print("Other exception")       


# Example 3 Handle zero division error
# a=int(input("Enter a number first:"))
# b=int(input("Enter a number second:")) 

# if(b == 0):
#     raise ZeroDivisionError("The program is given the Zero division error")
# else:
#     print("The division Of A and b is: ",a/b)


# Example 4 Else and finally block

# try:
#     n=int(input("Enter a number:"))     
#     print(n)
# except Exception as e:
#     print(e)    
# else:
#     print("This is the else block")   
# finally:
#     print("This is the finally block")     


# Example 5


# def myfunc():
#     print("Hello world")
# myfunc()    
# print(__name__)
print()


                                        # Advanced python
# lamada function
# The lamda function is normal function
# The lambda function is a single line function
square=lambda X:X*X
print(square(6))








                                            







                                       






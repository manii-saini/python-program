class student:
    name="manish"
    marks=30
    def __init__(self):
        print("Default constructor is called")
s1=student()
print(s1,type(s1))   
print(s1.name,s1.marks) 
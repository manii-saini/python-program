class student:
    name="manish"
    marks=30
    def __init__(self,name,marks):
        self.name=name
        self.marks=marks          
s1=student("manish",55)
print(s1,type(s1))   
print(s1.name,s1.marks) 
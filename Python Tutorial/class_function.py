class student:
    name="manish"
    marks=30
    clg_name="GECA"
    def __init__(self,name,marks):
        self.name=name
        self.marks=marks 
    def print(self):
        print("name:",self.name)
        print("marks:",self.marks) 
        print("College name:",student.clg_name)            
s1=student("manish",55)
s1.print()
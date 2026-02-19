class Employee:
    name="manish"
    rollno="23EEACS056"
    def __init__(self,name,salary,language):
         self.name=name
         self.salary=salary
         self.language=language
    def showdata(self):
         print(f"name:{self.name}")
         print(f"salary:{self.salary}")
         print(f"language:{self.language}")
obj=Employee("manish",120000,"javascript")
obj.showdata()


        
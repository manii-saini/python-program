class Employee:
    name="manish"
    rollno="23EEACS056"
    def showdata(self):
        print("name is:",self.name)
        print("rollno is",self.rollno)
    @staticmethod
    def greet():
        print("hello manish kumar saini")
obj=Employee()
obj.showdata()
obj.greet()
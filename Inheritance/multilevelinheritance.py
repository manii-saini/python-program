class college:
    def __init__(self):
        print("Welcome to college")

class student(college):
    def __init__(self,sname,branch,rollno):
        super().__init__()
        self.sname=sname
        self.branch=branch
        self.rollno=rollno

    def showdata1(self):
        print("Student Name:",self.sname)
        print("Branch:",self.branch)
        print("Rollno:",self.rollno)
        
stu=student("Mnaish","CSE",78)
stu.showdata1()        

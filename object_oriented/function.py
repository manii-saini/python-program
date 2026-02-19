class Employee:
    def getdata(self,name,rollno,ID):
        self.name=name
        self.rollno=rollno
        self.ID=ID
    def showdata(self):
        print(f"name is:{self.name} rollno is:{self.rollno} ID is:{self.ID}")
    @staticmethod
    def greet():
        print("hello words")
obj=Employee()
obj.getdata("manish","23EEACSO56","23CSS66")
obj.showdata() 
obj.greet()       
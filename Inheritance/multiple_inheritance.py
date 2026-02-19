class Employee1:
    def getdata(self,x):
        self.x=x
    def showdata(self):
        print("x=",self.x)
class Employee2:
    def getdata1(self,y):
        self.y=y
    def showdata1(self):
        print("y=",self.y)
class programeer(Employee1,Employee2):
    def product(self):
        print("multiply",(self.x)*(self.y))
obj=programeer()
obj.getdata(5)
obj.showdata()
obj.getdata1(6)
obj.showdata1()
obj.product()
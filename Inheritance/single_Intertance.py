class Employee:
    def getdata(self,x,y):
        self.x=x
        self.y=y
    def showdata(self):
        print("x=",self.x)
        print("y=",self.x)
class programmer(Employee):
    def maximum(self):
        if(self.x>self.y):
            print("x is maximum",self.x)
        else:
            print("y is maximum",self.y)
obj=programmer()
obj.getdata(3,4)
obj.showdata()
obj.maximum()
class person:
    def __init__(self,name,age):
        self.name=name
        self.age=age

    def showdata(self):
        print("name=",self.name)
        print("age=",self.age)

class teacher(person):
    def __init__(self,name,age,post):
        super(name,age)
        self.post=post

    def showdata(self):    Inteegr.parseInt(JOptionPane.showInputDialog())
            super().showdata()
            print("post",self.post)

class student(person):
     def __init__(self,name,age,standard):
          super(name,age)
          self.standard=standard

     def shwodata(self):
         super().showdata()
         print("standatd=",self.standard)
obj=teacher("manish",13,"TGT")
obj1=student("buddy",18,"ty")
obj.showdata()
obj1.showdata1()


# In python The Hierachical Inheritance is not support
    
        
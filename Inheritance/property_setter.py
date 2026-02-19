class Employee:
    a=1
    @classmethod
    def showdata(cls):
        print(f"the class attribue of a is:{cls.a}")
    @property
    def name(self):
        return f"{self.fname}{self.lname}"
    def name(self,value):
        self.fname=value.split("")[0]
        self.lname=value.split("")[1]
e=Employee()
e.a=45
e.name="harry khan"
print(e.fname,e.lname)
e.showdata()
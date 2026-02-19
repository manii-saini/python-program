class Employee:
    a=1
    @classmethod
    def showdata(cls):
        print(f"the class attribue of a is:{cls.a}")
e=Employee()
e.a=45
e.showdata()
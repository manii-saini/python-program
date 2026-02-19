class Employee:
    name="manish"
    @staticmethod
    def shwodata():
        print("Hello base class")
class programmer(Employee):
    @staticmethod
    def display():
        print("heloo derivad")
a=programmer();
a.shwodata()
a.display()

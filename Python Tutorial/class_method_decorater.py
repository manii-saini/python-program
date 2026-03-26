class student:
    name="manish"
    @classmethod
    def changename(self):
        student.name=self.name
s1=student()
print(s1.name) 
print(s1.changename())       
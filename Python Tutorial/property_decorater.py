class subject:
    def __init__(self,phy,chem,math):
        self.phy=phy
        self.chem=chem
        self.math=math
    @property    
    def calculate_per(self):
        return float(self.phy+self.chem+self.math)/3 
s1=subject(98,97,99)
s1.calculate_per() 
s1.phy=78
s1.calculate_per()      

class account:
    def __init__(self,account_num,account_pass):
        self.account_number=account_num
        self.__account_pass=account_pass
    def __print(self):
        print("password")    
acc=account(1234,"1234")
print(acc.account_number) 
print(acc.__account_pass)# private attribute
acc.__print() # private method    
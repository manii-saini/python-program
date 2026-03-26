class Account:
    def __init__(self,balence,account_num):
        self.balence=balence
        self.account_num=account_num

    def print(self):
        print("Account Number:",self.account_num)
        print("Balence:",self.balence) 

    def credit(self,Amount):
        self.balence=self.balence+Amount
        print("Rs.",Amount,"is creatited")
        print("The total balence is:",self.get_balence())

    def debit(self,Amount):
        self.balence=self.balence-Amount
        print(Amount,"is debited")
        print("The total balence is:",self.get_balence())

    def get_balence(self):
        return self.balence 
              
acc=Account(10000,12345)
acc.print()
acc.credit(5000)
acc.debit(1000)

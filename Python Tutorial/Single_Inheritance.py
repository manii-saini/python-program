class car:
    def start(self):
        print("car is started")
    def stop(self):
        print("car is stoped")
class toyoto(car):
    def __init__(self,name):
        self.name=name
c=toyoto("Fortunature")
print(c.name)
c.start()
c.stop()                    
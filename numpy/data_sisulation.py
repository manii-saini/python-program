import numpy as np
import matplotlib.pyplot as pit

x=np.linspace(0,1,50)
y=np.sin(x)
pit.plot(x,y)
pit.title("sinve wave")
pit.xlabel("x axis")
pit.ylabel("y axis")
pit.grid(True)
pit.show()
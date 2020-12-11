class Car:
    "This represents the car"
    def __init__(self,manu,model,make,trans,color):
        self.manu=manu
        self.model=model
        self.make=make
        self.trans=trans
        self.color=color
    def acce(self):
        print(self.manu+" "+self.model+ " "+"has started moving")
    def stop(self):
        print(self.manu+"  "+self.model+"  "+"has stopped moving")
car1=Car("Toyota","c","2016","Manual","White")
car2=Car("i10","D","2017","Automatic","Black")
car3=Car("i20","E","2018","Manual","Green")
car3.acce()
car3.stop()
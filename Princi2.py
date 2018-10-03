import math
class Operaciontrigonometrica:

    operando1=0
    rad=0;
    def seno(self):#SELF PARA LLAMAR LOS OBJETOS , ES NECESARIO
         self.rad= math.radians(self.operando1)
         return math.sin(self.rad)

    def coseno(self):  # SELF PARA LLAMAR LOS OBJETOS , ES NECESARIO
        self.rad = math.radians(self.operando1)
        return math.cos(self.rad)

    def tangente(self):  # SELF PARA LLAMAR LOS OBJETOS , ES NECESARIO
        self.rad = math.radians(self.operando1)
        return math.tan(self.rad)





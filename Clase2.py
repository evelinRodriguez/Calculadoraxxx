class OperacionAritmetica:
   # a = int(input())#para q el texto se conviera en entero
    operando1=0
    operando2=0
    def sumar(self):#SELF PARA LLAMAR LOS OBJETOS , ES NECESARIO
        return self.operando1+self.operando2
    def resta(self):
        return  self.operando1-self.operando2
    def multi(self):
        return self.operando1 * self.operando2
    def division(self):
        return self.operando1 /self.operando2
    #para llamar ingresar cosas por conso

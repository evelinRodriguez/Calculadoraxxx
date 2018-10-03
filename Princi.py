from Princi2 import Operaciontrigonometrica
from Clase2 import  OperacionAritmetica
import math



print("Bienvenido a la Calculadora de EVELIN")

print("1.resta")
print("2.resta")
print("3.multiplicacion")
print("4.division")
print("5.seno")
print("6.coseno")
print("7.tangente")





a=int(input())

if a==1:
    miCalculadora=OperacionAritmetica()
    print("ingrese 1 digito :")
    miCalculadora.operando1=int(input())
    print("ingrese 2 digito :")
    miCalculadora.operando2=int(input())
    print("la resta es :")
    print(miCalculadora.resta())
if a==2:
    miCalculadora = OperacionAritmetica()
    print("ingrese 1 digito :")
    miCalculadora.operando1 = int(input())
    print("ingrese 2 digito :")
    miCalculadora.operando2 = int(input())
    print("la resta es :")
    print(miCalculadora.sumar())
if a==3:
    miCalculadora=OperacionAritmetica()
    print("ingrese 1 digito :")
    miCalculadora.operando1=int(input())
    print("ingrese 2 digito :")
    miCalculadora.operando2=int(input())
    print("la resta es :")
    print(miCalculadora.multi())
if a == 4:
      miCalculadora = OperacionAritmetica()
      print("ingrese 1 digito :")
      miCalculadora.operando1 = int(input())
      print("ingrese 2 digito :")
      miCalculadora.operando2 = int(input())
      print("la resta es :")
      print(miCalculadora.division())
if a == 5:
      miCalculadora1 = Operaciontrigonometrica()
      print("ingrese el valor :")
      miCalculadora1.operando1 = int(input())


      print("el seno es :")
      print(miCalculadora1.seno())

if a == 6:
    miCalculadora1 = Operaciontrigonometrica()
    print("ingrese el valor :")
    miCalculadora1.operando1 = int(input())

    print("el coseno es :")
    print(miCalculadora1.coseno())
if a == 6:
    miCalculadora1 = Operaciontrigonometrica()
    print("ingrese el valor :")
    miCalculadora1.operando1 = int(input())

    print("la tangente es :")
    print(miCalculadora1.tangente())



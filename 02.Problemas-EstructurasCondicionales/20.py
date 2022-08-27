import os
os.system("cls")

#Datos de entrada:
a = int(input("a: "))
b = int(input("b: "))
c = int(input("c: "))

#Proceso: Evaluar números y determinar si es ascendente, descendente o en desorden.
if a > b and b > c:
    print("Orden descendente")
elif c > b and b > a:
    print("Orden ascendente")
else:
    print("En desorden")
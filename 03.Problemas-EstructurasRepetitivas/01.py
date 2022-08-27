import os
os.system("cls")

#Entradas: 
dividendo = int(input("Dividendo: "))
divisor = int(input("Divisor: "))
cociente = 0
residuo = dividendo

#Proceso:
while residuo - divisor >= 0:
    cociente += 1
    residuo -= divisor

#Salidas:
print("Cociente: ", cociente)
print("Residuo: ", residuo)
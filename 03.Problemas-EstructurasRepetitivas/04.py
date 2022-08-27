import os
os.system("cls")

#Entradas: 
numero = int(input("Número: "))
numMultiplos = int(input("Número de múltiplos: "))
multiplos = []

#Proceso:
for i in range(0, numMultiplos):
    multiplos.append(numero * i)

#Salidas:
print("Multiplos: ", multiplos)
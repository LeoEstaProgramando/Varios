import os
os.system("cls")

#Entradas: 
numero = int(input("Número: "))
numDivisores = 0
divisores = []

#Proceso:
for i in range(1, numero + 1):
    if numero % i == 0:
        numDivisores += 1
        divisores.append(i)

#Salidas:
print("Divisores: ", divisores)
print("Divisores: ", numDivisores)
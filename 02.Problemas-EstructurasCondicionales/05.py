import os
os.system("cls")

#Datos de entrada
num = input("Número: ")

#Buscar la mayor y menor cifra, y luego formar un número
numOrden = sorted(num)
newNum = numOrden[-1] + numOrden[0]

#Resultado
print("----------JUEGO DE CIFRAS----------")
print(f"Número: {newNum}")


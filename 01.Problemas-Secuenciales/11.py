from audioop import reverse
import os
os.system("cls")

#Dado dos números enteros de 3 cifras, desarrolle el programa que muestre la cifra primera y tercera cifras intercambiadas entre ambos números. Ejemplo 123 y 456 -> 624 y 351

num1 = input("Primer número: ")
num2 = input("Segundo número: ")

numPuente = num1 + num2
newNumPuente = numPuente[-1] + numPuente[1] + numPuente[3] + numPuente[2] + numPuente[4] + numPuente[0]
newNum1 = newNumPuente[0:3]
newNum2 = newNumPuente[3:6]

print("----------JUEGO DE NUMEROS----------")
print(f"Nuevo primer número : {newNum1}")
print(f"Nuevo segundo número: {newNum2}")
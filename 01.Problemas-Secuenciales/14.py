import math
import os

os.system("cls")

#Calcule el promedio de los 3 números mayores o menores de 5 números. Usando la clase Math.

num1 = int(input("Primer número: "))
num2 = int(input("Segundo número: "))
num3 = int(input("Tercer número: "))
num4 = int(input("Cuarto número: "))
num5 = int(input("Quinto número: "))

numOrdenados = sorted([num1, num2, num3, num4, num5])
promMayor = (numOrdenados[-1] + numOrdenados[-2] + numOrdenados[-3]) / 3
promMenor = (numOrdenados[0] + numOrdenados[1] + numOrdenados[2]) / 3

print("----------PROMEDIO 3 NÚMEROS----------")
print(f"Promedio Mayor de tres : {promMayor:.2f}")
print(f"Promedio Menor de tres : {promMenor:.2f}")
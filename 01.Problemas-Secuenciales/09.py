import os
os.system("cls")

#Desarrolle el programa que lea un número entero y determine la suma de sus cifras. Asumir que el número es positivo y de 4 cifras.

numero = input("Número: ")

sumaCifras = int(numero[0]) + int(numero[1]) + int(numero[2]) + int(numero[3])

print("----------SUMA DE CIFRAS----------")
print(f"Suma de cifras: {sumaCifras}")
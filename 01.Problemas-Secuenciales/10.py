import os
os.system("cls")

#Dado un número natural de cuatro cifras, desarrolle el programa que permite obtener el número al revés. Ejemplo 1234 -> 4321.

numero = input("Número: ")

revésNumero = numero[3] + numero[2] + numero[1] + numero[0]

print("----------NUMERO AL REVES----------")
print(f"Número al revés: {revésNumero}")
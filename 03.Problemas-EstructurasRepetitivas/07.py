import os
os.system("cls")

#Entradas: 
numero = int(input("Número: "))
factorial = 1

print("-----FACTORIAL-----")

#Proceso:
while numero >= 1:
    factorial = factorial * numero
    numero -= 1

print(f"Factorial: {factorial}")
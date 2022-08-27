import os
os.system("cls")

#Datos de entrada: número
numero = float(input("Número: "))

#Determinar el signo de un número
if numero == 0: print("Número: Nulo")
elif numero > 0: print("Número: Positivo")
elif numero < 0: print("Número: Negativo")
else: print("Error")


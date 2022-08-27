import os
os.system("cls")

#Datos de entrada
edad1 = int(input("Primera edad: "))
edad2 = int(input("Segunda edad: "))
edad3 = int(input("Tercera edad: "))

#Determinar la edad menor y mayor
listaEdades = [edad1, edad2, edad3]
listaEdades = (sorted(listaEdades))

#Resultado
print("----------EDADES----------")
print(f"Mayor: {listaEdades[-1]}")
print(f"Menor: {listaEdades[0]}")


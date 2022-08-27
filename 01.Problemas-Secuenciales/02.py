import os
os.system("cls")

#Desarrolle el programa que permite convertir una cantidad dada en metros a su equivalente en centímetros, pulgadas, pies y yardas. 

metros = float(input("Metros: "))

centimetros = metros * 100
pulgadas = centimetros / 2.54 
pies = pulgadas / 12
yardas = pies / 3

print("----------CONVERSIÓN----------")
print(f"Centimetros: {centimetros:.2f}")
print(f"Pulgadas   : {pulgadas:.2f}")
print(f"Pies       : {pies:.2f}")
print(f"Yardas     : {yardas:.2f}")
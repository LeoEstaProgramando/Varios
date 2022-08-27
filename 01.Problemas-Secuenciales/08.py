import math
import os

os.system("cls")

#Desarrolle el programa que determine de un cilindro el área base = π r2, área lateral = 2 π r h, área total = 2 x área base x área lateral. Siendo r el radio y h la altura.

radio = float(input("Radio: "))
altura = float(input("Altura: "))

areaBase = math.pi * math.pow(radio, 2)
areaLateral = 2 * math.pi * radio * altura
areaTotal = 2 * areaBase * areaLateral

print("----------ÁREAS DEL CILINDRO----------")
print(f"Área base   : {areaBase:.2f}")
print(f"Área lateral: {areaLateral:.2f}")
print(f"Área total  : {areaTotal:.2f}")

import math

import os
os.system("cls")


#Desarrolle el programa que calcule el área total y el volumen de un cilindro. Considere las siguientes formulas: Área = 2πr(r+h) y Volumen = πr2h. Siendo r el radio y h la altura.

radio = float(input("Radio: "))
altura = float(input("Altura: "))

area = 2 * math.pi * radio * (radio + altura)
volumen = math.pi * math.pow(radio, 2) * altura

print("----------ÁREA Y VOLUMEN----------")
print(f"Área   : {area:.2f}")
print(f"Volumen: {volumen:.2f}")

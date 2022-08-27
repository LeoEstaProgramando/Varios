import math
import os

os.system("cls")

#Desarrolle el programa que permita calcular la hipotenusa de un triángulo. Usando la clase Math.

primerCateto = float(input("Primer cateto: "))
segundoCateto = float(input("Segundo cateto: "))

hipotenusa = math.hypot(primerCateto, segundoCateto)

print("----------HIPOTENUSA----------")
print(f"Hipotenusa : {hipotenusa:.2f}")
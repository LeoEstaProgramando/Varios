import os
import random
os.system("cls")

#Datos de entrada:
descuentos = [0.15, 0.05]
descuento = 0
tarjeta = random.randint(0, 200)

#Determinar el descuento
if tarjeta >= 100 and tarjeta % 2 == 0:
    descuento = descuentos[0] * 100
else:
    descuento = descuentos[1] * 100

#Resultado
print("----------TARJETA DE DESCUENTO----------")
print(f"Tarjeta      : {tarjeta}")
print(f"Descuento (%): {descuento:.2f}")


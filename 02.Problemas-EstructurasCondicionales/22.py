import os
os.system("cls")

#Datos de entrada:
precioA = 25
precioB = 30
cantidadA = int(input("Cantidad de A: "))
cantidadB = int(input("Cantidad de B: "))
descuentoA = 0
descuentoB = 0

#Proceso: Calcular el importe bruto, y el total, y evaluar los descuentos.
importeA = precioA * cantidadA
importeB = precioB * cantidadB

if cantidadA > 50: descuentoA = 15 / 100 * importeA
if cantidadB > 60: descuentoB = 10 / 100 * importeB

totalA = importeA - descuentoA
totalB = importeB - descuentoB

#Resultado
print("-----PRODUCTO A-----")
print(f'Importe : {importeA} soles')
print(f'Descuento : {descuentoA} soles')
print(f'Total : {totalA} soles')

print("-----PRODUCTO B-----")
print(f'Importe : {importeB} soles')
print(f'Descuento : {descuentoB} soles')
print(f'Total : {totalB} soles')

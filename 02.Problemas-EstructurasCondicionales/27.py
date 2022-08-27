import os
os.system("cls")

#Datos de entrada:
sueldoBasico = 600
ventas = float(input("Ventas: "))

#Proceso: Determinar comisión y Sueldo Bruto
comision = 15 / 100 * ventas

sueldoBruto = sueldoBasico + comision

#Proceso: Evaluar sueldo bruto -> Determinar descuento y sueldo neto
if sueldoBruto > 1800: descuento = 10 / 100 * sueldoBruto
else: descuento = 5 / 100 * sueldoBruto

sueldoNeto = sueldoBruto - descuento

#Proceso: Evaluar ventas -> Determinar obsequio
if ventas > 1000: obsequio = 3
else: obsequio = 1

print("-----Planilla de trabajador-----")
print(f'Sueldo Básico: {sueldoBasico:.2f} soles')
print(f'Comisión     : {comision:.2f} soles')
print(f'Sueldo Bruto : {sueldoBruto:.2f} soles')
print(f'Descuentos   : {descuento:.2f} soles')
print(f'Sueldo Neto  : {sueldoNeto:.2f} soles')
print(f'Obsequio     : {obsequio} polos')
import os
os.system("cls")

#Datos de entrada:
horas = int(input("Horas trabajadas: "))
tarifaNormal = float(input("Tarifa horaria: "))
tarifaExtra = tarifaNormal * 1.2

#Proceso: Evaluar horas -> Determinar sueldo Bruto
if horas <= 48: sueldoBruto = horas * tarifaNormal
else: sueldoBruto = (48 * tarifaNormal) + ((horas - 48) * tarifaExtra)

#Proceso: Evaluar sueldo bruto -> Determinar descuento y sueldo neto
if sueldoBruto > 1500: descuento = 11 / 100 * sueldoBruto
else: descuento = 0

sueldoNeto = sueldoBruto - descuento

#Resultado
print("-----Planilla de trabajador-----")
print(f'Sueldo Bruto : {sueldoBruto:.2f} soles')
print(f'Descuentos   : {descuento:.2f} soles')
print(f'Sueldo Neto  : {sueldoNeto:.2f} soles')
import os
os.system("cls")

#Datos de entrada:
tarifas = {"A" : 21, "B" : 19.5, "C" : 17, "D" : 15.5}
horas = int(input("Horas trabajadas (hrs.): "))
tarifa = input("Tarifa horaria (categ.): ")

#Proceso: Calcular sueldo Bruto
sueldoBruto = horas * tarifas[tarifa]

#Proceso: Evaluar sueldoBruto -> Determinar descuento
if sueldoBruto > 2500: descuento = 20 / 100 * sueldoBruto
else: descuento = 15 / 100 * sueldoBruto

#Proceso: Calcular sueldo Neto
sueldoNeto = sueldoBruto - descuento

#Resultado
print("-----Planilla de trabajador-----")
print(f'Sueldo Bruto : {sueldoBruto:.2f} soles')
print(f'Descuento    : {descuento:.2f} soles')
print(f'Sueldo Neto  : {sueldoNeto:.2f} soles')
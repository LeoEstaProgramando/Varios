import os
os.system("cls")

#Datos de entrada:
sueldoBruto = 1000
num_hijo = int(input("Número de hijos: "))

#Proceso: Evaluar num de hijos -> determinar bonificacion.
if num_hijo > 1: bonif = (12.5 / 100 * sueldoBruto) + (40 * num_hijo)
else: bonif = 10 / 100 * sueldoBruto

sueldoNeto = sueldoBruto + bonif

#Resultado:
print("-----Sueldo Trabajador-----")
print(f'SueldoBruto  : {sueldoBruto:.2f} soles')
print(f'Bonificación : {bonif:.2f} soles')
print(f'SueldoNeto   : {sueldoNeto:.2f} soles')
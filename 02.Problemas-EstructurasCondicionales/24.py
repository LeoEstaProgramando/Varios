import os
os.system("cls")

#Datos de entrada:
ventas = float(input("Ventas: "))
bonificacion = 0

#Proceso: Evaluar las ventas -> determinar sueldo -> calcular bonificacion.
sueldoBasico = 10 / 100 * ventas

if ventas > 5000: bonificacion = ((ventas - 5000) / 500 ) * 25

sueldoBruto = sueldoBasico + bonificacion

#Resultado:
print("-----Sueldo-----")
print(f'SueldoBasico : {sueldoBasico:.2f} soles')
print(f'Bonificación : {bonificacion:.2f} soles')
print(f'SueldoBruto  : {sueldoBruto:.2f} soles')
import os
os.system("cls")

#Datos de entrada:
ingreso_mensual = float(input("Ingreso mensual: "))
costo_casa = float(input("Costo de la casa: "))

#Proceso: Evaluar ingreso mensual, asignar cuota inicial, y cuotas mensuales
if ingreso_mensual < 1250:
    cuota_inicial = 15 / 100 * costo_casa
    meses = 120
    cuotas_mensuales = (costo_casa - cuota_inicial) / meses
else:
    cuota_inicial = 30 / 100 * costo_casa
    meses = 75
    cuotas_mensuales = (costo_casa - cuota_inicial) / meses

#Resultado:
print("----------CUOTAS----------")
print(f"Cuota inicial (soles)               : {cuota_inicial:.2f}")
print(f"Cuotas mensuales ({meses}) (soles)  : {cuotas_mensuales:.2f}")

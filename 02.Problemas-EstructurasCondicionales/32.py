import os
os.system("cls")

#Datos de entrada:
pensiones = {"A" : 550, "B" : 500, "C" : 450, "D" : 400}
categoria = input("Tarifa horaria (categ.): ")
promedio = float(input("Promedio: "))

#Proceso: Calcular pension
pension = pensiones[categoria]

#Proceso: Evaluar promedio -> Determinar descuento
if promedio < 14: descuento = 0
elif promedio < 16: descuento = 10 / 100 * pension
elif promedio < 18: descuento = 12 / 100 * pension
elif promedio <= 20: descuento = 15 / 100 * pension
else: print("Ingrese un promedio de 0 a 20")

#Proceso: Calcular nueva pension
pensionNueva = pension - descuento

#Resultado
print("-----Pension de estudiante-----")
print(f'Pensión actual : {pension:.2f} soles')
print(f'Descuento      : {descuento:.2f} soles')
print(f'Pensión nueva  : {pensionNueva:.2f} soles')
import os
os.system("cls")

#Datos de entrada: notas
sueldoBasico = 250
ventas = float(input("Monto total vendido: "))
comision = 0
descuento = 0

#Proceso: Calcular comisíón, descuento, y neto
if ventas <= 5000: comision = 5 / 100 * ventas
elif ventas <= 10000: comision = 8 / 100 * ventas
elif ventas <= 20000: comision = 10 / 100 * ventas
else: comision = 15 / 100 * ventas

sueldoBruto = sueldoBasico + comision

if sueldoBruto > 3500: descuento = 15 / 100 * sueldoBruto
else: descuento = 8 / 100 * sueldoBruto

sueldoNeto = sueldoBruto - descuento

#Resultado:
print("----------PLANILLA DE VENDEDORES----------")
print(f"Sueldo basico (soles): {sueldoBasico:.2f}")
print(f" + Comisión (soles)  : {comision:.2f}")
print(f"Sueldo bruto (soles) : {sueldoBruto:.2f}")
print(f" - Descuento (soles) : {descuento:.2f}")
print(f"Sueldo neto (soles)  : {sueldoNeto:.2f}")

import os

os.system("cls")

#El cálculo del pago mensual de un empleado de una empresa se efectúa de la siguiente manera: el sueldo básico se calcula sobre la base del número total de horas trabajadas basado en una tarifa horaria, al sueldo básico, se le aplica una bonificación del 20% obteniéndose el sueldo bruto; al sueldo bruto, se le aplica un descuento del 10% obteniéndose el sueldo neto. Desarrolle el programa que muestre el sueldo básico, bruto y neto de un trabajador.

horas = float(input("Horas trabajadas: "))
tarifa = float(input("Tarifa horaria: "))

sueldoBasico = horas * tarifa
bonificacion = sueldoBasico * 20 / 100
sueldoBruto = sueldoBasico + bonificacion
descuento = sueldoBruto * 10 / 100
sueldoNeto = sueldoBruto - descuento

print("----------PAGO MENSUAL A TRABAJADOR----------")
print(f"Sueldo Básico (soles): {sueldoBasico:.2f}")
print(f"Sueldo Bruto (soles) : {sueldoBruto:.2f}")
print(f"Sueldo Neto (soles)  : {sueldoNeto:.2f}")
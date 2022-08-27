import os

os.system("cls")

#Una empresa paga a sus vendedores un sueldo básico mensual de S/. 500. El sueldo bruto es igual al sueldo básico más una comisión, que es igual al 9% del monto total vendido. Por ley, todo vendedor se somete a un descuento del 11%. Desarrolle el programa que calcule la comisión, el sueldo bruto, el descuento y el sueldo neto de un vendedor de la empresa.

sueldoBasico = 500
totalVentas = float(input("Monto total vendido: "))

comision = totalVentas * 9 / 100
sueldoBruto = sueldoBasico + comision
descuento = sueldoBruto * 11 / 100
sueldoNeto = sueldoBruto - descuento

print("----------PAGO MENSUAL A TRABAJADOR----------")
print(f"Sueldo Básico (soles): {sueldoBasico:.2f}")
print(f"Comisión (soles)     : {comision:.2f}")
print(f"Sueldo Bruto (soles) : {sueldoBruto:.2f}")
print(f"Descuento (soles)    : {descuento:.2f}")
print(f"Sueldo Neto (soles)  : {sueldoNeto:.2f}")
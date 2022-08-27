import os
os.system("cls")

#Datos de entrada:
diasMes = 30
cuota = float(input("Cuota mensual: "))
diaPago = int(input("Dia de pago: "))

#Proceso: Evaluar dia de pago -> Determinar descuento, nada, o recargo
if diaPago <= 10:
    descuento = max(5, 2 / 100 * cuota)
    print("Total a pagar: ", round(cuota - descuento, 2))
elif diaPago <= 20:
    print("Total a pagar: ", round(cuota, 2))
else:
    recargo = max(10, 3 / 100 * cuota)
    print("Total a pagar: ", round(cuota + recargo, 2))


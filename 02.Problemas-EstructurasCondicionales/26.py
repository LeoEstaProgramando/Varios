import os
os.system("cls")

#Datos de entrada:
totalCompra = float(input("Monto total de la compra ($): "))

#Proceso: Evaluar totalCompra y luego determinar el préstamo y fondo propio.
if totalCompra > 5000:
    prestamo = 30 / 100 * totalCompra
else: prestamo = 20 / 100 * totalCompra

interes = 10 / 100 * prestamo
propio = totalCompra - prestamo

#Resultado:
print("-----Pagos-----")
print(f'Préstamo Banco     : {prestamo:.2f} soles')
print(f'Fondos propios     : {propio:.2f} soles')
print("-----Gastos-----")
print(f'Intereses bancarios: {interes:.2f} soles')
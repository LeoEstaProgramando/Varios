import os
os.system("cls")

#Datos de entrada
unidades = int(input("Unidades: "))
precio = 20

#Cálculo del importe
compra = precio * unidades

#Cálculo del descuento y total a pagar
descuento = (0.12 if compra <= 500 else 0.16 if compra > 700 else 0.14) * compra

#Cálculo de los obsequios
obsequio = 5 if unidades <= 50 else 15 if unidades > 100 else 10

#Resultado
print("----------DETALLE DE COMPROBANTE----------")
print(f"Importe de la Compra (S/): {compra:.2f}")
print(f"Descuento (S/)           : {descuento:.2f}")
print(f"Total a pagar (S/)       : {(compra - descuento):.2f}")
print(f"Obsequio (caramelos)     : {obsequio}")

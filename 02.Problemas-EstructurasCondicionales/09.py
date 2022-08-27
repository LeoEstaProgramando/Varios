import os
os.system("cls")

#Datos de entrada
precios = {"101" : 17, "102" : 25, "103" : 16, "104" : 27}
descuentos = [0.05, 0.08, 0.10, 0.13]
codigo = input("Código de producto: ")
cantidad = int(input("Cantidad: "))
precio = precios[codigo]
descuento = 0

#Determinar importe, descuento y total (compra de un mismo tipo de producto)
importe = cantidad * precio

if cantidad < 11: descuento = importe * descuentos[0]
elif cantidad < 21: descuento = importe * descuentos[1]
elif cantidad < 31: descuento = importe * descuentos[2]
else: descuento = importe * descuentos[3]

total = importe - descuento

#Resultado
print("----------DETALLE DE COMPRA----------")
print(f"Importe de compra (S/): {importe:.2f}")
print(f"Descuento         (S/): {descuento:.2f}")
print(f"Total a pagar     (S/): {total:.2f}")


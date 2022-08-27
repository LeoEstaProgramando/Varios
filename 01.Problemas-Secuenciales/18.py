import os

os.system("cls")

#En una tienda han puesto en oferta la venta de todos sus artículos por cambio de estación ofreciendo un 15% + 15% de descuento. El primer 15% se aplica al importe de la compra, mientras que el segundo 15% se aplica al importe que resulta de restar el importe de la compra menos el primer descuento. Dada la cantidad de unidades adquiridas de un mismo tipo de artículo por parte de un cliente y el precio unitario del artículo. Desarrolle el programa que determine el importe de la compra, el descuento y el importe a pagar.

precio = float(input("Precio de articulo: "))
cantidad = int(input("Cantidad a comprar: "))

compra = precio * cantidad
desc1 = 15 / 100 * compra
desc2 = 15 / 100 * (compra - desc1)
totalDesc = desc1 + desc2
importe = compra - totalDesc

print("----------IMPORTE A PAGAR----------")
print(f"Importe de la compra (soles): {compra:.2f}")
print(f"Descuento (soles)           : {totalDesc:.2f}")
print(f"Importe a pagar (soles)     : {importe:.2f}")
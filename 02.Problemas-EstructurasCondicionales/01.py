import os
os.system("cls")

#Datos de entrada
cantidad = int(input("Cantidad (unidades): "))
listaPrecios = [{"precio" : 27, "descuento" : 0.05}, {"precio" : 25, "descuento" : 0.05}, {"precio" : 23, "descuento" : 0.15} ]

#Cálculo de importe, descuento y total a pagar
if cantidad < 26:
    importe = cantidad * listaPrecios[0]["precio"]
    descuento = importe * listaPrecios[0]["descuento"]
    total = importe - descuento 
elif cantidad < 51:
    importe = cantidad * listaPrecios[1]["precio"]
    descuento = importe * listaPrecios[1]["descuento"]
    total = importe - descuento 
else:
    importe = cantidad * listaPrecios[2]["precio"]
    descuento = importe * listaPrecios[2]["descuento"]
    total = importe - descuento 

#Resultado
print("----------DETALLE DE COMPROBANTE----------")
print(f"Importe de la Compra (S/): {importe:.2f}")
print(f"Descuento (S/)           : {descuento:.2f}")
print(f"Total a pagar (S/)       : {total:.2f}")

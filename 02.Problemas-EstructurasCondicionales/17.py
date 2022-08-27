import os
os.system("cls")

#Datos de entrada:
docenas = int(input("Docenas: "))
costo = float(input("Costo: "))

#Proceso: Calcular importe de compra
importe = docenas * costo

#Proceso: Evaluar las docenas compradas, asignar descuento.
if docenas >= 6: descuento = 15 / 100 * importe
else: descuento = 10 / 100 * importe

#Proceso: Evaluar docenas, asignar obsequios.
if docenas >= 30: obsequio = (docenas / 3) * 2

#Proceso: Calcular neto a pagar
neto = importe - descuento

#Resultado:
print("----------FACTURACION----------")
print(f"Monto de la compra (soles): {importe:.2f}")
print(f"Descuento (soles)         : {descuento:.2f}")
print(f"Total a pagar (soles)     : {neto:.2f}")
print(f"Obsequio (lapiceros)      : {obsequio:.0f}")

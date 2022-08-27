import os
os.system("cls")

#Datos de entrada:
donacion = int(input("Donación: "))

#Proceso: Evaluar la donación y repartirlas.
if donacion >= 10000:
    salud = 30 / 100 * donacion
    comedor = 50 / 100 * donacion
    bolsa = 20 / 100 * donacion
else:
    salud = 25 / 100 * donacion
    comedor = 60 / 100 * donacion
    bolsa = 15 / 100 * donacion

#Resultado:
print("----------REPAROTO DONACION----------")
print(f"Centro de salud($)   : {salud:.2f}")
print(f"Comedor de niños ($) : {comedor:.2f}")
print(f"Inversión enbolsa ($): {bolsa:.2f}")

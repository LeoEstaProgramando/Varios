import os

os.system("cls")

#Una institución social recibe anualmente una donación que reparte de la siguiente forma: 25% para el centro de salud, 35% en el comedor infantil, 25% para la escuela infantil y el resto para el asilo de ancianos.  Desarrolle el programa que muestre los montos asignados.

donacion = float(input("Donación: "))

clinica = 25 / 100 * donacion
comedor = 35 / 100 * donacion
escuela = 25 / 100 * donacion
asilo = 15 /100 * donacion

print("----------REPARTO DE DONACIONES----------")
print(f"Asignación para centro de salud (soles)    : {clinica:.2f}")
print(f"Asignación para comedor infantil (soles)   : {comedor:.2f}")
print(f"Asignación para escuela infantil (soles)   : {escuela:.2f}")
print(f"Asignación para asilo de ancianos (soles)  : {asilo:.2f}")
import os
os.system("cls")

#Datos de entrada: días
dias = {
    "1" : "lunes",
    "2" : "martes",
    "3" : "miercoles",
    "4" : "jueves",
    "5" : "viernes",
    "6" : "sabado",
    "7" : "domingo",
}
numero = input("Ingrese el día (número): ")

#Determinar el dia según numero
dia = dias[numero]

#Resultado
print(f"Día: {dia}")

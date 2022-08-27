import os
os.system("cls")

#Datos de entrada:
hora = int(input("Hora: "))

#Proceso: Evaluar hora -> Determinar hora am/pm y error
if hora >= 0 and hora < 24:
    if hora == 0: print(hora + 12, "AM")
    elif hora > 0 and hora < 12: hora = print(hora, "AM")
    elif hora == 12: print(hora, "PM")
    else: print(hora - 12, "PM")
else: 
    print("Ingrese un valor entre 0 y 23")

import os
os.system("cls")

#Datos de entrada:
bonificaciones = [2.5, 5, 7.5, 10, 12.5]
tardanza = int(input("Tardanza (min): "))
observacion = int(input("Observaciones(veces): "))
puntualidad = 0
rendimiento = 0
bonificacion = 0

#Proceso: Evaluar tardanza -> Calcular puntajes de puntualidad
if tardanza == 0: puntualidad = 10
elif tardanza <= 2: puntualidad = 8
elif tardanza <= 5: puntualidad = 6
elif tardanza <= 9: puntualidad = 4
else: puntualidad = 0  

#Proceso: Evaluar observacion -> Calcular puntajes de rendimiento
if observacion == 0: rendimiento = 10
elif observacion == 1: rendimiento = 8
elif observacion == 2: rendimiento = 5
elif observacion == 3: rendimiento = 1
else: rendimiento = 0

#Proceso: Calcular puntaje total
puntaje = puntualidad + rendimiento

#Proceso: Evaluar puntaje total -> Calcular bonificacion
if puntaje < 11: bonificacion = bonificaciones[0] * puntaje
elif puntaje < 14: bonificacion = bonificaciones[1] * puntaje
elif puntaje < 17: bonificacion = bonificaciones[2] * puntaje
elif puntaje < 20: bonificacion = bonificaciones[3] * puntaje
else: bonificacion = bonificaciones[4] * puntaje

#Resultado
print("-----Puntualidad, rendimiento y bonificación-----")
print(f'Puntualidad  : {puntualidad} puntos')
print(f'Rendimiento  : {rendimiento} puntos')
print(f'Bonificación : {bonificacion:.2f} soles')
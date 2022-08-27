import os
import operator
os.system("cls")

#Datos de entrada:

votosPamela = int(input("Pamela: "))
votosCarol = int(input("Carol: "))
votosFanny = int(input("Fanny: "))
votosTotal = votosPamela + votosCarol + votosFanny
votos = {"Pamela" : votosPamela, "Carol" : votosCarol, "Fanny" : votosFanny}
votosOrden = sorted(votos.items(), key=operator.itemgetter(1), reverse=True)

print("-----ELECCIONES: PRESIDENCIA DE CLUB FEMENINO-----")
#Proceso: Evaluar casos de anulaciones de elecciones
condicion1 = votosPamela == votosCarol == votosFanny
condicion2 = votosPamela == votosCarol or votosPamela == votosFanny or votosCarol == votosFanny

#Proceso: Evaluar primera vuelta
if condicion1 or condicion2:
    print("Elección Anulada")
else:
    if votosPamela > votosTotal // 2 or votosCarol > votosTotal // 2 or votosFanny > votosTotal // 2:
        print(f"Primer puesto : {votosOrden[0][0]} con {votosOrden[0][1]} votos")
        print(f"Segundo puesto: {votosOrden[1][0]} con {votosOrden[1][1]} votos")
        print(f"Tercer puesto : {votosOrden[2][0]} con {votosOrden[2][1]} votos")
    else:
        print("Elección a Segunda vuelta")

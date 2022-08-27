import os
os.system("cls")

#Datos de entrada: notas
nota1 = float(input("Nota 1: "))
nota2 = float(input("Nota 2: "))
nota3 = float(input("Nota 3: "))
nota4 = float(input("Nota 4: "))
nota5 = float(input("Nota 5: "))

#Proceso: Identificar nota mayor y menor, luego eliminarlas, y luego calcular el promedio de las restantes
listaNotas = [nota1, nota2, nota3, nota4, nota5]
listaNotas = (sorted(listaNotas))
notaMayor = listaNotas[-1]
notaMenor = listaNotas[0]

listaNotas.remove(notaMayor)
listaNotas.remove(notaMenor)

promedio = (listaNotas[0] + listaNotas[1] + listaNotas[2]) / 3

#Resultado: Notas eliminadas y promedio de notas
print("----------PROMEDIO DE NOTAS----------")
print(f"Nota mayor eliminada: {notaMayor}")
print(f"Nota menor eliminada: {notaMenor}")
print(f"Promedio de notas: {promedio:.2f}")


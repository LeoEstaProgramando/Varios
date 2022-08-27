import os
os.system("cls")

print("-----MINIMO, MAXIMO Y PROMEDIO-----")

notas = []

for i in range(10):
    nota = int(input(f"Nota {i+1}: "))
    notas.append(nota)

def minimo(notas):

    nota_min = 20

    for i in notas:
        if i < nota_min: nota_min = i
        else: nota_min

    return nota_min

def maximo(notas):

    nota_max = 0

    for i in notas:
        if i > nota_max: nota_max = i
        else: nota_max

    return nota_max

def promedio(notas):

    suma = 0
    n = len(notas)

    for i in notas:
        suma += i

    promedio = suma / n
    return promedio

print(f"Nota mínima: {minimo(notas)}")
print(f"Nota máxima: {maximo(notas)}")
print(f"Promedio de notas: {promedio(notas)}")

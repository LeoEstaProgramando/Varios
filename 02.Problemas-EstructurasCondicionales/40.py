import os
os.system("cls")

#Datos de entrada:
cursos = ["Matemática", "Física", "Química"]
curso = input("Curso: ")
pc1 = float(input("Práctica calificada 1: "))
pc2 = float(input("Práctica calificada 2: "))
pc3 = float(input("Práctica calificada 3: "))
ep = float(input("Examen Parcial: "))
ef = float(input("Examen final: "))

#Proceso: Evaluar curso y determinar promedio de notas
if curso == "Matemática":
    prom = pc1 * 0.1 + pc2 * 0.2 + pc3 * 0.1 + ep * 0.3 + ef * 0.3

if curso == "Física":
    prom = pc1 * 0.2 + pc2 * 0.2 + pc3 * 0.2 + ep * 0.2 + ef * 0.2

if curso == "Química":
    prom = pc1 * 0.1 + pc2 * 0.3 + pc3 * 0.1 + ep * 0.25 + ef * 0.25

print("-----PROMEDIO FINAL-----")
print(f"Promedio Final: {prom:.2f}")

if prom >= 13: print(f"Curso de {curso}: Aprobado")
else: print(f"Curso de {curso}: Desaprobado")

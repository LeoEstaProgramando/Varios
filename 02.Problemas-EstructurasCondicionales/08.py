import os
os.system("cls")

#Datos de entrada
propina = 20
exam1 = input("Primer examen: ")
exam2 = input("Segundo examen: ")
exam3 = input("Tercer examen: ")

#Determinar examenes aprobados y agregar 5 soles de propina
if exam1 == "aprobado": propina += 5
if exam2 == "aprobado": propina += 5
if exam3 == "aprobado": propina += 5

#Resultado
print("----------PROPINA MENSUAL----------")
print(f"Propina: {propina}")


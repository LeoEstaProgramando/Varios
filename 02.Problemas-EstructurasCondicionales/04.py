import os
os.system("cls")

#Datos de entrada
pc1 = float(input("Práctica calificada 1: "))
pc2 = float(input("Práctica calificada 2: "))
pc3 = float(input("Práctica calificada 3: "))

#Define la condicion de la pc3, y luego calcula el promedio 
if pc3 >= 10: pc3 += 2
promedio = (pc1 + pc2 + pc3) / 3

#Resultado
print("----------PROMEDIO DE NOTAS----------")
print(f"Promedio: {promedio:.2f}")


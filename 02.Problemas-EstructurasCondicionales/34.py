import os
os.system("cls")

#Datos de entrada:
peso = float(input("Peso (kg): "))
estatura = float(input("Estatura (m): "))
gradosDeObesidad = ["Delgado", "Normal", "Sobrepeso", "Obesidad"]

#Proceso: Calcular IMC
imc = peso / (estatura ** 2) 

#Proceso y Resultado: Evaluar IMC -> Determinar grado de obesidad
if imc < 20: print(f"Grado de obesidad: {gradosDeObesidad[0]}")
elif imc <= 25: print(f"Grado de obesidad: {gradosDeObesidad[1]}")
elif imc <= 27: print(f"Grado de obesidad: {gradosDeObesidad[2]}")
else: print(f"Grado de obesidad: {gradosDeObesidad[3]}")

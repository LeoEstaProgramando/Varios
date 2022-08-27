import os
os.system("cls")

#Datos de entrada:
numero = input("número: ")
sexo = {"1" : "masculino", "2" : "femenino"}
estado = {"1" : "soltero", "2" : "casado", "3" : "divorciado", "4" : "viudo"}

#Proceso: Evaluar el número, y determinar sexo, edad y estado civil.
print("Sexo: ", sexo[numero[3]])
print("Estado civil: ", sexo[numero[0]])
print("Edad: ", numero[1] + numero[2])

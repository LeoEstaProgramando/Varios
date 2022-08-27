import os
os.system("cls")

#Datos de entrada:
sexo = input("Sexo (masculino o femenino): ")
edad = int(input("Edad: "))

#Proceso: Evaluar el sexo y edad y categorizarlas.
if sexo == "femenino":
    if edad < 23: print("Categoría FA")
    else: print("Categoría FB")
elif sexo == "masculino":
    if edad < 25: print("Categoría MA")
    else: print("Categoría MB")




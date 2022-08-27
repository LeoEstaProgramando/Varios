import os
os.system("cls")

#Entradas: 
numero = int(input("Número: "))
inicio = int(input("Inicio: "))
final = int(input("Final: "))

print("-----TABLA DE MULTIPLICACION-----")
#Proceso:
for i in range(inicio, final + 1):
    print(f"{numero} x {i} = {numero * i}")

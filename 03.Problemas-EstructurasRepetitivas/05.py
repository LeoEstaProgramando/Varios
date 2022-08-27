import os
os.system("cls")

#Entradas: 
numero = int(input("Número: "))

print("-----TABLA DE MULTIPLICACION-----")
#Proceso:
for i in range(1, 13):
    print(f"{numero} x {i} = {numero * i}")

import os
os.system("cls")

#Datos de entrada
num1 = int(input("Primer número: "))
num2 = int(input("Segundo número: "))
num3 = int(input("Tercer número: "))

#Determinar el número intermedio
listaNum = [num1, num2, num3]
listaNum = (sorted(listaNum))

#Resultado
print("----------EDADES----------")
print(f"Número Intermedio: {listaNum[1]}")


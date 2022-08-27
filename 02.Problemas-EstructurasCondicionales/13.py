import os
os.system("cls")

#Datos de entrada: número positivo de 3 cifras
num = input("Número: ")

#Determinar si las cifras son consectuivas
if int(num[1]) == int(num[2]) - 1 and int(num[1]) == int(num[0]) + 1:
    print("Cifras consectuvias ascendente")
elif int(num[1]) == int(num[2]) + 1 and int(num[1]) == int(num[0]) - 1:
    print("Cifras consectuvias descendente")
else:
    print("Cifras no consecutivas")

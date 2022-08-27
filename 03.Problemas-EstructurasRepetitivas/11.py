import os
os.system("cls")

print("-----NUMEROS CAPICUAS-----")

conteo = 0

for i in range(100, 1000):
    cifras = str(i)
    if cifras == cifras[2] + cifras[1] + cifras[0]:
        conteo = conteo + 1

print(conteo)
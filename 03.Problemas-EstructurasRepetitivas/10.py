import os
os.system("cls")

print("-----JUEGO DE CIFRAS-----")

conteo = 0

for i in range(1000, 10000):
    cifra1 = i // 1000
    cifra2 = (i % 1000) // 100
    cifra3 = ((i % 1000) % 100) // 10
    cifra4 = (((i % 1000) % 100) % 10)
    if (cifra1 + cifra3) == (cifra2 + cifra4):
        conteo = conteo + 1

print(conteo)
import os
os.system("cls")

print("-----SUMA M(3) NOT(5)-----")

num = int(input("Número: "))
divisores = []

for i in range(1, num + 1):
    if num % i == 0:
        divisores.append(i)

print("Divisores:", divisores)

if len(divisores) == 2:
    print("Es un número primo")
else:
    print("No es un número primo")
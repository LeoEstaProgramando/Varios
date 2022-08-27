import os
os.system("cls")

print("-----SUMA M(3) NOT(5)-----")

num = int(input("Número: "))
suma = 0

for i in range(0, num + 1):
    if i % 3 == 0 and i % 5 != 0:
        suma += i

print("Suma: ", suma)
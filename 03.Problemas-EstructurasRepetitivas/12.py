import os
os.system("cls")

print("-----NUMEROS: RAZON 10-----")

count = 1

for i in range(0, 10):
    lista = []
    for j in range(count, count + 10):
        lista.append(j)
    count += 10
    print(lista)
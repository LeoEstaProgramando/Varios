import os
os.system("cls")

#Entradas: 
n = int(input("n: "))


print("-----RECTANGULO-----")

#Proceso:
if n >= 4:
    altura = 1 * n
    ancho = 2 * n
    for i in range(0, altura):
        print("* " * ancho)

import os
os.system("cls")

#Entradas: 
multiplicando = int(input("Multiplicando: "))
multiplicador = int(input("Multiplicador: "))
resultado = 0

#Proceso:
for i in range(0, multiplicador):
    resultado += multiplicando

#Salidas:
print("Resultado: ", resultado)
import os
os.system("cls")

#Entradas: 
numero = int(input("Número: "))
exponente = int(input("Exponente: "))
potencia = 1

print("-----POTENCIACION-----")

#Proceso:
for i in range(1, exponente + 1):
    potencia *= numero
    

print(f"Potencia: {potencia}")
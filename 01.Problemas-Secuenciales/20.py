import os

os.system("cls")

#Dada una cantidad de dinero en soles, desarrolle el programa que descomponga dicha cantidad en billetes de 200, 100, 50, 20, 10 y monedas de 5, 2, 1 nuevos soles.

dinero = float(input("Dinero: "))
dineroValor = [200, 100, 50, 20, 10, 5, 2, 1]

billetes200 = dinero // 200
billetes100 = (dinero % 200) // 100
billetes50 = ((dinero % 200) % 100) // 50
billetes20 = (((dinero % 200) % 100) % 50) // 20
billetes10 = ((((dinero % 200) % 100) % 50) % 20) // 10
monedas5 = (((((dinero % 200) % 100) % 50) % 20) % 10) // 5
monedas2 = ((((((dinero % 200) % 100) % 50) % 20) % 10) % 5)// 2
monedas1 = (((((((dinero % 200) % 100) % 50) % 20) % 10) % 5) % 2) // 1

print("----------BILLETES Y MONEDAS----------")
print(f"Billetes de 200 (unidades): {billetes200:.2f}")
print(f"Billetes de 100 (unidades): {billetes100:.2f}")
print(f"Billetes de 50 (unidades) : {billetes50:.2f}")
print(f"Billetes de 20 (unidades) : {billetes20:.2f}")
print(f"Billetes de 10 (unidades) : {billetes10:.2f}")
print(f"Monedas de 5 (unidades)   : {monedas5:.2f}")
print(f"Monedas de 2 (unidades)   : {monedas2:.2f}")
print(f"Monedas de 1 (unidades)   : {monedas1:.2f}")
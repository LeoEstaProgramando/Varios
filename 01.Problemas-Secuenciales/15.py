import os

os.system("cls")

#Juan, Rosa y Daniel aportan cantidades de dinero para formar un capital. Juan y Rosa aportan en dólares y Daniel, en soles. Desarrolle el programa que determine el capital total en dólares y que porcentaje de dicho capital aporta cada uno. Dólar = S/. 3.00 nuevos soles.

tipoCambioDolar = 3.00
capitalJuanDolar = float(input("Aporte Capital de Juan (dólares): "))
capitalRosaDolar = float(input("Aporte Capital de Rosa (dólares): "))
capitalDanielSoles = float(input("Aporte Capital de Daneiel (soles): "))

capitalDanielDolar = capitalDanielSoles / tipoCambioDolar
capitalTotal = capitalJuanDolar + capitalRosaDolar + capitalDanielDolar
capitalJuan = capitalJuanDolar / capitalTotal * 100
capitalRosa = capitalRosaDolar / capitalTotal * 100
capitalDaniel = capitalDanielDolar / capitalTotal * 100

print("----------CAPITAL TOTAL----------")
print(f"Capital Total (dólares): {capitalTotal:.2f}")
print("----------APORTES (%)----------")
print(f"Capital Juan (%) : {capitalJuan:.2f}")
print(f"Capital Rosa (%): {capitalRosa:.2f}")
print(f"Capital Daniel (%): {capitalDaniel:.2f}")
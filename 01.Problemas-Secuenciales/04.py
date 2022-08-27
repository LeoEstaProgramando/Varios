import os
os.system("cls")

#En países de habla inglesa, es común dar la estatura de una persona como la suma de una cantidad de pies, más una cantidad de pulgadas, por ejemplo 3’ 2”. Desarrolle el programa que determine la estatura en metros dada su estatura en el formato inglés.

estaturaPies = int(input("Estatura(pies): "))
estaturaPulgadas = int(input("Estatura(pulgadas): "))

estaturaMetros = estaturaPies/3.28084 + estaturaPulgadas/39.37008

print("----------CONVERSION----------")
print(f"Estatura(metros): {estaturaMetros:.2f}")
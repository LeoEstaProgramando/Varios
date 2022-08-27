import os
os.system("cls")

#Desarrolle el programa que determine el porcentaje de varones y de mujeres que hay en un salón de clases.

varones = int(input("Varones: "))
mujeres = int(input("Mujeres: "))

total = varones + mujeres
pVarones = varones / total * 100
pMujeres = mujeres / total * 100

print("----------PORCENTAJE----------")
print(f"Varones(%): {pVarones:.2f} %")
print(f"Mujeres(%): {pMujeres:.2f} %")
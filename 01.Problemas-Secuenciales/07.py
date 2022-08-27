import os
os.system("cls")

#Desarrolle el programa que determine el área y el perímetro de un rectángulo sabiendo que el   área = b x h, perímetro = 2x (b+h).

base = float(input("Base: "))
altura = float(input("Altura: "))

area = base * altura
perimetro = 2 * (base + altura)

print("----------ÁREA Y PERIMETRO----------")
print(f"Área     : {area:.2f}")
print(f"Perimetro: {perimetro:.2f}")

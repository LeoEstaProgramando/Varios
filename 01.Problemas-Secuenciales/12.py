from math import sqrt
import os

os.system("cls")

#Desarrolle el programa que permita calcular el resultado de la ecuación de segundo grado de la forma ax2 + bx +c. Usando la clase Math.

a = float(input("Dame el primer coeficiente: "))
b = float(input("Dame el segundo coeficiente: "))
c = float(input("Dame el tercer coeficiente: "))

discriminante = b * b - 4 * a * c
raiz = sqrt(discriminante)
x_1 = (-b + raiz) / (2 * a)
x_2 = (-b - raiz) / (2 * a)

print("----------SOLUCIONES----------")
print(f"Primera solución : {x_1:.2f}")
print(f"Segunda solución : {x_2:.2f}")
import os
os.system("cls")

#Datos de entrada
angulos = ["Nulo", "Agudo", "Recto", "Obtuso", "Llano", "Cóncavo", "Completo"]
angulo = float(input("Ángulo (grados sexagesimales): "))

#Proceso y resultado (Identifica el angulo ingresado con la lista)
if angulo == 0: print(angulos[0])
elif angulo < 90: print(angulos[1])
elif angulo == 90: print(angulos[2])
elif angulo < 180: print(angulos[3])
elif angulo == 180: print(angulos[4])
elif angulo < 360: print(angulos[5])
elif angulo == 360: print(angulos[6])
else: print("Ingrese un valor entre 0 y 360")


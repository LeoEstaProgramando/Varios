import os
os.system("cls")

#Datos de entrada:
codigo = int(input("Código: "))
empleados = ["Administrativo", "Directivo", "Vendedor", "Seguridad"]

#Proceso y Resultado: Evaluar codigo -> Determinar empleado
if codigo % 2 == 0 and codigo % 3 == 0 and codigo % 5 == 0:
    print(empleados[0])
elif codigo % 2 != 0 and codigo % 3 == 0 and codigo % 5 == 0:
    print(empleados[1])
elif codigo % 2 == 0 and codigo % 3 != 0 and codigo % 5 != 0:
    print(empleados[2])
elif codigo % 2 != 0 and codigo % 3 != 0 and codigo % 5 != 0:
    print(empleados[3])
else:
    print("ERROR: Código incorrecto")

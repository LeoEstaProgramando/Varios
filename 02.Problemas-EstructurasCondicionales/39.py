from operator import truediv
import os
os.system("cls")

#Datos de entrada:
horasAusencia = float(input("Horas de asusencia: "))
defectuosos = int(input("Tornillos defectuosos: "))
noDefectuosos = int(input("Tornillos no defectuosos: "))

#Proceso y resultado: Evaluar condiciones y mostrar grados de eficiencia
condicion1 = horasAusencia < 1.5 
condicion2 = defectuosos < 300
condicion3 = noDefectuosos > 1000

print("-----GRADO DE EFICIENCIA-----")
if condicion1 == False and condicion2 == False and condicion3 == False:
    print("Grado de eficiencia: 5")
elif condicion1 == True and condicion2 == False and condicion3 == False:
    print("Grado de eficiencia: 7")
elif condicion1 == False and condicion2 == True and condicion3 == False:
    print("Grado de eficiencia: 8")
elif condicion1 == False and condicion2 == False and condicion3 == True:
    print("Grado de eficiencia: 9")
elif condicion1 == True and condicion2 == True and condicion3 == False:
    print("Grado de eficiencia: 12")
elif condicion1 == True and condicion2 == False and condicion3 == True:
    print("Grado de eficiencia: 13")
elif condicion1 == False and condicion2 == True and condicion3 == True:
    print("Grado de eficiencia: 15")
elif condicion1 == True and condicion2 == True and condicion3 == True:
    print("Grado de eficiencia: 20")

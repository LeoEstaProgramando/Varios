import os
os.system("cls")

#Datos de entrada:
mes = int(input("Mes: "))
año = int(input("Año: "))
meses = ("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre")

print("-----MES Y DIAS-----")
#Proceso y resultado: Evaluar mes -> Determinar mes
if mes in range(1, 13):
    print("Mes:", meses[mes-1])

#Proceso y resultado: Evaluar año -> Determinar si es bisiesto o no
if (año % 4 == 0 and año % 100 != 0) or año % 400 == 0:
    print("Año: 366 días")
else:
    print("Año: 365 días")

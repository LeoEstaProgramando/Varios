import os
os.system("cls")

#Datos de entrada:
cuadernos = int(input("Cuadernos (unidades): "))
obsequios = []

#Proceso: Evaluar cuadernos -> Determinar obsequio
if cuadernos < 12:
    obsequios = [0, 0, 0]
elif cuadernos < 24:
    obsequios = [(cuadernos // 4) * 1, 0, 0]
elif cuadernos < 36:
    obsequios = [0, (cuadernos // 4) * 2, 0]
else:
    obsequios = [(cuadernos // 12) * 1, (cuadernos // 6) * 1, (cuadernos // 4) * 2]

#Resultado
print("-----Lapiceros obsequiados-----")
print(f'Lapiceros Lucas : {obsequios[0]}')
print(f'Lapiceros Faber : {obsequios[1]}')
print(f'Lapiceros Pilot : {obsequios[2]}')

import os
os.system("cls")

#Datos de entrada:
nota1 = float(input("Matemática: "))
nota2 = float(input("Física: "))

#Proceso: Evaluar las notas, y asignar propinas.
if nota1 > 17: propina1 = 3 * nota1
else: propina1 = 1 * nota1

if nota2 > 15: propina2 = 2 * nota2
else: propina2 = 0.5 * nota2

propina = propina1 + propina2

promedio = (nota1 + nota2) / 2

if promedio > 16: obsequio = "reloj"
else: obsequio = "Sigue estudiando más!"

#Resultado:
print("-----PROPINA-----")
print(f'Propina : {propina} soles')
print(f'Obsequio: {obsequio}')
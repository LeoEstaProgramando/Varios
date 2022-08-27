import os
os.system("cls")

print("-----INDICE-----")

animales = ['perro', 'gato', 'gallina', 'salamandra', 'caballo', 'cerdo', 'mono']
animal = input("Animal: ")

def indice(palabra, lista):
    
    indice = 0
    
    for elementos in lista: 
        if elementos == palabra:
            return indice
        indice += 1
    else:
        return "Palabra no encontrada"

print(f"Indice: {indice(animal, animales)}")
from dataclasses import replace
from operator import indexOf
import os
os.system("cls")

print("-----MAYUSCULAS Y MINUSCULAS-----")

def mayuscula(palabra):
    capletras = []
    regletras = []
    mayuscula = 'ABCDEFGHIJKLMNÑOPQRSTUVWXYZ'
    minuscula = 'abcdefghijklmnñopqrstuvwxyz'
    for x in mayuscula:
        capletras.append(x)
    for x in minuscula:
        regletras.append(x)
    
    nueva_palabra = []
    for x in palabra:
        if x in capletras:
            nueva_palabra.append(x)
        elif x not in capletras and x not in regletras:
            nueva_palabra.append(x)
        else:
            conversion = regletras.index(x)
            if x:
                proc = capletras[conversion]
                nueva_palabra.append(proc)
    resultado = ''.join(nueva_palabra)
    return resultado

def minuscula(palabra):
    capletras = []
    regletras = []
    mayuscula = 'ABCDEFGHIJKLMNÑOPQRSTUVWXYZ'
    minuscula = 'abcdefghijklmnñopqrstuvwxyz'
    for x in mayuscula:
        capletras.append(x)
    for x in minuscula:
        regletras.append(x)
    
    nueva_palabra = []
    for x in palabra:
        if x in regletras:
            nueva_palabra.append(x)
        elif x not in regletras and x not in capletras:
            nueva_palabra.append(x)
        else:
            conversion = capletras.index(x)
            if x:
                proc = regletras[conversion]
                nueva_palabra.append(proc)
    resultado = ''.join(nueva_palabra)
    return resultado

print(minuscula("Hola*Mundo"))
print(mayuscula("Hola*Mundo"))
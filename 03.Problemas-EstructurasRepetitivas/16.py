import os
os.system("cls")

print("-----INVERTIR-----")

palabra = input("Palabra: ")

def invertir(palabra):

    new_palabra = []

    for i in range(1, len(palabra)+1):
        new_palabra.append(palabra[len(palabra) - i])

    x = ",".join(new_palabra).replace(",","") 
    return x

print(f"Palabra invertida: {invertir(palabra)}")
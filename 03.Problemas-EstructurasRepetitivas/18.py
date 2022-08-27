import os
os.system("cls")

print("-----LTRIM, RTRIM, TRIM-----")

palabra = input("Palabra: ")

def ltrim(texto):
    
    new_texto = ""
    count = 0

    for i in texto:
        if i == " ":
            count += 1
            continue
        else:
            new_texto = texto[count:]
            break
            
    return new_texto

def rtrim(texto):
    
    new_texto = ""

    for i in range(-1, -len(texto), -1):
        if texto[i] == " ":
            continue
        else:
            new_texto = texto[:i+1]
            break
            
    return new_texto

def alltrim(texto):
    texto_ltrim = ltrim(texto)
    texto_alltrim = rtrim(texto_ltrim)
    return texto_alltrim

print(ltrim(palabra))
print(len(ltrim(palabra)))
print(rtrim(palabra))
print(len(rtrim(palabra)))
print(alltrim(palabra))
print(len(alltrim(palabra)))
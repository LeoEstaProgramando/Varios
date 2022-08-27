import os
os.system("cls")

#Una persona ha recorrido tres tramos de una carretera. La longitud del primer tramo está dada en kilómetros, el segundo tramo en pies y el tercer tramo en millas. Desarrolle el programa que determine la longitud total recorrida en metros y en yardas.

tramo1 = float(input("Primer tramo(kilometros): "))
tramo2 = float(input("Segundo tramo(pies): "))
tramo3 = float(input("Tercer tramo(millas): "))

tramoMetros = tramo1*1000 + tramo2/3.2808 + tramo3*1609
tramoYardas = tramoMetros*1.093613

print("----------TRAMO TOTAL----------")
print(f"Tramo total(metros): {tramoMetros:.2f}")
print(f"Tramo total(yardas): {tramoYardas:.2f}")
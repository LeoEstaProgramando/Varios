import os
os.system("cls")

#Desarrolle el programa que, dada la capacidad de un disco duro en gigabytes, lo convierta a megabytes, kilobytes y bytes. 1 KB = 1024 bytes, 1 MB = 1024 KB, 1 GB = 1024 MB.

capacidad_GB = int(input("Capacidad de disco duro(GB): "))

capacidad_MB = capacidad_GB * 1024 
capacidad_KB = capacidad_MB * 1024
capacidad_bytes = capacidad_KB * 1024

print("----------CONVERSION----------")
print(f"Capacidad de disco duro(MB)   : {capacidad_MB}")
print(f"Capacidad de disco duro(KB)   : {capacidad_KB}")
print(f"Capacidad de disco duro(bytes): {capacidad_bytes}")
# Función recursiva para calcular el factorial
def factorial(n):
    # Caso base: si n es 0 o 1, el factorial es 1
    if n == 0 or n == 1:
        return 1
    # Llamada recursiva: n * factorial(n - 1)
    return n * factorial(n - 1)

# Función principal
def main():
    # Pedir al usuario que ingrese un número
    numero = int(input("Ingrese un número para calcular su factorial: "))

    # Calcular el factorial y mostrar el resultado
    print(f"El factorial de {numero} es: {factorial(numero)}")

# Verificar si el script se está ejecutando directamente
if __name__ == "__main__":
    main()

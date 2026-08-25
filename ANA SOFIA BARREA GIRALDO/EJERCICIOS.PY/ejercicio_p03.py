productos = {
    "Arroz": 4000,
    "Leche": 3500,
    "Pan": 2000
}

while True:
    print("\n--- MENU ---")
    print("1. Agregar producto")
    print("2. Consultar precio")
    print("3. Actualizar precio")
    print("4. Eliminar producto")
    print("5. Salir")

    opcion = input("Seleccione una opción: ")

    if opcion == "1":
        producto = input("Ingrese el producto: ")
        precio = float(input("Ingrese el precio: "))

        productos[producto] = precio
        print("Producto agregado correctamente.")

    elif opcion == "2":
        producto = input("Ingrese el producto: ")

        if producto in productos:
            print("El precio es:", productos[producto])
        else:
            print("Producto no encontrado.")

    elif opcion == "3":
        producto = input("Ingrese el producto: ")

        if producto in productos:
            precio = float(input("Ingrese el nuevo precio: "))
            productos[producto] = precio
            print("Precio actualizado.")
        else:
            print("Producto no encontrado.")

    elif opcion == "4":
        producto = input("Ingrese el producto: ")

        if producto in productos:
            del productos[producto]
            print("Producto eliminado.")
        else:
            print("Producto no encontrado.")

    elif opcion == "5":
        print("Programa terminado.")
        break

    else:
        print("Opción no válida.")
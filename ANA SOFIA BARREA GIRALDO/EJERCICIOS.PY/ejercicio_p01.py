agenda = {
    "Camila": "3001234567",
    "Julian": "3012345678",
    "Valentina": "3023456789",
    "Sofia": "3034567890"
}

nombre = input("Ingrese el nombre del contacto: ")

if nombre in agenda:
    print("El teléfono de", nombre, "es:", agenda[nombre])
else:
    print("Contacto no encontrado")
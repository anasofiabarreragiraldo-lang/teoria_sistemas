estudiantes = [
    ("Camila", "11A"),
    ("Julian", "11B"),
    ("Valentina", "11A"),
    ("Sofia", "11B")
]

cursos = {}

for nombre, curso in estudiantes:

    if curso in cursos:
        cursos[curso].append(nombre)
    else:
        cursos[curso] = [nombre]

print("Estudiantes por curso:")

for curso, nombres in cursos.items():
    print(curso, ":", nombres)
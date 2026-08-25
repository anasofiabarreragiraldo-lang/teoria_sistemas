# teoria_sistemas

# 📚 Ejercicios de Hashes y Diccionarios

**Integrantes:** Ana Sofía Barrera Giraldo y Juan Miguel Ochoa Mesa
**Grado:** 11.6

## 📌 Descripción

En este repositorio se encuentran los ejercicios de la guía de **Hashes y Diccionarios**, realizados en tres lenguajes de programación:

* 🐍 Python
* 🟦 C#
* ☕ Java

Los ejercicios trabajan principalmente con estructuras de datos que relacionan una **clave** con un **valor**.

---

# 🐍 Python

## Ejercicio 1 — Agenda

**Archivo:** `ejercicio_p01.py`

### ¿Cómo funciona?

El programa tiene una agenda con nombres y números telefónicos.

Al ejecutarlo:

1. El programa muestra una solicitud para ingresar el nombre de un contacto.
2. Se escribe el nombre.
3. El programa busca el nombre en el diccionario.
4. Si existe, muestra su número telefónico.
5. Si no existe, muestra **"Contacto no encontrado"**.

### ▶️ Cómo ejecutarlo

Abrir la terminal en la carpeta donde está el archivo y escribir:

```bash
python ejercicio_p01.py
```

---

## Ejercicio 2 — Frecuencia de letras

**Archivo:** `ejercicio_p02.py`

### ¿Cómo funciona?

El programa solicita un texto y cuenta cuántas veces aparece cada letra.

El programa:

1. Solicita un texto.
2. Convierte las letras a minúsculas.
3. Ignora los espacios.
4. Cuenta las veces que aparece cada letra.
5. Ordena los resultados de mayor a menor frecuencia.

### ▶️ Cómo ejecutarlo

```bash
python ejercicio_p02.py
```

---

## Ejercicio 3 — Productos y precios

**Archivo:** `ejercicio_p03.py`

### ¿Cómo funciona?

El programa utiliza un diccionario para almacenar productos y sus precios.

Al ejecutarlo aparece un menú:

```text
--- MENU ---
1. Agregar producto
2. Consultar precio
3. Actualizar precio
4. Eliminar producto
5. Salir
```

El usuario puede seleccionar una opción y realizar la operación correspondiente.

### ▶️ Cómo ejecutarlo

```bash
python ejercicio_p03.py
```

---

## Ejercicio 4 — Estudiantes por curso

**Archivo:** `ejercicio_p04.py`

### ¿Cómo funciona?

El programa recibe una lista de estudiantes con sus respectivos cursos.

Por ejemplo:

```text
Camila → 11A
Julian → 11B
Valentina → 11A
```

Después organiza los estudiantes por curso:

```text
11A : [Camila, Valentina]
11B : [Julian]
```

### ▶️ Cómo ejecutarlo

```bash
python ejercicio_p04.py
```

---

# 🟦 C#

Los ejercicios en C# realizan las mismas funciones que los programas de Python.

## Ejercicio 1

**Archivo:** `ejercicio_p01.cs`

Busca un contacto dentro de un diccionario y muestra su número telefónico.

## Ejercicio 2

**Archivo:** `ejercicio_p02.cs`

Cuenta las veces que aparece cada letra de un texto y muestra los resultados ordenados.

## Ejercicio 3

**Archivo:** `ejercicio_p03.cs`

Permite agregar, consultar, actualizar y eliminar productos mediante un menú.

## Ejercicio 4

**Archivo:** `ejercicio_p04.cs`

Organiza los nombres de los estudiantes según el curso al que pertenecen.

### ▶️ Cómo ejecutar los programas en C#

Si se utiliza Visual Studio Code con .NET, se puede crear un proyecto de consola y ejecutar:

```bash
dotnet run
```

También se puede abrir el archivo correspondiente en el entorno de desarrollo y ejecutarlo desde allí.

---

# ☕ Java

Los ejercicios en Java también realizan las mismas operaciones de los ejercicios anteriores.

## Ejercicio 1

**Archivo:** `EjercicioP01.java`

Permite buscar un contacto por su nombre y mostrar su número telefónico.

## Ejercicio 2

**Archivo:** `EjercicioP02.java`

Cuenta la frecuencia de cada letra de un texto y organiza los resultados de mayor a menor.

## Ejercicio 3

**Archivo:** `EjercicioP03.java`

Presenta un menú para administrar productos y sus precios.

Permite:

* Agregar.
* Consultar.
* Actualizar.
* Eliminar.

## Ejercicio 4

**Archivo:** `EjercicioP04.java`

Agrupa los estudiantes utilizando el curso como clave y una lista de nombres como valor.

### ▶️ Cómo ejecutar los programas en Java

Primero se debe tener instalado Java.

Desde la terminal se puede compilar el archivo:

```bash
javac EjercicioP01.java
```

Después se ejecuta con:

```bash
java EjercicioP01
```

Se realiza el mismo proceso cambiando el nombre del archivo para los demás ejercicios.

---

# 📂 Organización del repositorio

```text
📁 Hashes-Diccionarios
│
├── 🐍 Python
│   ├── ejercicio_p01.py
│   ├── ejercicio_p02.py
│   ├── ejercicio_p03.py
│   └── ejercicio_p04.py
│
├── 🟦 C#
│   ├── ejercicio_p01.cs
│   ├── ejercicio_p02.cs
│   ├── ejercicio_p03.cs
│   └── ejercicio_p04.cs
│
├── ☕ Java
│   ├── EjercicioP01.java
│   ├── EjercicioP02.java
│   ├── EjercicioP03.java
│   └── EjercicioP04.java
│
└── README.md
```

# ▶️ Recomendación para usar los programas

1. Descargar o clonar este repositorio.
2. Abrir la carpeta en el editor de código.
3. Entrar a la carpeta del lenguaje que se quiera utilizar.
4. Abrir el ejercicio correspondiente.
5. Ejecutar el programa.
6. Seguir las instrucciones que aparecen en la consola.

Cada ejercicio es independiente, por lo que se puede ejecutar sin necesidad de ejecutar los demás.

---

## 🎯 Objetivo

Estos ejercicios permiten practicar el uso de **diccionarios, claves, valores, búsqueda, actualización, eliminación y conteo de datos**, aplicando los mismos conceptos en Python, C# y Java.

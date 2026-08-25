using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {
        List<(string nombre, string curso)> estudiantes = new List<(string, string)>
        {
            ("Camila", "11A"),
            ("Julian", "11B"),
            ("Valentina", "11A"),
            ("Sofia", "11B")
        };

        Dictionary<string, List<string>> cursos =
            new Dictionary<string, List<string>>();

        foreach (var estudiante in estudiantes)
        {
            string nombre = estudiante.nombre;
            string curso = estudiante.curso;

            if (cursos.ContainsKey(curso))
            {
                cursos[curso].Add(nombre);
            }
            else
            {
                cursos[curso] = new List<string>();
                cursos[curso].Add(nombre);
            }
        }

        Console.WriteLine("Estudiantes por curso:");

        foreach (var curso in cursos)
        {
            Console.Write(curso.Key + ": ");

            foreach (string nombre in curso.Value)
            {
                Console.Write(nombre + " ");
            }

            Console.WriteLine();
        }
    }
}
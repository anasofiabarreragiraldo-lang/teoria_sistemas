using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {
        Dictionary<string, string> agenda = new Dictionary<string, string>();

        agenda["Camila"] = "3001234567";
        agenda["Julian"] = "3012345678";
        agenda["Valentina"] = "3023456789";
        agenda["Sofia"] = "3034567890";

        Console.Write("Ingrese el nombre del contacto: ");
        string nombre = Console.ReadLine() ?? "";

        if (agenda.ContainsKey(nombre))
        {
            Console.WriteLine("El telefono de " + nombre + " es: " + agenda[nombre]);
        }
        else
        {
            Console.WriteLine("Contacto no encontrado");
        }
    }
}

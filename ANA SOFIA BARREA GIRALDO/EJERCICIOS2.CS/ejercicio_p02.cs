using System;
using System.Collections.Generic;
using System.Linq;

class Program
{
    static void Main()
    {
        Console.Write("Ingrese un texto: ");
        string texto = Console.ReadLine().ToLower();

        Dictionary<char, int> frecuencia = new Dictionary<char, int>();

        foreach (char letra in texto)
        {
            if (letra != ' ')
            {
                if (frecuencia.ContainsKey(letra))
                {
                    frecuencia[letra]++;
                }
                else
                {
                    frecuencia[letra] = 1;
                }
            }
        }

        var resultado = frecuencia.OrderByDescending(x => x.Value);

        Console.WriteLine("\nFrecuencia de las letras:");

        foreach (var dato in resultado)
        {
            Console.WriteLine(dato.Key + " : " + dato.Value);
        }
    }
}
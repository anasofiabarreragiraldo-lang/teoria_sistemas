using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {
        Dictionary<string, double> productos = new Dictionary<string, double>();

        productos["Arroz"] = 4000;
        productos["Leche"] = 3500;
        productos["Pan"] = 2000;

        while (true)
        {
            Console.WriteLine("\n--- MENU ---");
            Console.WriteLine("1. Agregar producto");
            Console.WriteLine("2. Consultar precio");
            Console.WriteLine("3. Actualizar precio");
            Console.WriteLine("4. Eliminar producto");
            Console.WriteLine("5. Salir");

            Console.Write("Seleccione una opción: ");
            string opcion = Console.ReadLine();

            if (opcion == "1")
            {
                Console.Write("Ingrese el producto: ");
                string producto = Console.ReadLine();

                Console.Write("Ingrese el precio: ");
                double precio = double.Parse(Console.ReadLine());

                productos[producto] = precio;

                Console.WriteLine("Producto agregado correctamente.");
            }
            else if (opcion == "2")
            {
                Console.Write("Ingrese el producto: ");
                string producto = Console.ReadLine();

                if (productos.ContainsKey(producto))
                {
                    Console.WriteLine("El precio es: " + productos[producto]);
                }
                else
                {
                    Console.WriteLine("Producto no encontrado.");
                }
            }
            else if (opcion == "3")
            {
                Console.Write("Ingrese el producto: ");
                string producto = Console.ReadLine();

                if (productos.ContainsKey(producto))
                {
                    Console.Write("Ingrese el nuevo precio: ");
                    double precio = double.Parse(Console.ReadLine());

                    productos[producto] = precio;

                    Console.WriteLine("Precio actualizado.");
                }
                else
                {
                    Console.WriteLine("Producto no encontrado.");
                }
            }
            else if (opcion == "4")
            {
                Console.Write("Ingrese el producto: ");
                string producto = Console.ReadLine();

                if (productos.ContainsKey(producto))
                {
                    productos.Remove(producto);
                    Console.WriteLine("Producto eliminado.");
                }
                else
                {
                    Console.WriteLine("Producto no encontrado.");
                }
            }
            else if (opcion == "5")
            {
                Console.WriteLine("Programa terminado.");
                break;
            }
            else
            {
                Console.WriteLine("Opción no válida.");
            }
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_labo2;

/**
 *
 * @author kaztro
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private static Menu menu;

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    public void opciones() {
        System.out.println("----- Menu -----");
        System.out.println("1. Agregar producto");
        System.out.println("2. Mostrar producto");
        System.out.println("3. Agregar proveedor");
        System.out.println("4. ver proveedores");
        System.out.println("5. Salir");
    }

    public void mostrar() {
        int opcion = 4;
        Scanner leer = new Scanner(System.in);
        ListaProducto productos = new ListaProducto();
        ListaProveedor provee = new ListaProveedor();

        while (opcion != 5) {
            opciones();
            try {
                opcion = leer.nextInt();
                
                switch (opcion) {
                    case 1:
                        productos.agregar();
                        break;
                    case 2:
                        productos.mostrar();
                        break;
                    case 3: 
                        provee.add();
                        break;
                    case 4:
                        provee.show();
                    case 5:
                        System.out.println("bye bye seniora de la tienda :v");
                        break;
                    default:
                        System.out.println("Por favor ingrese una opcion valida");
                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor seniora deme un numero que valga");
                leer.nextLine();
            }
        }
    }

}


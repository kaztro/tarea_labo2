package tarea_labo2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kaztro
 */
public class ListaProducto {
   
    private ArrayList<Producto> productos;
    
    public ListaProducto() {
        productos = new ArrayList<>();
    }
    
    public void agregar() {
        Producto Pro = new Producto();
        
        productos.add(Pro);
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del producto");
        Pro.setNomProduct(leer.nextLine());
        
        System.out.println("Ingrese la cantidad existente de producto");
        Pro.setCantProduct(leer.nextInt());
        
        System.out.println("Ingrese el precio del producto");
        Pro.setCosto(leer.nextFloat());
    }
    
    public void mostrar() {
        productos.forEach((i) -> {
            System.out.println(i.toString());
        });
    }
}

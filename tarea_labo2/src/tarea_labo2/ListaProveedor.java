/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_labo2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kaztro
 */
public class ListaProveedor {
     private ArrayList<Proveedor> proveedores;
    
    public ListaProveedor() {
        proveedores = new ArrayList<>();
    }
    
    public void add() {
        Proveedor prove = new Proveedor();
        
        proveedores.add(prove);
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del proveedor");
        prove.setNombre(leer.nextLine());
        
        System.out.println("Ingrese el telefono");
        prove.setTel(leer.nextLine());
        
        System.out.println("Ingrese el nombre de la empresa");
        prove.setEmpresa(leer.nextLine());
    }
    
    public void show() {
        proveedores.forEach((j) -> {
            System.out.println(j.toString());
        });
    }
}

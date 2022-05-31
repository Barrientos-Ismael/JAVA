package org.barrientos.appfacturas;

import org.barrientos.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {


        Cliente cliente = new Cliente();
        cliente.setNif("555-5");
        cliente.setNombre("Ismael");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese la descripcion de la factura: ");
        //String desc = s.nextLine();
        Factura factura = new Factura(s.nextLine(), cliente);

        Producto producto;
        //String nombre;
        //float precio;
        //int cantidad;

        System.out.println();

        for (int i = 0; i<2; i++){
            producto = new Producto();
            System.out.print("Ingrese producto nª"+ producto.getCodigo()+": ");
            //nombre = s.nextLine();
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            //precio = s.nextFloat();
            producto.setPrecio(s.nextFloat());

            System.out.print("ingrese la cantidad: ");
            //cantidad = s.nextInt();

            //ItemFactura item = new ItemFactura(s.nextInt(),producto);
            factura.addItemFactura(new ItemFactura(s.nextInt(),producto));

            System.out.println();
            s.nextLine(); // Movemos el cursor del scanner a la siguiente linea sino hay problema
        }

        //System.out.println(factura.generarDetalle());
        System.out.println(factura);

    }
}

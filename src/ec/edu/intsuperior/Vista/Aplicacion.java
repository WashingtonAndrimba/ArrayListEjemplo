/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.Vista;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Aplicacion {
     public static void main(String[] args) {
    ArrayList<String> listaNombres = new ArrayList<String>();

    // Agregar elementos a la lista
    listaNombres.add("Juan");
    listaNombres.add("María");
    listaNombres.add("Pedro");

    // Acceder a un elemento de la lista
    String primerNombre = listaNombres.get(0);
    System.out.println("El primer nombre de la lista es: " + primerNombre);

    // Eliminar un elemento de la lista
    listaNombres.remove(1);
    System.out.println("La lista después de eliminar un elemento: " + listaNombres);
  }
}





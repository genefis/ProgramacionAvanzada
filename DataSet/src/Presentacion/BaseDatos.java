/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.util.Scanner;


/**
 *
 * Autor: Génesis Gonzalez
 * Fecha:15/06/2022
 *
 */
public class BaseDatos {
     void menuArchivoTexto() {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion < 4) {
            System.out.println("Agregar");
            System.out.println("Eliminar");
            System.out.println("Listar");
            System.out.println("Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    AgregarClienteDB();
                    break;
                case 2:
                    EliminarClienteDB();
                    break;
                case 3:
                    ListarClienteDB();
                    break;
            }
        }

    }

    private void AgregarClienteDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void EliminarClienteDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ListarClienteDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

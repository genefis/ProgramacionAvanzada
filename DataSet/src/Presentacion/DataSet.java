package Presentacion;

import java.io.IOException;
import java.util.Scanner;


/**
 *
 * Autor: Génesis Gonzalez
 * Fecha:15/06/2022
 *
 */
public class DataSet {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArchivoTexto archivotexto = new ArchivoTexto();
        int opcion = 0;
        while (opcion < 4) {
            System.out.println("Texto");
            System.out.println("Binario");
            System.out.println("Database");
            System.out.println("Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    archivotexto.menuArchivoTexto();
                    break;
             //   case 2:
                    
                 //   break;
               // case 3:
                  
                   // break;
            }
        }
    }



}

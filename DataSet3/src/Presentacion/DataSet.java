
package Presentacion;

import java.io.IOException;
import java.util.Scanner;

/**
 * @Génesis González
 * Fecha:21/Junio/2022
 */
public class DataSet {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArchivoTexto objArchivoTexto = new ArchivoTexto();
                
        int op=0;
        while (op<4){
            System.out.println("Texto      1");
            System.out.println("Binario    2");
            System.out.println("Data Base  3");
            System.out.println("Salir      4");
            op = sc.nextInt();
            
            switch(op){
                case 1: objArchivoTexto.menuArhivoTexto(); break;
                //case 2: menuBin(); break;
                //case 3: menuDB(); break;       
            }
            
            
            
        }
    }

    
    
}

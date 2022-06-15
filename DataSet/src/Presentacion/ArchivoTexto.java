package Presentacion;

import Logica.LogClienteTxt;
import dataset.Cliente;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Génesis González
 */
public class ArchivoTexto {
    public static void main(String[] args) throws IOException {
        
        AgregarClienteTxt();
    }

    void menuArchivoTexto() throws IOException {

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
                    AgregarClienteTxt();
                    break;
                case 2:
                    EliminarClienteTxt();
                    break;
                case 3:
                    ListarClienteTxt();
                    break;
            }
        }

    }

        private static  void AgregarClienteTxt() throws IOException {
        LogClienteTxt Clientetxt = new LogClienteTxt(); 
        Cliente cliente = new Cliente();
        cliente.setCod(100);
        cliente.setName("Génesis");
        cliente.setFechaN(new Date());
        Clientetxt.ValidarId(cliente);
       

    }

    private void EliminarClienteTxt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ListarClienteTxt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

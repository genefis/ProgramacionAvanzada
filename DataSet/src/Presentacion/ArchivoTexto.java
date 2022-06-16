package presentacion;

import Logica.LogClienteTxt;
import dataset.Cliente;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * Autor: Génesis Gonzalez
 * Fecha:15/06/2022
 *
 */
public class ArchivoTexto {

    LogClienteTxt LogCliente = new LogClienteTxt();

    void menuArchivoTexto() throws IOException {

        Scanner in = new Scanner(System.in);

        int op = 0;

        while (op < 4) {
            System.out.println("agregar:   1");
            System.out.println("eliminar:  2");
            System.out.println("listar:    3");
            System.out.println("Salir:     4");
            op = in.nextInt();

            switch (op) {
                case 1:
                    AgregarCliente();
                    break;
                case 2:
                    EliminarCliente();
                    break;
                case 3:
                    ListarCliente();
                    break;

                default:
                    break;
            }

        }
    }

    public void AgregarCliente() throws IOException {

        Cliente cliente = new Cliente();
        cliente.setName("Erika");
        cliente.setFechaN(new Date());
        cliente.setCod(1);
        if (LogCliente.ValidarId(cliente)) {
            System.out.println("Clinte agregado con exito ");
        } else {
            System.out.println("cliente no agregado sin exito ");
        }

    }

    public void EliminarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void ListarCliente() {

        LogCliente.ListarClientes();

    }

}

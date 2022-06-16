package Logica;

import Archivos.ClienteTxt;
import dataset.Cliente;
import java.io.IOException;


/**
 *
 * Autor: Génesis Gonzalez
 * Fecha:15/06/2022
 *
 */
public class LogClienteTxt {

    ClienteTxt clientetxt = new ClienteTxt();

    public void ValidarId(Cliente cliente) throws IOException {
        //Valida si el codigo es correcto
        if (cliente.getCod() > 0) {
            return clientetxt.AgregarCliente(cliente);
            
        }
            return false;
    }
    public void ListarClientes(){
    
    }

}

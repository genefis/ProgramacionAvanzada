package Logica;

import Archivos.ClienteTxt;
import dataset.Cliente;
import java.io.IOException;

/**
 *
 * @author Usuario
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

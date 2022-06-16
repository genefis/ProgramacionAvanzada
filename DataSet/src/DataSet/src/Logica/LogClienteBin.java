package Logica;
import Archivos.ClienteBin;
import Clases.Cliente;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Carlos Escudero
 * Fecha 15 de junio
 */
public class LogClienteBin {
    ClienteBin objClienteBin = new ClienteBin();
    public boolean  ValidarId(Cliente objCliente) throws IOException {
        ArrayList<Cliente> ArrayClientes = new ArrayList<Cliente>();
        // Valida si el codigo es correcto
        if (objCliente.getId() > 0){
            // Agregar al archivo texto
            ArrayClientes.add(objCliente);
            return objClienteBin.AgregarCliente(objCliente);
        }
        return false;
    }
    public void ListarClientes(ArrayList<Cliente> ArrayClientes) throws IOException, ClassNotFoundException {
        objClienteBin.ImportarClienteBin(ArrayClientes);
    }
}

package Archivos;

import dataset.Cliente;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class ClienteTxt {

    public static void ValidarId(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void AgregarCliente(Cliente cliente) throws IOException {
        File f = new File("Cliente.txt ");

        FileWriter fw = new FileWriter(f, false);

        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write(Integer.toString(cliente.getCod())+",");
        bw.write(cliente.getName()+",");
        bw.write(String.valueOf(cliente.getFechaN()));
        bw.close();
        fw.close();

    }
}

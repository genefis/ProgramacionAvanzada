/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Archivos.EstudianteTxt;
import Clases.Estudiante;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Génesis González
 * FEcha  de junio
 */
public class LogEstudianteTxt {
    EstudianteTxt objClienteTxt = new EstudianteTxt();
    public boolean ValidarId(Estudiante objCliente) throws IOException {
        // valida si el codigo es correcto
        if (objCliente.getCod() > 0){
            // agregar al archvio texto            
            return objClienteTxt.AgregarCliente(objCliente);
        }
        return false;
    }

    public void ListarClientes(ArrayList<Estudiante> ArrayClientes){
        objClienteTxt.LeerCliente(ArrayClientes);
    
    }
    
}

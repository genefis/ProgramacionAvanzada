package Presentacion;
import Clases.Estudiante;
import Logica.LogEstudianteTxt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Génesis González
 * Fecha:21/Junio/2022
 */
public class ArchivoTexto {
    static LogEstudianteTxt objLogClienteTxt = new LogEstudianteTxt();
    
    public static void main(String[] args) throws IOException {
        
        AgregarClienteTxt();
        ListarClientes();
    }
    
    void menuArhivoTexto() throws IOException{
        Scanner sc = new Scanner(System.in);
        int op=0;
        while (op<4){
            System.out.println("Agregar     1");
            System.out.println("Eliminar    2");
            System.out.println("Listar      3");
            System.out.println("Salir       4");
            op = sc.nextInt();
            
            switch(op){
                case 1: AgregarClienteTxt(); break;
                case 2: EliminarClienteTxt(); break;
                case 3: ListarClientes(); break;
            }
        }
    }

    static private void AgregarClienteTxt() throws IOException {
        LogEstudianteTxt objLogClienteTxt = new LogEstudianteTxt();
        Estudiante estudiante = new Estudiante();
        // entrada
        estudiante.setCod(1);
        estudiante.setNombre("Génesis");
        estudiante.setFecNac("06122022");
        if (objLogClienteTxt.ValidarId(estudiante))
            System.out.println("cliente agregado");
        else
            System.out.println("codigo cliente no valido");
    }
    
    private void EliminarClienteTxt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static private void ListarClientes() {
        ArrayList<Estudiante> ArrayEstudiante = new ArrayList<Estudiante>();
        objLogClienteTxt.ListarClientes(ArrayEstudiante);
        for (Estudiante tmpCliente : ArrayEstudiante)
            System.out.println(tmpCliente.toString());
    }
}

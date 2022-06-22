package Presentacion;
import Clases.Estudiante;
import Logica.LogEstudianteBin;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Génesis González
 * Fecha:21/Junio/2022
 */
public class ArchivoBin {
    static LogEstudianteBin objLogClienteBin = new LogEstudianteBin();
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        AgregarClienteBin();
        ListarClienteBin();
    }
             
    void menuArhivoTexto() throws IOException, FileNotFoundException, ClassNotFoundException{
        Scanner sc = new Scanner(System.in);
        int op=0;
        while (op<4){
            System.out.println("Agregar     1");
            System.out.println("Eliminar    2");
            System.out.println("Listar      3");
            System.out.println("Salir       4");
            op = sc.nextInt();
            
            switch(op){
                case 1: AgregarClienteBin(); break;
                case 2: EliminarClienteBin(); break;
                case 3: ListarClienteBin(); break;
            }
        }
    }

    static private void AgregarClienteBin() throws IOException {
        
        Estudiante estudiante = new Estudiante();
        // entrada
        estudiante.setCod(5);
        estudiante.setNombre("Francisco");
        estudiante.setFecNac("07062200");
        
        if (objLogClienteBin.ValidarId(estudiante))
            System.out.println("cliente agregado");
        else
            System.out.println("codigo cliente no valido");
    
    }

    private void EliminarClienteBin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static private void ListarClienteBin() throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Estudiante> ArrayEstudiante = new ArrayList<Estudiante>();
        objLogClienteBin.ListarClientes(ArrayEstudiante);
        for (Estudiante tmpEstudiante : ArrayEstudiante)
            System.out.println(tmpEstudiante.toString());
    
    }
}

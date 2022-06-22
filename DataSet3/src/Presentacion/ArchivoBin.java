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
    static LogEstudianteBin objLogEstudianteBin = new LogEstudianteBin();
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        AgregarEstudianteBin();
        ListarEstudianteBin();
    }
             
    void menuArhivoTexto() throws IOException, FileNotFoundException, ClassNotFoundException{
        Scanner sc = new Scanner(System.in);
        int op=0;
        while (op<4){
            System.out.println("AGREGAR ESTUDIANTE  1");
            System.out.println("ELIMINAR ESTUDIANTE    2");
            System.out.println("LISTAR ESTUDIANTE     3");
            System.out.println("SALIR     4");
            op = sc.nextInt();
            
            switch(op){
                case 1: AgregarEstudianteBin(); break;
                case 2: EliminarEstudianteBin(); break;
                case 3: ListarEstudianteBin(); break;
            }
        }
    }

    static private void AgregarEstudianteBin() throws IOException {
        
        Estudiante estudiante = new Estudiante();
        // entrada
        estudiante.setCod(333);
        estudiante.setNombre("David");
        estudiante.setCarrera("Computacion");
        
        if (objLogEstudianteBin.ValidarCod(estudiante))
            System.out.println("Estudiante agregado");
        else
            System.out.println("Estudiante no agregado");
    
    }

    private void EliminarEstudianteBin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static private void ListarEstudianteBin() throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Estudiante> ArrayEstudiante = new ArrayList<Estudiante>();
        objLogEstudianteBin.ListarEstudiante(ArrayEstudiante);
        for (Estudiante tmpEstudiante : ArrayEstudiante)
            System.out.println(tmpEstudiante.toString());
    
    }
}

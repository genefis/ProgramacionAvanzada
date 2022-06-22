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
    static LogEstudianteTxt objLogEstudianteTxt = new LogEstudianteTxt();
    
    public static void main(String[] args) throws IOException {
        
        AgregarEstudianteTxt();
       ListarEstudiante();
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
                case 1: AgregarEstudianteTxt(); break;
                case 2: EliminarEstudianteTxt(); break;
                case 3: ListarEstudiante(); break;
            }
        }
    }

    static private void AgregarEstudianteTxt() throws IOException {
        LogEstudianteTxt objLogClienteTxt = new LogEstudianteTxt();
        Estudiante estudiante = new Estudiante();
        // entrada
        estudiante.setCod(444);
        estudiante.setNombre("Génesis");
        estudiante.setCarrera("sistemas");
        if (objLogClienteTxt.ValidarCod(estudiante))
            System.out.println("Cliente agregado");
        else
            System.out.println("Cliente no agregado");
    }
    
    private void EliminarEstudianteTxt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static private void ListarEstudiante() {
        ArrayList<Estudiante> ArrayEstudiante = new ArrayList<Estudiante>();
        objLogEstudianteTxt.ListarEstudiante(ArrayEstudiante);
        for (Estudiante tmpEstudiante : ArrayEstudiante)
            System.out.println(tmpEstudiante.toString());
    }
}

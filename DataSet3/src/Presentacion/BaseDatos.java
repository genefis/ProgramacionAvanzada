package Presentacion;
import java.util.Scanner;
/**
 * @Génesis González
 * Fecha:21/Junio/2022
 */
public class BaseDatos {
    void menuArhivoTexto(){
        Scanner sc = new Scanner(System.in);
        int op=0;
        while (op<4){
            System.out.println("Agregar     1");
            System.out.println("Eliminar    2");
            System.out.println("Listar      3");
            System.out.println("Salir       4");
            op = sc.nextInt();
            
            switch(op){
                case 1: AgregarEstudianteDB(); break;
                case 2: EliminarEstudianteDB(); break;
                case 3: ListarEstudianteDB(); break;
            }
        }
    }

    private void AgregarEstudianteDB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void EliminarEstudianteDB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void ListarEstudianteDB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

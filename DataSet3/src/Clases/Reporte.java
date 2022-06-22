package Clases;

/**
 * Fecha:21/06/2022
 *
 * @author Génesis González
 */
public class Reporte extends Estudiante {
    private String materia;
    private double Bimestre1;
    private double Bimestre2;
    private double promedio;

    public Reporte() {
    }

    public Reporte(String materia, double Bimestre1, double Bimestre2, double promedio, int Cod, String nombre, String fecNac) {
        super(Cod, nombre, fecNac);
        this.materia = materia;
        this.Bimestre1 = Bimestre1;
        this.Bimestre2 = Bimestre2;
        this.promedio = promedio;
    }

    public Reporte(String materia, double Bimestre1, double Bimestre2, double promedio) {
        this.materia = materia;
        this.Bimestre1 = Bimestre1;
        this.Bimestre2 = Bimestre2;
        this.promedio = promedio;
    }

    

}

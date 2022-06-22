package Clases;

/**
 * Fecha:21/06/2022
 *
 * @author Génesis González
 */
public class Reporte extends Estudiante {

    private double Bimestre1;
    private double Bimestre2;
    private double promedio;

    public Reporte() {
    }

    public Reporte(double Bimestre1, double Bimestre2) {
        this.Bimestre1 = Bimestre1;
        this.Bimestre2 = Bimestre2;
    }

    public Reporte(int Cod, String nombre, String fecNac, double Bimestre1, double Bimestre2) {
        super(Cod, nombre, fecNac);
        this.Bimestre1 = Bimestre1;
        this.Bimestre2 = Bimestre2;
    }

}

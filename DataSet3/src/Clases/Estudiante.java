
package Clases;

import java.io.Serializable;

/**
 * @Génesis González
 * Fecha:21/Junio/2022
 */
public class Estudiante implements Serializable{
    int Cod;
    String nombre;
    String carrera;

    public Estudiante() {
    }

    public Estudiante(int Cod, String nombre, String fecNac) {
        this.Cod = Cod;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public void setCod(int Cod) {
        this.Cod = Cod;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCod() {
        return Cod;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "Cod=" + Cod + ", nombre=" + nombre + ", carrera=" + carrera + '}';
    }

    
    
}

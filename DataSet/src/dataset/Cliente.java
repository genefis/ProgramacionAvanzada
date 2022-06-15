/*
*Autor:Génesis González 
*Fecha: 15/06/2022
 */
package dataset;

import java.util.Date;

public class Cliente {
    int cod;
    String Name;
    Date fechaN;

    public Cliente() {
    }

    public Cliente(int cod, String Name, Date fechaN) {
        this.cod = cod;
        this.Name = Name;
        this.fechaN = fechaN;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cod=" + cod + ", Name=" + Name + ", fechaN=" + fechaN + '}';
    }
    

}

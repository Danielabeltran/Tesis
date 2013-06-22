/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundovelocity;

/**
 *
 * @author JeysonAlveiro
 */
public class Estudiante {
    public int carnet;
    public String nombre;

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String iniciales(){
        return this.nombre.substring(0, 1).toUpperCase();
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundovelocity;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

/**
 *
 * @author JeysonAlveiro
 */
public class HolaMundoVelocity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] bandas = {"Coldplay", "U2", "ACDC"};
        ArrayList<Estudiante> curso = new ArrayList<Estudiante>();
        
        Estudiante est1 = new Estudiante();
        est1.setCarnet(123);
        est1.setNombre("Catalina");
        
        Estudiante est2 = new Estudiante();
        est2.setCarnet(456);
        est2.setNombre("Diana");
        
        Estudiante est3 = new Estudiante();
        est3.setCarnet(789);
        est3.setNombre("Martha");
        
        curso.add(est1);
        curso.add(est2);
        curso.add(est3);
        
        VelocityContext contexto = new VelocityContext();
        
        contexto.put("foo", "Esto funciona al pelo");
        contexto.put("alumno", est1);
        contexto.put("grupos", bandas);
        contexto.put("curso", curso);
        
        Velocity.init();//inicializa el motor velocity
        
        Template plantilla = null;
        try {
            plantilla=Velocity.getTemplate("plantillas/hola.vsl");
        } catch (Exception e) {
            System.out.println("shit");
        }
        
        
        if(plantilla != null)
        {
            try {
                BufferedWriter escritor = new BufferedWriter(new FileWriter("output/hola.html"));
                
                plantilla.merge(contexto, escritor);
                
                escritor.flush();
                escritor.close();
                
                
            } catch (IOException ex) {
                
            }
                
            
            
            
            
            
        }
        else
            System.out.println("no cargo la plantilla");
        
        
    }
}

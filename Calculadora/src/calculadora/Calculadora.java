
package calculadora;


/**
 *
 * @author Estudiantes
 */
public class Calculadora {
    
     
    public static void main(String[] args) {

        Operaciones miCalculador = new Operaciones();
    /*
    
    boolean repetir=true;
    do{
    miCalculador.operacion();
    }while(repetir=true);
   */
    
    Grafica miGrafico = new Grafica();
    miGrafico.respuesta = miCalculador;
    miGrafico.setVisible(true);
    
    
    }
}

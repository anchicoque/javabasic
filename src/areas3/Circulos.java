//description: Aplicación que calcula el area, perimetro y mas en tres figuras geometricas, utilizando herencia y JOptionPane 
//Date: 08-11-2018
//Author: Alex Anchicoque
package areas3;

import javax.swing.JOptionPane;

public class Circulos extends FigurasGeometricas {
    
    public static double radio;
    public static double PI;
    public static double diametro;
    
    //Clase constucota
    public Circulos(){
        PI = 3.1416;
    }
    //Metodo para pedir variables
    public void pedirVariables(){
        radio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el radio del circulo"));
    }
    
    @Override
    public void calcularArea(){
        pedirVariables();
        area = (PI*(radio*radio));
        JOptionPane.showMessageDialog(null, "El area del circulo es: " + area);
    }
    
    @Override
    public void calcularPerimetro(){
        pedirVariables();
        perimetro = (2*PI*radio);
        JOptionPane.showMessageDialog(null, "El perimetro del circulo es: " + perimetro);
    }
    
    public void calcularDiametroCirculo(){
        pedirVariables();
        diametro = (radio*2);
        JOptionPane.showMessageDialog(null, "El diametro del circulo es: " + diametro);
    }    
}

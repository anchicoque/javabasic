//description: Aplicación que calcula el area, perimetro y mas en tres figuras geometricas, utilizando herencia y JOptionPane 
//Date: 08-11-2018
//Author: Alex Anchicoque
package areas3;

import javax.swing.JOptionPane;

public class Cuadrados extends FigurasGeometricas{
    
    public static double l1;
    public static double l2;
    public static double diagonal;

    //Metodo para pedir variables
    public void pedirVariables(){    
        l1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el lado 1 del cuadrado"));
        l2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el lado 2 del cuadrado"));
    }
    
    @Override
    public void calcularArea(){
        pedirVariables();
        area = l1*l2;
        JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + area);
    }
    
    @Override
    public void calcularPerimetro(){
        pedirVariables();
        perimetro = ((l1*2)+(l2*2));
        JOptionPane.showMessageDialog(null, "El perimetro del cuadrado es: " + perimetro);
    }
    
    public void calcularDiagonalCuadrado(){
        pedirVariables();
        diagonal = Math.sqrt((l1*l1)+(l2*l2));
        JOptionPane.showMessageDialog(null, "La diagonal del cuadrado es: " + diagonal);
    }    
}

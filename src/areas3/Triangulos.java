//description: Aplicación que calcula el area, perimetro y mas en tres figuras geometricas, utilizando herencia y JOptionPane 
//Date: 08-11-2018
//Author: Alex Anchicoque
package areas3;

import javax.swing.JOptionPane;

public class Triangulos extends FigurasGeometricas {
    
    public static double base;
    public static double altura;
    public static double hipotenusa;
    
    //Metodo para pedir variables
    public void pedirVariables(){        
        base = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la base del triangulo"));
        altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la altura del triangulo"));
    }
    
    @Override
    public void calcularArea(){
        pedirVariables();
        area = ((base*altura)/2);
        JOptionPane.showMessageDialog(null, "El area del triangulo es: " + area);
    }
    
    @Override
    public void calcularPerimetro(){
        pedirVariables();
        perimetro = ((Math.sqrt((base*base)+(altura*altura))) + base + altura);
        JOptionPane.showMessageDialog(null, "El perimetro del triangulo es: " + perimetro);
    }
    
    public void calcularHipotenusaTriangulo(){
        pedirVariables();
        hipotenusa = Math.sqrt((base*base)+(altura*altura));
        JOptionPane.showMessageDialog(null, "La hipotenusa del triangulo es: " + hipotenusa);
    }    
}

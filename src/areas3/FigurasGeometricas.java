//description: Aplicación que calcula el area, perimetro y mas en tres figuras geometricas, utilizando herencia y JOptionPane 
//Date: 08-11-2018
//Author: Alex Anchicoque
package areas3;

public abstract class FigurasGeometricas {
    
    public double area;
    public double perimetro;
    
    //Los métodos abstractos se escriben sin llaves {} y con ; al final de la declaración.
    public abstract void calcularArea();    
    public abstract void calcularPerimetro();
    
}

//description: Aplicación que calcula el area, perimetro y mas en tres figuras geometricas, utilizando herencia y JOptionPane 
//Date: 08-07-2020 22:06
//Author: Alex Anchicoque
package areas3;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Areas3 {

    public static Cuadrados miCuadrado = new Cuadrados();
    public static Circulos miCirculo = new Circulos();
    public static Triangulos miTriangulo = new Triangulos();
    public static int opcion;

    public static void main(String[] args) {
        String menu = "MENU\n"
                + "1. Calcular area del cuadrado\n"
                + "2. Calcular area del circulo\n"
                + "3. Calcular area del triangulo\n"
                + "4. Calcular perimetro del cuadrado\n"
                + "5. Calcular perimetro del circulo\n"
                + "6. Calcular perimetro del triangulo\n"
                + "7. Calcular diagonal del cuadrado\n"
                + "8. Calcular diametro del circulo\n"
                + "9. Calcular hipotenusa del triangulo\n"
                + "0. Salir.";
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
                mostrarMenu();
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Introduce una opción");
                opcion = 100;
            }
        } while (opcion != 0);
    }

    public static void mostrarMenu() {
        switch (opcion) {
            case 1:
                miCuadrado.calcularArea();
                break;
            case 2:
                miCirculo.calcularArea();
                break;
            case 3:
                miTriangulo.calcularArea();
                break;
            case 4:
                miCuadrado.calcularPerimetro();
                break;
            case 5:
                miCirculo.calcularPerimetro();
                break;
            case 6:
                miTriangulo.calcularPerimetro();
                break;
            case 7:
                miCuadrado.calcularDiagonalCuadrado();
                break;
            case 8:
                miCirculo.calcularDiametroCirculo();
                break;
            case 9:
                miTriangulo.calcularHipotenusaTriangulo();
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa, adios.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ingrese una opción validad.");
                break;
        }
    }
}

//fila 3 silla 5
package examenlab5p2_gerardohasbum;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Date;
public class ExamenLab5P2_GerardoHasbum {
public static Scanner jhin = new Scanner(System.in);
    public static void main(String[] args) {
    
        ServicioBoroa s = new ServicioBoroa();
        
        System.out.println("Ingrese su nombre completo: ");
        String nombre = jhin.nextLine();
        System.out.println("Ingrese su Contrasenia: ");
        String password = jhin.nextLine();
        
        
        
        s.setVisible(true);
    
    }
    
}

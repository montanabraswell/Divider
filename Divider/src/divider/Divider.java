/* MOOC Java Tutorial 9
 * Java Tutorial 9
 * Montana Braswell
 * 11/8/2017
 */
package divider;

/**
 *
 * @author Montana
 */
import java.util.Scanner;
public class Divider {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number: ");
        double number2 = Integer.parseInt(reader.nextLine());
        
        double sum = number / number2;
        System.out.println("Division: " + sum);
    }
    
}

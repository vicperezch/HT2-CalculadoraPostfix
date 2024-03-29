/**
 * @author Nils Muralles & Víctor Pérez
 * @version 1.0.0
 * @since 20/01/24
 * Clase principal del programa
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean menu = true;

        while (menu) { 
            System.out.println("\n---CALCULADORA POSTFIX---");
            System.out.println("1. Leer archivo\n2. Salir");
            System.out.print("Seleccione una opción: ");
            String option = input.nextLine();

            try {
                int op = Integer.parseInt(option);

                switch (op) {
                    case 1:
                        Postfix posfixOperation = new Postfix();
                        System.out.println("\nOperación dada: " + posfixOperation.readOperation());
                        System.out.println("Resultado: " + posfixOperation.postfixOperate());
                        break;
                
                    case 2:
                        menu = false;
                        break;

                    default:
                        System.out.println("\nSeleccione una opción del menú");
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("\nDebe seleccionar un número");
            }
        
        
        }
        input.close();
    }
}

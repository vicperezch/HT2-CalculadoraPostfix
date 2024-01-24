package src;
/**
 * @author Nils Muralles & Víctor Pérez
 * @version 1.0.0
 * @since 22/01/24
 * Clase que maneja todo lo relacionado a la lógica posfix
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Postfix {
    private File posfixFile;

    /**
     * Constructor de la clase Posfix, inicializa con archivo llamado "datos.txt"
     */
    public Postfix() {
        this.posfixFile = new File("datos.txt");
    }

    /**
     * Lee la operación tal cual y como fue dada en el archivo .txt
     * @return Operación del archivo .txt
     */
    public String readOperation() {
        String operation = "";

        try {
            // Lector
            BufferedReader br = new BufferedReader(new FileReader(posfixFile));
            
            String line;
            while ((line = br.readLine()) != null) { // Lee cada línea distinta de null
                operation = line;
            }

            br.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return operation;
    }

    /**
     * Realiza los cálculos de acuerdo con el paradigma Posfix
     * @return Resultado de los cálculos
     */
    public String postfixOperate() {
        // Stack de strings sobre el que se trabaja, calculadora y elementos de la operación dada
        CustomStack<String> stack = new CustomStack<>();
        Calculator myCalc = new Calculator();
        String[] elements = readOperation().split(" ");
    
        // Itera sobre los elementos proporcionados 
        for (int i = 0; i < elements.length; i++) {

            if (!Character.isDigit(elements[i].charAt(0))) { // Si el elemento es un operador

                try {
                    Integer operatorA = Integer.parseInt(stack.pop()); // Toma los dos primeros números
                    Integer operatorB = Integer.parseInt(stack.pop());

                    int result = myCalc.calculate(elements[i].charAt(0), operatorB, operatorA); // Reliza la operación con dicho elemento
                    stack.push(String.valueOf(result)); // Inserta el resultado en el Stack
                    
                // Si parseInt lanza una excepción significa que no hay operadores suficientes
                } catch (NumberFormatException e) {
                    return "La expresión no es válida";
                }

            } else { // Si no es un operador
                stack.push(elements[i]); // Inserta únicamente el elemento
            }
        } 

        return stack.pop(); // Return del último elemento restante en el Stack, que coincide con el resultado de la operación
    }
}

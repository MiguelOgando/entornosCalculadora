import java.util.Scanner;

/**
 * <h1>Proyecto</h1>
 * <h2>Calculadora</h2>
 * @author Miguel Angel Ogando Gomez y David Fernandez Melendez
 * @version 12-2021
 */
public class Calculadora {
    public static void main(String[] args) {
        // Vamos a hacer una calculadora
        // Pedimos: dos números y una operación
        // Hacemos la operación correspondiente
        // Imprimimos el resultado

        /**
         * Recogemos datos por teclado que seran enviados a distintos metodos.
         *  En este caso sólo pedimos 2 números.
         */
        // Recoger datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Num:");
        double a = sc.nextDouble();
        System.out.println("Num:");
        double b = sc.nextDouble();
        // llamo al método menú y devuelvo la operación seleccionada
        int operacion = menu();

        /**
         * Al pedir los números este salta a uno de los metodos (seleccionarOperacion) para luego realizar las
         * operaciones.
         */
        seleccionarOperacion(operacion, a, b);

    }

    /**
     * Realiza la suma, con nombre suma.
     * @param a;
     * @param b;
     */
    public static void suma(double a, double b){
        double suma = a + b;
        System.out.println("Suma: " + suma);
    }

    /**
     * Realiza la resta, con nombre resta.
     * @param num1;
     * @param num2;
     */
    public static void resta(double num1, double num2) {
        double resta = num1 - num2;
        System.out.println("Resta" + resta);
    }

    /**
     * Realiza la multiplicacion, con nombre producto.
     * @param num1;
     * @param num2;
     */
    public static void producto(double num1, double num2) {
        double producto = num1 * num2;
        System.out.println("Producto: " + producto);
    }

    /**
     * Realiza la division, con nombre cociente.
     * @param num1;
     * @param num2;
     */
    public static void cociente(double num1, double num2) {
        double cociente = num1 / num2;
        System.out.println("Cociente: " + cociente);
    }


    /**
     * El nombre menu es el que da el paso a las operaciones para selecionar los metodos.
     * @return
     */
    public static int menu() { // presenta el menú de opciones, y devuelve el código de operación
        Scanner sc = new Scanner(System.in);
        System.out.println("Operacion: \n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division");
        int op = sc.nextInt();
        return op;
    }

    /**
     * Recoge los datos dados en menu y porsteriormente selecciona el tipo de operacion que se quiere realizar.
     *  <p>Metodos:</p>
     *  <ol>
     *          <li>Suma</li>
     *          <li>Resta</li>
     *          <li>Multiplicacion</li>
     *          <li>Division</li>
     *  </ol>
     *  <p>Dependiendo del numero, este se direccionara a estas opciones.</p>
     * @param op;
     * @param a;
     * @param b;
     */
    public static void seleccionarOperacion(int op, double a, double b) {
        if (op == 1) {
            // Suma
            suma(a, b);
        } else if (op == 2) {
            // Resta
            resta(a, b);
        } else if (op == 3) {
            // Multiplicacion
            producto(a, b);
        } else if (op == 4) {
            // Cociente
            cociente(a, b);
        } else {
            System.out.println("Opcion incorrecta");
        }
    }
}

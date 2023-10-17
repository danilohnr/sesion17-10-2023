import java.util.InputMismatchException;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        int x = pedirEnteroConExcepciones();
        System.out.println("x = " + x);
    }
    public static int pedirEnteroSinExcepciones(){
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese un valor entero: ");
        return lector.nextInt();
    }
    public static int pedirEnteroConValidaciones(){
        Scanner lector = new Scanner(System.in);
        boolean esValido = true;
        System.out.print("Ingrese un valor entero: ");
        String entrada = lector.next();
        for (int i = 0; i < entrada.length(); i++) {
            if (!Character.isDigit(entrada.charAt(i))) {
                esValido = false;
                break;
            }
        }
        if (esValido) {
            return Integer.parseInt(entrada);
        }
        return 0;
    }
    public static int pedirEnteroConExcepciones(){
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese un valor entero: ");
        try {
            return lector.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }
}

public class App {
    public static void main(String[] args) {
        int x = 98;
        int y = 0;
        //System.out.println(dividirSinExcepciones(x,y));
        //System.out.println(dividirConValidacion(x,y));
        System.out.println(dividirConExcepciones(x,y));
    }
    public static int dividirSinExcepciones(int x, int y){
        return x/y;
    }
    public static int dividirConValidacion(int x,int y){
        if (y != 0) {
            return x/y;
        } else {
            return 0;
        }
    }
    public static int dividirConExcepciones(int x, int y){
        try {
            return x/y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}

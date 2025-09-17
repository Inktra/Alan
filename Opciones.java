import java.util.Scanner;

public class Opciones {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        System.out.println("Hola usuario es un gusto tenerte por aqui, este codigo ejecuta varias cosas");
        int opcion = 0;
       
       do {
        System.out.println("Por favor ingresa la acción que quieres realizar:");
        System.out.println("1- Factorial Recursivo\n2-serie de Fibonnacci\n3-Conjetura de Collatz\n4-salir del programa");
        opcion = Integer.parseInt(e.nextLine());
            switch (opcion){
                case 1:
                System.out.println("Haz introducido la opción de factorial recursivo, por favor, dinos que numero quieres su factorial");
                int num = Integer.parseInt(e.nextLine());
                Factorial f = new Factorial();
                System.out.println("El factorial de " + num + " es: " + f.fact(num) +"\n");
                break;
                case 2:
                
                System.out.println("Haz introducido la opción de la serie de Fibonnacci, dinos ¿Cuántos términos quieres?");
                float nume = (float) Integer.parseInt(e.nextLine());
                Finonnacci g = new Finonnacci();
                g.fibo(nume);
                break;

                case 3:
                System.out.println("Haz introducido la opción de la Conjetura de Collatz, dinos ¿Cuántos términos quieres?");
                float numer = (float) Integer.parseInt(e.nextLine());
                Collatz h = new Collatz();
                h.col(numer);
                break;

                case 4:
                System.out.println("Haz decidido salir del programa");
                break;

                default:
                System.out.println("Introduce una entrada valida");
                break;
            }
       }while (opcion != 4);

    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Digestiva {

    public static void main(String[] args) {
        // Opcional: mal uso de argumentos en la entrada indicar uso correcto

        ArrayList <String> lista = new  ArrayList <> ();
        HashMap <String, String> arreglo = new HashMap <>();
        for (int i = 0; i<args.length; i++){
            lista.add (args[i]);
        }

        for (int i = 0; i< lista.size(); i++){
            String code = generaHash(lista.get(i));
            arreglo.put(lista.get(i), code);
        }

            String inp = "";
            String out = "";

        for (int i = 0; i < lista.size(); i++){
            inp += lista.get(i) + " ";
            out += arreglo.get(lista.get(i)) + " ";
        }

        System.out.println("La impresión queda como:");
        System.out.println("Frase " + inp);
        System.out.println("Encriptación " + out);
        // Recorrido sobre ArrayList para agregar las entradas
        // Mandamos las entradas a la función digestiva
        // Mandamos al HashMap las entradas donde las llaves van asociadas a cada entrada
        // Presentamos resultados con base en el HashMap
    }

    public static String generaHash(String texto) {
        // Variable para crear semilla a partir de la suma de los caracteres
        int semilla = 0;
        for (char c : texto.toCharArray()) {
            semilla += c;
        }

        Random random = new Random(semilla);

        //Para generar 32 caracteres hexadecimales (investigar a quien se parece)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            int valor = random.nextInt(16); //0 - 15
            sb.append(Integer.toHexString(valor));
        }

        return sb.toString();
    }
} 

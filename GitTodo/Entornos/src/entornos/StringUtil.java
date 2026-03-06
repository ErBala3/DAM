package entornos;

public class StringUtil {

    public static void main(String[] args) {
        System.out.println(invertirCadena("hola"));
    }

    public static String invertirCadena(String cadena) {

        if (cadena.isEmpty()) {
            cadena += "";
        } else {
            cadena = invertirCadena(cadena.substring(1)) + cadena.charAt(0);
        }
        return cadena;

    }

    public static boolean esPalindromo(String cadena) {
        if (cadena.isEmpty()) {
            return false;
        } else if (cadena.equals(invertirCadena(cadena))) {
            return true;
        } else {
            return false;
        }
    }

    public static int contarPalabras(String cadena) {
        if (cadena == null || cadena.trim().isEmpty()) {
            return 0;
        } else {
            String[] palabras = cadena.trim().split(" ");
            return palabras.length;
        }
    }

    public static String concatenar(String cadena, String cadena2) {
        String resultado = "";
        if (cadena.isEmpty()) {
            resultado = cadena2;
        } else {
            resultado += cadena + cadena2;
        }
        return resultado;
    }
}

package examen;

public class ValidadorClave {
	
	 // Regla: válida si NO es null, longitud >= 8, contiene al menos 1 mayúscula, 1
    // minúscula y 1 dígito
    public static boolean esClaveValida(String clave) {
        if (clave == null)
            return false;

        if (clave.length() < 8)
            return false;

        boolean may = false, min = false, dig = false;

        for (char c : clave.toCharArray()) {
            if (Character.isUpperCase(c))
                may = true;
            if (Character.isLowerCase(c))
                min = true;
            if (Character.isDigit(c))
                dig = true;
        }
        return may && min && dig;
    }

    // Devuelve: "DEBIL" si < 10, "MEDIA" si [10..13], "FUERTE" si >= 14
    // (si es null -> "DEBIL")
    public static String fortaleza(String clave) {
        if (clave == null)
            return "DEBIL";

        int len = clave.length();
        if (len < 10)
            return "DEBIL";
        if (len <= 13)
            return "MEDIA";
        return "FUERTE";
    }

    // Oculta todos los caracteres salvo los 2 últimos.
    // Ej: "Secreta123" -> "*******23"
    // Si null -> ""
    // Si longitud <= 2, devuelve la misma cadena (o "" si está vacía)
    public static String ocultar(String clave) {
        if (clave == null)
            return "";
        if (clave.length() <= 2)
            return clave;

        int n = clave.length();
        String ult2 = clave.substring(n - 2);
        return "*".repeat(n - 2) + ult2;
    }
}

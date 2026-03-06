package entornos;

public class TestReproduction {
    public static void main(String[] args) {
        System.out.println("Starting TestReproduction...");
        try {
            String input = "hola";
            System.out.println("Input: " + input);
            String result = StringUtil.invertirCadena(input);
            System.out.println("Result: " + result);
            if (!"aloh".equals(result)) {
                System.out.println("FAILURE: Expected aloh but got " + result);
            } else {
                System.out.println("SUCCESS: Inversion worked.");
            }
        } catch (Throwable t) {
            System.out.println("EXCEPTION: " + t);
            t.printStackTrace();
        }
    }
}

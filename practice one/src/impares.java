import java.util.Scanner;

public class impares {
    public static void main(String[] args) {
        try {
            System.out.println("Digite um número: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            verificarSiEsPar(num);
            System.out.println("el numero: " + num + " es par");
        } catch (ImparException e) {
            System.out.println("Error: el número es impar " + e.getMessage());
        } finally {
            System.out.println("Fin del programa");
        }
    }

    public static void verificarSiEsPar(int num) throws ImparException {
        if (num % 2 != 0) {
            throw new ImparException("El número " + num + " es impar");
        }
    }
}

class ImparException extends Exception {
    public ImparException(String message) {
        super(message);
    }
}
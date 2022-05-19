import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um valor:");
        int valor = scanner.nextInt();

        if (valor >= 2 && ehPrimo(valor)) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo.");
        }

        System.out.println("Informe um valor para listar numeros primos:");
        int n = scanner.nextInt();
        System.out.println(printPrime(n));
    }

    private static int printPrime(int number) {
        int i;
        int n = 0;
        for (i = 1; i <= number; i++) {
            if (ehPrimo(i)) {
                n = n + i;
                System.out.println(n);
            }
        }
        return n;
    }

    private static boolean ehPrimo( int valor ){
        boolean primo = true;
        for( int i = 2; i < valor; i++ ){
            if( valor % i == 0 ){
                primo = false;
                break;
            }
        }
        return primo;
    }
}

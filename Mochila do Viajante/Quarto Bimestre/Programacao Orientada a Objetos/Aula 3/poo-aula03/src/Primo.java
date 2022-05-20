import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um valor:");
        int valor = scanner.nextInt();

        if (valor >= 2 && isPrime(valor)) {
            System.out.println("Não é primo.");
        } else {
            System.out.println("É primo");
        }

        System.out.println("Informe um valor para listar numeros primos:");
        int n = scanner.nextInt();
        System.out.println(printPrime(n));
    }

    private static int printPrime(int number) {
        int i = 1;
        int n = 0;
        while( n < number){
            if (isPrime(i)) {
                i++;
                n++;
                System.out.println(i);
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
    private static boolean isPrime( int num ){
    boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // Não é um número primo
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }

}

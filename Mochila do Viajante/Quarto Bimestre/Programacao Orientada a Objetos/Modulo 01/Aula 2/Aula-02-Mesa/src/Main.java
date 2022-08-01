import java.util.Scanner;
// Exercicio 01
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um Número");
        int num = sc.nextInt();

        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // Não é um número primo
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " É Primo");
        else
            System.out.println(num + " Não é primo");
    }
}
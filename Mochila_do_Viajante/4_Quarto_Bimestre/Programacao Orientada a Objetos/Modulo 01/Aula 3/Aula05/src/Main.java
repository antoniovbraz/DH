import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        UsuarioJogo jogadorUm = new UsuarioJogo("Antonio", "Vanucci","0", 1);
        System.out.println(jogadorUm.getNome());

        UsuarioJogo jogadorDois = new UsuarioJogo("Rafael", "Rafa","0", 10);
        System.out.println(jogadorDois.getNome());
    }
}
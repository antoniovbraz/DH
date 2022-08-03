import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Person antonio = new Person("Antonio","Vanucci", LocalDate.of(1984,1,24));
        Person bruna = new Person("Bruna","Heimbeck", LocalDate.of(1991,10,28));

        antonio.setConjuge(bruna);

        Cat Garfield = new Cat("Garfield", LocalDate.of(1978,6,19));

        antonio.setPet(Garfield);

        System.out.println(antonio);
    }
}

public class ProcessaMail {
    public static void main(String[] args) {
        CheckMail processo = new CheckMail();

        processo.verificar(new Mail("email@email.com","tecnico@digitalhouse.com","Reclamação"));
        processo.verificar(new Mail("email@email.com","helloworld@digitalhouse.com","Gerência"));
        processo.verificar(new Mail("email@email.com","juanes@whathouse.com","Comercial"));
        processo.verificar(new Mail("email@email.com","tecnica@colmeia.com","Reclamação"));
    }
}

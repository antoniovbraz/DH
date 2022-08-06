package Aula6_integradora2_2;

public class GradeDeFilmeProxy implements  IGradeDeFilmes{

    private  GradeDeFilmes gradeDeFilmes;
    private IP ipRec;

    public GradeDeFilmeProxy(GradeDeFilmes gradeDeFilmes){
        this.setFilme(gradeDeFilmes);
    }

    public void setIp(IP ip){
        this.ipRec = ip;
    }

    @Override
    public Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException{
        Filme f = gradeDeFilmes.getFilme(nomeDoFilme);

        if (!(getIp().getPais()).equalsIgnoreCase(f.getPais())){
            throw new FilmeNaoHabilitadoException(nomeDoFilme+" não disponível no(a) " + getIp().getPais() );
        }
        return f;
    }

    public void setFilme(GradeDeFilmes filme){
        this.gradeDeFilmes = filme;
    }

    public IP getIp(){
        return  ipRec;
    }
}

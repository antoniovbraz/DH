package Aula6_integradora2_2;

public interface IGradeDeFilmes {
    public Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException;
}

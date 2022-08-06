package Aula6_integradora2_2;

public class GradeDeFilmes implements IGradeDeFilmes{

    @Override
    public Filme getFilme(String nomeDoFilme){
        Filme f = null;

        switch (nomeDoFilme)
        {
            case "The White Tiger":
                f = new Filme("The White Tiger","ARG","www.wtiger.com");
                break;
            case "His Houser":
                f = new Filme("His Houser", "BRA", "www.hhouser.com");
                break;
            case "Over The Moon":
                f = new Filme("Over The Moon", "COL", "www.omoon.com");
                break;
            case "Superbad":
                f = new Filme("Superbad","ARG","www.sbad.com");
                break;
        }
        return f;
    }
}

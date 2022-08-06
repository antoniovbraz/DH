package Mesa_A4S_Chain_of_Responsibility;

public abstract class ControleDeQualidade {

    protected  ControleDeQualidade controleSeguinte;

    public  ControleDeQualidade getSeguinte(){
        return this.controleSeguinte;
    }

    public void setSeguinte(ControleDeQualidade m){
        this.controleSeguinte = m;
    }

    public abstract void verificar(Artigo artigo);
}

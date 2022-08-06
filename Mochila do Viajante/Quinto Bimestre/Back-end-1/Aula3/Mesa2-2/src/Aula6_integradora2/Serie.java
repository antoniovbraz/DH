package Aula6_integradora2;

public class Serie implements ISerie{

    public String getSerie(String nome){

        if(nome == "GOT"){
            return "www.got.com";
        } else if ( nome == "TWD"){
            return  "www.twd.com";
        } else {}
    }
}

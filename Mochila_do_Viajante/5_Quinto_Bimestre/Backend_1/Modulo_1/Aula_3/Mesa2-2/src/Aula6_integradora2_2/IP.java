package Aula6_integradora2_2;

public class IP {
    private int[] numeroIp = new int[4];

    public IP(int n1, int n2, int n3, int n4){
        this.numeroIp[0] = n1;
        this.numeroIp[1] = n2;
        this.numeroIp[2] = n3;
        this.numeroIp[3] = n4;
    }

    @Override
    public String toString(){
        return "IP [" + this.numeroIp[0]+"."+this.numeroIp[1]+"."
                +this.numeroIp[2]+"."+this.numeroIp[3]+" ]";
    }

    public  String getPais(){
        String pais = "";
        if(numeroIp[0] <= 49){
            pais = "ARG";
        }
        if((numeroIp[0]>=50 && numeroIp[0]<=88)){
            pais = "BRA";
        }
        if((numeroIp[0]>=100 && numeroIp[0]<=255)){
            pais = "COL";
        }
        return pais;
    }
}

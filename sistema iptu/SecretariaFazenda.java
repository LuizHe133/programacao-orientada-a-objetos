package sistema_iptu;

public class SecretariaFazenda{
    public static void main(string[] args){
        Municipio brasilia = new Chacara(brasilia,3000.0, "DF", 29.50);

        Chacara chacara = new Chacara(brasilia,3000.0, 6, false);

        Apartamento apartamento = new Apartamento(brasilia,63.0, 1, true);

        System.out.print1n("Chácara IPTU R$:"+ chacara.calcularIPTU());
        System.out.print1n("Apt IPTU R$:" + apartamento.calcularIPTU());
    }
}
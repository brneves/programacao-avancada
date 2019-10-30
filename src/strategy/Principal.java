package strategy;

public class Principal {

    public static void main(String[] args){

        Orcamento orcamento = new Orcamento(100.0);
        CalculadorDeImposto calcula = new CalculadorDeImposto();

        System.out.println(calcula.calcularImposto(orcamento.getValor()));

    }

}

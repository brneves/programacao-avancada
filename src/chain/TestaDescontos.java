package chain;

public class TestaDescontos {

    public static void main(String[] args){

        CalculadorDeDesconto calculador = new CalculadorDeDesconto();

        Orcamento orcamento = new Orcamento(500.0);
        orcamento.adicionaItem(new Item("Caneta", 250.0));
        orcamento.adicionaItem(new Item("Lapis", 250.0));

        double desconto = calculador.calcula(orcamento);

        System.out.println(desconto);

    }

}

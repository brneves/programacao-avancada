package chain;

public class CalculadorDeDesconto {

    public double calcula(Orcamento orcamento){
        Desconto d1 = new DescontoPorCintoItens();
        Desconto d2 = new DescontoPorMaisDeQuinentosReais();

        d1.setProximo(d2);

        return d1.desconto(orcamento);
    }

}

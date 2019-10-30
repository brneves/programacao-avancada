package chain;

public interface Desconto {

    void setProximo(Desconto proximo);

    double desconto(Orcamento orcamento);

}

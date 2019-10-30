package chain;

public class DescontoPorMaisDeQuinentosReais implements Desconto {

    private Desconto proximo;

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

    @Override
    public double desconto(Orcamento orcamento) {
        if (orcamento.getValor() > 500){
            return orcamento.getValor() * 0.07;
        } else {
            return proximo.desconto(orcamento);
        }
    }
}

package chain;

public class DescontoPorCintoItens implements Desconto {

    private Desconto proximo;

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

    @Override
    public double desconto(Orcamento orcamento) {
        if (orcamento.getItens().size() > 5){
            return orcamento.getValor() * 0.1;
        } else {
            return proximo.desconto(orcamento);
        }
    }


}

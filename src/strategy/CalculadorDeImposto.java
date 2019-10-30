package strategy;

public class CalculadorDeImposto {

    private Imposto imposto;
    private Orcamento orcamento;

    public Double calcularImposto(Double orcamento){
        imposto = new ICMS();
        return imposto.calcula(orcamento);

    }

}

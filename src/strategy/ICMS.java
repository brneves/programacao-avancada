package strategy;

public class ICMS implements Imposto {
    @Override
    public Double calcula(Double orcamento) {
        return orcamento = (orcamento * 0.05) + 50.0;
    }
}
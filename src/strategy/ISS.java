package strategy;

public class ISS implements Imposto {

    @Override
    public Double calcula(Double orcamento) {
        return orcamento = orcamento * 0.06;
    }
}

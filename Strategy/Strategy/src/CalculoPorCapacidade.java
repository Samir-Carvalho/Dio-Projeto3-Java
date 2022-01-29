public class CalculoPorCapacidade implements CalculoValor{
    private int capacidade;

    public CalculoPorCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    @Override
    public double calcularValorLocacao(double valorUnitario, int tempo) {
        return valorUnitario * tempo * (1 + capacidade/100f);
    }
}
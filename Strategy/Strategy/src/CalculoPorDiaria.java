public class CalculoPorDiaria implements CalculoValor{
    @Override
    public double calcularValorLocacao(double valorUnitario, int tempo) {
        return valorUnitario * tempo;
    }
}
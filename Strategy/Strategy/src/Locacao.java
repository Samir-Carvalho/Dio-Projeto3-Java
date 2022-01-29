public class Locacao {
    private CalculoValor calc;

    public Locacao(CalculoValor calc) {
        this.calc = calc;
    }
    
    public double calcularValorPagar(double valorUnitario, int qtdDias){
        return calc.calcularValorLocacao(valorUnitario, qtdDias);
    }  
}
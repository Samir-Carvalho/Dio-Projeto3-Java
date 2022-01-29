public class CalculoPorTipo implements CalculoValor{
    private String tipo;

    public CalculoPorTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public double calcularValorLocacao(double valorUnitario, int tempo) {
        if(tipo.equalsIgnoreCase("CS")){
            return valorUnitario * tempo;
        }
        return 1.5 * valorUnitario * tempo;  
    }
}
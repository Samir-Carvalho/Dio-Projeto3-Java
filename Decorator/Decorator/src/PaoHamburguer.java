public class PaoHamburguer extends Sanduiche{
    
    public PaoHamburguer(String descricao) {
        setDescricao(descricao);
    }

    @Override
    public double getPreco() {
        return 2.5;
    }
}
public class Hamburguer extends Ingrediente{

    public Hamburguer(Sanduiche sand) {
        super(sand);
    }

    @Override
    public double getPreco() {
        return 4.0 + getSanduiche().getPreco();
    }
}
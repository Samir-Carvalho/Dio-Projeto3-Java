public class Tomate extends Ingrediente{
    public Tomate(Sanduiche sand) {
        super(sand);
    }

    @Override
    public double getPreco() {
        return 0.5 + getSanduiche().getPreco();
    }
}
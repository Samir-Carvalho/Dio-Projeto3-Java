public class Cebola extends Ingrediente{
    public Cebola(Sanduiche sand) {
        super(sand);
    }

    @Override
    public double getPreco() {
        return 1.3 + getSanduiche().getPreco();
    }
}
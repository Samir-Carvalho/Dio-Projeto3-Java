public class Queijo extends Ingrediente{
    
    public Queijo(Sanduiche sand) {
        super(sand);
    }

    @Override
    public double getPreco() {
        return 2.3 + getSanduiche().getPreco();
    }
}
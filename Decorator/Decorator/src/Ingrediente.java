public abstract class Ingrediente extends Sanduiche{
    private Sanduiche sand;

    public Ingrediente(Sanduiche sand) {
        this.sand = sand;
        setDescricao(sand.getDescricao());
    }
    
    public Sanduiche getSanduiche(){
        return sand;
    }
}
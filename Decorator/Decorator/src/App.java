public class App {
    public static void main(String[] args) throws Exception {
        Sanduiche s = new PaoHamburguer("X-Burguer");
        s = new Hamburguer(s);
        s = new Queijo(s);
        s = new Queijo(s);
        
        System.out.printf("\nSanduiche: %s \nPreco: R$ %.2f\n", s.getDescricao(), s.getPreco());
    }
}

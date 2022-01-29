public abstract class Sanduiche {
    private String descricao;
      
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public abstract double getPreco();
    
    public String getDescricao(){
        return descricao;
    }
}
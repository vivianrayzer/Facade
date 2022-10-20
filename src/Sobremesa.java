public class Sobremesa extends Produto{
    private String tamanho;

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public String getTamanho(){
        return tamanho;
    }

    public Sobremesa(String descricao, double preco, String tamanho){
        super(descricao, preco);
        this.tamanho = tamanho;
    }
}

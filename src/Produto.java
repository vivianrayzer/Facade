public class Produto {
    private String descricao;
    private double preco;

    public Produto(){}
    public Produto(String descricao,double preco){
        this.descricao = descricao;
        this.preco = preco;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }


    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }
}

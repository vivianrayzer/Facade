public class Bebida extends Produto{
    private int ml;

    public void setMl(int ml){
        this.ml = ml;
    }

    public int getml(){
        return ml;
    }

    public Bebida(String descricao, double preco, int ml){
        super(descricao, preco);
        this.ml = ml;
    }
}

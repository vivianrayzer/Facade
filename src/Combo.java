public class Combo {

    private Burguer burguer;
    private Bebida bebida;
    private Sobremesa sobremesa;


    public void  CriarCombo(int tipo){
        if(tipo == 1){

            burguer = new Burguer("Moda da casa", 18, 400);
            bebida = new Bebida("Coca cola", 4, 600);
            sobremesa = new Sobremesa("Pudim", 9, "grande");
        }
        else if(tipo == 2){
            burguer = new Burguer("Americano", 20, 550);
            bebida = new Bebida("Caipirinha de vinho", 12, 700);
            sobremesa = new Sobremesa("Mousse de chocolate", 6, "pequeno");
        }
    }
    public void exibirCombo(double total){
        System.out.println("\nHAMBURGUER: " + burguer.getDescricao() + "  PREÇO: " + burguer.getPreco() + "  GRAMAS:" +  burguer.getGramas());
        System.out.println("BEBIDA: " + bebida.getDescricao() + "  PREÇO: " + bebida.getPreco() + "  Ml: " + bebida.getml());
        System.out.println("SOBREMESA: " + sobremesa.getDescricao() + "  PREÇO: " + sobremesa.getPreco() + "  TAMANHO: " + sobremesa.getTamanho());

        total = burguer.getPreco() + bebida.getPreco() + sobremesa.getPreco();

        System.out.println("\nO VALOR TOTAL DO COMBO É: " + total);
    }



}

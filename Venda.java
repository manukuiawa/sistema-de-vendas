
package sistemavendas;

public class Venda {
   Produto prod;
   private int qtd;
   double valor;
   
public Venda (Produto prod, int qtd){
    this.prod = prod;
    prod.getPreco();
    this.qtd = qtd;
}

public void setQtd(int qtd){
    this.qtd = qtd;
}

public int getQtd(){
    return this.qtd;
}

public void setValor(double valor){
    this.valor = valor;
}
public double getValor(){
    return this.valor;
}

public void CalculaPreco(){
    valor = (prod.getPreco()*qtd);
}

public void ImprimirItemVendas(){
    System.out.println("Informações da venda: "
    + "\nProdutos: " + this.prod
    + "\nPreço: " + prod.getPeso()
    + "\nQuantidade: " + this.qtd
    + "\nValor: " + valor);
}
}

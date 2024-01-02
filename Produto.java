
package sistemavendas;

public class Produto {
   
    private String descricao;
    private double peso, preco;
    private int codigo;
    
    public Produto(int codigo, String descricao, double preco, double peso){
        this.codigo = codigo;
        this.descricao = descricao;
        this.peso = peso;
        this.preco = preco;
    }
    
    public void setCod(int codigo){
        this.codigo = codigo;
    }
    
    public void setdescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setpeso(double peso){
        this.peso = peso;
    }
    
    public void setpreco(double preco){
        this.preco = preco;
    }
    
    public int getCod() {
        return this.codigo;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public void imprimirTodasInformacoes(){
        System.out.println("Código: " + this.codigo 
                + "\nNome do Produto: " + this.descricao 
                + "\nPreço: " + this.preco 
                + "\nPeso: " + this.peso);
    }
}



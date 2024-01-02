package sistemavendas;

public class Pessoa {

    public String nome;
    private int tempoEmpresa;
    
    public Pessoa(String no){
        this.nome= no;
        this.tempoEmpresa=0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
       String nome = "João";
        return nome;
    }
}

package sistemavendas;
public class Cliente {
    private String nome, rua, cidade, estado, telefone;
    private String cpf, email;

    public Cliente(String nome, String email, String cpf, String telefone, String endereco, String estado, String cidade) {
        this.nome=nome;
        this.email=email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.rua = endereco;
        this.estado = estado;
        this.cidade = cidade;
    }
   
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setRua(String rua){
        this.rua = rua;
    }
    public void setCidade(String cidade){
        this.cidade=cidade;
    }
    public void setEstado(String estado){
        this.estado= estado;
    } 

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
    
    public void imprimirCliente(){
        System.out.println("Informações do cliente: \nNome: " + this.nome
                + "\nCpf: " + this.cpf 
                + "\nEmail: " + this.email 
                + "\nTelefone: " + this.telefone
                + "\nCidade: " + this.cidade
                + "\nEndereco: " + this.rua
                + "\nEstado: " + this.estado);
   
}
}

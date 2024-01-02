
package sistemavendas;

import java.util.ArrayList;
import java.util.Scanner;

public class Retorno {
 
    public static void main(String[] args) {
        String nome, email, telefone, cpf, endereco, estado, cidade;
        String descricao;
        int codigo;
        double peso, preco;
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

        int opcao;
        do {
            System.out.println("1 Cadastrar Cliente\n"
                    + "2 Atualizar Cliente\n"
                    + "3 Cadastrar Produto\n"
                    + "4 Atualizar Produto\n"
                    + "5 Relatórios\n"
                    + "0 Sair");
            opcao = scan.nextInt();
            
        switch (opcao) {
            case 1:
                scan.nextLine();
                System.out.println("Digite o nome do cliente: ");
                nome = scan.nextLine();
                System.out.println("Digite o email do cliente: ");
                email = scan.next();
                System.out.println("Digite seu cpf: ");
                cpf = scan.next();
                System.out.println("Digite seu telefone: ");
                telefone = scan.next();
                System.out.println("Digite seu endereço: ");
                endereco = scan.nextLine();
                System.out.println("Digite seu estado: ");
                estado = scan.next();
                System.out.println("Digite sua cidade: ");
                cidade = scan.next();
                System.out.println("Cliente cadastrado com sucesso!");
                Cliente c = new Cliente(nome, email, cpf, telefone, endereco, estado, cidade);
                listaClientes.add(c);
                break;
                
            case 2:
                for(int i = 0; i<listaClientes.size(); i++){
                    System.out.println(i + " " + listaClientes.get(i).getNome());
                }
                
                for(Cliente i : listaClientes){
                    i.getNome();
                }
                System.out.println("Digite qual cliente deseja alterar: ");
                int altera = scan.nextInt();
                    try{
                    listaClientes.get(altera);
                    scan.nextLine();
                    System.out.println("Digite o nome do cliente: ");
                    nome = scan.nextLine();
                    listaClientes.get(altera).setNome(nome);
                    System.out.println("Digite o email do cliente: ");
                    email = scan.next();
                    listaClientes.get(altera).setEmail(email);
                    System.out.println("Digite seu cpf: ");
                    cpf = scan.next();
                    listaClientes.get(altera).setCpf(cpf);
                    System.out.println("Digite seu telefone: ");
                    telefone = scan.next();
                    listaClientes.get(altera).setTelefone(telefone);
                    System.out.println("Digite seu endereço: ");
                    endereco = scan.next();
                    listaClientes.get(altera).setRua(endereco);
                    System.out.println("Digite seu estado: ");
                    estado = scan.next();
                    listaClientes.get(altera).setEstado(estado);
                    System.out.println("Digite sua cidade: ");
                    cidade = scan.next();
                    listaClientes.get(altera).setCidade(cidade);
                    } catch(Exception e){
                        System.out.println("Erro: "+e);
                    }
                break;
                
            case 3:
                scan.nextLine();
                System.out.println("Digite o código do produto: ");
                codigo = scan.nextInt();
                scan.nextLine();
                System.out.println("Digite a descrição do produto: ");
                descricao = scan.nextLine();
                System.out.println("Digite o preço do produto: ");
                preco = scan.nextDouble();
                System.out.println("Digite o peso do produto: ");
                peso = scan.nextDouble();
                Produto p = new Produto(codigo, descricao, preco, peso);
                listaProdutos.add(p);
                break;
                
            case 4:
                for(int i = 0; i < listaProdutos.size(); i++){
                System.out.println(i + " " + listaProdutos.get(i).getCod());
                }
                for(Produto i: listaProdutos){
                    i.getCod();
                }
                System.out.println("\nDigite qual o produto que deseja alterar? ");
                altera = scan.nextInt();
                try{
                    scan.nextLine();
                    listaProdutos.get(altera);
                    System.out.println("Digite o código do produto: ");
                    codigo = scan.nextInt();
                    listaProdutos.get(altera).setCod(codigo);
                    System.out.println("Digite a descrição do produto: ");
                    descricao = scan.nextLine();
                    listaProdutos.get(altera).setdescricao(descricao);
                    System.out.println("Digite o preço do produto: ");
                    preco = scan.nextDouble();
                    listaProdutos.get(altera).setpreco(preco);
                    System.out.println("Digite o peso do produto: ");
                    peso = scan.nextDouble();
                    listaProdutos.get(altera).setpeso(peso);
                }catch(Exception e){
                    System.out.println("\nErro: "+e);
                }
                break;
               
            case 5:
                for(Produto i : listaProdutos){
                    i.imprimirTodasInformacoes();
                }
                for(Cliente i: listaClientes){
                   i.imprimirCliente();
                }
                break;
                
            case 0:
                System.exit(opcao);
            default:
                System.out.println("Opção Inválida. Digite novamente!");
        }

    }while(opcao<=5 || opcao >=0 );
        
    }
    
        }


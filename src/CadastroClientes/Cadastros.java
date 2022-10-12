
package CadastroClientes;
import java.util.ArrayList;
import java.util.Scanner;

public class Cadastros {
   
    private int alterar;
    private String nome, cpf, idade, telefone, info, nomeAux;
    OpcaoAlterar opcaoAlterar = new OpcaoAlterar();
 
    
    public void insereCliente(ArrayList<Cliente> clientesBD, Scanner input){    
        
        System.out.println("Insira o nome:");
        nome = input.nextLine();
        System.out.println("Insira o CPF:");
        cpf = input.nextLine();
        System.out.println("Insira a idade:");
        idade = input.nextLine();
        System.out.println("Insira o telefone:");
        telefone = input.nextLine();
        clientesBD.add(new Cliente(nome,cpf,idade,telefone)); 
    }
    
    public void alteraCliente(ArrayList<Cliente> clientesBD, Scanner input){
        
        System.out.println("Insira o nome do cliente que voce deseja alterar");
        nomeAux = input.nextLine();
        System.out.println("Escolha qual dado voce deseja alterar:");
        System.out.println("1 - Nome");
        System.out.println("2 - CPF");
        System.out.println("3 - Idade");
        System.out.println("4 - Telefone");
        alterar = input.nextInt();
        System.out.println("Insira qual a nova informacao a ser adicionada:");
        info = input.nextLine();
        info = input.nextLine();
        opcaoAlterar.opcoes(nomeAux, alterar, info, clientesBD,input);   
            
    }
    
    public void removeCliente(ArrayList<Cliente> clientesBD, Scanner input){
        System.out.println("Insira o nome do cliente que voce deseja remover");    
        nomeAux = input.nextLine();
        for(Cliente clienteAux : clientesBD){
            if(clienteAux.getNome().equals(nomeAux)){
                int id = clientesBD.indexOf(clienteAux);
                clientesBD.remove(id);
                break;
            }
        }
        System.out.printf("Nome de cliente não encontrado");
    }
    
    public void buscaCliente(ArrayList<Cliente> clientesBD, Scanner input){
        System.out.println("Insira o nome do cliente que voce deseja visualizar");
        nomeAux = input.nextLine();
        for(Cliente clienteAux : clientesBD){
            if(clienteAux.getNome().equals(nomeAux)){
                imprime(clienteAux.getNome(),clienteAux.getCpf(),clienteAux.getIdade(),clienteAux.getTelefone());  
            }
        }
        System.out.printf("Nome de cliente nao encontrado");
        
    }
    
    public void imprimeClientes(ArrayList<Cliente> clientesBD, Scanner input){
        Cliente clienteAux;
        for(int id = 0; id < clientesBD.size(); id++){
            clienteAux = clientesBD.get(id);
            imprime(clienteAux.getNome(),clienteAux.getCpf(),clienteAux.getIdade(),clienteAux.getTelefone());  
        }
    }
    
    public void imprime(String nome, String cpf, String idade, String telefone){
        System.out.printf("\n==================================================\n");
        System.out.printf("Nome: %s \nCPF: %s \nIdade: %s \nTelefone: %s",nome, cpf, idade, telefone);  
        System.out.printf("\n==================================================\n");
    }
   
}


package CadastroClientes;
import java.util.ArrayList;
import java.util.Scanner;

public class OpcaoAlterar {
    String nomeAux, cpfAux, idadeAux, telefoneAux;
    public void opcoes(String nomeAux, int alterar, String info, ArrayList<Cliente> clientesBD, Scanner input){
        for(Cliente clienteAux : clientesBD){
            if(clienteAux.getNome().equals(nomeAux)){ 
                int id = clientesBD.indexOf(clienteAux);
                nomeAux = clienteAux.getNome();
                cpfAux = clienteAux.getCpf();
                idadeAux = clienteAux.getIdade();
                telefoneAux = clienteAux.getTelefone();
                if(alterar == 1){
                    nomeAux = info;
                }
                if(alterar == 2){
                    cpfAux = info;
                }
                if(alterar == 3){
                    idadeAux = info;
                }
                if(alterar == 4){
                    telefoneAux = info; 
                }
                Cliente clienteAux2 = new Cliente(nomeAux, cpfAux, idadeAux, telefoneAux);
                clientesBD.set(id, clienteAux2);
                break;
            }         
        }
        System.out.printf("Nome de cliente nao encontrado");
    }    
}

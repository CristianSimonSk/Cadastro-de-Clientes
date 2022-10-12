
package CadastroClientes;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<Cliente> clientesBD = new ArrayList<Cliente>();
        Cadastros cadastros = new Cadastros();
        Menu menu = new Menu();
        
        int id, opc = 1;
        String nome, cpf, idade, telefone;
        
        System.out.println("BEM VINDO");
        
        while (opc != 0){
            opc = menu.menu(input);
            switch(opc){
                case 1: 
                    cadastros.insereCliente(clientesBD,input);
                    break;             
                case 2: 
                    cadastros.alteraCliente(clientesBD,input);
                    break;                 
                case 3: 
                    cadastros.removeCliente(clientesBD,input);
                    break; 
                case 4: 
                    cadastros.buscaCliente(clientesBD,input);
                    break; 
                case 5: 
                    cadastros.imprimeClientes(clientesBD,input);
                    break; 
                case 0: input.close();

                
            }
        }
        
        
        
        
        
    }
    
}

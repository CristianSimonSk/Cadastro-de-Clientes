
package CadastroClientes;
import java.util.Scanner;


public class Menu {
 
    
    public int menu(Scanner input){
        int opc = 1;    
        System.out.println("");
        System.out.println("O que deseja realizar:");
        System.out.println("1 - Adicionar Cliente");
        System.out.println("2 - Editar Cliente");
        System.out.println("3 - Remover Cliente");
        System.out.println("4 - Buscar Cliente");
        System.out.println("5 - Exibir Clientes Cadastrados");
        System.out.println("0 - Sair do Programa");
        opc = input.nextInt();
        input.nextLine();          
        return opc;
    }    
}

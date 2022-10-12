
package CadastroClientes;

public class Cliente {
    private String nome;
    private String cpf;
    private String idade;
    private String telefone;
    
    public Cliente(){
        this.nome = "";
        this.cpf = "";
        this.idade = "";
        this.telefone = "";
    }

    public Cliente(String nome, String cpf, String idade, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

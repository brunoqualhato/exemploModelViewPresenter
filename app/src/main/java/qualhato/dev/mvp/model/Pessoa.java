package qualhato.dev.mvp.model;

public class Pessoa {
    private String nome;
    private String email;
    private int idade;



    public Pessoa(){
        this.nome = "";
        this.email = "";
        this.idade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getidade() {
        return idade;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString(){

        return "Nome: "+getNome()+"\n E-mail: "+getEmail()+"\n Idade: "+getidade();
     }
}

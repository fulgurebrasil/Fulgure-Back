package sh.surge.fulgure.fulgure_brasil.model;

public class Usuario {
    
    private static int idCounter = 0;

    private int id, vidas, pontuacao;
    private String nome, email, senha;

    public Usuario() {
        this.id = ++Usuario.idCounter;
    }

    public Usuario(String nome, String email, String senha) {
        this.vidas = 5;
        this.pontuacao = 0;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.id = ++Usuario.idCounter;
    }

    public int getId() {
        return id;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}

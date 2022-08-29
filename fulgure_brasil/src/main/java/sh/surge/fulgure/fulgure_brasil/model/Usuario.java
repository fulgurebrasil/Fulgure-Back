package sh.surge.fulgure.fulgure_brasil.model;

public class Usuario{
    private static int idCounter = 0;

    private String nome, email, senha;
    private int id, vidas, pontuacao;

    public Usuario() {
        this.id = ++Usuario.idCounter;
    }
}
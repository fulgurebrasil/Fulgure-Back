package sh.surge.fulgure.fulgure_brasil.repository;

import java.util.ArrayList;

import sh.surge.fulgure.fulgure_brasil.model.Usuario;

public class UsuarioRepository {
    private static UsuarioRepository repo;
    private ArrayList<Usuario> usuarios;

    private UsuarioRepository() {
        this.usuarios = new ArrayList<>();
    }

    public static void init(){
        if (UsuarioRepository.repo == null){
            //Criando usuário
            UsuarioRepository.repo = new UsuarioRepository();

            UsuarioRepository.add(
                new Usuario("Julia", "julinha@gmail.com", "julinhatop")
            );
        }

    }

        public static void add(Usuario Usuario) {
        UsuarioRepository.repo.usuarios.add(Usuario);
    }

    public static ArrayList<Usuario> all(){
        return UsuarioRepository.repo.usuarios;
    }

    // Recupera Usuario pelo Id
    public static Usuario getById(int id) {
        return UsuarioRepository.repo.usuarios.stream().filter((Usuario) -> Usuario.getId() == id).toList().get(0);
    }
}

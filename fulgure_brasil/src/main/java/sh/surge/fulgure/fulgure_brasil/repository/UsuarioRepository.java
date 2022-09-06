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
                new Usuario("Usuário Teste 1", "teste1@gmail.com", "testando")
            );
            UsuarioRepository.add(
                new Usuario("Usuário Teste 2", "teste2@gmail.com", "testando")
            );
            UsuarioRepository.add(
                new Usuario("Usuário Teste 3", "teste3@gmail.com", "testando")
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
    public static boolean deleteById(int id) {
        Usuario userToDelete = getById(id);
        UsuarioRepository.repo.usuarios.remove(userToDelete);
        return true;
    }
}

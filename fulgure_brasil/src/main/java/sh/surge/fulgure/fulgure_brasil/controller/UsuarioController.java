package sh.surge.fulgure.fulgure_brasil.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sh.surge.fulgure.fulgure_brasil.model.Usuario;
import sh.surge.fulgure.fulgure_brasil.repository.UsuarioRepository;

@CrossOrigin
@RestController
public class UsuarioController {

    @GetMapping("/usuario")
    public List<Usuario> listaUsuarios() {
        return UsuarioRepository.all();
    }

    @GetMapping("/usuario/{id}")
    public Usuario RecuperaUsuarioPeloId(@PathVariable("id") int id) {
        return UsuarioRepository.getById(id);
    }

    @PostMapping("/usuario") 
    public void addUsuario(@RequestBody Usuario usuario){
        UsuarioRepository.add(usuario);
    }
    @DeleteMapping("/usuario/{id}") 
    public void deleteUsuario(@PathVariable("id") int id){
        UsuarioRepository.deleteById(id);
    }

}

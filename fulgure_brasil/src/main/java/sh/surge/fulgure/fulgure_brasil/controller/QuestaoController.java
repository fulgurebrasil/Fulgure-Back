package sh.surge.fulgure.fulgure_brasil.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import sh.surge.fulgure.fulgure_brasil.model.Questao;
import sh.surge.fulgure.fulgure_brasil.repository.QuestaoRepository;

@CrossOrigin
@RestController
public class QuestaoController {

    @GetMapping("/questao")
    public List<Questao> listaQuestoes() {
        return QuestaoRepository.all();
    }

    @GetMapping("/questao/{id}")
    public Questao RecuperaQuestaoPeloId(@PathVariable("id") int id) {
        return QuestaoRepository.getById(id);
    }

}

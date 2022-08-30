package sh.surge.fulgure.fulgure_brasil.repository;

import java.util.ArrayList;

import sh.surge.fulgure.fulgure_brasil.model.Questao;

public class QuestaoRepository {
    private static QuestaoRepository repo;
    private ArrayList<Questao> questoes;

    private QuestaoRepository() {
        this.questoes = new ArrayList<>();
    }

    public static void init(){
        if (QuestaoRepository.repo == null){
            //Criando repositório
            QuestaoRepository.repo = new QuestaoRepository();
            //Adicionando questões
            QuestaoRepository.add(
                new Questao("Qual a maior influência cultural na culinária nortista brasileira?", "curiosidade", "dica", "Indígena", 120, 3)
            );
            QuestaoRepository.add(
                new Questao("Alimentos como churrasco, polenta e chimarrão são típicos de qual região?", "curiosidade", "dica", "Sul", 120, 3)
            );
            QuestaoRepository.add(
                new Questao("O cordel é um gênero literário popular brasileiro, na maioria das vezes composto por rimas, que se originou através de falas e relatos. Em qual região o cordel se formou?", "curiosidade", "dica", "Nordeste", 120, 3)

            );
            QuestaoRepository.add(
                new Questao("Em qual estado se encontra a maior metrópole do Brasil e qual é o nome dela?", "curiosidade", "dica", "Sudeste, São Paulo", 120, 3)

            );
            QuestaoRepository.add(
                new Questao("O Pantanal é um importante bioma encontrado no Brasil, no Paraguai e na Bolívia. Em que região brasileira ele está localizado?", "curiosidade", "dica", "Centro-Oeste", 120, 3)

            );

            Questao questao = new Questao();
            questao.cadastraAlternativa(1, "Europeia", "Norte-americana", "Asiática", "Australiana", "Indígena");
            questao.cadastraAlternativa(2, "Norte", "Nordeste", "Centro-Oeste", "Sul", "Sudeste");
            questao.cadastraAlternativa(3, "Nordeste", "Norte", "Centro-Oeste", "Sul", "Sudeste");
            questao.cadastraAlternativa(4, "Nordeste, Fortaleza", "Sudeste, Rio de Janeiro", "Sudeste, São Paulo", "Centro-Oeste, Brasília", "Sul, Porto Alegre");
            questao.cadastraAlternativa(5, "Sudeste", "Nordeste", "Sul", "Norte", "Centro-Oeste");
        } 
    }

        public static void add(Questao questao) {
        QuestaoRepository.repo.questoes.add(questao);
    }

    public static ArrayList<Questao> all(){
        return QuestaoRepository.repo.questoes;
    }

    // Recupera Questão pelo Id
    public static Questao getById(int id) {
        return QuestaoRepository.repo.questoes.stream().filter((questao) -> questao.getId() == id).toList().get(0);
    }
}

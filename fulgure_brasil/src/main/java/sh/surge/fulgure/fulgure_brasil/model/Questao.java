package sh.surge.fulgure.fulgure_brasil.model;

import java.util.ArrayList;
import java.util.Iterator;

import sh.surge.fulgure.fulgure_brasil.repository.QuestaoRepository;

public class Questao {
    private static int idCounter = 0;

    private String comando, curiosidade, dica, resposta;
    private int id, tempo, pontuacao;
    private ArrayList<String> alternativas;

    public Questao(){
        this.id = ++Questao.idCounter;
    }

    public Questao(String comando, String curiosidade, String dica, String resposta, int tempo, int pontuacao) {
        this.id = ++Questao.idCounter;
        this.comando = comando;
        this.curiosidade = curiosidade;
        this.dica = dica;
        this.resposta = resposta;
        this.tempo = tempo;
        this.pontuacao = pontuacao;
        this.alternativas = new ArrayList<>();
    }

    public void cadastraAlternativa(int id, String alternativa1, String alternativa2, String alternativa3, String alternativa4, String alternativa5){
        Questao questaoRecebida = QuestaoRepository.getById(id);
        questaoRecebida.alternativas.add(alternativa1);
        questaoRecebida.alternativas.add(alternativa2);
        questaoRecebida.alternativas.add(alternativa3);
        questaoRecebida.alternativas.add(alternativa4);
        questaoRecebida.alternativas.add(alternativa5);
    }

    public String exibeAlternativas(){
        Iterator it = this.alternativas.iterator();
        String alternativa = null;
        while(it.hasNext()){
             alternativa = (String) it.next();
        }
        return alternativa;
    }

    public int getId() {
        return id;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public String getCuriosidade() {
        return curiosidade;
    }

    public void setCuriosidade(String curiosidade) {
        this.curiosidade = curiosidade;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    
}

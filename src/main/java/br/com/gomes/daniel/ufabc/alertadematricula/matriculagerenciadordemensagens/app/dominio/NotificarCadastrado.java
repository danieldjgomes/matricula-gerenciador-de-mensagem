package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.dominio;

import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.domain.dominio.Disciplina;

import java.io.Serializable;
import java.util.Map;

public class NotificarCadastrado implements Serializable {

    public NotificarCadastrado(String destinatario, Disciplina disciplina) {
        this.destinatario = destinatario;
        this.disciplina = disciplina;
    }

    public String getDestinatario() {
        return destinatario;
    }

    String destinatario;

    public Disciplina getDisciplina() {
        return disciplina;
    }

    Disciplina disciplina;


}

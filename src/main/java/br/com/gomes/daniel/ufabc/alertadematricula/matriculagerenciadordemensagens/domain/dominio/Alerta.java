package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.domain.dominio;

public class Alerta {

    Long idDisciplina;
    Email email;
    Status status;


    public Alerta(Long idDisciplina, Email email, Status status) {
        this.idDisciplina = idDisciplina;
        this.email = email;
        this.status = status;
    }
    public Email getEmail() {
        return email;
    }
}

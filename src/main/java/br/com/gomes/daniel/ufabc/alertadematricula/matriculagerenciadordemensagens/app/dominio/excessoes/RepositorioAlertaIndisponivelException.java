package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.dominio.excessoes;

public class RepositorioAlertaIndisponivelException extends RepositorioIndisponivelException{


    public RepositorioAlertaIndisponivelException() {
        super(new RepositorioAlertaIndisponivelException());
    }
}

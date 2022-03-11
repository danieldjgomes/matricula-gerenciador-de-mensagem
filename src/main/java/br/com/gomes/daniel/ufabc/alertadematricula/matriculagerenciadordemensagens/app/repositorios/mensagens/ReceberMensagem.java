package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.repositorios.mensagens;

public interface ReceberMensagem<M> {

    public void receber(M m);
}

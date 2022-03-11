package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.repositorios.mensagens;

public interface EnviarMensagem<M> {

    public void enviar(M m);
}

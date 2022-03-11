package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.dominio;

public class MensagemNotificarCadastrados extends Mensagem<NotificarCadastrado>{

    public static final String FILA = "notificarCadastrados";

    public MensagemNotificarCadastrados(NotificarCadastrado conteudo) {
        super(conteudo, FILA);
    }

}

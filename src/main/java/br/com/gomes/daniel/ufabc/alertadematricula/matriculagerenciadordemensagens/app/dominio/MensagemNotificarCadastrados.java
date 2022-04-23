package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.dominio;

import org.springframework.beans.factory.annotation.Value;

public class MensagemNotificarCadastrados extends Mensagem<NotificarCadastrado>{

    @Value("${mensageria.rabbit.filas.notificarCadastrados:notificarCadastrados}")
    public static final String FILA = "notificarCadastrados";

    public MensagemNotificarCadastrados(NotificarCadastrado conteudo) {
        super(conteudo, FILA);
    }
}

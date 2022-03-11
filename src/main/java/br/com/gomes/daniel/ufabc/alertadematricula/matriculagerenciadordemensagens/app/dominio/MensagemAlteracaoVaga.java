package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.dominio;

public class MensagemAlteracaoVaga extends Mensagem<AlteracaoVaga> {

    public static final String FILA = "vagasAlteradas";

    public MensagemAlteracaoVaga(AlteracaoVaga conteudo) {
        super(conteudo, FILA);
    }
}

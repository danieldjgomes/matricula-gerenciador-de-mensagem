package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.repositorios.mensagens;

import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.dominio.AlteracaoVaga;
import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.dominio.Mensagem;

public interface ReceberMensagemAlteracaoVaga extends ReceberMensagem<Mensagem<AlteracaoVaga>> {

    public void receber(Mensagem<AlteracaoVaga> alteracaoVaga);
}

package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.repositorios.mensagens;

import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.dominio.Mensagem;
import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.dominio.NotificarCadastrado;

public interface EnviarMensagemNotificarCadastrados extends EnviarMensagem<Mensagem<NotificarCadastrado>> {
}

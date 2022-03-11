package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.repositorios.servicos;

import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.repositorios.servicos.Service;
import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.domain.dominio.Disciplina;

public interface EnviarMensagemNotificarCadastradosService extends Service {
    public void enviarMensagemNotificacao(Disciplina disciplina);

}

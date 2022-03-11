package br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.serviceImpl;

import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.dominio.MensagemNotificarCadastrados;
import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.dominio.NotificarCadastrado;
import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.dominio.excessoes.RepositorioAlertaIndisponivelException;
import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.repositorios.mensagens.EnviarMensagemNotificarCadastrados;
import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.app.repositorios.servicos.EnviarMensagemNotificarCadastradosService;
import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.domain.dominio.Alerta;
import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.domain.dominio.Disciplina;
import br.com.gomes.daniel.ufabc.alertadematricula.matriculagerenciadordemensagens.domain.repositorio.AlertaRepository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.Optional;

@Named
public class EnviarMensagemNotificarCadastradosServiceImpl implements EnviarMensagemNotificarCadastradosService {

    private final AlertaRepository alertaRepository;
    private final EnviarMensagemNotificarCadastrados enviarMensagemNotificarCadastrados;

    @Inject
    public EnviarMensagemNotificarCadastradosServiceImpl(AlertaRepository alertaRepository, EnviarMensagemNotificarCadastrados enviarMensagemNotificarCadastrados) {
        this.alertaRepository = alertaRepository;
        this.enviarMensagemNotificarCadastrados = enviarMensagemNotificarCadastrados;
    }

    public void enviarMensagemNotificacao(Disciplina disciplina) {
        Optional<List<Alerta>> alertas = alertaRepository.getAlertasPorId(disciplina.identificadorUFABC);
        alertas.orElseThrow(RepositorioAlertaIndisponivelException::new);

        for (Alerta alerta : alertas.get()) {
            enviarMensagemNotificarCadastrados.enviar(new MensagemNotificarCadastrados(new NotificarCadastrado(alerta.getEmail().getCorpo(), disciplina)));
        }

    }
}
